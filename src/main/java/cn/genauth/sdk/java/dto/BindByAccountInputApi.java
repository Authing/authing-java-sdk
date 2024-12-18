package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BindByAccountInputApi {
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
     * 账号密码
     */
    @JsonProperty("password")
    private String password;
    /**
     * 账号（手机/邮箱/用户名）
     */
    @JsonProperty("account")
    private String account;

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

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }



}