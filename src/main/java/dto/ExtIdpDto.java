package dto;


public class ExtIdpDto {
    /**
     * 身份源 id
     */
    private String id
    /**
     * 身份源名称
     */
    private String name
    /**
     * 租户场景下自动加入
     */
    private Boolean autoJoin
    /**
     * 租户 ID
     */
    private String tenantId
    /**
     * 身份源类型
     */
    private String type

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Boolean getAutoJoin() {
        return autoJoin;
    }
    public void setAutoJoin(Boolean autoJoin) {
        this.autoJoin = autoJoin;
    }

    public String getTenantId() {
        return tenantId;
    }
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

};