package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateUserProfileDto {
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
     * 第三方外部 ID
     */
    @JsonProperty("externalId")
    private String externalId;
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
     * 性别
     */
    @JsonProperty("gender")
    private Gender gender;
    /**
     * 用户名，用户池内唯一
     */
    @JsonProperty("username")
    private String username;
    /**
     * 所在公司
     */
    @JsonProperty("company")
    private String company;
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

    public String getExternalId() {
        return externalId;
    }
    public void setExternalId(String externalId) {
        this.externalId = externalId;
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

    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
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
        W("W")
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