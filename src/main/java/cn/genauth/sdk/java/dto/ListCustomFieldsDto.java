package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListCustomFieldsDto {
    /**
     * 目标对象类型：
     * - `USER`: 用户
     * - `ROLE`: 角色
     * - `GROUP`: 分组
     * - `DEPARTMENT`: 部门
     * ;该接口暂不支持分组(GROUP)
     */
    @JsonProperty("targetType")
    private String targetType;
    /**
     * 字段类型
     */
    @JsonProperty("dataType")
    private String dataType;
    /**
     * 租户 ID
     */
    @JsonProperty("tenantId")
    private String tenantId;
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
     * 用户是否可见
     */
    @JsonProperty("userVisible")
    private Boolean userVisible;
    /**
     * 管理员是否可见
     */
    @JsonProperty("adminVisible")
    private Boolean adminVisible;
    /**
     * 访问控制
     */
    @JsonProperty("accessControl")
    private Boolean accessControl;
    /**
     * 搜索关键词
     */
    @JsonProperty("keyword")
    private String keyword;
    /**
     * 搜索语言
     */
    @JsonProperty("lang")
    private String lang;

    public String getTargetType() {
        return targetType;
    }
    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public String getDataType() {
        return dataType;
    }
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getTenantId() {
        return tenantId;
    }
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
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

    public Boolean getUserVisible() {
        return userVisible;
    }
    public void setUserVisible(Boolean userVisible) {
        this.userVisible = userVisible;
    }

    public Boolean getAdminVisible() {
        return adminVisible;
    }
    public void setAdminVisible(Boolean adminVisible) {
        this.adminVisible = adminVisible;
    }

    public Boolean getAccessControl() {
        return accessControl;
    }
    public void setAccessControl(Boolean accessControl) {
        this.accessControl = accessControl;
    }

    public String getKeyword() {
        return keyword;
    }
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getLang() {
        return lang;
    }
    public void setLang(String lang) {
        this.lang = lang;
    }



}