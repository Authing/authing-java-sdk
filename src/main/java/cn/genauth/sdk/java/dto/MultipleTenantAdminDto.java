package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MultipleTenantAdminDto {
    /**
     * 用户唯一 ID
     */
    @JsonProperty("userId")
    private String userId;
    /**
     * 用户名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 用户手机号
     */
    @JsonProperty("phone")
    private String phone;
    /**
     * 用户邮箱
     */
    @JsonProperty("email")
    private String email;
    /**
     * 授权 API
     */
    @JsonProperty("apiAuthorized")
    private Boolean apiAuthorized;
    /**
     * 最后登录时间
     */
    @JsonProperty("lastLogin")
    private String lastLogin;

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getApiAuthorized() {
        return apiAuthorized;
    }
    public void setApiAuthorized(Boolean apiAuthorized) {
        this.apiAuthorized = apiAuthorized;
    }

    public String getLastLogin() {
        return lastLogin;
    }
    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }



}