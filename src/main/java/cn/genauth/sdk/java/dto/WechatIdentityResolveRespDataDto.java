package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class WechatIdentityResolveRespDataDto {
    /**
     * 可选的账号绑定方式。
     */
    @JsonProperty("methods")
    private List<String> methods;
    /**
     * 可选的账号列表。
     */
    @JsonProperty("accounts")
    private List<String> accounts;
    /**
     * 认证中间态。
     */
    @JsonProperty("key")
    private String key;

    public List<String> getMethods() {
        return methods;
    }
    public void setMethods(List<String> methods) {
        this.methods = methods;
    }

    public List<String> getAccounts() {
        return accounts;
    }
    public void setAccounts(List<String> accounts) {
        this.accounts = accounts;
    }

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }



}