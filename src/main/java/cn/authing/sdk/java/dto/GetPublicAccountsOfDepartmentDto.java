package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetPublicAccountsOfDepartmentDto {
    /**
     * 部门 ID
     */
    @JsonProperty("departmentId")
    private String departmentId;

    public String getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }



}