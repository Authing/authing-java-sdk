package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.SignInByAlipayPayloadDto;
import cn.authing.sdk.java.dto.SignInByAmazonPayloadDto;
import cn.authing.sdk.java.dto.SignInByApplePayloadDto;
import cn.authing.sdk.java.dto.SignInByBaiduPayloadDto;
import cn.authing.sdk.java.dto.SignInByDingTalkPayloadDto;
import cn.authing.sdk.java.dto.SignInByDouyinPayloadDto;
import cn.authing.sdk.java.dto.SignInByFacebookPayloadDto;
import cn.authing.sdk.java.dto.SignInByGiteePayloadDto;
import cn.authing.sdk.java.dto.SignInByGithubPayloadDto;
import cn.authing.sdk.java.dto.SignInByGitlabPayloadDto;
import cn.authing.sdk.java.dto.SignInByGooglePayloadDto;
import cn.authing.sdk.java.dto.SignInByHuaweiPayloadDto;
import cn.authing.sdk.java.dto.SignInByKuaishouPayloadDto;
import cn.authing.sdk.java.dto.SignInByLarkInternalPayloadDto;
import cn.authing.sdk.java.dto.SignInByLarkPublicPayloadDto;
import cn.authing.sdk.java.dto.SignInByLinePayloadDto;
import cn.authing.sdk.java.dto.SignInByLinkedInPayloadDto;
import cn.authing.sdk.java.dto.SignInByMobileOptionsDto;
import cn.authing.sdk.java.dto.SignInByOPPOPayloadDto;
import cn.authing.sdk.java.dto.SignInByQQPayloadDto;
import cn.authing.sdk.java.dto.SignInBySlackPayloadDto;
import cn.authing.sdk.java.dto.SignInByWechatMiniProgramCodeAndPhonePayloadDto;
import cn.authing.sdk.java.dto.SignInByWechatMiniProgramCodePayloadDto;
import cn.authing.sdk.java.dto.SignInByWechatMiniProgramPhonePayloadDto;
import cn.authing.sdk.java.dto.SignInByWechatPayloadDto;
import cn.authing.sdk.java.dto.SignInByWechatworkAgencyPayloadDto;
import cn.authing.sdk.java.dto.SignInByWechatworkDto;
import cn.authing.sdk.java.dto.SignInByWeiboPayloadDto;
import cn.authing.sdk.java.dto.SignInByXiaomiPayloadDto;
import cn.authing.sdk.java.dto.SignInByYidunPayloadDto;

public class SigninByMobileDto {
    /**
     * 外部身份源连接标志符
     */
    @JsonProperty("extIdpConnidentifier")
    private String extIdpConnidentifier;
    /**
     * 移动端社会化登录类型：
     * - `apple`: Apple 移动端应用
     * - `wechat`: 微信移动应用
     * - `alipay`: 支付宝移动应用
     * - `wechatwork`: 企业微信移动应用
     * - `wechatwork_agency`: 企业微信移动应用（代开发模式）
     * - `lark_internal`: 飞书移动端企业自建应用
     * - `lark_public`: 飞书移动端应用商店应用
     * - `yidun`: 网易易盾一键登录
     * - `wechat_mini_program_code`: 微信小程序使用 code 登录
     * - `wechat_mini_program_phone `: 微信小程序使用手机号登录
     * - `wechat_mini_program_code_and_phone `: 微信小程序使用 code 和手机号登录
     * - `google`: Google 移动端社会化登录
     * - `facebook`: Facebook 移动端社会化登录
     * - `qq`: QQ 移动端社会化登录
     * - `weibo`: 新浪微博移动端社会化登录
     * - `baidu`: 百度移动端社会化登录
     * - `linkedin`: LinkedIn 移动端社会化登录
     * - `dingtalk`: 钉钉移动端社会化登录
     * - `github`: Github 动端社会化登录
     * - `gitee`: Gitee 移动端社会化登录
     * - `gitlab`: GitLab 移动端社会化登录
     * - `douyin`: 抖音移动端社会化登录
     * - `kuaishou`: 快手移动端社会化登录
     * - `xiaomi`: 小米移动端社会化登录
     * - `line`: LINE 移动端社会化登录
     * - `slack`: Slack 移动端社会化登录
     * - `oppo`: OPPO 移动端社会化登录
     * - `huawei`: 华为移动端社会化登录
     * - `amazon`: 亚马逊移动端社会化登录
     *
     */
    @JsonProperty("connection")
    private Connection connection;
    /**
     * 苹果移动端社会化登录数据，当 `connection` 为 `wechat` 的时候必填。
     */
    @JsonProperty("wechatPayload")
    private SignInByWechatPayloadDto wechatPayload;
    /**
     * 微信移动端社会化登录数据，当 `connection` 为 `apple` 的时候必填。
     */
    @JsonProperty("applePayload")
    private SignInByApplePayloadDto applePayload;
    /**
     * 支付宝移动端社会化登录数据，当 `connection` 为 `alipay` 的时候必填。
     */
    @JsonProperty("alipayPayload")
    private SignInByAlipayPayloadDto alipayPayload;
    /**
     * 企业微信移动端社会化登录数据，当 `connection` 为 `wechatwork` 的时候必填。
     */
    @JsonProperty("wechatworkPayload")
    private SignInByWechatworkDto wechatworkPayload;
    /**
     * 企业微信（代开发模式）移动端社会化登录数据，当 `connection` 为 `wechatwork_agency` 的时候必填。
     */
    @JsonProperty("wechatworkAgencyPayload")
    private SignInByWechatworkAgencyPayloadDto wechatworkAgencyPayload;
    /**
     * 飞书应用商店应用移动端社会化登录数据，当 `connection` 为 `lark_public` 的时候必填。
     */
    @JsonProperty("larkPublicPayload")
    private SignInByLarkPublicPayloadDto larkPublicPayload;
    /**
     * 飞书自建应用移动端社会化登录数据，当 `connection` 为 `lark_internal` 的时候必填。
     */
    @JsonProperty("larkInternalPayload")
    private SignInByLarkInternalPayloadDto larkInternalPayload;
    /**
     * 网易易盾移动端社会化登录数据，当 `connection` 为 `yidun` 的时候必填。
     */
    @JsonProperty("yidunPayload")
    private SignInByYidunPayloadDto yidunPayload;
    /**
     * 微信小程序使用 code 登录相关数据，当 `connection` 为 `wechat_mini_program_code` 的时候必填。
     */
    @JsonProperty("wechatMiniProgramCodePayload")
    private SignInByWechatMiniProgramCodePayloadDto wechatMiniProgramCodePayload;
    /**
     * 微信小程序使用手机号登录相关数据，当 `connection` 为 `wechat_mini_program_phone` 的时候必填。
     */
    @JsonProperty("wechatMiniProgramPhonePayload")
    private SignInByWechatMiniProgramPhonePayloadDto wechatMiniProgramPhonePayload;
    /**
     * 微信小程序使用 code 和手机号登录相关数据，当 `connection` 为 `wechat_mini_program_code_and_phone` 的时候必填。
     */
    @JsonProperty("wechatMiniProgramCodeAndPhonePayload")
    private SignInByWechatMiniProgramCodeAndPhonePayloadDto wechatMiniProgramCodeAndPhonePayload;
    /**
     * Google 移动端社会化登录数据，当 `connection` 为 `google` 的时候必填。
     */
    @JsonProperty("googlePayload")
    private SignInByGooglePayloadDto googlePayload;
    /**
     * Facebook 移动端社会化登录数据，当 `connection` 为 `facebook` 的时候必填。
     */
    @JsonProperty("facebookPayload")
    private SignInByFacebookPayloadDto facebookPayload;
    /**
     * QQ 移动端社会化登录数据，当 `connection` 为 `qq` 的时候必填。
     */
    @JsonProperty("qqPayload")
    private SignInByQQPayloadDto qqPayload;
    /**
     * 新浪微博移动端社会化登录数据，当 `connection` 为 `weibo` 的时候必填。
     */
    @JsonProperty("weiboPayload")
    private SignInByWeiboPayloadDto weiboPayload;
    /**
     * 百度移动端社会化登录数据，当 `connection` 为 `baidu` 的时候必填，且 `baiduPayload` 的属性 `code` 和 `access_token` 必选其一，优先使用 `code` 值作为授权登录方式。
     */
    @JsonProperty("baiduPayload")
    private SignInByBaiduPayloadDto baiduPayload;
    /**
     * LinkedIn 移动端社会化登录数据，当 `connection` 为 `linkedin` 的时候必填。
     */
    @JsonProperty("linkedInPayload")
    private SignInByLinkedInPayloadDto linkedInPayload;
    /**
     * 钉钉移动端社会化登录数据，当 `connection` 为 `dingtalk` 的时候必填。
     */
    @JsonProperty("dingTalkPayload")
    private SignInByDingTalkPayloadDto dingTalkPayload;
    /**
     * Github 移动端社会化登录数据，当 `connection` 为 `github` 的时候必填。
     */
    @JsonProperty("githubPayload")
    private SignInByGithubPayloadDto githubPayload;
    /**
     * Gitee 移动端社会化登录数据，当 `connection` 为 `gitee` 的时候必填。
     */
    @JsonProperty("giteePayload")
    private SignInByGiteePayloadDto giteePayload;
    /**
     * GitLab 移动端社会化登录数据，当 `connection` 为 `gitlab` 的时候必填。
     */
    @JsonProperty("gitlabPayload")
    private SignInByGitlabPayloadDto gitlabPayload;
    /**
     * 抖音移动端社会化登录数据，当 `connection` 为 `douyin` 的时候必填。
     */
    @JsonProperty("douyinPayload")
    private SignInByDouyinPayloadDto douyinPayload;
    /**
     * 快手移动端社会化登录数据，当 `connection` 为 `kuaishou` 的时候必填。
     */
    @JsonProperty("kuaishouPayload")
    private SignInByKuaishouPayloadDto kuaishouPayload;
    /**
     * 小米移动端社会化登录数据，当 `connection` 为 `xiaomi` 的时候必填。
     */
    @JsonProperty("xiaomiPayload")
    private SignInByXiaomiPayloadDto xiaomiPayload;
    /**
     * LINE 移动端社会化登录数据，当 `connection` 为 `line` 的时候必填。
     */
    @JsonProperty("linePayload")
    private SignInByLinePayloadDto linePayload;
    /**
     * Slack 移动端社会化登录数据，当 `connection` 为 `slack` 的时候必填。
     */
    @JsonProperty("slackPayload")
    private SignInBySlackPayloadDto slackPayload;
    /**
     * OPPO 移动端社会化登录数据，当 `connection` 为 `oppo` 的时候必填。
     */
    @JsonProperty("oppoPayload")
    private SignInByOPPOPayloadDto oppoPayload;
    /**
     * 华为移动端社会化登录数据，当 `connection` 为 `huawei` 的时候必填。
     */
    @JsonProperty("huaweiPayload")
    private SignInByHuaweiPayloadDto huaweiPayload;
    /**
     * 亚马逊移动端社会化登录数据，当 `connection` 为 `amazon` 的时候必填。
     */
    @JsonProperty("amazonPayload")
    private SignInByAmazonPayloadDto amazonPayload;
    /**
     * 可选参数
     */
    @JsonProperty("options")
    private SignInByMobileOptionsDto options;
    /**
     * 应用 ID。当应用的「换取 token 身份验证方式」配置为 `client_secret_post` 需要传。
     */
    @JsonProperty("client_id")
    private String clientId;
    /**
     * 应用密钥。当应用的「换取 token 身份验证方式」配置为 `client_secret_post` 需要传。
     */
    @JsonProperty("client_secret")
    private String clientSecret;

    public String getExtIdpConnidentifier() {
        return extIdpConnidentifier;
    }
    public void setExtIdpConnidentifier(String extIdpConnidentifier) {
        this.extIdpConnidentifier = extIdpConnidentifier;
    }

    public Connection getConnection() {
        return connection;
    }
    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public SignInByWechatPayloadDto getWechatPayload() {
        return wechatPayload;
    }
    public void setWechatPayload(SignInByWechatPayloadDto wechatPayload) {
        this.wechatPayload = wechatPayload;
    }

    public SignInByApplePayloadDto getApplePayload() {
        return applePayload;
    }
    public void setApplePayload(SignInByApplePayloadDto applePayload) {
        this.applePayload = applePayload;
    }

    public SignInByAlipayPayloadDto getAlipayPayload() {
        return alipayPayload;
    }
    public void setAlipayPayload(SignInByAlipayPayloadDto alipayPayload) {
        this.alipayPayload = alipayPayload;
    }

    public SignInByWechatworkDto getWechatworkPayload() {
        return wechatworkPayload;
    }
    public void setWechatworkPayload(SignInByWechatworkDto wechatworkPayload) {
        this.wechatworkPayload = wechatworkPayload;
    }

    public SignInByWechatworkAgencyPayloadDto getWechatworkAgencyPayload() {
        return wechatworkAgencyPayload;
    }
    public void setWechatworkAgencyPayload(SignInByWechatworkAgencyPayloadDto wechatworkAgencyPayload) {
        this.wechatworkAgencyPayload = wechatworkAgencyPayload;
    }

    public SignInByLarkPublicPayloadDto getLarkPublicPayload() {
        return larkPublicPayload;
    }
    public void setLarkPublicPayload(SignInByLarkPublicPayloadDto larkPublicPayload) {
        this.larkPublicPayload = larkPublicPayload;
    }

    public SignInByLarkInternalPayloadDto getLarkInternalPayload() {
        return larkInternalPayload;
    }
    public void setLarkInternalPayload(SignInByLarkInternalPayloadDto larkInternalPayload) {
        this.larkInternalPayload = larkInternalPayload;
    }

    public SignInByYidunPayloadDto getYidunPayload() {
        return yidunPayload;
    }
    public void setYidunPayload(SignInByYidunPayloadDto yidunPayload) {
        this.yidunPayload = yidunPayload;
    }

    public SignInByWechatMiniProgramCodePayloadDto getWechatMiniProgramCodePayload() {
        return wechatMiniProgramCodePayload;
    }
    public void setWechatMiniProgramCodePayload(SignInByWechatMiniProgramCodePayloadDto wechatMiniProgramCodePayload) {
        this.wechatMiniProgramCodePayload = wechatMiniProgramCodePayload;
    }

    public SignInByWechatMiniProgramPhonePayloadDto getWechatMiniProgramPhonePayload() {
        return wechatMiniProgramPhonePayload;
    }
    public void setWechatMiniProgramPhonePayload(SignInByWechatMiniProgramPhonePayloadDto wechatMiniProgramPhonePayload) {
        this.wechatMiniProgramPhonePayload = wechatMiniProgramPhonePayload;
    }

    public SignInByWechatMiniProgramCodeAndPhonePayloadDto getWechatMiniProgramCodeAndPhonePayload() {
        return wechatMiniProgramCodeAndPhonePayload;
    }
    public void setWechatMiniProgramCodeAndPhonePayload(SignInByWechatMiniProgramCodeAndPhonePayloadDto wechatMiniProgramCodeAndPhonePayload) {
        this.wechatMiniProgramCodeAndPhonePayload = wechatMiniProgramCodeAndPhonePayload;
    }

    public SignInByGooglePayloadDto getGooglePayload() {
        return googlePayload;
    }
    public void setGooglePayload(SignInByGooglePayloadDto googlePayload) {
        this.googlePayload = googlePayload;
    }

    public SignInByFacebookPayloadDto getFacebookPayload() {
        return facebookPayload;
    }
    public void setFacebookPayload(SignInByFacebookPayloadDto facebookPayload) {
        this.facebookPayload = facebookPayload;
    }

    public SignInByQQPayloadDto getQqPayload() {
        return qqPayload;
    }
    public void setQqPayload(SignInByQQPayloadDto qqPayload) {
        this.qqPayload = qqPayload;
    }

    public SignInByWeiboPayloadDto getWeiboPayload() {
        return weiboPayload;
    }
    public void setWeiboPayload(SignInByWeiboPayloadDto weiboPayload) {
        this.weiboPayload = weiboPayload;
    }

    public SignInByBaiduPayloadDto getBaiduPayload() {
        return baiduPayload;
    }
    public void setBaiduPayload(SignInByBaiduPayloadDto baiduPayload) {
        this.baiduPayload = baiduPayload;
    }

    public SignInByLinkedInPayloadDto getLinkedInPayload() {
        return linkedInPayload;
    }
    public void setLinkedInPayload(SignInByLinkedInPayloadDto linkedInPayload) {
        this.linkedInPayload = linkedInPayload;
    }

    public SignInByDingTalkPayloadDto getDingTalkPayload() {
        return dingTalkPayload;
    }
    public void setDingTalkPayload(SignInByDingTalkPayloadDto dingTalkPayload) {
        this.dingTalkPayload = dingTalkPayload;
    }

    public SignInByGithubPayloadDto getGithubPayload() {
        return githubPayload;
    }
    public void setGithubPayload(SignInByGithubPayloadDto githubPayload) {
        this.githubPayload = githubPayload;
    }

    public SignInByGiteePayloadDto getGiteePayload() {
        return giteePayload;
    }
    public void setGiteePayload(SignInByGiteePayloadDto giteePayload) {
        this.giteePayload = giteePayload;
    }

    public SignInByGitlabPayloadDto getGitlabPayload() {
        return gitlabPayload;
    }
    public void setGitlabPayload(SignInByGitlabPayloadDto gitlabPayload) {
        this.gitlabPayload = gitlabPayload;
    }

    public SignInByDouyinPayloadDto getDouyinPayload() {
        return douyinPayload;
    }
    public void setDouyinPayload(SignInByDouyinPayloadDto douyinPayload) {
        this.douyinPayload = douyinPayload;
    }

    public SignInByKuaishouPayloadDto getKuaishouPayload() {
        return kuaishouPayload;
    }
    public void setKuaishouPayload(SignInByKuaishouPayloadDto kuaishouPayload) {
        this.kuaishouPayload = kuaishouPayload;
    }

    public SignInByXiaomiPayloadDto getXiaomiPayload() {
        return xiaomiPayload;
    }
    public void setXiaomiPayload(SignInByXiaomiPayloadDto xiaomiPayload) {
        this.xiaomiPayload = xiaomiPayload;
    }

    public SignInByLinePayloadDto getLinePayload() {
        return linePayload;
    }
    public void setLinePayload(SignInByLinePayloadDto linePayload) {
        this.linePayload = linePayload;
    }

    public SignInBySlackPayloadDto getSlackPayload() {
        return slackPayload;
    }
    public void setSlackPayload(SignInBySlackPayloadDto slackPayload) {
        this.slackPayload = slackPayload;
    }

    public SignInByOPPOPayloadDto getOppoPayload() {
        return oppoPayload;
    }
    public void setOppoPayload(SignInByOPPOPayloadDto oppoPayload) {
        this.oppoPayload = oppoPayload;
    }

    public SignInByHuaweiPayloadDto getHuaweiPayload() {
        return huaweiPayload;
    }
    public void setHuaweiPayload(SignInByHuaweiPayloadDto huaweiPayload) {
        this.huaweiPayload = huaweiPayload;
    }

    public SignInByAmazonPayloadDto getAmazonPayload() {
        return amazonPayload;
    }
    public void setAmazonPayload(SignInByAmazonPayloadDto amazonPayload) {
        this.amazonPayload = amazonPayload;
    }

    public SignInByMobileOptionsDto getOptions() {
        return options;
    }
    public void setOptions(SignInByMobileOptionsDto options) {
        this.options = options;
    }

    public String getClientId() {
        return clientId;
    }
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }


    /**
     * 移动端社会化登录类型：
     * - `apple`: Apple 移动端应用
     * - `wechat`: 微信移动应用
     * - `alipay`: 支付宝移动应用
     * - `wechatwork`: 企业微信移动应用
     * - `wechatwork_agency`: 企业微信移动应用（代开发模式）
     * - `lark_internal`: 飞书移动端企业自建应用
     * - `lark_public`: 飞书移动端应用商店应用
     * - `yidun`: 网易易盾一键登录
     * - `wechat_mini_program_code`: 微信小程序使用 code 登录
     * - `wechat_mini_program_phone `: 微信小程序使用手机号登录
     * - `wechat_mini_program_code_and_phone `: 微信小程序使用 code 和手机号登录
     * - `google`: Google 移动端社会化登录
     * - `facebook`: Facebook 移动端社会化登录
     * - `qq`: QQ 移动端社会化登录
     * - `weibo`: 新浪微博移动端社会化登录
     * - `baidu`: 百度移动端社会化登录
     * - `linkedin`: LinkedIn 移动端社会化登录
     * - `dingtalk`: 钉钉移动端社会化登录
     * - `github`: Github 动端社会化登录
     * - `gitee`: Gitee 移动端社会化登录
     * - `gitlab`: GitLab 移动端社会化登录
     * - `douyin`: 抖音移动端社会化登录
     * - `kuaishou`: 快手移动端社会化登录
     * - `xiaomi`: 小米移动端社会化登录
     * - `line`: LINE 移动端社会化登录
     * - `slack`: Slack 移动端社会化登录
     * - `oppo`: OPPO 移动端社会化登录
     * - `huawei`: 华为移动端社会化登录
     * - `amazon`: 亚马逊移动端社会化登录
     *
     */
    public static enum Connection {

        @JsonProperty("apple")
        APPLE("apple"),

        @JsonProperty("wechat")
        WECHAT("wechat"),

        @JsonProperty("alipay")
        ALIPAY("alipay"),

        @JsonProperty("wechatwork")
        WECHATWORK("wechatwork"),

        @JsonProperty("wechatwork_agency")
        WECHATWORK_AGENCY("wechatwork_agency"),

        @JsonProperty("lark_internal")
        LARK_INTERNAL("lark_internal"),

        @JsonProperty("lark_public")
        LARK_PUBLIC("lark_public"),

        @JsonProperty("yidun")
        YIDUN("yidun"),

        @JsonProperty("wechat_mini_program_code")
        WECHAT_MINI_PROGRAM_CODE("wechat_mini_program_code"),

        @JsonProperty("wechat_mini_program_phone")
        WECHAT_MINI_PROGRAM_PHONE("wechat_mini_program_phone"),

        @JsonProperty("wechat_mini_program_code_and_phone")
        WECHAT_MINI_PROGRAM_CODE_AND_PHONE("wechat_mini_program_code_and_phone"),

        @JsonProperty("google")
        GOOGLE("google"),

        @JsonProperty("facebook")
        FACEBOOK("facebook"),

        @JsonProperty("qq")
        QQ("qq"),

        @JsonProperty("weibo")
        WEIBO("weibo"),

        @JsonProperty("baidu")
        BAIDU("baidu"),

        @JsonProperty("linkedin")
        LINKEDIN("linkedin"),

        @JsonProperty("dingtalk")
        DINGTALK("dingtalk"),

        @JsonProperty("github")
        GITHUB("github"),

        @JsonProperty("gitee")
        GITEE("gitee"),

        @JsonProperty("gitlab")
        GITLAB("gitlab"),

        @JsonProperty("douyin")
        DOUYIN("douyin"),

        @JsonProperty("kuaishou")
        KUAISHOU("kuaishou"),

        @JsonProperty("xiaomi")
        XIAOMI("xiaomi"),

        @JsonProperty("line")
        LINE("line"),

        @JsonProperty("slack")
        SLACK("slack"),

        @JsonProperty("oppo")
        OPPO("oppo"),

        @JsonProperty("huawei")
        HUAWEI("huawei"),

        @JsonProperty("amazon")
        AMAZON("amazon"),
        ;

        private String value;

        Connection(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}