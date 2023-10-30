package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.SendCreateAccountNotificationDto;

public class CreateUserOptionsDto {
    /**
     * 该参数一般在迁移旧有用户数据到 Authing 的时候会设置。开启这个开关，password 字段会直接写入 Authing 数据库，Authing 不会再次加密此字段。如果你的密码不是明文存储，你应该保持开启，并编写密码函数计算。
     */
    @JsonProperty("keepPassword")
    private Boolean keepPassword;
    /**
     * 是否自动生成密码
     */
    @JsonProperty("autoGeneratePassword")
    private Boolean autoGeneratePassword;
    /**
     * 是否强制要求用户在第一次的时候重置密码
     */
    @JsonProperty("resetPasswordOnFirstLogin")
    private Boolean resetPasswordOnFirstLogin;
    /**
     * 此次调用中使用的父部门 ID 的类型
     */
    @JsonProperty("departmentIdType")
    private DepartmentIdType departmentIdType;
    /**
     * 重置密码发送邮件和手机号选项
     */
    @JsonProperty("sendNotification")
    private SendCreateAccountNotificationDto sendNotification;
    /**
     * 密码加密类型，支持使用 RSA256 和国密 SM2 算法进行加密。默认为 `none` 不加密。
     * - `none`: 不对密码进行加密，使用明文进行传输。
     * - `rsa`: 使用 RSA256 算法对密码进行加密，需要使用 Authing 服务的 RSA 公钥进行加密，请阅读**介绍**部分了解如何获取 Authing 服务的 RSA256 公钥。
     * - `sm2`: 使用 [国密 SM2 算法](https://baike.baidu.com/item/SM2/15081831) 对密码进行加密，需要使用 Authing 服务的 SM2 公钥进行加密，请阅读**介绍**部分了解如何获取 Authing 服务的 SM2 公钥。
     *
     */
    @JsonProperty("passwordEncryptType")
    private PasswordEncryptType passwordEncryptType;

    public Boolean getKeepPassword() {
        return keepPassword;
    }
    public void setKeepPassword(Boolean keepPassword) {
        this.keepPassword = keepPassword;
    }

    public Boolean getAutoGeneratePassword() {
        return autoGeneratePassword;
    }
    public void setAutoGeneratePassword(Boolean autoGeneratePassword) {
        this.autoGeneratePassword = autoGeneratePassword;
    }

    public Boolean getResetPasswordOnFirstLogin() {
        return resetPasswordOnFirstLogin;
    }
    public void setResetPasswordOnFirstLogin(Boolean resetPasswordOnFirstLogin) {
        this.resetPasswordOnFirstLogin = resetPasswordOnFirstLogin;
    }

    public DepartmentIdType getDepartmentIdType() {
        return departmentIdType;
    }
    public void setDepartmentIdType(DepartmentIdType departmentIdType) {
        this.departmentIdType = departmentIdType;
    }

    public SendCreateAccountNotificationDto getSendNotification() {
        return sendNotification;
    }
    public void setSendNotification(SendCreateAccountNotificationDto sendNotification) {
        this.sendNotification = sendNotification;
    }

    public PasswordEncryptType getPasswordEncryptType() {
        return passwordEncryptType;
    }
    public void setPasswordEncryptType(PasswordEncryptType passwordEncryptType) {
        this.passwordEncryptType = passwordEncryptType;
    }


    /**
     * 此次调用中使用的父部门 ID 的类型
     */
    public static enum DepartmentIdType {

        @JsonProperty("department_id")
        DEPARTMENT_ID("department_id"),

        @JsonProperty("open_department_id")
        OPEN_DEPARTMENT_ID("open_department_id"),

        @JsonProperty("sync_relation")
        SYNC_RELATION("sync_relation"),

        @JsonProperty("custom_field")
        CUSTOM_FIELD("custom_field"),

        @JsonProperty("code")
        CODE("code"),
        ;

        private String value;

        DepartmentIdType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
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