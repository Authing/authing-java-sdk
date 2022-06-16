package cn.authing.sdk.java.client;

import cn.authing.sdk.java.dto.authentication.*;
import cn.authing.sdk.java.model.AuthenticationClientOptions;
import cn.authing.sdk.java.model.AuthingRequestConfig;
import cn.authing.sdk.java.util.CommonUtils;
import cn.authing.sdk.java.util.HttpUtils;
import cn.authing.sdk.java.util.JsonUtils;
import cn.hutool.core.util.StrUtil;
import cn.hutool.http.Header;
import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSObject;
import com.nimbusds.jose.JWSVerifier;
import com.nimbusds.jose.crypto.MACVerifier;
import com.nimbusds.jose.crypto.RSASSAVerifier;
import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.jwk.RSAKey;

/**
 * @author ZKB
 */
@SuppressWarnings("all")
public class AuthenticationClient extends BaseClient {

    private final AuthenticationClientOptions options;
    private final String appId;
    private final JWKSet jwks;

    public AuthenticationClient(AuthenticationClientOptions options) throws IOException, ParseException {
        super(options);
        // 必要参数校验
        this.options = options;
        appId = options.getAppId();

        if (!(options.getScope().contains("openid"))) {
            throw new IllegalArgumentException("scope 中必须包含 openid");
        }

        if(options.getServerJWKS() != null && options.getServerJWKS().getKeys().size() > 0) {
            this.jwks = options.getServerJWKS();
        } else {
            this.jwks = JWKSet.load(new URL(this.options.getHost() + "/oidc/.well-known/jwks.json"));
        }
    }

    public AuthUrlResult buildAuthUrl(BuildAuthUrlParams buildOptionParam){
        if(StrUtil.isBlank(buildOptionParam.getState())) {
            buildOptionParam.setState(CommonUtils.createRandomString(16));
        }

        if(StrUtil.isBlank(buildOptionParam.getNonce())) {
            buildOptionParam.setNonce(CommonUtils.createRandomString(16));
        }

        AuthUrlParams params = new AuthUrlParams(
                buildOptionParam.getRedirectUri(),
                "code",
                "query",
                appId,
                buildOptionParam.getState(),
                buildOptionParam.getNonce(),
                buildOptionParam.getScope(),
                null);

        if(buildOptionParam.getForced()) {
            params.setPrompt("login");
        }

        if (buildOptionParam.getScope().contains("offline_access")) {
            params.setPrompt("consent");
        }

        String url = HttpUtils.buildUrlWithQueryParams(options.getHost() + "/oidc/auth", JsonUtils.deserialize(JsonUtils.serialize(params), Map.class));
        return new AuthUrlResult(url, buildOptionParam.getState(), params.getNonce());
    }

    public LoginState getLoginStateByAuthCode(String code ,String redirectUri) throws Exception {
        CodeToTokenParams tokenParam = new CodeToTokenParams(code, this.options.getAppId(), this.options.getAppSecret(),redirectUri,"authorization_code");

        AuthingRequestConfig config = new AuthingRequestConfig();

        config.setUrl("/oidc/token");

        HashMap<String, String> headerMap = new HashMap<>();

        headerMap.put(Header.CONTENT_TYPE.getValue(), "application/x-www-form-urlencoded");

        config.setHeaders(headerMap);

        config.setMethod("UrlencodedPOST");

        config.setBody(tokenParam);

        String response = request(config);

        OIDCTokenResponse deserializeOIDCResponse = deserialize(response, OIDCTokenResponse.class);

        return new LoginState(deserializeOIDCResponse.getAccessToken(),
                deserializeOIDCResponse.getIdToken(),
                deserializeOIDCResponse.getRefreshToken(),
                deserializeOIDCResponse.getExpiresIn(),
                this.parseIDToken(deserializeOIDCResponse.getIdToken()),
                this.parseAccessToken(deserializeOIDCResponse.getAccessToken())
        );
    }

    public LoginState refreshLoginState(String token) throws Exception {
        RefreshTokenParams tokenParam = new RefreshTokenParams(this.options.getAppId(), this.options.getAppSecret(),token);
        AuthingRequestConfig config = new AuthingRequestConfig();

        config.setUrl("/oidc/token");

        HashMap<String, String> headerMap = new HashMap<>();

        headerMap.put(Header.CONTENT_TYPE.getValue(), "application/x-www-form-urlencoded");

        config.setHeaders(headerMap);

        config.setBody(tokenParam);

        config.setMethod("UrlencodedPOST");

        String response = request(config);

        OIDCTokenResponse deserializeOIDCResponse = deserialize(response, OIDCTokenResponse.class);

        return new LoginState(deserializeOIDCResponse.getAccessToken(),
                deserializeOIDCResponse.getIdToken(),
                deserializeOIDCResponse.getRefreshToken(),
                deserializeOIDCResponse.getExpiresIn(),
                this.parseIDToken(deserializeOIDCResponse.getIdToken()),
                this.parseAccessToken(deserializeOIDCResponse.getAccessToken())
        );

    }

    private IDToken parseIDToken(String token) throws Exception {
        JWSObject jwsObject = JWSObject.parse(token);
        String payload;

        if(jwsObject.getHeader().getAlgorithm() == JWSAlgorithm.HS256) {
            JWSVerifier jwsVerifier = new MACVerifier(this.options.getAppSecret());
            if (!jwsObject.verify(jwsVerifier)){
                throw new Exception("token 签名不合法");
            }
        } else {
            RSAKey rsaKey = this.jwks.getKeys().get(0).toRSAKey();
            RSASSAVerifier verifier = new RSASSAVerifier(rsaKey);
            if (!jwsObject.verify(verifier)){
                throw new Exception("校验不通过");
            }
        }

        payload = jwsObject.getPayload().toString();

        return deserialize(payload, IDToken.class);
    }

    private AccessToken parseAccessToken(String token) throws Exception {
        JWSObject jwsObject = JWSObject.parse(token);
        String payload;
        RSAKey rsaKey = this.jwks.getKeys().get(0).toRSAKey();
        RSASSAVerifier verifier = new RSASSAVerifier(rsaKey);
        if (!jwsObject.verify(verifier)){
            throw new Exception("校验不通过");
        }
        payload = jwsObject.getPayload().toString();
        return deserialize(payload, AccessToken.class);
    }

    public UserInfo getUserinfo(String accessToken) {
        AuthingRequestConfig config = new AuthingRequestConfig();

        Map<String, String> headerMap = new HashMap<>();

        headerMap.put("Authorization", "Bearer " + accessToken);

        config.setHeaders(headerMap);

        config.setMethod("GET");

        config.setUrl("/oidc/me");

        String response = request(config);

        return deserialize(response, UserInfo.class);

    }

    public String buildLogoutUrl(LogoutUrlParams param) {
        String redirectUri = this.options.getRedirectUri();

        if(StrUtil.isBlank(redirectUri)) {
            param.setPostLogoutRedirectUri(param.getPostLogoutRedirectUri());
        }

        if(StrUtil.isBlank(param.getPostLogoutRedirectUri())) {
            param.setState(null);
        }

        return HttpUtils.buildUrlWithQueryParams("/oidc/session/end", JsonUtils.deserialize(JsonUtils.serialize(param), Map.class));
    }
}

