package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SyncTaskKayangClientConfig {
    /**
     * Endpoint
     */
    @JsonProperty("endpoint")
    private String endpoint;
    /**
     * Account
     */
    @JsonProperty("account")
    private String account;
    /**
     * Password
     */
    @JsonProperty("password")
    private String password;

    public String getEndpoint() {
        return endpoint;
    }
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }



}