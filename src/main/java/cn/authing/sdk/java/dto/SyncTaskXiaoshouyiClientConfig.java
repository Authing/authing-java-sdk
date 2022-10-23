package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SyncTaskXiaoshouyiClientConfig {
    /**
     * 销售易应用的 ClientId
     */
    @JsonProperty("client_id")
    private String clientId;
    /**
     * 销售易应用的 ClientSecret
     */
    @JsonProperty("client_secret")
    private String clientSecret;
    /**
     * 销售易应用的 UserName
     */
    @JsonProperty("username")
    private String username;
    /**
     * 销售易应用的 Password
     */
    @JsonProperty("password")
    private String password;

    public String getClientId() {
        return clientId;
    }
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }



}