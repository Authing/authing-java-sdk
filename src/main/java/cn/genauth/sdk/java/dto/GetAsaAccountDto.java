package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetAsaAccountDto {
    /**
     * 所属应用 ID
     */
    @JsonProperty("appId")
    private String appId;
    /**
     * ASA 账号 ID
     */
    @JsonProperty("accountId")
    private String accountId;

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



}