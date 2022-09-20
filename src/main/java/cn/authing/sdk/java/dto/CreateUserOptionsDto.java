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


    /**
     * 此次调用中使用的父部门 ID 的类型
     */
    public static enum DepartmentIdType {

        @JsonProperty("department_id")
        DEPARTMENT_ID("department_id"),

        @JsonProperty("open_department_id")
        OPEN_DEPARTMENT_ID("open_department_id"),
        ;

        private String value;

        DepartmentIdType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}