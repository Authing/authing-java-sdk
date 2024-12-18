package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SetUserDepartmentDto {
    /**
     * 部门 id
     */
    @JsonProperty("departmentId")
    private String departmentId;
    /**
     * 是否是部门 leader
     */
    @JsonProperty("isLeader")
    private Boolean isLeader;
    /**
     * 是否是主部门
     */
    @JsonProperty("isMainDepartment")
    private Boolean isMainDepartment;

    public String getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public Boolean getIsLeader() {
        return isLeader;
    }
    public void setIsLeader(Boolean isLeader) {
        this.isLeader = isLeader;
    }

    public Boolean getIsMainDepartment() {
        return isMainDepartment;
    }
    public void setIsMainDepartment(Boolean isMainDepartment) {
        this.isMainDepartment = isMainDepartment;
    }



}