package dto;

import dto.SetUserDepartmentDto;

public class SetUserDepartmentsDto {
    /**
     * 部门信息
     */
    private Array<SetUserDepartmentDto> departments
    /**
     * 用户 ID
     */
    private String userId

    public Array<SetUserDepartmentDto> getDepartments() {
        return departments;
    }
    public void setDepartments(Array<SetUserDepartmentDto> departments) {
        this.departments = departments;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

};