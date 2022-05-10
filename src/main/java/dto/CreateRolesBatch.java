package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import dto.Role;

public class CreateRolesBatch {
    /**
     * 角色列表
     */
    @JsonProperty("getList")
    private Role list;

    public Role getList() {
        return list;
    }
    public void setList(Role list) {
        this.list = list;
    }



}