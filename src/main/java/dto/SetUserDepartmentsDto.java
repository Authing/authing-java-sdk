package dto;

import java.util.List;

import dto.SetUserDepartmentDto;

public class SetUserDepartmentsDto {
    /**
     * 部门信息
     */
    private List<SetUserDepartmentDto> departments;
    /**
     * 用户 ID
     */
    private String userId;

    public List<SetUserDepartmentDto> getDepartments() {
        return departments;
    }
    public void setDepartments(List<SetUserDepartmentDto> departments) {
        this.departments = departments;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }



}