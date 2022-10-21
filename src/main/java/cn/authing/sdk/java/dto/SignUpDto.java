package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.SignUpByPassCodeDto;
import cn.authing.sdk.java.dto.SignUpByPasswordDto;
import cn.authing.sdk.java.dto.SignUpOptionsDto;
import cn.authing.sdk.java.dto.SignUpProfileDto;

public class SignUpDto {
    /**
     * 注册方式：
     * - `PASSWORD`: 邮箱密码方式
     * - `PASSCODE`: 邮箱/手机号验证码方式
     *
     */
    @JsonProperty("connection")
    private Connection connection;
    /**
     * 当主持方式为 `PASSWORD` 时此参数必填。
     */
    @JsonProperty("passwordPayload")
    private SignUpByPasswordDto passwordPayload;
    /**
     * 当认证方式为 `PASSCODE` 时此参数必填
     */
    @JsonProperty("passCodePayload")
    private SignUpByPassCodeDto passCodePayload;
    /**
     * 用户资料
     */
    @JsonProperty("profile")
    private SignUpProfileDto profile;
    /**
     * 可选参数
     */
    @JsonProperty("options")
    private SignUpOptionsDto options;

    public Connection getConnection() {
        return connection;
    }
    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public SignUpByPasswordDto getPasswordPayload() {
        return passwordPayload;
    }
    public void setPasswordPayload(SignUpByPasswordDto passwordPayload) {
        this.passwordPayload = passwordPayload;
    }

    public SignUpByPassCodeDto getPassCodePayload() {
        return passCodePayload;
    }
    public void setPassCodePayload(SignUpByPassCodeDto passCodePayload) {
        this.passCodePayload = passCodePayload;
    }

    public SignUpProfileDto getProfile() {
        return profile;
    }
    public void setProfile(SignUpProfileDto profile) {
        this.profile = profile;
    }

    public SignUpOptionsDto getOptions() {
        return options;
    }
    public void setOptions(SignUpOptionsDto options) {
        this.options = options;
    }


    /**
     * 注册方式：
     * - `PASSWORD`: 邮箱密码方式
     * - `PASSCODE`: 邮箱/手机号验证码方式
     *
     */
    public static enum Connection {

        @JsonProperty("PASSWORD")
        PASSWORD("PASSWORD"),

        @JsonProperty("PASSCODE")
        PASSCODE("PASSCODE"),
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