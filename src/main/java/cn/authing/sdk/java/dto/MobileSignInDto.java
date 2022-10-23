package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.AuthenticateByAlipayDto;
import cn.authing.sdk.java.dto.AuthenticateByLarkInternalDto;
import cn.authing.sdk.java.dto.AuthenticateByLarkPublicDto;
import cn.authing.sdk.java.dto.AuthenticateByWechatDto;
import cn.authing.sdk.java.dto.AuthenticateByWechatMiniProgramCodeDto;
import cn.authing.sdk.java.dto.AuthenticateByWechatMiniProgramPhoneDto;
import cn.authing.sdk.java.dto.AuthenticateByWechatworkAgencyDto;
import cn.authing.sdk.java.dto.AuthenticateByWechatworkDto;
import cn.authing.sdk.java.dto.AuthenticateByYidunDto;
import cn.authing.sdk.java.dto.SignInByMobileOptionsDto;

public class MobileSignInDto {
    /**
     * 外部身份源连接标志符
     */
    @JsonProperty("extIdpConnidentifier")
    private String extIdpConnidentifier;
    /**
     * 移动端社会化登录类型：
     * - `wechat`: 微信移动应用
     * - `alipay`: 支付宝移动应用
     * - `wechatwork`: 企业微信移动应用
     * - `wechatwork_agency`: 企业微信移动应用（代开发模式）
     * - `lark_internal`: 飞书移动端企业自建应用
     * - `lark_public`: 飞书移动端应用商店应用
     * - `yidun`: 网易易盾一键登录
     * - `wechat_mini_program_code`: 微信小程序使用 code 登录
     * - `wechat_mini_program_phone `: 微信小程序使用手机号登录
     *
     */
    @JsonProperty("connection")
    private Connection connection;
    /**
     * 微信移动端社会化登录数据，当 `connection` 为 `wechat` 的时候必填
     */
    @JsonProperty("wechatPayload")
    private AuthenticateByWechatDto wechatPayload;
    /**
     * 支付宝移动端社会化登录数据，当 `connection` 为 `alipay` 的时候必填
     */
    @JsonProperty("alipayPayload")
    private AuthenticateByAlipayDto alipayPayload;
    /**
     * 企业微信移动端社会化登录数据，当 `connection` 为 `wechatwork` 的时候必填
     */
    @JsonProperty("wechatworkPayload")
    private AuthenticateByWechatworkDto wechatworkPayload;
    /**
     * 企业微信（代开发模式）移动端社会化登录数据，当 `connection` 为 `wechatwork_agency` 的时候必填
     */
    @JsonProperty("wechatworkAgencyPayload")
    private AuthenticateByWechatworkAgencyDto wechatworkAgencyPayload;
    /**
     * 飞书应用商店应用移动端社会化登录数据，当 `connection` 为 `lark_public` 的时候必填
     */
    @JsonProperty("larkPublicPayload")
    private AuthenticateByLarkPublicDto larkPublicPayload;
    /**
     * 飞书应用商店应用移动端社会化登录数据，当 `connection` 为 `lark_internal` 的时候必填
     */
    @JsonProperty("larkInternalPayload")
    private AuthenticateByLarkInternalDto larkInternalPayload;
    /**
     * 网易易盾移动端社会化登录数据，当 `connection` 为 `yidun` 的时候必填
     */
    @JsonProperty("yidunPayload")
    private AuthenticateByYidunDto yidunPayload;
    /**
     * 网易易盾移动端社会化登录数据，当 `connection` 为 `wechat_mini_program_code` 的时候必填
     */
    @JsonProperty("wechatMiniProgramCodePayload")
    private AuthenticateByWechatMiniProgramCodeDto wechatMiniProgramCodePayload;
    /**
     * 网易易盾移动端社会化登录数据，当 `connection` 为 `wechat_mini_program_phone` 的时候必填
     */
    @JsonProperty("wechatMiniProgramPhonePayload")
    private AuthenticateByWechatMiniProgramPhoneDto wechatMiniProgramPhonePayload;
    /**
     * 可选参数
     */
    @JsonProperty("options")
    private SignInByMobileOptionsDto options;

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

    public AuthenticateByWechatDto getWechatPayload() {
        return wechatPayload;
    }
    public void setWechatPayload(AuthenticateByWechatDto wechatPayload) {
        this.wechatPayload = wechatPayload;
    }

    public AuthenticateByAlipayDto getAlipayPayload() {
        return alipayPayload;
    }
    public void setAlipayPayload(AuthenticateByAlipayDto alipayPayload) {
        this.alipayPayload = alipayPayload;
    }

    public AuthenticateByWechatworkDto getWechatworkPayload() {
        return wechatworkPayload;
    }
    public void setWechatworkPayload(AuthenticateByWechatworkDto wechatworkPayload) {
        this.wechatworkPayload = wechatworkPayload;
    }

    public AuthenticateByWechatworkAgencyDto getWechatworkAgencyPayload() {
        return wechatworkAgencyPayload;
    }
    public void setWechatworkAgencyPayload(AuthenticateByWechatworkAgencyDto wechatworkAgencyPayload) {
        this.wechatworkAgencyPayload = wechatworkAgencyPayload;
    }

    public AuthenticateByLarkPublicDto getLarkPublicPayload() {
        return larkPublicPayload;
    }
    public void setLarkPublicPayload(AuthenticateByLarkPublicDto larkPublicPayload) {
        this.larkPublicPayload = larkPublicPayload;
    }

    public AuthenticateByLarkInternalDto getLarkInternalPayload() {
        return larkInternalPayload;
    }
    public void setLarkInternalPayload(AuthenticateByLarkInternalDto larkInternalPayload) {
        this.larkInternalPayload = larkInternalPayload;
    }

    public AuthenticateByYidunDto getYidunPayload() {
        return yidunPayload;
    }
    public void setYidunPayload(AuthenticateByYidunDto yidunPayload) {
        this.yidunPayload = yidunPayload;
    }

    public AuthenticateByWechatMiniProgramCodeDto getWechatMiniProgramCodePayload() {
        return wechatMiniProgramCodePayload;
    }
    public void setWechatMiniProgramCodePayload(AuthenticateByWechatMiniProgramCodeDto wechatMiniProgramCodePayload) {
        this.wechatMiniProgramCodePayload = wechatMiniProgramCodePayload;
    }

    public AuthenticateByWechatMiniProgramPhoneDto getWechatMiniProgramPhonePayload() {
        return wechatMiniProgramPhonePayload;
    }
    public void setWechatMiniProgramPhonePayload(AuthenticateByWechatMiniProgramPhoneDto wechatMiniProgramPhonePayload) {
        this.wechatMiniProgramPhonePayload = wechatMiniProgramPhonePayload;
    }

    public SignInByMobileOptionsDto getOptions() {
        return options;
    }
    public void setOptions(SignInByMobileOptionsDto options) {
        this.options = options;
    }


    /**
     * 移动端社会化登录类型：
     * - `wechat`: 微信移动应用
     * - `alipay`: 支付宝移动应用
     * - `wechatwork`: 企业微信移动应用
     * - `wechatwork_agency`: 企业微信移动应用（代开发模式）
     * - `lark_internal`: 飞书移动端企业自建应用
     * - `lark_public`: 飞书移动端应用商店应用
     * - `yidun`: 网易易盾一键登录
     * - `wechat_mini_program_code`: 微信小程序使用 code 登录
     * - `wechat_mini_program_phone `: 微信小程序使用手机号登录
     *
     */
    public static enum Connection {

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