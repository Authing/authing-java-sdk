package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetParentDepartmentDto {
    /**
     * 组织 code
     */
    @JsonProperty("organizationCode")
    private String organizationCode;
    /**
     * 部门 id
     */
    @JsonProperty("departmentId")
    private String departmentId;
    /**
     * 此次调用中使用的部门 ID 的类型
     */
    @JsonProperty("departmentIdType")
    private String departmentIdType;

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

    public String getDepartmentIdType() {
        return departmentIdType;
    }
    public void setDepartmentIdType(String departmentIdType) {
        this.departmentIdType = departmentIdType;
    }



}