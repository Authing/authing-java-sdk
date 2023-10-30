package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListChildrenDepartmentsDto {
    /**
     * 组织 code
     */
    @JsonProperty("organizationCode")
    private String organizationCode;
    /**
     * 需要获取的部门 ID
     */
    @JsonProperty("departmentId")
    private String departmentId;
    /**
     * 部门的状态
     */
    @JsonProperty("status")
    private Boolean status;
    /**
     * 此次调用中使用的部门 ID 的类型
     */
    @JsonProperty("departmentIdType")
    private String departmentIdType;
    /**
     * 是否要排除虚拟组织
     */
    @JsonProperty("excludeVirtualNode")
    private Boolean excludeVirtualNode;
    /**
     * 是否只包含虚拟组织
     */
    @JsonProperty("onlyVirtualNode")
    private Boolean onlyVirtualNode;
    /**
     * 是否获取自定义数据
     */
    @JsonProperty("withCustomData")
    private Boolean withCustomData;
    /**
     * 租户 ID
     */
    @JsonProperty("tenantId")
    private String tenantId;

    public String getOrganizationCode() {
        return organizationCode;
    }
    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getDepartmentIdType() {
        return departmentIdType;
    }
    public void setDepartmentIdType(String departmentIdType) {
        this.departmentIdType = departmentIdType;
    }

    public Boolean getExcludeVirtualNode() {
        return excludeVirtualNode;
    }
    public void setExcludeVirtualNode(Boolean excludeVirtualNode) {
        this.excludeVirtualNode = excludeVirtualNode;
    }

    public Boolean getOnlyVirtualNode() {
        return onlyVirtualNode;
    }
    public void setOnlyVirtualNode(Boolean onlyVirtualNode) {
        this.onlyVirtualNode = onlyVirtualNode;
    }

    public Boolean getWithCustomData() {
        return withCustomData;
    }
    public void setWithCustomData(Boolean withCustomData) {
        this.withCustomData = withCustomData;
    }

    public String getTenantId() {
        return tenantId;
    }
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }



}