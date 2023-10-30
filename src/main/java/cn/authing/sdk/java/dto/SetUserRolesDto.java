package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SetUserRolesDto {
    /**
     * 角色 IDs
     */
    @JsonProperty("roleIds")
    private List<String> roleIds;
    /**
     * 用户唯一标志，可以是用户 ID、用户名、邮箱、手机号、外部 ID、在外部身份源的 ID。
     */
    @JsonProperty("userId")
    private String userId;

    public List<String> getRoleIds() {
        return roleIds;
    }
    public void setRoleIds(List<String> roleIds) {
        this.roleIds = roleIds;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }



}