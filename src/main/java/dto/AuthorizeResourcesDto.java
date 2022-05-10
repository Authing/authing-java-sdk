package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import dto.AuthorizeResourceItem;

public class AuthorizeResourcesDto {
    /**
     * 授权列表
     */
    @JsonProperty("getList")
    private List<AuthorizeResourceItem> nase list;
    /**
     * 所属权限分组的 code
     */
    @JsonProperty("getNamespace")
    private String namespace;

    public List<AuthorizeResourceItem> nase getList() {
        return list;
    }
    public void setList(List<AuthorizeResourceItem> nase list) {
        this.list = list;
    }

    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }



}