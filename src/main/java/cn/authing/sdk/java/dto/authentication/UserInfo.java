package cn.authing.sdk.java.dto.authentication;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserInfo {

    /**
     * subject 的缩写，唯一标识，一般为用户 ID
     */
    @JsonProperty("sub")
    private String sub;

    /**
     * 姓名
     */
    @JsonProperty("name")
    private String name;

    /**
     * 昵称
     */
    @JsonProperty("nickname")
    private String nickname;

    /**
     * 名字
     */
    @JsonProperty("given_name")
    private String givenName;

    /**
     * 姓氏
     */
    @JsonProperty("family_name")
    private String familyName;

    /**
     * 生日
     */
    @JsonProperty("birthdate")
    private String birthdate;

    /**
     * 性别
     */
    @JsonProperty("gender")
    private String gender;

    /**
     * 头像
     */
    @JsonProperty("picture")
    private String picture;

    /**
     * 信息更新时间
     */
    @JsonProperty("updated_at")
    private String updatedAt;

    /**
     * 时区
     */
    @JsonProperty("zoneinfo")
    private String zoneinfo;

    /**
     * 希望被称呼的名字
     */
    @JsonProperty("preferred_username")
    private String preferredUsername;

    /**
     * 区域
     */
    @JsonProperty("locale")
    private String locale;

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getZoneinfo() {
        return zoneinfo;
    }

    public void setZoneinfo(String zoneinfo) {
        this.zoneinfo = zoneinfo;
    }

    public String getPreferredUsername() {
        return preferredUsername;
    }

    public void setPreferredUsername(String preferredUsername) {
        this.preferredUsername = preferredUsername;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "sub='" + sub + '\'' +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", givenName='" + givenName + '\'' +
                ", familyName='" + familyName + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", gender='" + gender + '\'' +
                ", picture='" + picture + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", zoneinfo='" + zoneinfo + '\'' +
                ", preferredUsername='" + preferredUsername + '\'' +
                ", locale='" + locale + '\'' +
                '}';
    }
}