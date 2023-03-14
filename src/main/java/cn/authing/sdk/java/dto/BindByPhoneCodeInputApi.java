package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BindByPhoneCodeInputApi {
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
     * 手机验证码（四位：1234；六位：123456）
     */
    @JsonProperty("code")
    private String code;
    /**
     * 手机号
     */
    @JsonProperty("phone")
    private String phone;
    /**
     * 国家码（标准格式：加号“+”加国家码数字；当前校验兼容历史用户输入习惯。例，中国国家码标准格式为「+86」，历史用户输入记录中存在「86、086、0086」等格式）
     */
    @JsonProperty("phoneCountryCode")
    private String phoneCountryCode;

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

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoneCountryCode() {
        return phoneCountryCode;
    }
    public void setPhoneCountryCode(String phoneCountryCode) {
        this.phoneCountryCode = phoneCountryCode;
    }



}