package dto;


public class UserDepartmentRespDto {
    /**
     * 部门 ID
     */
    private String departmentId
    /**
     * 部门名称
     */
    private String name
    /**
     * 部门描述
     */
    private String description
    /**
     * 是否是部门 Leader
     */
    private Boolean isLeader
    /**
     * 部门识别码
     */
    private String code
    /**
     * 是否是主部门
     */
    private Boolean isMainDepartment

    public String getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsLeader() {
        return isLeader;
    }
    public void setIsLeader(Boolean isLeader) {
        this.isLeader = isLeader;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getIsMainDepartment() {
        return isMainDepartment;
    }
    public void setIsMainDepartment(Boolean isMainDepartment) {
        this.isMainDepartment = isMainDepartment;
    }

};