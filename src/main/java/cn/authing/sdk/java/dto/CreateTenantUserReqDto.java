package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.CreateTenantUserOptionsDto;

public class CreateTenantUserReqDto {
    /**
     * 租户 ID
     */
    @JsonProperty("tenantId")
    private String tenantId;
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
    @JsonProperty("preferredUsername")
    private String preferredUsername;
    /**
     * 用户密码。我们使用 HTTPS 协议对密码进行安全传输，可以在一定程度上保证安全性。如果你还需要更高级别的安全性，我们还支持 RSA256 和国密 SM2 两种方式对密码进行加密。详情见 `passwordEncryptType` 参数。
     */
    @JsonProperty("password")
    private String password;
    /**
     * 加密用户密码的盐
     */
    @JsonProperty("salt")
    private String salt;
    /**
     * 可选参数
     */
    @JsonProperty("options")
    private CreateTenantUserOptionsDto options;

    public String getTenantId() {
        return tenantId;
    }
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
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

    public String getPreferredUsername() {
        return preferredUsername;
    }
    public void setPreferredUsername(String preferredUsername) {
        this.preferredUsername = preferredUsername;
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

    public CreateTenantUserOptionsDto getOptions() {
        return options;
    }
    public void setOptions(CreateTenantUserOptionsDto options) {
        this.options = options;
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


}