package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AsaAccountDto {
    /**
     * 所属应用 ID
     */
    @JsonProperty("appId")
    private String appId;
    /**
     * 账号 ID
     */
    @JsonProperty("accountId")
    private String accountId;
    /**
     * 账号信息，一般为包含 "account", "password" key 的键值对
     */
    @JsonProperty("accountInfo")
    private Object accountInfo;

    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAccountId() {
        return accountId;
    }
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Object getAccountInfo() {
        return accountInfo;
    }
    public void setAccountInfo(Object accountInfo) {
        this.accountInfo = accountInfo;
    }



}