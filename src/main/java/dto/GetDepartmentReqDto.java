package dto;

import java.util.List;


public class GetDepartmentReqDto {
    /**
     * 部门 id，根部门传 `root`
     */
    private String departmentId;
    /**
     * 组织 code
     */
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



};