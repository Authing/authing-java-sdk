package dto;

import java.util.List;


public class ExtIdpConnDetail {
    /**
     * 身份源连接 id
     */
    private String id;
    /**
     * 身份源连接类型
     */
    private Type type;
    /**
     * 身份源图标
     */
    private String logo;
    /**
     * 连接标识
     */
    private String identifier;
    /**
     * 连接在登录页的显示名称
     */
    private String displayName;
    /**
     * 只支持登录
     */
    private Boolean loginOnly;
    /**
     * 关联模式
     */
    private AssociationMode associationMode;
    /**
     * 绑定方式
     */
    private List<> challengeBindingMethods;
    /**
     * 自定义参数
     */
    private Object fields;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }
    public void setType(Type type) {
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

    public AssociationMode getAssociationMode() {
        return associationMode;
    }
    public void setAssociationMode(AssociationMode associationMode) {
        this.associationMode = associationMode;
    }

    public List<> getChallengeBindingMethods() {
        return challengeBindingMethods;
    }
    public void setChallengeBindingMethods(List<> challengeBindingMethods) {
        this.challengeBindingMethods = challengeBindingMethods;
    }

    public Object getFields() {
        return fields;
    }
    public void setFields(Object fields) {
        this.fields = fields;
    }


    /**
     * 身份源连接类型
     */
    public static enum Type {
        OIDC("oidc"),
        OAUTH("oauth"),
        SAML("saml"),
        LDAP("ldap"),
        AD("ad"),
        CAS("cas"),
        AZURE_AD("azure-ad"),
        ALIPAY("alipay"),
        FACEBOOK("facebook"),
        TWITTER("twitter"),
        GOOGLE("google"),
        WECHAT_PC("wechat:pc"),
        WECHAT_MOBILE("wechat:mobile"),
        WECHAT_WEBPAGE_AUTHORIZATION("wechat:webpage-authorization"),
        WECHATMP_QRCODE("wechatmp-qrcode"),
        WECHAT_MINIPROGRAM_DEFAULT("wechat:miniprogram:default"),
        WECHAT_MINIPROGRAM_QRCONNECT("wechat:miniprogram:qrconnect"),
        WECHAT_MINIPROGRAM_APP_LAUNCH("wechat:miniprogram:app-launch"),
        GITHUB("github"),
        QQ("qq"),
        WECHATWORK_CORP_QRCONNECT("wechatwork:corp:qrconnect"),
        WECHATWORK_AGENCY_QRCONNECT("wechatwork:agency:qrconnect"),
        WECHATWORK_SERVICE_PROVIDER_QRCONNECT("wechatwork:service-provider:qrconnect"),
        WECHATWORK_MOBILE("wechatwork:mobile"),
        DINGTALK("dingtalk"),
        DINGTALK_PROVIDER("dingtalk:provider"),
        WEIBO("weibo"),
        APPLE("apple"),
        APPLE_WEB("apple:web"),
        BAIDU("baidu"),
        LARK_INTERNAL("lark-internal"),
        LARK_PUBLIC("lark-public"),
        GITLAB("gitlab"),
        LINKEDIN("linkedin"),
        SLACK("slack"),
        YIDUN("yidun"),
        QINGCLOUD("qingcloud"),
        GITEE("gitee"),
        ;

        private String value;

        Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * 关联模式
     */
    public static enum AssociationMode {
        NONE("none"),
        FIELD("field"),
        CHALLENGE("challenge"),
        ;

        private String value;

        AssociationMode(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}