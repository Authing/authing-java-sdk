package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateDepartmentStatusReqDto {
    /**
     * 部门状态
     */
    @JsonProperty("status")
    private Boolean status;
    /**
     * 需要获取的部门 ID
     */
    @JsonProperty("departmentId")
    private String departmentId;

    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }



}