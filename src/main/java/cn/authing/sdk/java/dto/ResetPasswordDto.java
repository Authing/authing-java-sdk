package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ResetPasswordDto {
    /**
     * 密码
     */
    @JsonProperty("password")
    private String password;
    /**
     * 重置密码的 token
     */
    @JsonProperty("passwordResetToken")
    private String passwordResetToken;
    /**
     * 密码加密类型，支持使用 RSA256 和国密 SM2 算法进行加密。默认为 `none` 不加密。
     * - `none`: 不对密码进行加密，使用明文进行传输。
     * - `rsa`: 使用 RSA256 算法对密码进行加密，需要使用 Authing 服务的 RSA 公钥进行加密，请阅读**介绍**部分了解如何获取 Authing 服务的 RSA256 公钥。
     * - `sm2`: 使用 [国密 SM2 算法](https://baike.baidu.com/item/SM2/15081831) 对密码进行加密，需要使用 Authing 服务的 SM2 公钥进行加密，请阅读**介绍**部分了解如何获取 Authing 服务的 SM2 公钥。
     *
     */
    @JsonProperty("passwordEncryptType")
    private PasswordEncryptType passwordEncryptType;

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordResetToken() {
        return passwordResetToken;
    }
    public void setPasswordResetToken(String passwordResetToken) {
        this.passwordResetToken = passwordResetToken;
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