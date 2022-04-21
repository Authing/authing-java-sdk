package dto;

import dto.AuthorizeResourceItem;

public class AuthorizeResourcesDto {
    /**
     * 授权列表
     */
    private Array<AuthorizeResourceItem> list
    /**
     * 所属权限分组的 code
     */
    private String namespace

    public Array<AuthorizeResourceItem> getList() {
        return list;
    }
    public void setList(Array<AuthorizeResourceItem> list) {
        this.list = list;
    }

    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

};