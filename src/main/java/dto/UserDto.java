package dto;

import java.util.List;

import dto.IdentityDto;

public class UserDto {
    /**
     * 用户 ID
     */
    private String userId;
    /**
     * 账户当前状态
     */
    private Status status;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 手机区号
     */
    private String phoneCountryCode;
    /**
     * 用户名，用户池内唯一
     */
    private String username;
    /**
     * 用户真实名称，不具备唯一性
     */
    private String name;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 头像链接
     */
    private String photo;
    /**
     * 历史总登录次数
     */
    private Integer loginsCount;
    /**
     * 上次登录时间
     */
    private String lastLogin;
    /**
     * 上次登录 IP
     */
    private String lastIp;
    /**
     * 性别
     */
    private Gender gender;
    /**
     * 邮箱是否验证
     */
    private Boolean emailVerified;
    /**
     * 手机号是否验证
     */
    private Boolean phoneVerified;
    /**
     * 第三方外部 ID
     */
    private String externalId;
    /**
     * 用户所属部门 ID 列表
     */
    private List<string> departmentIds;
    /**
     * 外部身份源
     */
    private List<IdentityDto> identities;
    /**
     * 自定义数据，传入的对象中的 key 必须先在用户池定义相关自定义字段
     */
    private Object customData;

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

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

    public String getExternalId() {
        return externalId;
    }
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public List<string> getDepartmentIds() {
        return departmentIds;
    }
    public void setDepartmentIds(List<string> departmentIds) {
        this.departmentIds = departmentIds;
    }

    public List<IdentityDto> getIdentities() {
        return identities;
    }
    public void setIdentities(List<IdentityDto> identities) {
        this.identities = identities;
    }

    public Object getCustomData() {
        return customData;
    }
    public void setCustomData(Object customData) {
        this.customData = customData;
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