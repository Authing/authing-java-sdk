package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateRolesBatch {
    /**
     * 角色列表
     */
    @JsonProperty("list")
    private List<RoleListItem> list;

    public List<RoleListItem> getList() {
        return list;
    }
    public void setList(List<RoleListItem> list) {
        this.list = list;
    }



}