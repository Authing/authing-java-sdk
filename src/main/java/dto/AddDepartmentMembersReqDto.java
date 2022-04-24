package dto;

import java.util.List;


public class AddDepartmentMembersReqDto {
    /**
     * 部门 ID
     */
    private String departmentId;
    /**
     * 组织 code
     */
    private String organizationCode;
    /**
     * 用户 ID 列表
     */
    private List<String> userIds;

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

    public List<String> getUserIds() {
        return userIds;
    }
    public void setUserIds(List<String> userIds) {
        this.userIds = userIds;
    }



}