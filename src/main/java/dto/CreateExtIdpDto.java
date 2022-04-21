package dto;


public class CreateExtIdpDto {
    /**
     * 身份源连接类型
     */
    private CreateExtIdpDto.type type
    /**
     * 名称
     */
    private String name
    /**
     * 租户 ID
     */
    private String tenantId

    public CreateExtIdpDto.type getType() {
        return type;
    }
    public void setType(CreateExtIdpDto.type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getTenantId() {
        return tenantId;
    }
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

};