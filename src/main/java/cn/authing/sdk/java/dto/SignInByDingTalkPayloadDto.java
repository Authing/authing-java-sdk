package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SignInByDingTalkPayloadDto {
    /**
     * 钉钉移动端社会化登录获取到的 code
     */
    @JsonProperty("code")
    private String code;
    /**
     * 如果钉钉移动端社会化登录获取到的 `code` 需要调用 `sns/getuserinfo_bycode` 接口获取授权用户的个人信息，则参数 `isSnsCode` 传 `true`， 否则将通过 `code` 换取 `accessToken` 再获取用户信息
     */
    @JsonProperty("isSnsCode")
    private Boolean isSnsCode;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getIsSnsCode() {
        return isSnsCode;
    }
    public void setIsSnsCode(Boolean isSnsCode) {
        this.isSnsCode = isSnsCode;
    }



}