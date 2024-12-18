package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ExtIdpInfoDto {
    /**
     * 身份源连接唯一标志
     */
    @JsonProperty("identifier")
    private String identifier;
    /**
     * 身份源 ID
     */
    @JsonProperty("extIdpId")
    private String extIdpId;
    /**
     * 身份源类型
     */
    @JsonProperty("type")
    private Type type;
    /**
     * 认证类型
     */
    @JsonProperty("extIdpType")
    private ExtIdpType extIdpType;
    /**
     * 认证地址
     */
    @JsonProperty("bindUrl")
    private String bindUrl;
    /**
     * 身份源显示名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 身份源显示名称（英文）
     */
    @JsonProperty("name_en")
    private String nameEn;
    /**
     * 描述
     */
    @JsonProperty("desc")
    private String desc;
    /**
     * 描述英文
     */
    @JsonProperty("desc_en")
    private String descEn;
    /**
     * 图标
     */
    @JsonProperty("logo")
    private String logo;

    public String getIdentifier() {
        return identifier;
    }
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getExtIdpId() {
        return extIdpId;
    }
    public void setExtIdpId(String extIdpId) {
        this.extIdpId = extIdpId;
    }

    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }

    public ExtIdpType getExtIdpType() {
        return extIdpType;
    }
    public void setExtIdpType(ExtIdpType extIdpType) {
        this.extIdpType = extIdpType;
    }

    public String getBindUrl() {
        return bindUrl;
    }
    public void setBindUrl(String bindUrl) {
        this.bindUrl = bindUrl;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getNameEn() {
        return nameEn;
    }
    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDescEn() {
        return descEn;
    }
    public void setDescEn(String descEn) {
        this.descEn = descEn;
    }

    public String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }


    /**
     * 身份源类型
     */
    public static enum Type {

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

        @JsonProperty("oppo")
        OPPO("oppo"),

        @JsonProperty("aws")
        AWS("aws"),

        @JsonProperty("amazon")
        AMAZON("amazon"),

        @JsonProperty("douyin")
        DOUYIN("douyin"),

        @JsonProperty("kuaishou")
        KUAISHOU("kuaishou"),

        @JsonProperty("line")
        LINE("line"),

        @JsonProperty("sdbz")
        SDBZ("sdbz"),
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
     * 认证类型
     */
    public static enum ExtIdpType {

        @JsonProperty("social")
        SOCIAL("social"),

        @JsonProperty("enterprise")
        ENTERPRISE("enterprise"),
        ;

        private String value;

        ExtIdpType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}