package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;



public class FactorProfile {
    /**
     * 当发起绑定手机短信认证要素时，此参数必传。需要传递用户希望绑定的手机号。Authing 服务器会向此手机号发送短信验证码，要求用户在绑定 MFA 阶段提供验证码。一个手机号在一分钟内只能请求一次。
     */
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    /**
     * 当发起绑定手机短信认证要素且需要绑定国际手机号时可以设置，默认为 +86，中国大陆手机区号。Authing 短信服务暂不内置支持国际手机号，你需要在 Authing 控制台配置对应的国际短信服务。完整的手机区号列表可参阅 https://en.wikipedia.org/wiki/List_of_country_calling_codes。
     */
    @JsonProperty("phoneCountryCode")
    private String phoneCountryCode;
    /**
     * 当发起绑定邮箱验证码认证要素时，此参数必传。需要传递用户希望绑定的邮箱。Authing 服务器会向此邮箱发送邮箱验证码，要求用户在绑定 MFA 阶段提供验证码。一个邮箱在一分钟内只能请求一次。
     */
    @JsonProperty("email")
    private String email;

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneCountryCode() {
        return phoneCountryCode;
    }
    public void setPhoneCountryCode(String phoneCountryCode) {
        this.phoneCountryCode = phoneCountryCode;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }



}