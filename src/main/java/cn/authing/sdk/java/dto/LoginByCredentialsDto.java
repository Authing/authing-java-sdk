package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.AuthenticateByADDto;
import cn.authing.sdk.java.dto.AuthenticateByLDAPDto;
import cn.authing.sdk.java.dto.AuthenticateByPassCodeDto;
import cn.authing.sdk.java.dto.AuthenticateByPasswordDto;
import cn.authing.sdk.java.dto.SignInOptionsDto;

public class LoginByCredentialsDto {
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
    private AuthenticateByPasswordDto passwordPayload;
    /**
     * 当认证方式为 `PASSCODE` 时此参数必填
     */
    @JsonProperty("passCodePayload")
    private AuthenticateByPassCodeDto passCodePayload;
    /**
     * 当认证方式为 `AD` 时此参数必填
     */
    @JsonProperty("adPayload")
    private AuthenticateByADDto adPayload;
    /**
     * 当认证方式为 `LDAP` 时此参数必填
     */
    @JsonProperty("ldapPayload")
    private AuthenticateByLDAPDto ldapPayload;
    /**
     * 可选参数
     */
    @JsonProperty("options")
    private SignInOptionsDto options;

    public Connection getConnection() {
        return connection;
    }
    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public AuthenticateByPasswordDto getPasswordPayload() {
        return passwordPayload;
    }
    public void setPasswordPayload(AuthenticateByPasswordDto passwordPayload) {
        this.passwordPayload = passwordPayload;
    }

    public AuthenticateByPassCodeDto getPassCodePayload() {
        return passCodePayload;
    }
    public void setPassCodePayload(AuthenticateByPassCodeDto passCodePayload) {
        this.passCodePayload = passCodePayload;
    }

    public AuthenticateByADDto getAdPayload() {
        return adPayload;
    }
    public void setAdPayload(AuthenticateByADDto adPayload) {
        this.adPayload = adPayload;
    }

    public AuthenticateByLDAPDto getLdapPayload() {
        return ldapPayload;
    }
    public void setLdapPayload(AuthenticateByLDAPDto ldapPayload) {
        this.ldapPayload = ldapPayload;
    }

    public SignInOptionsDto getOptions() {
        return options;
    }
    public void setOptions(SignInOptionsDto options) {
        this.options = options;
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