package dto;


public class CreateDepartmentReqDto {
    /**
     * 组织 code
     */
    private String organizationCode
    /**
     * 部门名称
     */
    private String name
    /**
     * 父部门 id
     */
    private String parentDepartmentId
    /**
     * 部门识别码
     */
    private String code
    /**
     * 部门负责人 ID
     */
    private String leaderUserId

    public String getOrganizationCode() {
        return organizationCode;
    }
    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getParentDepartmentId() {
        return parentDepartmentId;
    }
    public void setParentDepartmentId(String parentDepartmentId) {
        this.parentDepartmentId = parentDepartmentId;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getLeaderUserId() {
        return leaderUserId;
    }
    public void setLeaderUserId(String leaderUserId) {
        this.leaderUserId = leaderUserId;
    }

};