package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PublicAccountDto {
    /**
     * 用户唯一标志，可以是用户 ID、用户名、邮箱、手机号、外部 ID、在外部身份源的 ID。
     */
    @JsonProperty("userId")
    private String userId;
    /**
     * 创建时间
     */
    @JsonProperty("createdAt")
    private String createdAt;
    /**
     * 更新时间
     */
    @JsonProperty("updatedAt")
    private String updatedAt;
    /**
     * 账户当前状态
     */
    @JsonProperty("status")
    private Status status;
    /**
     * 账户当前工作状态
     */
    @JsonProperty("workStatus")
    private WorkStatus workStatus;
    /**
     * 第三方外部 ID
     */
    @JsonProperty("externalId")
    private String externalId;
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
     * 历史总登录次数
     */
    @JsonProperty("loginsCount")
    private Integer loginsCount;
    /**
     * 上次登录时间
     */
    @JsonProperty("lastLogin")
    private String lastLogin;
    /**
     * 上次登录 IP
     */
    @JsonProperty("lastIp")
    private String lastIp;
    /**
     * 性别:
     * - `M`: 男性，`male`
     * - `F`: 女性，`female`
     * - `U`: 未知，`unknown`
     *
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
     * 用户上次密码修改时间
     */
    @JsonProperty("passwordLastSetAt")
    private String passwordLastSetAt;
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
     * 来源类型:
     * - `excel`: 通过 excel 导入
     * - `register`: 用户自主注册
     * - `adminCreated`: 管理员后台手动创建（包含使用管理 API 创建用户 ）
     * - `syncTask`: 同步中心的同步任务
     *
     */
    @JsonProperty("userSourceType")
    private UserSourceType userSourceType;
    /**
     * 应用 ID 或者同步任务 ID
     */
    @JsonProperty("userSourceId")
    private String userSourceId;
    /**
     * 用户上次登录的应用 ID
     */
    @JsonProperty("lastLoginApp")
    private String lastLoginApp;
    /**
     * 用户主部门 ID
     */
    @JsonProperty("mainDepartmentId")
    private String mainDepartmentId;
    /**
     * 用户上次进行 MFA 认证的时间
     */
    @JsonProperty("lastMfaTime")
    private String lastMfaTime;
    /**
     * 用户密码安全强度等级
     */
    @JsonProperty("passwordSecurityLevel")
    private Integer passwordSecurityLevel;
    /**
     * 下次登录要求重置密码
     */
    @JsonProperty("resetPasswordOnNextLogin")
    private Boolean resetPasswordOnNextLogin;
    /**
     * 注册方式
     */
    @JsonProperty("registerSource")
    private List<String> registerSource;
    /**
     * 公共账号所属部门 ID 列表
     */
    @JsonProperty("departmentIds")
    private List<String> departmentIds;
    /**
     * 用户身份证号码
     */
    @JsonProperty("identityNumber")
    private String identityNumber;
    /**
     * 公共账号的扩展字段数据
     */
    @JsonProperty("customData")
    private Object customData;
    /**
     * 公共账号状态上次修改时间
     */
    @JsonProperty("statusChangedAt")
    private String statusChangedAt;
    /**
     * 用户租户 ID
     */
    @JsonProperty("tenantId")
    private String tenantId;

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    public WorkStatus getWorkStatus() {
        return workStatus;
    }
    public void setWorkStatus(WorkStatus workStatus) {
        this.workStatus = workStatus;
    }

    public String getExternalId() {
        return externalId;
    }
    public void setExternalId(String externalId) {
        this.externalId = externalId;
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

    public Integer getLoginsCount() {
        return loginsCount;
    }
    public void setLoginsCount(Integer loginsCount) {
        this.loginsCount = loginsCount;
    }

    public String getLastLogin() {
        return lastLogin;
    }
    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getLastIp() {
        return lastIp;
    }
    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
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

    public String getPasswordLastSetAt() {
        return passwordLastSetAt;
    }
    public void setPasswordLastSetAt(String passwordLastSetAt) {
        this.passwordLastSetAt = passwordLastSetAt;
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

    public UserSourceType getUserSourceType() {
        return userSourceType;
    }
    public void setUserSourceType(UserSourceType userSourceType) {
        this.userSourceType = userSourceType;
    }

    public String getUserSourceId() {
        return userSourceId;
    }
    public void setUserSourceId(String userSourceId) {
        this.userSourceId = userSourceId;
    }

    public String getLastLoginApp() {
        return lastLoginApp;
    }
    public void setLastLoginApp(String lastLoginApp) {
        this.lastLoginApp = lastLoginApp;
    }

    public String getMainDepartmentId() {
        return mainDepartmentId;
    }
    public void setMainDepartmentId(String mainDepartmentId) {
        this.mainDepartmentId = mainDepartmentId;
    }

    public String getLastMfaTime() {
        return lastMfaTime;
    }
    public void setLastMfaTime(String lastMfaTime) {
        this.lastMfaTime = lastMfaTime;
    }

    public Integer getPasswordSecurityLevel() {
        return passwordSecurityLevel;
    }
    public void setPasswordSecurityLevel(Integer passwordSecurityLevel) {
        this.passwordSecurityLevel = passwordSecurityLevel;
    }

    public Boolean getResetPasswordOnNextLogin() {
        return resetPasswordOnNextLogin;
    }
    public void setResetPasswordOnNextLogin(Boolean resetPasswordOnNextLogin) {
        this.resetPasswordOnNextLogin = resetPasswordOnNextLogin;
    }

    public List<String> getRegisterSource() {
        return registerSource;
    }
    public void setRegisterSource(List<String> registerSource) {
        this.registerSource = registerSource;
    }

    public List<String> getDepartmentIds() {
        return departmentIds;
    }
    public void setDepartmentIds(List<String> departmentIds) {
        this.departmentIds = departmentIds;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }
    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public Object getCustomData() {
        return customData;
    }
    public void setCustomData(Object customData) {
        this.customData = customData;
    }

    public String getStatusChangedAt() {
        return statusChangedAt;
    }
    public void setStatusChangedAt(String statusChangedAt) {
        this.statusChangedAt = statusChangedAt;
    }

    public String getTenantId() {
        return tenantId;
    }
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
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
     * 账户当前工作状态
     */
    public static enum WorkStatus {

        @JsonProperty("Closed")
        CLOSED("Closed"),

        @JsonProperty("Active")
        ACTIVE("Active"),
        ;

        private String value;

        WorkStatus(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * 性别:
     * - `M`: 男性，`male`
     * - `F`: 女性，`female`
     * - `U`: 未知，`unknown`
     *
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

    /**
     * 来源类型:
     * - `excel`: 通过 excel 导入
     * - `register`: 用户自主注册
     * - `adminCreated`: 管理员后台手动创建（包含使用管理 API 创建用户 ）
     * - `syncTask`: 同步中心的同步任务
     *
     */
    public static enum UserSourceType {

        @JsonProperty("excel")
        EXCEL("excel"),

        @JsonProperty("register")
        REGISTER("register"),

        @JsonProperty("adminCreated")
        ADMIN_CREATED("adminCreated"),

        @JsonProperty("sync")
        SYNC("sync"),
        ;

        private String value;

        UserSourceType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}