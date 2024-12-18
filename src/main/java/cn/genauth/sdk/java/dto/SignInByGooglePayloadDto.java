package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SignInByGooglePayloadDto {
    /**
     * Google 移动端社会化登录获取到的 code
     */
    @JsonProperty("code")
    private String code;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }



}