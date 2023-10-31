package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;



public class BindByEmailCodeInputApi {
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
     * 邮箱验证码（四位：1234；六位：123456）
     */
    @JsonProperty("code")
    private String code;
    /**
     * 邮箱
     */
    @JsonProperty("email")
    private String email;

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

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }



}