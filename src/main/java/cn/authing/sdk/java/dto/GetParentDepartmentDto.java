package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetParentDepartmentDto {
    /**
     * 组织 code
     */
    @JsonProperty("organization_code")
    private String organizationCode;
    /**
     * 部门 id
     */
    @JsonProperty("department_id")
    private String departmentId;

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



}