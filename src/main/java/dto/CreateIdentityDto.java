package dto;


public class CreateIdentityDto {
    /**
     * 外部身份源的 ID
     */
    private String extIdpId
    /**
     * 外部身份源类型，如 lark, wechat
     */
    private String provider
    /**
     * Identity 类型，如 unionid, openid, primary
     */
    private String type
    /**
     * 在外部身份源的 id
     */
    private String userIdInIdp

    public String getExtIdpId() {
        return extIdpId;
    }
    public void setExtIdpId(String extIdpId) {
        this.extIdpId = extIdpId;
    }

    public String getProvider() {
        return provider;
    }
    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getUserIdInIdp() {
        return userIdInIdp;
    }
    public void setUserIdInIdp(String userIdInIdp) {
        this.userIdInIdp = userIdInIdp;
    }

};