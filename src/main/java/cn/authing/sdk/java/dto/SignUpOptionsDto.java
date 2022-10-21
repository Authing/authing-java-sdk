package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SignUpOptionsDto {
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
     * 密码加密类型，支持使用 RSA256 和国密 SM2 算法进行加密。默认为 `none` 不加密。
     * - `none`: 不对密码进行加密，使用明文进行传输。
     * - `rsa`: 使用 RSA256 算法对密码进行加密，需要使用 Authing 服务的 RSA 公钥进行加密，请阅读**介绍**部分了解如何获取 Authing 服务的 RSA256 公钥。
     * - `sm2`: 使用 [国密 SM2 算法](https://baike.baidu.com/item/SM2/15081831) 对密码进行加密，需要使用 Authing 服务的 SM2 公钥进行加密，请阅读**介绍**部分了解如何获取 Authing 服务的 SM2 公钥。
     *
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
     * 密码加密类型，支持使用 RSA256 和国密 SM2 算法进行加密。默认为 `none` 不加密。
     * - `none`: 不对密码进行加密，使用明文进行传输。
     * - `rsa`: 使用 RSA256 算法对密码进行加密，需要使用 Authing 服务的 RSA 公钥进行加密，请阅读**介绍**部分了解如何获取 Authing 服务的 RSA256 公钥。
     * - `sm2`: 使用 [国密 SM2 算法](https://baike.baidu.com/item/SM2/15081831) 对密码进行加密，需要使用 Authing 服务的 SM2 公钥进行加密，请阅读**介绍**部分了解如何获取 Authing 服务的 SM2 公钥。
     *
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