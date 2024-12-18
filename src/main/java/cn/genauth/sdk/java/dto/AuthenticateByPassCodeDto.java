package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AuthenticateByPassCodeDto {
    /**
     * 一次性临时验证码，你需要先调用发送短信或者发送邮件接口获取验证码。
     */
    @JsonProperty("passCode")
    private String passCode;
    /**
     * 邮箱，不区分大小写。
     */
    @JsonProperty("email")
    private String email;
    /**
     * 手机号
     */
    @JsonProperty("phone")
    private String phone;
    /**
     * 手机区号，中国大陆手机号可不填。Authing 短信服务暂不内置支持国际手机号，你需要在 Authing 控制台配置对应的国际短信服务。完整的手机区号列表可参阅 https://en.wikipedia.org/wiki/List_of_country_calling_codes。
     */
    @JsonProperty("phoneCountryCode")
    private String phoneCountryCode;

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