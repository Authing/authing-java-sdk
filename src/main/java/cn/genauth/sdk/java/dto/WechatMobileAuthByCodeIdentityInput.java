package cn.genauth.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WechatMobileAuthByCodeIdentityInput {
    /**
     * 客户端微信授权成功，微信返回当前认证授权码
     */
    @JsonProperty("code")
    private String code;
    /**
     * 应用 ID
     */
    @JsonProperty("appId")
    private String appId;
    /**
     * 身份源连接 ID
     */
    @JsonProperty("connId")
    private String connId;
    /**
     * 登录参数
     */
    @JsonProperty("options")
    private SignInOptionsDto options;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getConnId() {
        return connId;
    }
    public void setConnId(String connId) {
        this.connId = connId;
    }

    public SignInOptionsDto getOptions() {
        return options;
    }
    public void setOptions(SignInOptionsDto options) {
        this.options = options;
    }



}