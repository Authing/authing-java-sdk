package cn.genauth.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VerifyAuthenticationResultDto {
    /**
     * 验证认证器登录认证的结果，true 验证成功
     */
    @JsonProperty("verified")
    private Boolean verified;
    /**
     * 验证认证器登录认证通过时，即 verified = true，此数据才会返回。
     */
    @JsonProperty("tokenSet")
    private LoginTokenResponseDataDto tokenSet;

    public Boolean getVerified() {
        return verified;
    }
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public LoginTokenResponseDataDto getTokenSet() {
        return tokenSet;
    }
    public void setTokenSet(LoginTokenResponseDataDto tokenSet) {
        this.tokenSet = tokenSet;
    }



}