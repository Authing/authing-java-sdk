package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SyncTaskProvisioningScope {
    /**
     * 是否同步所选组织机构下的所有用户和部门
     */
    @JsonProperty("all")
    private Boolean all;
    /**
     * 是否包含新增的用户
     */
    @JsonProperty("includeNewUsers")
    private Boolean includeNewUsers;

    public Boolean getAll() {
        return all;
    }
    public void setAll(Boolean all) {
        this.all = all;
    }

    public Boolean getIncludeNewUsers() {
        return includeNewUsers;
    }
    public void setIncludeNewUsers(Boolean includeNewUsers) {
        this.includeNewUsers = includeNewUsers;
    }



}