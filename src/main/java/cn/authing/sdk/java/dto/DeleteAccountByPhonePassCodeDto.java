package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;



public class DeleteAccountByPhonePassCodeDto {
    /**
     * 此账号绑定的手机号，不带区号。如果是国外手机号，请在 phoneCountryCode 参数中指定区号。
     */
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    /**
     * 短信验证码，一个短信验证码只能使用一次，有效时间为一分钟。你需要通过**发送短信**接口获取。
     */
    @JsonProperty("passCode")
    private String passCode;
    /**
     * 手机区号
     */
    @JsonProperty("phoneCountryCode")
    private String phoneCountryCode;

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassCode() {
        return passCode;
    }
    public void setPassCode(String passCode) {
        this.passCode = passCode;
    }

    public String getPhoneCountryCode() {
        return phoneCountryCode;
    }
    public void setPhoneCountryCode(String phoneCountryCode) {
        this.phoneCountryCode = phoneCountryCode;
    }



}