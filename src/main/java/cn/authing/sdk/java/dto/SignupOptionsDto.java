package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SignupOptionsDto {
    /**
     * 客户端 IP
     */
    @JsonProperty("clientIp")
    private String clientIp;
    /**
     * 用于注册时补全用户信息的短信验证码
     */
    @JsonProperty("phonePassCodeForInformationCompletion")
    private String phonePassCodeForInformationCompletion;
    /**
     * 用于注册时补全用户信息的短信验证码
     */
    @JsonProperty("emailPassCodeForInformationCompletion")
    private String emailPassCodeForInformationCompletion;
    /**
     * 登录/注册时传的额外参数，会存到用户自定义字段里面
     */
    @JsonProperty("context")
    private Object context;
    /**
     * 密码加密类型，支持 sm2 和 rsa。默认可以不加密。
     */
    @JsonProperty("passwordEncryptType")
    private PasswordEncryptType passwordEncryptType;

    public String getClientIp() {
        return clientIp;
    }
    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public String getPhonePassCodeForInformationCompletion() {
        return phonePassCodeForInformationCompletion;
    }
    public void setPhonePassCodeForInformationCompletion(String phonePassCodeForInformationCompletion) {
        this.phonePassCodeForInformationCompletion = phonePassCodeForInformationCompletion;
    }

    public String getEmailPassCodeForInformationCompletion() {
        return emailPassCodeForInformationCompletion;
    }
    public void setEmailPassCodeForInformationCompletion(String emailPassCodeForInformationCompletion) {
        this.emailPassCodeForInformationCompletion = emailPassCodeForInformationCompletion;
    }

    public Object getContext() {
        return context;
    }
    public void setContext(Object context) {
        this.context = context;
    }

    public PasswordEncryptType getPasswordEncryptType() {
        return passwordEncryptType;
    }
    public void setPasswordEncryptType(PasswordEncryptType passwordEncryptType) {
        this.passwordEncryptType = passwordEncryptType;
    }


    /**
     * 密码加密类型，支持 sm2 和 rsa。默认可以不加密。
     */
    public static enum PasswordEncryptType {

        @JsonProperty("sm2")
        SM2("sm2"),

        @JsonProperty("rsa")
        RSA("rsa"),

        @JsonProperty("none")
        NONE("none"),
        ;

        private String value;

        PasswordEncryptType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}