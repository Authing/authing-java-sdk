package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetUserDto {
    /**
     * 用户 ID
     */
    @JsonProperty("userId")
    private String userId;
    /**
     * 是否获取自定义数据
     */
    @JsonProperty("withCustomData")
    private Boolean withCustomData;
    /**
     * 是否获取 identities
     */
    @JsonProperty("withIdentities")
    private Boolean withIdentities;
    /**
     * 是否获取部门 ID 列表
     */
    @JsonProperty("withDepartmentIds")
    private Boolean withDepartmentIds;
    /**
     * 手机号
     */
    @JsonProperty("phone")
    private String phone;
    /**
     * 邮箱
     */
    @JsonProperty("email")
    private String email;
    /**
     * 用户名
     */
    @JsonProperty("username")
    private String username;
    /**
     * 原系统 ID
     */
    @JsonProperty("externalId")
    private String externalId;

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Boolean getWithCustomData() {
        return withCustomData;
    }
    public void setWithCustomData(Boolean withCustomData) {
        this.withCustomData = withCustomData;
    }

    public Boolean getWithIdentities() {
        return withIdentities;
    }
    public void setWithIdentities(Boolean withIdentities) {
        this.withIdentities = withIdentities;
    }

    public Boolean getWithDepartmentIds() {
        return withDepartmentIds;
    }
    public void setWithDepartmentIds(Boolean withDepartmentIds) {
        this.withDepartmentIds = withDepartmentIds;
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



}