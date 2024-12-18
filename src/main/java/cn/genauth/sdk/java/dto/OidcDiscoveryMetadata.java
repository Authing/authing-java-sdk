package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OidcDiscoveryMetadata {
    /**
     * OIDC Issuer
     */
    @JsonProperty("issuer")
    private String issuer;
    /**
     * OIDC 发起认证端点
     */
    @JsonProperty("authorization_endpoint")
    private String authorizationEndpoint;
    /**
     * OIDC 获取 Token 端点
     */
    @JsonProperty("token_endpoint")
    private String tokenEndpoint;
    /**
     * OIDC 获取用户信息端点
     */
    @JsonProperty("userinfo_endpoint")
    private String userinfoEndpoint;
    /**
     * OIDC JWKS 端点
     */
    @JsonProperty("jwks_uri")
    private String jwksUri;
    /**
     * 此 OIDC IDP 支持的所有 Scope 列表
     */
    @JsonProperty("scopes_supported")
    private List<String> scopesSupported;
    /**
     * 此 OIDC IDP 支持的所有返回类型
     */
    @JsonProperty("response_types_supported")
    private List<String> responseTypesSupported;
    /**
     * 此 OIDC IDP 支持的所有 Response Mode
     */
    @JsonProperty("response_modes_supported")
    private List<String> responseModesSupported;
    /**
     * 此 OIDC IDP 支持的所有 Grant Types
     */
    @JsonProperty("grant_types_supported")
    private List<String> grantTypesSupported;
    /**
     * 此 OIDC IDP 支持的所有 ID Token 签名方式
     */
    @JsonProperty("id_token_signing_alg_values_supported")
    private List<String> idTokenSigningAlgValuesSupported;
    /**
     * 此 OIDC IDP 支持的所有 ID Token 加密方式
     */
    @JsonProperty("id_token_encryption_alg_values_supported")
    private List<String> idTokenEncryptionAlgValuesSupported;
    @JsonProperty("id_token_encryption_enc_values_supported")
    private List<String> idTokenEncryptionEncValuesSupported;
    /**
     * 此 OIDC IDP 支持的所有用户信息签名方式
     */
    @JsonProperty("userinfo_signing_alg_values_supported")
    private List<String> userinfoSigningAlgValuesSupported;
    /**
     * 此 OIDC IDP 支持的所有用户信息加密方式
     */
    @JsonProperty("userinfo_encryption_alg_values_supported")
    private List<String> userinfoEncryptionAlgValuesSupported;
    @JsonProperty("userinfo_encryption_enc_values_supported")
    private List<String> userinfoEncryptionEncValuesSupported;
    /**
     * 此 OIDC IDP 支持的所有获取 Token 的认证方式
     */
    @JsonProperty("token_endpoint_auth_methods_supported")
    private List<String> tokenEndpointAuthMethodsSupported;
    /**
     * 此 OIDC IDP 支持的所有 Claim Type
     */
    @JsonProperty("claim_types_supported")
    private List<String> claimTypesSupported;
    /**
     * 此 OIDC IDP 支持的所有 Claim
     */
    @JsonProperty("claims_supported")
    private List<String> claimsSupported;
    /**
     * 此 OIDC IDP 支持的所有 Code Challenge 模式
     */
    @JsonProperty("code_challenge_methods_supported")
    private List<String> codeChallengeMethodsSupported;
    /**
     * 此 OIDC IDP 的前端登出端点
     */
    @JsonProperty("end_session_endpoint")
    private String endSessionEndpoint;
    /**
     * 此 OIDC IDP 的检查 Token 状态端点
     */
    @JsonProperty("introspection_endpoint")
    private String introspectionEndpoint;
    /**
     * 此 OIDC IDP 检查 Token 状态端点支持的所有验证方式
     */
    @JsonProperty("introspection_endpoint_auth_methods_supported")
    private List<String> introspectionEndpointAuthMethodsSupported;
    /**
     * 此 OIDC IDP 的撤销 Token 端点
     */
    @JsonProperty("revocation_endpoint")
    private String revocationEndpoint;
    /**
     * 此 OIDC IDP 撤销 Token 端点支持的所有验证方式
     */
    @JsonProperty("revocation_endpoint_auth_methods_supported")
    private List<String> revocationEndpointAuthMethodsSupported;

    public String getIssuer() {
        return issuer;
    }
    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getAuthorizationEndpoint() {
        return authorizationEndpoint;
    }
    public void setAuthorizationEndpoint(String authorizationEndpoint) {
        this.authorizationEndpoint = authorizationEndpoint;
    }

    public String getTokenEndpoint() {
        return tokenEndpoint;
    }
    public void setTokenEndpoint(String tokenEndpoint) {
        this.tokenEndpoint = tokenEndpoint;
    }

    public String getUserinfoEndpoint() {
        return userinfoEndpoint;
    }
    public void setUserinfoEndpoint(String userinfoEndpoint) {
        this.userinfoEndpoint = userinfoEndpoint;
    }

    public String getJwksUri() {
        return jwksUri;
    }
    public void setJwksUri(String jwksUri) {
        this.jwksUri = jwksUri;
    }

    public List<String> getScopesSupported() {
        return scopesSupported;
    }
    public void setScopesSupported(List<String> scopesSupported) {
        this.scopesSupported = scopesSupported;
    }

    public List<String> getResponseTypesSupported() {
        return responseTypesSupported;
    }
    public void setResponseTypesSupported(List<String> responseTypesSupported) {
        this.responseTypesSupported = responseTypesSupported;
    }

    public List<String> getResponseModesSupported() {
        return responseModesSupported;
    }
    public void setResponseModesSupported(List<String> responseModesSupported) {
        this.responseModesSupported = responseModesSupported;
    }

    public List<String> getGrantTypesSupported() {
        return grantTypesSupported;
    }
    public void setGrantTypesSupported(List<String> grantTypesSupported) {
        this.grantTypesSupported = grantTypesSupported;
    }

    public List<String> getIdTokenSigningAlgValuesSupported() {
        return idTokenSigningAlgValuesSupported;
    }
    public void setIdTokenSigningAlgValuesSupported(List<String> idTokenSigningAlgValuesSupported) {
        this.idTokenSigningAlgValuesSupported = idTokenSigningAlgValuesSupported;
    }

    public List<String> getIdTokenEncryptionAlgValuesSupported() {
        return idTokenEncryptionAlgValuesSupported;
    }
    public void setIdTokenEncryptionAlgValuesSupported(List<String> idTokenEncryptionAlgValuesSupported) {
        this.idTokenEncryptionAlgValuesSupported = idTokenEncryptionAlgValuesSupported;
    }

    public List<String> getIdTokenEncryptionEncValuesSupported() {
        return idTokenEncryptionEncValuesSupported;
    }
    public void setIdTokenEncryptionEncValuesSupported(List<String> idTokenEncryptionEncValuesSupported) {
        this.idTokenEncryptionEncValuesSupported = idTokenEncryptionEncValuesSupported;
    }

    public List<String> getUserinfoSigningAlgValuesSupported() {
        return userinfoSigningAlgValuesSupported;
    }
    public void setUserinfoSigningAlgValuesSupported(List<String> userinfoSigningAlgValuesSupported) {
        this.userinfoSigningAlgValuesSupported = userinfoSigningAlgValuesSupported;
    }

    public List<String> getUserinfoEncryptionAlgValuesSupported() {
        return userinfoEncryptionAlgValuesSupported;
    }
    public void setUserinfoEncryptionAlgValuesSupported(List<String> userinfoEncryptionAlgValuesSupported) {
        this.userinfoEncryptionAlgValuesSupported = userinfoEncryptionAlgValuesSupported;
    }

    public List<String> getUserinfoEncryptionEncValuesSupported() {
        return userinfoEncryptionEncValuesSupported;
    }
    public void setUserinfoEncryptionEncValuesSupported(List<String> userinfoEncryptionEncValuesSupported) {
        this.userinfoEncryptionEncValuesSupported = userinfoEncryptionEncValuesSupported;
    }

    public List<String> getTokenEndpointAuthMethodsSupported() {
        return tokenEndpointAuthMethodsSupported;
    }
    public void setTokenEndpointAuthMethodsSupported(List<String> tokenEndpointAuthMethodsSupported) {
        this.tokenEndpointAuthMethodsSupported = tokenEndpointAuthMethodsSupported;
    }

    public List<String> getClaimTypesSupported() {
        return claimTypesSupported;
    }
    public void setClaimTypesSupported(List<String> claimTypesSupported) {
        this.claimTypesSupported = claimTypesSupported;
    }

    public List<String> getClaimsSupported() {
        return claimsSupported;
    }
    public void setClaimsSupported(List<String> claimsSupported) {
        this.claimsSupported = claimsSupported;
    }

    public List<String> getCodeChallengeMethodsSupported() {
        return codeChallengeMethodsSupported;
    }
    public void setCodeChallengeMethodsSupported(List<String> codeChallengeMethodsSupported) {
        this.codeChallengeMethodsSupported = codeChallengeMethodsSupported;
    }

    public String getEndSessionEndpoint() {
        return endSessionEndpoint;
    }
    public void setEndSessionEndpoint(String endSessionEndpoint) {
        this.endSessionEndpoint = endSessionEndpoint;
    }

    public String getIntrospectionEndpoint() {
        return introspectionEndpoint;
    }
    public void setIntrospectionEndpoint(String introspectionEndpoint) {
        this.introspectionEndpoint = introspectionEndpoint;
    }

    public List<String> getIntrospectionEndpointAuthMethodsSupported() {
        return introspectionEndpointAuthMethodsSupported;
    }
    public void setIntrospectionEndpointAuthMethodsSupported(List<String> introspectionEndpointAuthMethodsSupported) {
        this.introspectionEndpointAuthMethodsSupported = introspectionEndpointAuthMethodsSupported;
    }

    public String getRevocationEndpoint() {
        return revocationEndpoint;
    }
    public void setRevocationEndpoint(String revocationEndpoint) {
        this.revocationEndpoint = revocationEndpoint;
    }

    public List<String> getRevocationEndpointAuthMethodsSupported() {
        return revocationEndpointAuthMethodsSupported;
    }
    public void setRevocationEndpointAuthMethodsSupported(List<String> revocationEndpointAuthMethodsSupported) {
        this.revocationEndpointAuthMethodsSupported = revocationEndpointAuthMethodsSupported;
    }



}