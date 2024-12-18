package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Result {
    /**
     * 新增用户数
     */
    @JsonProperty("addUser")
    private Integer addUser;
    /**
     * 更新用户数
     */
    @JsonProperty("updateUser")
    private Integer updateUser;
    /**
     * 新增部门数
     */
    @JsonProperty("addDepartment")
    private Integer addDepartment;
    /**
     * 更新部门数
     */
    @JsonProperty("updateDepartment")
    private Integer updateDepartment;

    public Integer getAddUser() {
        return addUser;
    }
    public void setAddUser(Integer addUser) {
        this.addUser = addUser;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }
    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public Integer getAddDepartment() {
        return addDepartment;
    }
    public void setAddDepartment(Integer addDepartment) {
        this.addDepartment = addDepartment;
    }

    public Integer getUpdateDepartment() {
        return updateDepartment;
    }
    public void setUpdateDepartment(Integer updateDepartment) {
        this.updateDepartment = updateDepartment;
    }



}