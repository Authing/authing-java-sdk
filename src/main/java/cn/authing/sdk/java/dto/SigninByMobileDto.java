package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.SignInByAlipayPayloadDto;
import cn.authing.sdk.java.dto.SignInByApplePayloadDto;
import cn.authing.sdk.java.dto.SignInByGooglePayloadDto;
import cn.authing.sdk.java.dto.SignInByLarkInternalPayloadDto;
import cn.authing.sdk.java.dto.SignInByLarkPublicPayloadDto;
import cn.authing.sdk.java.dto.SignInByMobileOptionsDto;
import cn.authing.sdk.java.dto.SignInByWechatMiniProgramCodePayloadDto;
import cn.authing.sdk.java.dto.SignInByWechatMiniProgramPhonePayloadDto;
import cn.authing.sdk.java.dto.SignInByWechatPayloadDto;
import cn.authing.sdk.java.dto.SignInByWechatworkAgencyPayloadDto;
import cn.authing.sdk.java.dto.SignInByWechatworkDto;
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
     * - `google`: Google 移动端社会化登录
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
     * 网易易盾移动端社会化登录数据，当 `connection` 为 `wechat_mini_program_code` 的时候必填。
     */
    @JsonProperty("wechatMiniProgramCodePayload")
    private SignInByWechatMiniProgramCodePayloadDto wechatMiniProgramCodePayload;
    /**
     * 网易易盾移动端社会化登录数据，当 `connection` 为 `wechat_mini_program_phone` 的时候必填。
     */
    @JsonProperty("wechatMiniProgramPhonePayload")
    private SignInByWechatMiniProgramPhonePayloadDto wechatMiniProgramPhonePayload;
    /**
     * Google 移动端社会化登录数据，当 `connection` 为 `google` 的时候必填。
     */
    @JsonProperty("googlePayload")
    private SignInByGooglePayloadDto googlePayload;
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

    public SignInByGooglePayloadDto getGooglePayload() {
        return googlePayload;
    }
    public void setGooglePayload(SignInByGooglePayloadDto googlePayload) {
        this.googlePayload = googlePayload;
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
     * - `google`: Google 移动端社会化登录
     *
     */
    public static enum Connection {

        @JsonProperty("Apple")
        APPLE("Apple"),

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

        @JsonProperty("google")
        GOOGLE("google"),
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