package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PreCheckSmsCodeDto {
    /**
     * 手机号，不带区号。如果是国外手机号，请在 phoneCountryCode 参数中指定区号。
     */
    @JsonProperty("phone")
    private String phone;
    /**
     * 短信验证码
     */
    @JsonProperty("passCode")
    private String passCode;
    /**
     * 手机区号，中国大陆手机号可不填。Authing 短信服务暂不内置支持国际手机号，你需要在 Authing 控制台配置对应的国际短信服务。完整的手机区号列表可参阅 https://en.wikipedia.org/wiki/List_of_country_calling_codes。
     */
    @JsonProperty("phoneCountryCode")
    private String phoneCountryCode;
    /**
     * 短信通道，指定发送此短信的目的，如 CHANNEL_LOGIN 用于登录、CHANNEL_REGISTER 用于注册。
     */
    @JsonProperty("channel")
    private Channel channel;

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
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

    public Channel getChannel() {
        return channel;
    }
    public void setChannel(Channel channel) {
        this.channel = channel;
    }


    /**
     * 短信通道，指定发送此短信的目的，如 CHANNEL_LOGIN 用于登录、CHANNEL_REGISTER 用于注册。
     */
    public static enum Channel {

        @JsonProperty("CHANNEL_LOGIN")
        CHANNEL_LOGIN("CHANNEL_LOGIN"),

        @JsonProperty("CHANNEL_REGISTER")
        CHANNEL_REGISTER("CHANNEL_REGISTER"),

        @JsonProperty("CHANNEL_RESET_PASSWORD")
        CHANNEL_RESET_PASSWORD("CHANNEL_RESET_PASSWORD"),

        @JsonProperty("CHANNEL_BIND_PHONE")
        CHANNEL_BIND_PHONE("CHANNEL_BIND_PHONE"),

        @JsonProperty("CHANNEL_UNBIND_PHONE")
        CHANNEL_UNBIND_PHONE("CHANNEL_UNBIND_PHONE"),

        @JsonProperty("CHANNEL_BIND_MFA")
        CHANNEL_BIND_MFA("CHANNEL_BIND_MFA"),

        @JsonProperty("CHANNEL_VERIFY_MFA")
        CHANNEL_VERIFY_MFA("CHANNEL_VERIFY_MFA"),

        @JsonProperty("CHANNEL_UNBIND_MFA")
        CHANNEL_UNBIND_MFA("CHANNEL_UNBIND_MFA"),

        @JsonProperty("CHANNEL_COMPLETE_PHONE")
        CHANNEL_COMPLETE_PHONE("CHANNEL_COMPLETE_PHONE"),

        @JsonProperty("CHANNEL_IDENTITY_VERIFICATION")
        CHANNEL_IDENTITY_VERIFICATION("CHANNEL_IDENTITY_VERIFICATION"),

        @JsonProperty("CHANNEL_DELETE_ACCOUNT")
        CHANNEL_DELETE_ACCOUNT("CHANNEL_DELETE_ACCOUNT"),
        ;

        private String value;

        Channel(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}