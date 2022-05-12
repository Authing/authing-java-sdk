package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.Role;

public class CreateRolesBatch {
    /**
     * 角色列表
     */
    @JsonProperty("list")
    private Role list;

    public Role getList() {
        return list;
    }
    public void setList(Role list) {
        this.list = list;
    }



}