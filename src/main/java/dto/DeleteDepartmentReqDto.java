package dto;

import java.util.List;


public class DeleteDepartmentReqDto {
    /**
     * 组织 code
     */
    private String organizationCode;
    /**
     * 部门 ID
     */
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



};