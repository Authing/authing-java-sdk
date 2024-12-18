package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ApplicationDefaultLoginMethod {
    /**
     * 默认的登录类型
     * - `PASSWORD`: 密码类型，取决于你开启的基础登录方式，支持手机号/邮箱/用户名 + 密码进行登录
     * - `PASSCODE`: 验证码类型，取决于你开启的基础登录方式，支持手机号/邮箱 + 验证码进行登录
     * - `QRCODE`: 扫码登录类型，目前包含自建 APP 扫码登录、关注微信公众号扫码登录、微信小程序扫码登录三种类型
     *
     */
    @JsonProperty("connectionType")
    private ConnectionType connectionType;
    /**
     * 当 `connectionType` 为 `QRCODE` 时，此参数表示二维码类型。
     * - `SELF_BUILT_APP`: 自建 APP 扫码
     * - `WECHAT_OFFICIAL_ACCOUNT`: 扫码关注微信公众号登录
     * - `WECHAT_MINI_PROGRAM`: 微信小程序扫码登录
     *
     */
    @JsonProperty("qrcodeType")
    private QrcodeType qrcodeType;
    /**
     * 当 `connectionType` 为 `QRCODE` 时，你需要通过此参数指定具体的扫码登录身份源连接的 ID。
     */
    @JsonProperty("qrcodeExtIdpConnId")
    private String qrcodeExtIdpConnId;
    /**
     * 当 `connectionType` 为 `AD` 时，你需要通过此参数指定具体的 AD 身份源连接的 ID。
     */
    @JsonProperty("adExtIdpConnId")
    private String adExtIdpConnId;
    /**
     * 当 `connectionType` 为 `LDAP` 时，你需要通过此参数指定具体的 LDAP 身份源连接的 ID。
     */
    @JsonProperty("ldapExtIdpConnId")
    private String ldapExtIdpConnId;

    public ConnectionType getConnectionType() {
        return connectionType;
    }
    public void setConnectionType(ConnectionType connectionType) {
        this.connectionType = connectionType;
    }

    public QrcodeType getQrcodeType() {
        return qrcodeType;
    }
    public void setQrcodeType(QrcodeType qrcodeType) {
        this.qrcodeType = qrcodeType;
    }

    public String getQrcodeExtIdpConnId() {
        return qrcodeExtIdpConnId;
    }
    public void setQrcodeExtIdpConnId(String qrcodeExtIdpConnId) {
        this.qrcodeExtIdpConnId = qrcodeExtIdpConnId;
    }

    public String getAdExtIdpConnId() {
        return adExtIdpConnId;
    }
    public void setAdExtIdpConnId(String adExtIdpConnId) {
        this.adExtIdpConnId = adExtIdpConnId;
    }

    public String getLdapExtIdpConnId() {
        return ldapExtIdpConnId;
    }
    public void setLdapExtIdpConnId(String ldapExtIdpConnId) {
        this.ldapExtIdpConnId = ldapExtIdpConnId;
    }


    /**
     * 默认的登录类型
     * - `PASSWORD`: 密码类型，取决于你开启的基础登录方式，支持手机号/邮箱/用户名 + 密码进行登录
     * - `PASSCODE`: 验证码类型，取决于你开启的基础登录方式，支持手机号/邮箱 + 验证码进行登录
     * - `QRCODE`: 扫码登录类型，目前包含自建 APP 扫码登录、关注微信公众号扫码登录、微信小程序扫码登录三种类型
     *
     */
    public static enum ConnectionType {

        @JsonProperty("PASSCODE")
        PASSCODE("PASSCODE"),

        @JsonProperty("PASSWORD")
        PASSWORD("PASSWORD"),

        @JsonProperty("QRCODE")
        QRCODE("QRCODE"),

        @JsonProperty("LDAP")
        LDAP("LDAP"),

        @JsonProperty("AD")
        AD("AD"),
        ;

        private String value;

        ConnectionType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * 当 `connectionType` 为 `QRCODE` 时，此参数表示二维码类型。
     * - `SELF_BUILT_APP`: 自建 APP 扫码
     * - `WECHAT_OFFICIAL_ACCOUNT`: 扫码关注微信公众号登录
     * - `WECHAT_MINI_PROGRAM`: 微信小程序扫码登录
     *
     */
    public static enum QrcodeType {

        @JsonProperty("SELF_BUILT_APP")
        SELF_BUILT_APP("SELF_BUILT_APP"),

        @JsonProperty("WECHAT_OFFICIAL_ACCOUNT")
        WECHAT_OFFICIAL_ACCOUNT("WECHAT_OFFICIAL_ACCOUNT"),

        @JsonProperty("WECHAT_MINI_PROGRAM")
        WECHAT_MINI_PROGRAM("WECHAT_MINI_PROGRAM"),
        ;

        private String value;

        QrcodeType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}