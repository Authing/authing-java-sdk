package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetDepartmentDto {
    /**
     * 组织 code
     */
    @JsonProperty("organization_code")
    private String organizationCode;
    /**
     * 部门 id，根部门传 `root`
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