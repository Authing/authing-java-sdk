package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;



public class SignInByBaiduPayloadDto {
    /**
     * 百度移动端社会化登录获取到的授权码 `code`。和属性 `access_token` 任选一个参数。两个都不为空，则优先使用授权码 `code` 参数。
     */
    @JsonProperty("code")
    private String code;
    /**
     * 百度移动端社会化登录获取到的授权访问凭证 `access_token`。和属性 `code` 任选一个参数。两个都不为空，则优先使用授权码 `code` 参数。
     */
    @JsonProperty("access_token")
    private String accessToken;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getAccessToken() {
        return accessToken;
    }
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }



}