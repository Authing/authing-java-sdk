package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;



public class BindEmailDto {
    /**
     * 邮箱验证码，一个邮箱验证码只能使用一次，且有一定有效时间。
     */
    @JsonProperty("passCode")
    private String passCode;
    /**
     * 邮箱，不区分大小写。
     */
    @JsonProperty("email")
    private String email;

    public String getPassCode() {
        return passCode;
    }
    public void setPassCode(String passCode) {
        this.passCode = passCode;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }



}