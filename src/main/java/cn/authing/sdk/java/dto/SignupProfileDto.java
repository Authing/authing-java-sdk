package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SignupProfileDto {
    /**
     * 昵称
     */
    @JsonProperty("nickname")
    private String nickname;
    /**
     * 公司
     */
    @JsonProperty("company")
    private String company;
    /**
     * 头像
     */
    @JsonProperty("photo")
    private String photo;
    /**
     * 设备
     */
    @JsonProperty("device")
    private String device;
    /**
     * 浏览器
     */
    @JsonProperty("browser")
    private String browser;
    /**
     * 名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 名
     */
    @JsonProperty("givenName")
    private String givenName;
    /**
     * 姓
     */
    @JsonProperty("familyName")
    private String familyName;
    /**
     * 中间名
     */
    @JsonProperty("middleName")
    private String middleName;
    /**
     * 资料
     */
    @JsonProperty("profile")
    private String profile;
    /**
     * 希望称呼的用户名
     */
    @JsonProperty("preferredUsername")
    private String preferredUsername;
    /**
     * 网站
     */
    @JsonProperty("website")
    private String website;
    /**
     * 性别 W : 女性; M : 男性
     */
    @JsonProperty("gender")
    private Gender gender;
    /**
     * 生日
     */
    @JsonProperty("birthdate")
    private String birthdate;
    /**
     * 地区
     */
    @JsonProperty("zoneinfo")
    private String zoneinfo;
    /**
     * 语言地区
     */
    @JsonProperty("locale")
    private String locale;
    /**
     * 地址
     */
    @JsonProperty("address")
    private String address;
    /**
     * 格式
     */
    @JsonProperty("formatted")
    private String formatted;
    /**
     * 街道地址
     */
    @JsonProperty("streetAddress")
    private String streetAddress;
    /**
     * 位置
     */
    @JsonProperty("locality")
    private String locality;
    /**
     * 地区
     */
    @JsonProperty("region")
    private String region;
    /**
     * 邮政编码
     */
    @JsonProperty("postalCode")
    private String postalCode;
    /**
     * 国家
     */
    @JsonProperty("country")
    private String country;
    /**
     * 邮箱
     */
    @JsonProperty("email")
    private String email;
    /**
     * 手机号
     */
    @JsonProperty("phone")
    private String phone;
    /**
     * 用户自定义字段
     */
    @JsonProperty("customData")
    private Object customData;

    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    public String getPhoto() {
        return photo;
    }
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDevice() {
        return device;
    }
    public void setDevice(String device) {
        this.device = device;
    }

    public String getBrowser() {
        return browser;
    }
    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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

    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getProfile() {
        return profile;
    }
    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getPreferredUsername() {
        return preferredUsername;
    }
    public void setPreferredUsername(String preferredUsername) {
        this.preferredUsername = preferredUsername;
    }

    public String getWebsite() {
        return website;
    }
    public void setWebsite(String website) {
        this.website = website;
    }

    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getZoneinfo() {
        return zoneinfo;
    }
    public void setZoneinfo(String zoneinfo) {
        this.zoneinfo = zoneinfo;
    }

    public String getLocale() {
        return locale;
    }
    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getFormatted() {
        return formatted;
    }
    public void setFormatted(String formatted) {
        this.formatted = formatted;
    }

    public String getStreetAddress() {
        return streetAddress;
    }
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getLocality() {
        return locality;
    }
    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Object getCustomData() {
        return customData;
    }
    public void setCustomData(Object customData) {
        this.customData = customData;
    }


    /**
     * 性别 W : 女性; M : 男性
     */
    public static enum Gender {


        @JsonProperty("M")
        M("M"),


        @JsonProperty("F")
        F("F"),


        @JsonProperty("U")
        U("U"),
        ;

        private String value;

        Gender(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}