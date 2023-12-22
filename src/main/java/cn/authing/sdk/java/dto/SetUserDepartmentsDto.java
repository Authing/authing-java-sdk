package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.SetUserDepartmentDto;
import cn.authing.sdk.java.dto.SetUserDepartmentsOptionsDto;

public class SetUserDepartmentsDto {
    /**
     * 用户的唯一标志，可以是用户 ID、用户名、邮箱、手机号、externalId、在外部身份源的 ID，详情见 userIdType 字段的说明。默认为用户 id 。
     */
    @JsonProperty("userId")
    private String userId;
    /**
     * 部门信息
     */
    @JsonProperty("departments")
    private List<SetUserDepartmentDto> departments;
    /**
     * 可选参数
     */
    @JsonProperty("options")
    private SetUserDepartmentsOptionsDto options;

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<SetUserDepartmentDto> getDepartments() {
        return departments;
    }
    public void setDepartments(List<SetUserDepartmentDto> departments) {
        this.departments = departments;
    }

    public SetUserDepartmentsOptionsDto getOptions() {
        return options;
    }
    public void setOptions(SetUserDepartmentsOptionsDto options) {
        this.options = options;
    }



}