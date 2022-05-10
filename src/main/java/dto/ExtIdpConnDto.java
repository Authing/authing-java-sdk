package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class ExtIdpConnDto {
    /**
     * 身份源连接 id
     */
    @JsonProperty("getId")
    private String id;
    /**
     * 身份源连接类型
     */
    @JsonProperty("getType")
    private Type type;
    /**
     * 身份源图标
     */
    @JsonProperty("getLogo")
    private String logo;
    /**
     * 身份源连接标识
     */
    @JsonProperty("getIdentifier")
    private String identifier;
    /**
     * 身份源连接在登录页的显示名称
     */
    @JsonProperty("getDisplayName")
    private String displayName;

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


}