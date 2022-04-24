package dto;

import java.util.List;

import dto.ListDepartmentMembersOptionsDto;

public class ListDepartmentMembersReqDto {
    /**
     * 部门 id，根部门传 `root`
     */
    private String departmentId;
    /**
     * 组织 code
     */
    private String organizationCode;
    /**
     * 可选参数
     */
    private ListDepartmentMembersOptionsDto options;

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

    public ListDepartmentMembersOptionsDto getOptions() {
        return options;
    }
    public void setOptions(ListDepartmentMembersOptionsDto options) {
        this.options = options;
    }



}