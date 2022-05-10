package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import dto.SetUserDepartmentDto;

public class SetUserDepartmentsDto {
    /**
     * 部门信息
     */
    @JsonProperty("getDepartments")
    private List<SetUserDepartmentDto> nase departments;
    /**
     * 用户 ID
     */
    @JsonProperty("getUserId")
    private String userId;

    public List<SetUserDepartmentDto> nase getDepartments() {
        return departments;
    }
    public void setDepartments(List<SetUserDepartmentDto> nase departments) {
        this.departments = departments;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }



}