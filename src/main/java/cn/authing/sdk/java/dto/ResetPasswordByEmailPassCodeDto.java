package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ResetPasswordByEmailPassCodeDto {
    /**
     * 此账号绑定的邮箱，不区分大小写。
     */
    @JsonProperty("email")
    private String email;
    /**
     * 邮箱验证码，一个短信验证码只能使用一次，默认有效时间为无分钟。你需要通过**发送邮件**接口获取。
     */
    @JsonProperty("passCode")
    private String passCode;

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassCode() {
        return passCode;
    }
    public void setPassCode(String passCode) {
        this.passCode = passCode;
    }



}