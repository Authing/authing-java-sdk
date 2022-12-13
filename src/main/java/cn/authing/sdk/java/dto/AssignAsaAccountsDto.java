package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.AssignAsaAccountItem;

public class AssignAsaAccountsDto {
    /**
     * 所属应用 ID
     */
    @JsonProperty("appId")
    private String appId;
    /**
     * 要关联的账号 ID
     */
    @JsonProperty("accountId")
    private String accountId;
    /**
     * 关联对象列表
     */
    @JsonProperty("targets")
    private List<AssignAsaAccountItem> targets;

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

    public List<AssignAsaAccountItem> getTargets() {
        return targets;
    }
    public void setTargets(List<AssignAsaAccountItem> targets) {
        this.targets = targets;
    }



}