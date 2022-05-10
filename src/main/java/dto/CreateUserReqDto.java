package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import dto.CreateIdentityDto;
import dto.CreateUserOptionsDto;

public class CreateUserReqDto {
    /**
     * 账户当前状态
     */
    @JsonProperty("getStatus")
    private Status status;
    /**
     * 邮箱
     */
    @JsonProperty("getEmail")
    private String email;
    /**
     * 加密类型
     */
    @JsonProperty("getPasswordEncryptType")
    private PasswordEncryptType passwordEncryptType;
    /**
     * 手机号
     */
    @JsonProperty("getPhone")
    private String phone;
    /**
     * 手机区号
     */
    @JsonProperty("getPhoneCountryCode")
    private String phoneCountryCode;
    /**
     * 用户名，用户池内唯一
     */
    @JsonProperty("getUsername")
    private String username;
    /**
     * 用户真实名称，不具备唯一性
     */
    @JsonProperty("getName")
    private String name;
    /**
     * 昵称
     */
    @JsonProperty("getNickname")
    private String nickname;
    /**
     * 头像链接
     */
    @JsonProperty("getPhoto")
    private String photo;
    /**
     * 性别
     */
    @JsonProperty("getGender")
    private Gender gender;
    /**
     * 邮箱是否验证
     */
    @JsonProperty("getEmailVerified")
    private Boolean emailVerified;
    /**
     * 手机号是否验证
     */
    @JsonProperty("getPhoneVerified")
    private Boolean phoneVerified;
    /**
     * 第三方外部 ID
     */
    @JsonProperty("getExternalId")
    private String externalId;
    /**
     * 用户所属部门 ID 列表
     */
    @JsonProperty("getDepartmentIds")
    private List<String> departmentIds;
    /**
     * 自定义数据，传入的对象中的 key 必须先在用户池定义相关自定义字段
     */
    @JsonProperty("getCustomData")
    private Object customData;
    /**
     * 密码。可选加密方式进行加密，默认为未加密
     */
    @JsonProperty("getPassword")
    private String password;
    /**
     * 租户 ID
     */
    @JsonProperty("getTenantIds")
    private List<String> tenantIds;
    /**
     * 第三方身份源（建议调用绑定接口进行绑定）
     */
    @JsonProperty("getIdentities")
    private List<CreateIdentityDto> nase identities;
    /**
     * 附加选项
     */
    @JsonProperty("getOptions")
    private CreateUserOptionsDto options;

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

    public PasswordEncryptType getPasswordEncryptType() {
        return passwordEncryptType;
    }
    public void setPasswordEncryptType(PasswordEncryptType passwordEncryptType) {
        this.passwordEncryptType = passwordEncryptType;
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

    public String getExternalId() {
        return externalId;
    }
    public void setExternalId(String externalId) {
        this.externalId = externalId;
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

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getTenantIds() {
        return tenantIds;
    }
    public void setTenantIds(List<String> tenantIds) {
        this.tenantIds = tenantIds;
    }

    public List<CreateIdentityDto> nase getIdentities() {
        return identities;
    }
    public void setIdentities(List<CreateIdentityDto> nase identities) {
        this.identities = identities;
    }

    public CreateUserOptionsDto getOptions() {
        return options;
    }
    public void setOptions(CreateUserOptionsDto options) {
        this.options = options;
    }


    /**
     * 账户当前状态
     */
    public static enum Status {
        DELETED("Deleted"),
        SUSPENDED("Suspended"),
        RESIGNED("Resigned"),
        ACTIVATED("Activated"),
        ARCHIVED("Archived"),
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
     * 加密类型
     */
    public static enum PasswordEncryptType {
        SM2("sm2"),
        RSA("rsa"),
        NONE("none"),
        ;

        private String value;

        PasswordEncryptType(String value) {
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
        M("M"),
        W("W"),
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