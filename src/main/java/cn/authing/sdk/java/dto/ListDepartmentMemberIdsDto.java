package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListDepartmentMemberIdsDto {
    /**
     * 部门 ID
     */
    @JsonProperty("department_id")
    private String departmentId;
    /**
     * 组织 code
     */
    @JsonProperty("organization_code")
    private String organizationCode;

    public String getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getOrganizationCode() {
        return organizationCode;
    }
    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }



}