package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SyncTaskLdapClientConfig {
    /**
     * LDAP 链接
     */
    @JsonProperty("url")
    private String url;
    /**
     * Bind DN
     */
    @JsonProperty("bindDn")
    private String bindDn;
    /**
     * Bind DN 密码
     */
    @JsonProperty("bindCredentials")
    private String bindCredentials;
    /**
     * Users Base DN
     */
    @JsonProperty("usersBaseDn")
    private String usersBaseDn;
    /**
     * Groups Base Dn
     */
    @JsonProperty("groupsBaseDn")
    private String groupsBaseDn;
    /**
     * 用户查询条件
     */
    @JsonProperty("userQueryCriteria")
    private String userQueryCriteria;
    /**
     * 部门查询条件
     */
    @JsonProperty("departmentQueryCriteria")
    private String departmentQueryCriteria;

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public String getBindDn() {
        return bindDn;
    }
    public void setBindDn(String bindDn) {
        this.bindDn = bindDn;
    }

    public String getBindCredentials() {
        return bindCredentials;
    }
    public void setBindCredentials(String bindCredentials) {
        this.bindCredentials = bindCredentials;
    }

    public String getUsersBaseDn() {
        return usersBaseDn;
    }
    public void setUsersBaseDn(String usersBaseDn) {
        this.usersBaseDn = usersBaseDn;
    }

    public String getGroupsBaseDn() {
        return groupsBaseDn;
    }
    public void setGroupsBaseDn(String groupsBaseDn) {
        this.groupsBaseDn = groupsBaseDn;
    }

    public String getUserQueryCriteria() {
        return userQueryCriteria;
    }
    public void setUserQueryCriteria(String userQueryCriteria) {
        this.userQueryCriteria = userQueryCriteria;
    }

    public String getDepartmentQueryCriteria() {
        return departmentQueryCriteria;
    }
    public void setDepartmentQueryCriteria(String departmentQueryCriteria) {
        this.departmentQueryCriteria = departmentQueryCriteria;
    }



}