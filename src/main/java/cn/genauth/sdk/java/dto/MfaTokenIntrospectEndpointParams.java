package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MfaTokenIntrospectEndpointParams {
    /**
     * `mfa_token` 的值
     */
    @JsonProperty("token")
    private String token;

    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }



}