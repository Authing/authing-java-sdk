package dto;

import java.util.List;

import dto.AuthorizeResourceItem;

public class AuthorizeResourcesDto {
    /**
     * 授权列表
     */
    private List<AuthorizeResourceItem> list;
    /**
     * 所属权限分组的 code
     */
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



};