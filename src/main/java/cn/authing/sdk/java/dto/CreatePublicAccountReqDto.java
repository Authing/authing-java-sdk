package cn.authing.sdk.java.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.CreatePublicAccountOptionsDto;
import cn.authing.sdk.java.dto.CreatePublicAccountOtpDto;

public class CreatePublicAccountReqDto {
    /**
     * 账户当前状态
     */
    @JsonProperty("status")
    private Status status;
    /**
     * 邮箱，不区分大小写
     */
    @JsonProperty("email")
    private String email;
    /**
     * 手机号，不带区号。如果是国外手机号，请在 phoneCountryCode 参数中指定区号。
     */
    @JsonProperty("phone")
    private String phone;
    /**
     * 手机区号，中国大陆手机号可不填。Authing 短信服务暂不内置支持国际手机号，你需要在 Authing 控制台配置对应的国际短信服务。完整的手机区号列表可参阅 https://en.wikipedia.org/wiki/List_of_country_calling_codes。
     */
    @JsonProperty("phoneCountryCode")
    private String phoneCountryCode;
    /**
     * 用户名，用户池内唯一
     */
    @JsonProperty("username")
    private String username;
    /**
     * 第三方外部 ID
     */
    @JsonProperty("externalId")
    private String externalId;
    /**
     * 用户真实名称，不具备唯一性
     */
    @JsonProperty("name")
    private String name;
    /**
     * 昵称
     */
    @JsonProperty("nickname")
    private String nickname;
    /**
     * 头像链接
     */
    @JsonProperty("photo")
    private String photo;
    /**
     * 性别
     */
    @JsonProperty("gender")
    private Gender gender;
    /**
     * 邮箱是否验证
     */
    @JsonProperty("emailVerified")
    private Boolean emailVerified;
    /**
     * 手机号是否验证
     */
    @JsonProperty("phoneVerified")
    private Boolean phoneVerified;
    /**
     * 出生日期
     */
    @JsonProperty("birthdate")
    private String birthdate;
    /**
     * 所在国家
     */
    @JsonProperty("country")
    private String country;
    /**
     * 所在省份
     */
    @JsonProperty("province")
    private String province;
    /**
     * 所在城市
     */
    @JsonProperty("city")
    private String city;
    /**
     * 所处地址
     */
    @JsonProperty("address")
    private String address;
    /**
     * 所处街道地址
     */
    @JsonProperty("streetAddress")
    private String streetAddress;
    /**
     * 邮政编码号
     */
    @JsonProperty("postalCode")
    private String postalCode;
    /**
     * 所在公司
     */
    @JsonProperty("company")
    private String company;
    /**
     * 最近一次登录时使用的浏览器 UA
     */
    @JsonProperty("browser")
    private String browser;
    /**
     * 最近一次登录时使用的设备
     */
    @JsonProperty("device")
    private String device;
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
     * Preferred Username
     */
    @JsonProperty("profile")
    private String profile;
    /**
     * Preferred Username
     */
    @JsonProperty("preferredUsername")
    private String preferredUsername;
    /**
     * 用户个人网页
     */
    @JsonProperty("website")
    private String website;
    /**
     * 用户时区信息
     */
    @JsonProperty("zoneinfo")
    private String zoneinfo;
    /**
     * Locale
     */
    @JsonProperty("locale")
    private String locale;
    /**
     * 标准的完整地址
     */
    @JsonProperty("formatted")
    private String formatted;
    /**
     * 用户所在区域
     */
    @JsonProperty("region")
    private String region;
    /**
     * 用户密码，默认为明文。我们使用 HTTPS 协议对密码进行安全传输，可以在一定程度上保证安全性。如果你还需要更高级别的安全性，我们还支持 RSA256 和国密 SM2 两种方式对密码进行加密。详情见 `passwordEncryptType` 参数。
     */
    @JsonProperty("password")
    private String password;
    /**
     * 加密用户密码的盐
     */
    @JsonProperty("salt")
    private String salt;
    /**
     * 公共账号的 OTP 验证器
     */
    @JsonProperty("otp")
    private CreatePublicAccountOtpDto otp;
    /**
     * 用户所属部门 ID 列表
     */
    @JsonProperty("departmentIds")
    private List<String> departmentIds;
    /**
     * 自定义数据，传入的对象中的 key 必须先在用户池定义相关自定义字段
     */
    @JsonProperty("customData")
    private Object customData;
    /**
     * 用户身份证号码
     */
    @JsonProperty("identityNumber")
    private String identityNumber;
    /**
     * 可选参数
     */
    @JsonProperty("options")
    private CreatePublicAccountOptionsDto options;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
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

    public String getPhoneCountryCode() {
        return phoneCountryCode;
    }

    public void setPhoneCountryCode(String phoneCountryCode) {
        this.phoneCountryCode = phoneCountryCode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Boolean getEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(Boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    public Boolean getPhoneVerified() {
        return phoneVerified;
    }

    public void setPhoneVerified(Boolean phoneVerified) {
        this.phoneVerified = phoneVerified;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
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

    public String getFormatted() {
        return formatted;
    }

    public void setFormatted(String formatted) {
        this.formatted = formatted;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public CreatePublicAccountOtpDto getOtp() {
        return otp;
    }

    public void setOtp(CreatePublicAccountOtpDto otp) {
        this.otp = otp;
    }

    public List<String> getDepartmentIds() {
        return departmentIds;
    }

    public void setDepartmentIds(List<String> departmentIds) {
        this.departmentIds = departmentIds;
    }

    public Object getCustomData() {
        return customData;
    }

    public void setCustomData(Object customData) {
        this.customData = customData;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public CreatePublicAccountOptionsDto getOptions() {
        return options;
    }

    public void setOptions(CreatePublicAccountOptionsDto options) {
        this.options = options;
    }


    /**
     * 账户当前状态
     */
    public static enum Status {

        @JsonProperty("Suspended")
        SUSPENDED("Suspended"),

        @JsonProperty("Resigned")
        RESIGNED("Resigned"),

        @JsonProperty("Activated")
        ACTIVATED("Activated"),

        @JsonProperty("Archived")
        ARCHIVED("Archived"),

        @JsonProperty("Deactivated")
        DEACTIVATED("Deactivated"),
        ;

        private String value;

        Status(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * 性别
     */
    public static enum Gender {

        @JsonProperty("M")
        M("M"),

        @JsonProperty("F")
        F("F"),

        @JsonProperty("U")
        U("U"),

        @JsonProperty("W")
        W("W");


        private String value;

        Gender(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}