package dto;

import java.util.List;


public class UpdateExtIdpConnDto {
    /**
     * 是否只支持登录
     */
    private Boolean loginOnly;
    /**
     * 关联模式
     */
    private String associationMode;
    /**
     * 图标
     */
    private String logo;
    /**
     * 身份源连接自定义参数
     */
    private Object fields;
    /**
     * 身份源连接显示名称
     */
    private String displayName;
    /**
     * 连接 ID
     */
    private String id;
    /**
     * 绑定方式
     */
    //private List<> challengeBindingMethods;

    public Boolean getLoginOnly() {
        return loginOnly;
    }
    public void setLoginOnly(Boolean loginOnly) {
        this.loginOnly = loginOnly;
    }

    public String getAssociationMode() {
        return associationMode;
    }
    public void setAssociationMode(String associationMode) {
        this.associationMode = associationMode;
    }

    public String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Object getFields() {
        return fields;
    }
    public void setFields(Object fields) {
        this.fields = fields;
    }

    public String getDisplayName() {
        return displayName;
    }
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

//    public List<> getChallengeBindingMethods() {
//        return challengeBindingMethods;
//    }
//    public void setChallengeBindingMethods(List<> challengeBindingMethods) {
//        this.challengeBindingMethods = challengeBindingMethods;
//    }



}