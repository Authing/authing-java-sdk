package test;

import cn.authing.sdk.java.client.AuthenticationClient;
import cn.authing.sdk.java.dto.ValidateTokenRespDto;
import cn.authing.sdk.java.dto.authentication.OIDCTokenResponse;
import cn.authing.sdk.java.dto.authentication.ValidateTokenParams;
import cn.authing.sdk.java.model.AuthenticationClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

public class ValidateTokenTest {

    private static final String APP_ID = "YOUR_APP_ID";
    private static final String APP_SECRET = "YOUR_APP_SECRET";
    private static final String REDIRECT_URI = "YOUR_REDIRECT_URI";

    public static void main(String[] args) throws Exception {
        AuthenticationClientOptions clientOptions = new AuthenticationClientOptions(APP_ID, APP_SECRET, REDIRECT_URI);
        AuthenticationClient client = new AuthenticationClient(clientOptions);

        OIDCTokenResponse oidcTokenResponse = client.getAccessTokenByCode("");
        ValidateTokenParams dto = new ValidateTokenParams();
        dto.setAccessToken(oidcTokenResponse.getAccessToken());

        ValidateTokenRespDto response = client.validateToken(dto);
        System.out.println(JsonUtils.serialize(response));
    }
}
