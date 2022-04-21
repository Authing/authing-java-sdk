package dto;


public class CreateExtIdpConnDto {
    /**
     * 连接的自定义配置信息
     */
    private any fields
    /**
     * 身份源图标
     */
    private String logo
    /**
     * 身份源连接标识
     */
    private String identifier
    /**
     * 身份源连接类型
     */
    private CreateExtIdpConnDto.type type
    /**
     * 身份源连接 id
     */
    private String extIdpId
    /**
     * 连接在登录页的显示名称
     */
    private String displayName

    public any getFields() {
        return fields;
    }
    public void setFields(any fields) {
        this.fields = fields;
    }

    public String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getIdentifier() {
        return identifier;
    }
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public CreateExtIdpConnDto.type getType() {
        return type;
    }
    public void setType(CreateExtIdpConnDto.type type) {
        this.type = type;
    }

    public String getExtIdpId() {
        return extIdpId;
    }
    public void setExtIdpId(String extIdpId) {
        this.extIdpId = extIdpId;
    }

    public String getDisplayName() {
        return displayName;
    }
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

};