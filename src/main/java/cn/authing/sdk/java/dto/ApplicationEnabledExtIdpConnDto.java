package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ApplicationEnabledExtIdpConnDto {
    /**
     * 是否为社会化登录身份源连接
     */
    @JsonProperty("isSocial")
    private Boolean isSocial;
    /**
     * 身份源 ID
     */
    @JsonProperty("extIdpId")
    private String extIdpId;
    /**
     * 身份源类型
     */
    @JsonProperty("extIdpType")
    private ExtIdpType extIdpType;
    /**
     * 身份源连接 ID
     */
    @JsonProperty("extIdpConnId")
    private String extIdpConnId;
    /**
     * 身份源连接类型
     */
    @JsonProperty("extIdpConnType")
    private ExtIdpConnType extIdpConnType;
    /**
     * 身份源连接可读唯一标志
     */
    @JsonProperty("extIdpConnIdentifier")
    private String extIdpConnIdentifier;
    /**
     * 微信
     */
    @JsonProperty("extIdpConnDisplayName")
    private String extIdpConnDisplayName;
    /**
     * 身份源连接 Logo
     */
    @JsonProperty("extIdpConnLogo")
    private String extIdpConnLogo;
    /**
     * 是否允许身份源连接
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    public Boolean getIsSocial() {
        return isSocial;
    }
    public void setIsSocial(Boolean isSocial) {
        this.isSocial = isSocial;
    }

    public String getExtIdpId() {
        return extIdpId;
    }
    public void setExtIdpId(String extIdpId) {
        this.extIdpId = extIdpId;
    }

    public ExtIdpType getExtIdpType() {
        return extIdpType;
    }
    public void setExtIdpType(ExtIdpType extIdpType) {
        this.extIdpType = extIdpType;
    }

    public String getExtIdpConnId() {
        return extIdpConnId;
    }
    public void setExtIdpConnId(String extIdpConnId) {
        this.extIdpConnId = extIdpConnId;
    }

    public ExtIdpConnType getExtIdpConnType() {
        return extIdpConnType;
    }
    public void setExtIdpConnType(ExtIdpConnType extIdpConnType) {
        this.extIdpConnType = extIdpConnType;
    }

    public String getExtIdpConnIdentifier() {
        return extIdpConnIdentifier;
    }
    public void setExtIdpConnIdentifier(String extIdpConnIdentifier) {
        this.extIdpConnIdentifier = extIdpConnIdentifier;
    }

    public String getExtIdpConnDisplayName() {
        return extIdpConnDisplayName;
    }
    public void setExtIdpConnDisplayName(String extIdpConnDisplayName) {
        this.extIdpConnDisplayName = extIdpConnDisplayName;
    }

    public String getExtIdpConnLogo() {
        return extIdpConnLogo;
    }
    public void setExtIdpConnLogo(String extIdpConnLogo) {
        this.extIdpConnLogo = extIdpConnLogo;
    }

    public Boolean getEnabled() {
        return enabled;
    }
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }


    /**
     * 身份源类型
     */
    public static enum ExtIdpType {

        @JsonProperty("oidc")
        OIDC("oidc"),

        @JsonProperty("oauth2")
        OAUTH2("oauth2"),

        @JsonProperty("saml")
        SAML("saml"),

        @JsonProperty("ldap")
        LDAP("ldap"),

        @JsonProperty("ad")
        AD("ad"),

        @JsonProperty("cas")
        CAS("cas"),

        @JsonProperty("azure-ad")
        AZURE_AD("azure-ad"),

        @JsonProperty("wechat")
        WECHAT("wechat"),

        @JsonProperty("google")
        GOOGLE("google"),

        @JsonProperty("qq")
        QQ("qq"),

        @JsonProperty("wechatwork")
        WECHATWORK("wechatwork"),

        @JsonProperty("dingtalk")
        DINGTALK("dingtalk"),

        @JsonProperty("weibo")
        WEIBO("weibo"),

        @JsonProperty("github")
        GITHUB("github"),

        @JsonProperty("alipay")
        ALIPAY("alipay"),

        @JsonProperty("apple")
        APPLE("apple"),

        @JsonProperty("baidu")
        BAIDU("baidu"),

        @JsonProperty("lark")
        LARK("lark"),

        @JsonProperty("gitlab")
        GITLAB("gitlab"),

        @JsonProperty("twitter")
        TWITTER("twitter"),

        @JsonProperty("facebook")
        FACEBOOK("facebook"),

        @JsonProperty("slack")
        SLACK("slack"),

        @JsonProperty("linkedin")
        LINKEDIN("linkedin"),

        @JsonProperty("yidun")
        YIDUN("yidun"),

        @JsonProperty("qingcloud")
        QINGCLOUD("qingcloud"),

        @JsonProperty("gitee")
        GITEE("gitee"),

        @JsonProperty("instagram")
        INSTAGRAM("instagram"),

        @JsonProperty("welink")
        WELINK("welink"),

        @JsonProperty("huawei")
        HUAWEI("huawei"),

        @JsonProperty("honor")
        HONOR("honor"),

        @JsonProperty("xiaomi")
        XIAOMI("xiaomi"),

        @JsonProperty("aws")
        AWS("aws"),
        ;

        private String value;

        ExtIdpType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * 身份源连接类型
     */
    public static enum ExtIdpConnType {

        @JsonProperty("oidc")
        OIDC("oidc"),

        @JsonProperty("oauth")
        OAUTH("oauth"),

        @JsonProperty("saml")
        SAML("saml"),

        @JsonProperty("ldap")
        LDAP("ldap"),

        @JsonProperty("ad")
        AD("ad"),

        @JsonProperty("cas")
        CAS("cas"),

        @JsonProperty("azure-ad")
        AZURE_AD("azure-ad"),

        @JsonProperty("alipay")
        ALIPAY("alipay"),

        @JsonProperty("facebook")
        FACEBOOK("facebook"),

        @JsonProperty("facebook:mobile")
        FACEBOOK_MOBILE("facebook:mobile"),

        @JsonProperty("twitter")
        TWITTER("twitter"),

        @JsonProperty("google:mobile")
        GOOGLE_MOBILE("google:mobile"),

        @JsonProperty("google")
        GOOGLE("google"),

        @JsonProperty("wechat:pc")
        WECHAT_PC("wechat:pc"),

        @JsonProperty("wechat:mobile")
        WECHAT_MOBILE("wechat:mobile"),

        @JsonProperty("wechat:webpage-authorization")
        WECHAT_WEBPAGE_AUTHORIZATION("wechat:webpage-authorization"),

        @JsonProperty("wechatmp-qrcode")
        WECHATMP_QRCODE("wechatmp-qrcode"),

        @JsonProperty("wechat:miniprogram:default")
        WECHAT_MINIPROGRAM_DEFAULT("wechat:miniprogram:default"),

        @JsonProperty("wechat:miniprogram:qrconnect")
        WECHAT_MINIPROGRAM_QRCONNECT("wechat:miniprogram:qrconnect"),

        @JsonProperty("wechat:miniprogram:app-launch")
        WECHAT_MINIPROGRAM_APP_LAUNCH("wechat:miniprogram:app-launch"),

        @JsonProperty("github")
        GITHUB("github"),

        @JsonProperty("qq")
        QQ("qq"),

        @JsonProperty("qq:mobile")
        QQ_MOBILE("qq:mobile"),

        @JsonProperty("wechatwork:corp:qrconnect")
        WECHATWORK_CORP_QRCONNECT("wechatwork:corp:qrconnect"),

        @JsonProperty("wechatwork:agency:qrconnect")
        WECHATWORK_AGENCY_QRCONNECT("wechatwork:agency:qrconnect"),

        @JsonProperty("wechatwork:service-provider:qrconnect")
        WECHATWORK_SERVICE_PROVIDER_QRCONNECT("wechatwork:service-provider:qrconnect"),

        @JsonProperty("wechatwork:mobile")
        WECHATWORK_MOBILE("wechatwork:mobile"),

        @JsonProperty("wechatwork:agency:mobile")
        WECHATWORK_AGENCY_MOBILE("wechatwork:agency:mobile"),

        @JsonProperty("dingtalk")
        DINGTALK("dingtalk"),

        @JsonProperty("dingtalk:mobile")
        DINGTALK_MOBILE("dingtalk:mobile"),

        @JsonProperty("dingtalk:provider")
        DINGTALK_PROVIDER("dingtalk:provider"),

        @JsonProperty("weibo")
        WEIBO("weibo"),

        @JsonProperty("weibo:mobile")
        WEIBO_MOBILE("weibo:mobile"),

        @JsonProperty("apple")
        APPLE("apple"),

        @JsonProperty("apple:web")
        APPLE_WEB("apple:web"),

        @JsonProperty("baidu")
        BAIDU("baidu"),

        @JsonProperty("baidu:mobile")
        BAIDU_MOBILE("baidu:mobile"),

        @JsonProperty("lark-internal")
        LARK_INTERNAL("lark-internal"),

        @JsonProperty("lark-public")
        LARK_PUBLIC("lark-public"),

        @JsonProperty("gitlab")
        GITLAB("gitlab"),

        @JsonProperty("linkedin")
        LINKEDIN("linkedin"),

        @JsonProperty("linkedin:mobile")
        LINKEDIN_MOBILE("linkedin:mobile"),

        @JsonProperty("slack")
        SLACK("slack"),

        @JsonProperty("yidun")
        YIDUN("yidun"),

        @JsonProperty("qingcloud")
        QINGCLOUD("qingcloud"),

        @JsonProperty("gitee")
        GITEE("gitee"),

        @JsonProperty("instagram")
        INSTAGRAM("instagram"),

        @JsonProperty("welink")
        WELINK("welink"),

        @JsonProperty("ad-kerberos")
        AD_KERBEROS("ad-kerberos"),

        @JsonProperty("huawei")
        HUAWEI("huawei"),

        @JsonProperty("honor")
        HONOR("honor"),

        @JsonProperty("xiaomi")
        XIAOMI("xiaomi"),

        @JsonProperty("aws")
        AWS("aws"),
        ;

        private String value;

        ExtIdpConnType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}