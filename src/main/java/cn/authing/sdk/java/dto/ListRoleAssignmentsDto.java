package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListRoleAssignmentsDto {
    /**
     * 角色 code,只能使用字母、数字和 -_，最多 50 字符
     */
    @JsonProperty("roleCode")
    private String roleCode;
    /**
     * 当前页数，从 1 开始
     */
    @JsonProperty("page")
    private Integer page;
    /**
     * 每页数目，最大不能超过 50，默认为 10
     */
    @JsonProperty("limit")
    private Integer limit;
    /**
     * 按角色 Code 或者角色名称查询
     */
    @JsonProperty("query")
    private String query;
    /**
     * 权限空间code
     */
    @JsonProperty("namespaceCode")
    private String namespaceCode;
    /**
     * 目标类型，接受用户，部门
     */
    @JsonProperty("targetType")
    private String targetType;

    public String getRoleCode() {
        return roleCode;
    }
    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public Integer getPage() {
        return page;
    }
    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getQuery() {
        return query;
    }
    public void setQuery(String query) {
        this.query = query;
    }

    public String getNamespaceCode() {
        return namespaceCode;
    }
    public void setNamespaceCode(String namespaceCode) {
        this.namespaceCode = namespaceCode;
    }

    public String getTargetType() {
        return targetType;
    }
    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }



}