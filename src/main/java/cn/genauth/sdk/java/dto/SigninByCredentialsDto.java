package cn.genauth.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SigninByCredentialsDto {
    /**
     * 认证方式：
     * - `PASSWORD`: 使用密码方式进行认证。
     * - `PASSCODE`: 使用一次性临时验证码进行认证。
     * - `LDAP`: 基于 LDAP 用户目录进行认证。
     * - `AD`: 基于 Windows AD 用户目录进行认证。
     *
     */
    @JsonProperty("connection")
    private Connection connection;
    /**
     * 当认证方式为 `PASSWORD` 时此参数必填。
     */
    @JsonProperty("passwordPayload")
    private SignInByPasswordPayloadDto passwordPayload;
    /**
     * 当认证方式为 `PASSCODE` 时此参数必填
     */
    @JsonProperty("passCodePayload")
    private SignInByPassCodePayloadDto passCodePayload;
    /**
     * 当认证方式为 `AD` 时此参数必填
     */
    @JsonProperty("adPayload")
    private SignInByAdPayloadDto adPayload;
    /**
     * 当认证方式为 `LDAP` 时此参数必填
     */
    @JsonProperty("ldapPayload")
    private SignInByLdapPayloadDto ldapPayload;
    /**
     * 可选参数
     */
    @JsonProperty("options")
    private SignInOptionsDto options;
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

    public Connection getConnection() {
        return connection;
    }
    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public SignInByPasswordPayloadDto getPasswordPayload() {
        return passwordPayload;
    }
    public void setPasswordPayload(SignInByPasswordPayloadDto passwordPayload) {
        this.passwordPayload = passwordPayload;
    }

    public SignInByPassCodePayloadDto getPassCodePayload() {
        return passCodePayload;
    }
    public void setPassCodePayload(SignInByPassCodePayloadDto passCodePayload) {
        this.passCodePayload = passCodePayload;
    }

    public SignInByAdPayloadDto getAdPayload() {
        return adPayload;
    }
    public void setAdPayload(SignInByAdPayloadDto adPayload) {
        this.adPayload = adPayload;
    }

    public SignInByLdapPayloadDto getLdapPayload() {
        return ldapPayload;
    }
    public void setLdapPayload(SignInByLdapPayloadDto ldapPayload) {
        this.ldapPayload = ldapPayload;
    }

    public SignInOptionsDto getOptions() {
        return options;
    }
    public void setOptions(SignInOptionsDto options) {
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
     * 认证方式：
     * - `PASSWORD`: 使用密码方式进行认证。
     * - `PASSCODE`: 使用一次性临时验证码进行认证。
     * - `LDAP`: 基于 LDAP 用户目录进行认证。
     * - `AD`: 基于 Windows AD 用户目录进行认证。
     *
     */
    public static enum Connection {

        @JsonProperty("PASSWORD")
        PASSWORD("PASSWORD"),

        @JsonProperty("PASSCODE")
        PASSCODE("PASSCODE"),

        @JsonProperty("LDAP")
        LDAP("LDAP"),

        @JsonProperty("AD")
        AD("AD"),
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