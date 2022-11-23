package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.LoginFailCheckConfigDto;
import cn.authing.sdk.java.dto.LoginPassowrdFailCheckConfigDto;

public class LoginAnomalyDetectionConfigDto {
    /**
     * 登录安全策略。当用户触发登录失败频率检测时，采用什么策略。目前支持验证码和锁定账号两种策略。当选择账号锁定策略的时候，只可以开启「登录密码错误限制」。此字段标志为过时，但是此字段还是必传的，如果使用新版本逻辑可以默认写一个。新版本账号锁定使用 accountLock，验证码使用 robotVerify
     */
    @JsonProperty("loginFailStrategy")
    private LoginFailStrategy loginFailStrategy;
    /**
     * 人机验证（验证码）策略。可选值，disable（不开启）/condition_set（条件开启）/always_enable （始终开启）
     */
    @JsonProperty("robotVerify")
    private String robotVerify;
    /**
     * 账号锁定策略。可选值，disable（不开启）/condition_set（条件开启）
     */
    @JsonProperty("accountLock")
    private String accountLock;
    /**
     * 登录失败次数限制：当用户登录输入信息错误的时候会被按照「登录安全策略」规则触发相对应的策略。
     */
    @JsonProperty("loginFailCheck")
    private LoginFailCheckConfigDto loginFailCheck;
    /**
     * 登录密码错误限制：当用户登录输入密码信息错误的时候会被按照「登录安全策略」规则触发相对应的策略。此字段被标志为过时，见 accountLockLoginPasswordFailCheck/ robotVerifyLoginPasswordFailCheck
     */
    @JsonProperty("loginPasswordFailCheck")
    private LoginPassowrdFailCheckConfigDto loginPasswordFailCheck;
    /**
     * 账号锁定-登录密码错误限制：当用户登录输入密码信息错误的时候会被按照「登录安全策略」规则触发相对应的策略。
     */
    @JsonProperty("accountLockLoginPasswordFailCheck")
    private LoginPassowrdFailCheckConfigDto accountLockLoginPasswordFailCheck;
    /**
     * 人机验证（验证码）-登录密码错误限制：当用户登录输入密码信息错误的时候会被按照「登录安全策略」规则触发相对应的策略。
     */
    @JsonProperty("robotVerifyLoginPasswordFailCheck")
    private LoginPassowrdFailCheckConfigDto robotVerifyLoginPasswordFailCheck;

    public LoginFailStrategy getLoginFailStrategy() {
        return loginFailStrategy;
    }
    public void setLoginFailStrategy(LoginFailStrategy loginFailStrategy) {
        this.loginFailStrategy = loginFailStrategy;
    }

    public String getRobotVerify() {
        return robotVerify;
    }
    public void setRobotVerify(String robotVerify) {
        this.robotVerify = robotVerify;
    }

    public String getAccountLock() {
        return accountLock;
    }
    public void setAccountLock(String accountLock) {
        this.accountLock = accountLock;
    }

    public LoginFailCheckConfigDto getLoginFailCheck() {
        return loginFailCheck;
    }
    public void setLoginFailCheck(LoginFailCheckConfigDto loginFailCheck) {
        this.loginFailCheck = loginFailCheck;
    }

    public LoginPassowrdFailCheckConfigDto getLoginPasswordFailCheck() {
        return loginPasswordFailCheck;
    }
    public void setLoginPasswordFailCheck(LoginPassowrdFailCheckConfigDto loginPasswordFailCheck) {
        this.loginPasswordFailCheck = loginPasswordFailCheck;
    }

    public LoginPassowrdFailCheckConfigDto getAccountLockLoginPasswordFailCheck() {
        return accountLockLoginPasswordFailCheck;
    }
    public void setAccountLockLoginPasswordFailCheck(LoginPassowrdFailCheckConfigDto accountLockLoginPasswordFailCheck) {
        this.accountLockLoginPasswordFailCheck = accountLockLoginPasswordFailCheck;
    }

    public LoginPassowrdFailCheckConfigDto getRobotVerifyLoginPasswordFailCheck() {
        return robotVerifyLoginPasswordFailCheck;
    }
    public void setRobotVerifyLoginPasswordFailCheck(LoginPassowrdFailCheckConfigDto robotVerifyLoginPasswordFailCheck) {
        this.robotVerifyLoginPasswordFailCheck = robotVerifyLoginPasswordFailCheck;
    }


    /**
     * 登录安全策略。当用户触发登录失败频率检测时，采用什么策略。目前支持验证码和锁定账号两种策略。当选择账号锁定策略的时候，只可以开启「登录密码错误限制」。此字段标志为过时，但是此字段还是必传的，如果使用新版本逻辑可以默认写一个。新版本账号锁定使用 accountLock，验证码使用 robotVerify
     */
    public static enum LoginFailStrategy {

        @JsonProperty("captcha")
        CAPTCHA("captcha"),

        @JsonProperty("block-account")
        BLOCK_ACCOUNT("block-account"),
        ;

        private String value;

        LoginFailStrategy(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}