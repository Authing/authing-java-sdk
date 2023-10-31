package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;



public class ListPublicAccountDataDto {
    /**
     * 账号 ID
     */
    @JsonProperty("userId")
    private String userId;
    /**
     * 账号头像
     */
    @JsonProperty("avatar")
    private String avatar;
    /**
     * 显示名称
     */
    @JsonProperty("displayName")
    private String displayName;
    /**
     * 用户类型：1 个人用户，2 公共账号
     */
    @JsonProperty("usertype")
    private Usertype usertype;

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAvatar() {
        return avatar;
    }
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getDisplayName() {
        return displayName;
    }
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Usertype getUsertype() {
        return usertype;
    }
    public void setUsertype(Usertype usertype) {
        this.usertype = usertype;
    }


    /**
     * 用户类型：1 个人用户，2 公共账号
     */
    public static enum Usertype {

        @JsonProperty("1")
        _1("1"),

        @JsonProperty("2")
        _2("2"),
        ;

        private String value;

        Usertype(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}