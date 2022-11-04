package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.LoginFailCheckConfigDto;
import cn.authing.sdk.java.dto.LoginPassowrdFailCheckConfigDto;

public class LoginAnomalyDetectionConfigDto {
    /**
     * 登录安全策略。当用户触发登录失败频率检测时，采用什么策略。目前支持验证码和锁定账号两种策略。当选择账号锁定策略的时候，只可以开启「登录密码错误限制」。
     */
    @JsonProperty("loginFailStrategy")
    private LoginFailStrategy loginFailStrategy;
    /**
     * 登录失败次数限制：当用户登录输入信息错误的时候会被按照「登录安全策略」规则触发相对应的策略。
     */
    @JsonProperty("loginFailCheck")
    private LoginFailCheckConfigDto loginFailCheck;
    /**
     * 登录密码错误限制：当用户登录输入密码信息错误的时候会被按照「登录安全策略」规则触发相对应的策略。
     */
    @JsonProperty("loginPasswordFailCheck")
    private LoginPassowrdFailCheckConfigDto loginPasswordFailCheck;

    public LoginFailStrategy getLoginFailStrategy() {
        return loginFailStrategy;
    }
    public void setLoginFailStrategy(LoginFailStrategy loginFailStrategy) {
        this.loginFailStrategy = loginFailStrategy;
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


    /**
     * 登录安全策略。当用户触发登录失败频率检测时，采用什么策略。目前支持验证码和锁定账号两种策略。当选择账号锁定策略的时候，只可以开启「登录密码错误限制」。
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