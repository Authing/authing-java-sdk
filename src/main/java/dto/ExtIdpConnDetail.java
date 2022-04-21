package dto;


public class ExtIdpConnDetail {
    /**
     * 身份源连接 id
     */
    private String id
    /**
     * 身份源连接类型
     */
    private ExtIdpConnDetail.type type
    /**
     * 身份源图标
     */
    private String logo
    /**
     * 连接标识
     */
    private String identifier
    /**
     * 连接在登录页的显示名称
     */
    private String displayName
    /**
     * 只支持登录
     */
    private Boolean loginOnly
    /**
     * 关联模式
     */
    private ExtIdpConnDetail.associationMode associationMode
    /**
     * 绑定方式
     */
    private Array<'email-password' | 'username-password' | 'phone-password' | 'phone-code' | 'email-code'> challengeBindingMethods
    /**
     * 自定义参数
     */
    private any fields

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public ExtIdpConnDetail.type getType() {
        return type;
    }
    public void setType(ExtIdpConnDetail.type type) {
        this.type = type;
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

    public String getDisplayName() {
        return displayName;
    }
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Boolean getLoginOnly() {
        return loginOnly;
    }
    public void setLoginOnly(Boolean loginOnly) {
        this.loginOnly = loginOnly;
    }

    public ExtIdpConnDetail.associationMode getAssociationMode() {
        return associationMode;
    }
    public void setAssociationMode(ExtIdpConnDetail.associationMode associationMode) {
        this.associationMode = associationMode;
    }

    public Array<'email-password' | 'username-password' | 'phone-password' | 'phone-code' | 'email-code'> getChallengeBindingMethods() {
        return challengeBindingMethods;
    }
    public void setChallengeBindingMethods(Array<'email-password' | 'username-password' | 'phone-password' | 'phone-code' | 'email-code'> challengeBindingMethods) {
        this.challengeBindingMethods = challengeBindingMethods;
    }

    public any getFields() {
        return fields;
    }
    public void setFields(any fields) {
        this.fields = fields;
    }

};