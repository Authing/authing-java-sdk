package dto;

import dto.IdentityDto;

public class UserDto {
    /**
     * 用户 ID
     */
    private String userId
    /**
     * 账户当前状态
     */
    private UserDto.status status
    /**
     * 邮箱
     */
    private String email
    /**
     * 手机号
     */
    private String phone
    /**
     * 手机区号
     */
    private String phoneCountryCode
    /**
     * 用户名，用户池内唯一
     */
    private String username
    /**
     * 用户真实名称，不具备唯一性
     */
    private String name
    /**
     * 昵称
     */
    private String nickname
    /**
     * 头像链接
     */
    private String photo
    /**
     * 历史总登录次数
     */
    private Int loginsCount
    /**
     * 上次登录时间
     */
    private String lastLogin
    /**
     * 上次登录 IP
     */
    private String lastIp
    /**
     * 性别
     */
    private UserDto.gender gender
    /**
     * 邮箱是否验证
     */
    private Boolean emailVerified
    /**
     * 手机号是否验证
     */
    private Boolean phoneVerified
    /**
     * 第三方外部 ID
     */
    private String externalId
    /**
     * 用户所属部门 ID 列表
     */
    private Array<string> departmentIds
    /**
     * 外部身份源
     */
    private Array<IdentityDto> identities
    /**
     * 自定义数据，传入的对象中的 key 必须先在用户池定义相关自定义字段
     */
    private any customData

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UserDto.status getStatus() {
        return status;
    }
    public void setStatus(UserDto.status status) {
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

    public Int getLoginsCount() {
        return loginsCount;
    }
    public void setLoginsCount(Int loginsCount) {
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

    public UserDto.gender getGender() {
        return gender;
    }
    public void setGender(UserDto.gender gender) {
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

    public Array<string> getDepartmentIds() {
        return departmentIds;
    }
    public void setDepartmentIds(Array<string> departmentIds) {
        this.departmentIds = departmentIds;
    }

    public Array<IdentityDto> getIdentities() {
        return identities;
    }
    public void setIdentities(Array<IdentityDto> identities) {
        this.identities = identities;
    }

    public any getCustomData() {
        return customData;
    }
    public void setCustomData(any customData) {
        this.customData = customData;
    }

};