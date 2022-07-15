package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.AuthorizeResourceItem;

public class AuthorizeResourcesDto {
    /**
     * 授权资源列表
     */
    @JsonProperty("list")
    private List<AuthorizeResourceItem> list;
    /**
     * 所属权限分组的 code
     */
    @JsonProperty("namespace")
    private String namespace;

    public List<AuthorizeResourceItem> getList() {
        return list;
    }
    public void setList(List<AuthorizeResourceItem> list) {
        this.list = list;
    }

    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }



}