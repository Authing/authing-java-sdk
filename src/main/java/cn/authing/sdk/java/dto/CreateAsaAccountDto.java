package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateAsaAccountDto {
    /**
     * 账号信息，一般为包含 "account", "password" key 的键值对
     */
    @JsonProperty("accountInfo")
    private Object accountInfo;
    /**
     * 所属应用 ID
     */
    @JsonProperty("appId")
    private String appId;

    public Object getAccountInfo() {
        return accountInfo;
    }
    public void setAccountInfo(Object accountInfo) {
        this.accountInfo = accountInfo;
    }

    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }



}