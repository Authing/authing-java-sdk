package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SortingDto {
    /**
     * 进行排序的字段，可选值为：
     * - `createdAt`: 创建时间
     * - `updatedAt`: 修改时间
     * - `email`: 邮箱
     * - `phone`: 手机号
     * - `username`: 用户名
     * - `externalId`: 外部 ID
     * - `status`: 公共账号状态
     * - `statusChangedAt`: 状态修改时间
     * - `passwordLastSetAt`: 密码修改时间
     * - `loginsCount`: 登录次数
     * - `gender`: 性别
     * - `lastLogin`: 上次登录时间
     * - `userSourceType`: 公共账号注册来源
     * - `lastMfaTime`: 上次 MFA 认证时间
     * - `passwordSecurityLevel`: 密码安全等级
     * - `phoneCountryCode`: 手机区号
     * - `lastIp`: 上次登录时使用的 IP
     *
     */
    @JsonProperty("field")
    private Field field;
    /**
     * 排序顺序：
     * - `desc`: 按照从大到小降序。
     * - `asc`: 按照从小到大升序。
     *
     */
    @JsonProperty("order")
    private Order order;

    public Field getField() {
        return field;
    }
    public void setField(Field field) {
        this.field = field;
    }

    public Order getOrder() {
        return order;
    }
    public void setOrder(Order order) {
        this.order = order;
    }


    /**
     * 进行排序的字段，可选值为：
     * - `createdAt`: 创建时间
     * - `updatedAt`: 修改时间
     * - `email`: 邮箱
     * - `phone`: 手机号
     * - `username`: 用户名
     * - `externalId`: 外部 ID
     * - `status`: 公共账号状态
     * - `statusChangedAt`: 状态修改时间
     * - `passwordLastSetAt`: 密码修改时间
     * - `loginsCount`: 登录次数
     * - `gender`: 性别
     * - `lastLogin`: 上次登录时间
     * - `userSourceType`: 公共账号注册来源
     * - `lastMfaTime`: 上次 MFA 认证时间
     * - `passwordSecurityLevel`: 密码安全等级
     * - `phoneCountryCode`: 手机区号
     * - `lastIp`: 上次登录时使用的 IP
     *
     */
    public static enum Field {

        @JsonProperty("id")
        ID("id"),

        @JsonProperty("createdAt")
        CREATED_AT("createdAt"),

        @JsonProperty("updatedAt")
        UPDATED_AT("updatedAt"),

        @JsonProperty("email")
        EMAIL("email"),

        @JsonProperty("username")
        USERNAME("username"),

        @JsonProperty("externalId")
        EXTERNAL_ID("externalId"),

        @JsonProperty("phone")
        PHONE("phone"),

        @JsonProperty("status")
        STATUS("status"),

        @JsonProperty("statusChangedAt")
        STATUS_CHANGED_AT("statusChangedAt"),

        @JsonProperty("passwordLastSetAt")
        PASSWORD_LAST_SET_AT("passwordLastSetAt"),

        @JsonProperty("loginsCount")
        LOGINS_COUNT("loginsCount"),

        @JsonProperty("gender")
        GENDER("gender"),

        @JsonProperty("lastLogin")
        LAST_LOGIN("lastLogin"),

        @JsonProperty("userSourceType")
        USER_SOURCE_TYPE("userSourceType"),

        @JsonProperty("lastMfaTime")
        LAST_MFA_TIME("lastMfaTime"),

        @JsonProperty("passwordSecurityLevel")
        PASSWORD_SECURITY_LEVEL("passwordSecurityLevel"),

        @JsonProperty("phoneCountryCode")
        PHONE_COUNTRY_CODE("phoneCountryCode"),

        @JsonProperty("lastIp")
        LAST_IP("lastIp"),
        ;

        private String value;

        Field(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * 排序顺序：
     * - `desc`: 按照从大到小降序。
     * - `asc`: 按照从小到大升序。
     *
     */
    public static enum Order {

        @JsonProperty("desc")
        DESC("desc"),

        @JsonProperty("asc")
        ASC("asc"),
        ;

        private String value;

        Order(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}