package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UnbindEmailDto {
    /**
     * 邮箱验证码，需要先调用**发送邮件**接口接收验证码。
     */
    @JsonProperty("passCode")
    private String passCode;

    public String getPassCode() {
        return passCode;
    }
    public void setPassCode(String passCode) {
        this.passCode = passCode;
    }



}