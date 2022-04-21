package dto;


public class AddDepartmentMembersReqDto {
    /**
     * 部门 ID
     */
    private String departmentId
    /**
     * 组织 code
     */
    private String organizationCode
    /**
     * 用户 ID 列表
     */
    private Array<string> userIds

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

    public Array<string> getUserIds() {
        return userIds;
    }
    public void setUserIds(Array<string> userIds) {
        this.userIds = userIds;
    }

};