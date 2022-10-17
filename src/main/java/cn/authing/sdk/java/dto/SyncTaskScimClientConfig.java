package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SyncTaskScimClientConfig {
    /**
     * Group Url
     */
    @JsonProperty("org_url")
    private String orgUrl;
    /**
     * User Url
     */
    @JsonProperty("user_url")
    private String userUrl;
    /**
     * Token
     */
    @JsonProperty("token")
    private String token;
    /**
     * Root Department Id
     */
    @JsonProperty("root_department_id")
    private String rootDepartmentId;
    /**
     * Parent Department
     */
    @JsonProperty("parent_department")
    private String parentDepartment;
    /**
     * Department
     */
    @JsonProperty("department")
    private String department;

    public String getOrgUrl() {
        return orgUrl;
    }
    public void setOrgUrl(String orgUrl) {
        this.orgUrl = orgUrl;
    }

    public String getUserUrl() {
        return userUrl;
    }
    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl;
    }

    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }

    public String getRootDepartmentId() {
        return rootDepartmentId;
    }
    public void setRootDepartmentId(String rootDepartmentId) {
        this.rootDepartmentId = rootDepartmentId;
    }

    public String getParentDepartment() {
        return parentDepartment;
    }
    public void setParentDepartment(String parentDepartment) {
        this.parentDepartment = parentDepartment;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }



}