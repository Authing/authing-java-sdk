package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RefreshApplicationSecretDataDto {
    /**
     * 新的应用密钥
     */
    @JsonProperty("secret")
    private String secret;

    public String getSecret() {
        return secret;
    }
    public void setSecret(String secret) {
        this.secret = secret;
    }



}