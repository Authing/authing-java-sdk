package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.User;

public class IdentityDto {
    /**
     * 身份源 ID
     */
    @JsonProperty("identityId")
    private String identityId;
    /**
     * 身份源连接 ID
     */
    @JsonProperty("extIdpId")
    private String extIdpId;
    /**
     * 外部身份源类型：
     * - `wechat`: 微信
     * - `qq`: QQ
     * - `wechatwork`: 企业微信
     * - `dingtalk`: 钉钉
     * - `weibo`: 微博
     * - `github`: GitHub
     * - `alipay`: 支付宝
     * - `baidu`: 百度
     * - `lark`: 飞书
     * - `welink`: Welink
     * - `yidun`: 网易易盾
     * - `qingcloud`: 青云
     * - `google`: Google
     * - `gitlab`: GitLab
     * - `gitee`: Gitee
     * - `twitter`: Twitter
     * - `facebook`: Facebook
     * - `slack`: Slack
     * - `linkedin`: Linkedin
     * - `instagram`: Instagram
     * - `oidc`: OIDC 型企业身份源
     * - `oauth2`: OAuth2 型企业身份源
     * - `saml`: SAML 型企业身份源
     * - `ldap`: LDAP 型企业身份源
     * - `ad`: AD 型企业身份源
     * - `cas`: CAS 型企业身份源
     * - `azure-ad`: Azure AD 型企业身份源
     *
     */
    @JsonProperty("provider")
    private Provider provider;
    /**
     * Identity 类型，如 unionid, openid, primary
     */
    @JsonProperty("type")
    private String type;
    /**
     * 在外部身份源中的 ID
     */
    @JsonProperty("userIdInIdp")
    private String userIdInIdp;
    /**
     * 用户在 idp 中的身份信息
     */
    @JsonProperty("userInfoInIdp")
    private User userInfoInIdp;
    /**
     * 在外部身份源中的 Access Token（此参数只会在用户主动获取时返回，管理侧接口不会返回）。
     */
    @JsonProperty("accessToken")
    private String accessToken;
    /**
     * 在外部身份源中的 Refresh Token（此参数只会在用户主动获取时返回，管理侧接口不会返回）。
     */
    @JsonProperty("refreshToken")
    private String refreshToken;
    /**
     * 身份来自的身份源连接 ID 列表
     */
    @JsonProperty("originConnIds")
    private List<String> originConnIds;

    public String getIdentityId() {
        return identityId;
    }
    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    public String getExtIdpId() {
        return extIdpId;
    }
    public void setExtIdpId(String extIdpId) {
        this.extIdpId = extIdpId;
    }

    public Provider getProvider() {
        return provider;
    }
    public void setProvider(Provider provider) {
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

    public User getUserInfoInIdp() {
        return userInfoInIdp;
    }
    public void setUserInfoInIdp(User userInfoInIdp) {
        this.userInfoInIdp = userInfoInIdp;
    }

    public String getAccessToken() {
        return accessToken;
    }
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public List<String> getOriginConnIds() {
        return originConnIds;
    }
    public void setOriginConnIds(List<String> originConnIds) {
        this.originConnIds = originConnIds;
    }


    /**
     * 外部身份源类型：
     * - `wechat`: 微信
     * - `qq`: QQ
     * - `wechatwork`: 企业微信
     * - `dingtalk`: 钉钉
     * - `weibo`: 微博
     * - `github`: GitHub
     * - `alipay`: 支付宝
     * - `baidu`: 百度
     * - `lark`: 飞书
     * - `welink`: Welink
     * - `yidun`: 网易易盾
     * - `qingcloud`: 青云
     * - `google`: Google
     * - `gitlab`: GitLab
     * - `gitee`: Gitee
     * - `twitter`: Twitter
     * - `facebook`: Facebook
     * - `slack`: Slack
     * - `linkedin`: Linkedin
     * - `instagram`: Instagram
     * - `oidc`: OIDC 型企业身份源
     * - `oauth2`: OAuth2 型企业身份源
     * - `saml`: SAML 型企业身份源
     * - `ldap`: LDAP 型企业身份源
     * - `ad`: AD 型企业身份源
     * - `cas`: CAS 型企业身份源
     * - `azure-ad`: Azure AD 型企业身份源
     *
     */
    public static enum Provider {

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
        ;

        private String value;

        Provider(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}