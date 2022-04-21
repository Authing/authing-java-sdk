package dto;


public class GetUserRolesDto {
    /**
     * 用户 ID
     */
    private String userId
    /**
     * 所属权限分组的 code
     */
    private String namespace

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

};