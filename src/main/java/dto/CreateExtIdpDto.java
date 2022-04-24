package dto;

import java.util.List;


public class CreateExtIdpDto {
    /**
     * 身份源连接类型
     */
    private Type type;
    /**
     * 名称
     */
    private String name;
    /**
     * 租户 ID
     */
    private String tenantId;

    public Type getType() {
        return type;
    }
    public void setType(Type type) {
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


    /**
     * 身份源连接类型
     */
    public static enum Type {
        OIDC("oidc"),
        OAUTH2("oauth2"),
        SAML("saml"),
        LDAP("ldap"),
        AD("ad"),
        CAS("cas"),
        AZURE_AD("azure-ad"),
        WECHAT("wechat"),
        GOOGLE("google"),
        QQ("qq"),
        WECHATWORK("wechatwork"),
        DINGTALK("dingtalk"),
        WEIBO("weibo"),
        GITHUB("github"),
        ALIPAY("alipay"),
        APPLE("apple"),
        BAIDU("baidu"),
        LARK("lark"),
        GITLAB("gitlab"),
        TWITTER("twitter"),
        FACEBOOK("facebook"),
        SLACK("slack"),
        LINKEDIN("linkedin"),
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


}