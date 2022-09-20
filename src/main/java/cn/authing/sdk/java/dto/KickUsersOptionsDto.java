package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class KickUsersOptionsDto {
    /**
     * 用户 ID 类型，可以指定为用户 ID、手机号、邮箱、用户名和 externalId。
     */
    @JsonProperty("userIdType")
    private UserIdType userIdType;

    public UserIdType getUserIdType() {
        return userIdType;
    }
    public void setUserIdType(UserIdType userIdType) {
        this.userIdType = userIdType;
    }


    /**
     * 用户 ID 类型，可以指定为用户 ID、手机号、邮箱、用户名和 externalId。
     */
    public static enum UserIdType {

        @JsonProperty("user_id")
        USER_ID("user_id"),

        @JsonProperty("external_id")
        EXTERNAL_ID("external_id"),

        @JsonProperty("phone")
        PHONE("phone"),

        @JsonProperty("email")
        EMAIL("email"),

        @JsonProperty("username")
        USERNAME("username"),
        ;

        private String value;

        UserIdType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}