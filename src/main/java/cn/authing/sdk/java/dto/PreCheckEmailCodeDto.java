package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PreCheckEmailCodeDto {
    /**
     * 邮箱，不区分大小写
     */
    @JsonProperty("email")
    private String email;
    /**
     * 邮箱验证码
     */
    @JsonProperty("passCode")
    private String passCode;
    /**
     * 短信通道，指定发送此短信的目的，如 CHANNEL_LOGIN 用于登录、CHANNEL_REGISTER 用于注册。
     */
    @JsonProperty("channel")
    private Channel channel;

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

        @JsonProperty("CHANNEL_VERIFY_EMAIL_LINK")
        CHANNEL_VERIFY_EMAIL_LINK("CHANNEL_VERIFY_EMAIL_LINK"),

        @JsonProperty("CHANNEL_UPDATE_EMAIL")
        CHANNEL_UPDATE_EMAIL("CHANNEL_UPDATE_EMAIL"),

        @JsonProperty("CHANNEL_BIND_EMAIL")
        CHANNEL_BIND_EMAIL("CHANNEL_BIND_EMAIL"),

        @JsonProperty("CHANNEL_UNBIND_EMAIL")
        CHANNEL_UNBIND_EMAIL("CHANNEL_UNBIND_EMAIL"),

        @JsonProperty("CHANNEL_VERIFY_MFA")
        CHANNEL_VERIFY_MFA("CHANNEL_VERIFY_MFA"),

        @JsonProperty("CHANNEL_UNLOCK_ACCOUNT")
        CHANNEL_UNLOCK_ACCOUNT("CHANNEL_UNLOCK_ACCOUNT"),

        @JsonProperty("CHANNEL_COMPLETE_EMAIL")
        CHANNEL_COMPLETE_EMAIL("CHANNEL_COMPLETE_EMAIL"),

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