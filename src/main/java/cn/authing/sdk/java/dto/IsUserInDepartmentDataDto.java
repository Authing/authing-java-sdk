package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class IsUserInDepartmentDataDto {
    /**
     * 是否在此部门内
     */
    @JsonProperty("inDepartment")
    private Boolean inDepartment;

    public Boolean getInDepartment() {
        return inDepartment;
    }
    public void setInDepartment(Boolean inDepartment) {
        this.inDepartment = inDepartment;
    }



}