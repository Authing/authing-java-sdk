package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeleteAsaAccountBatchDto {
    /**
     * ASA 账号 ID 列表
     */
    @JsonProperty("accountIds")
    private List<String> accountIds;
    /**
     * 所属应用 ID
     */
    @JsonProperty("appId")
    private String appId;

    public List<String> getAccountIds() {
        return accountIds;
    }
    public void setAccountIds(List<String> accountIds) {
        this.accountIds = accountIds;
    }

    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }



}