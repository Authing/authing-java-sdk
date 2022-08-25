package cn.authing.sdk.java.dto.authentication;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IDToken{
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

    /**
     * 标识令牌的目标接收方
     */
    @JsonProperty("aud")
    private String aud;

    /**
     * “exp”（过期时间）声明指定只能在哪个时间（含）之前接受 JWT 的处理。
     */
    @JsonProperty("exp")
    private Number exp;

    /**
     * “Issued At”表示针对此令牌进行身份验证的时间。
     */
    @JsonProperty("iat")
    private Number iat;

    /**
     * 标识构造并返回令牌的安全令牌服务 (STS)。
     */
    @JsonProperty("iss")
    private String iss;

    /**
     * 发起认证时携带的随机字符串
     */
    @JsonProperty("nonce")
    private String nonce;

    /**
     * 访问令牌 hash
     */
    @JsonProperty("at_hash")
    private String atHash;

    /**
     * hash
     */
    @JsonProperty("s_hash")
    private String sHash;

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

    public String getAud() {
        return aud;
    }

    public Number getExp() {
        return exp;
    }

    public Number getIat() {
        return iat;
    }

    public String getIss() {
        return iss;
    }

    public String getNonce() {
        return nonce;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    public String getAtHash() {
        return atHash;
    }

    public void setAtHash(String atHash) {
        this.atHash = atHash;
    }

    public String getsHash() {
        return sHash;
    }

    public void setsHash(String sHash) {
        this.sHash = sHash;
    }
}