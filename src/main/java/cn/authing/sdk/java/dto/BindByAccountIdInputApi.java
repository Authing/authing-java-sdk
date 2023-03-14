package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BindByAccountIdInputApi {
    /**
     * 中间态键
     */
    @JsonProperty("key")
    private String key;
    /**
     * 操作编码
     */
    @JsonProperty("action")
    private String action;
    /**
     * 账号 ID
     */
    @JsonProperty("accountId")
    private String accountId;

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public String getAction() {
        return action;
    }
    public void setAction(String action) {
        this.action = action;
    }

    public String getAccountId() {
        return accountId;
    }
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }



}