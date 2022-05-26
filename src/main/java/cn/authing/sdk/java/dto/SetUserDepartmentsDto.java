package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.SetUserDepartmentDto;

public class SetUserDepartmentsDto {
    /**
     * 部门信息
     */
    @JsonProperty("departments")
    private List<SetUserDepartmentDto> departments;
    /**
     * 用户 ID
     */
    @JsonProperty("userId")
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