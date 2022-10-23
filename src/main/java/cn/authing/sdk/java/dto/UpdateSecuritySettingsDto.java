package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.ChangeEmailStrategyDto;
import cn.authing.sdk.java.dto.ChangePhoneStrategyDto;
import cn.authing.sdk.java.dto.CookieSettingsDto;
import cn.authing.sdk.java.dto.LoginAnomalyDetectionConfigDto;
import cn.authing.sdk.java.dto.QrcodeLoginStrategyDto;
import cn.authing.sdk.java.dto.RegisterAnomalyDetectionConfigDto;
import cn.authing.sdk.java.dto.SelfUnlockAccountConfigDto;

public class UpdateSecuritySettingsDto {
    /**
     * 安全域（CORS）
     */
    @JsonProperty("allowedOrigins")
    private String allowedOrigins;
    /**
     * Authing Token 有效时间（秒）
     */
    @JsonProperty("authingTokenExpiresIn")
    private Integer authingTokenExpiresIn;
    /**
     * 验证码长度。包含短信验证码、邮件验证码和图形验证码。
     */
    @JsonProperty("verifyCodeLength")
    private Integer verifyCodeLength;
    /**
     * 验证码尝试次数。在一个验证码有效周期内（默认为 60 s），用户输入验证码错误次数超过此阈值之后，将会导致当前验证码失效，需要重新发送。
     */
    @JsonProperty("verifyCodeMaxAttempts")
    private Integer verifyCodeMaxAttempts;
    /**
     * 用户修改邮箱的安全策略
     */
    @JsonProperty("changeEmailStrategy")
    private ChangeEmailStrategyDto changeEmailStrategy;
    /**
     * 用户修改手机号的安全策略
     */
    @JsonProperty("changePhoneStrategy")
    private ChangePhoneStrategyDto changePhoneStrategy;
    /**
     * Cookie 过期时间设置
     */
    @JsonProperty("cookieSettings")
    private CookieSettingsDto cookieSettings;
    /**
     * 是否禁止用户注册，开启之后，用户将无法自主注册，只能管理员为其创建账号。针对 B2B 和 B2E 类型用户池，默认开启。
     */
    @JsonProperty("registerDisabled")
    private Boolean registerDisabled;
    /**
     * 频繁注册检测配置
     */
    @JsonProperty("registerAnomalyDetection")
    private RegisterAnomalyDetectionConfigDto registerAnomalyDetection;
    /**
     * 验证码注册后是否要求用户设置密码（仅针对 Authing 登录页和 Guard 有效，不针对 API 调用）。
     */
    @JsonProperty("completePasswordAfterPassCodeLogin")
    private Boolean completePasswordAfterPassCodeLogin;
    /**
     * 登录防暴破配置
     */
    @JsonProperty("loginAnomalyDetection")
    private LoginAnomalyDetectionConfigDto loginAnomalyDetection;
    /**
     * 当使用邮箱登录时，未验证的邮箱登录时是否禁止登录并发送认证邮件。当用户收到邮件并完成验证之后，才能进行登录。
     */
    @JsonProperty("loginRequireEmailVerified")
    private Boolean loginRequireEmailVerified;
    /**
     * 用户自助解锁配置。注：只有绑定了手机号/邮箱的用户才可以自助解锁
     */
    @JsonProperty("selfUnlockAccount")
    private SelfUnlockAccountConfigDto selfUnlockAccount;
    /**
     * Authing 登录页面是否开启登录账号选择
     */
    @JsonProperty("enableLoginAccountSwitch")
    private Boolean enableLoginAccountSwitch;
    /**
     * APP 扫码登录安全配置
     */
    @JsonProperty("qrcodeLoginStrategy")
    private QrcodeLoginStrategyDto qrcodeLoginStrategy;

    public String getAllowedOrigins() {
        return allowedOrigins;
    }
    public void setAllowedOrigins(String allowedOrigins) {
        this.allowedOrigins = allowedOrigins;
    }

    public Integer getAuthingTokenExpiresIn() {
        return authingTokenExpiresIn;
    }
    public void setAuthingTokenExpiresIn(Integer authingTokenExpiresIn) {
        this.authingTokenExpiresIn = authingTokenExpiresIn;
    }

    public Integer getVerifyCodeLength() {
        return verifyCodeLength;
    }
    public void setVerifyCodeLength(Integer verifyCodeLength) {
        this.verifyCodeLength = verifyCodeLength;
    }

    public Integer getVerifyCodeMaxAttempts() {
        return verifyCodeMaxAttempts;
    }
    public void setVerifyCodeMaxAttempts(Integer verifyCodeMaxAttempts) {
        this.verifyCodeMaxAttempts = verifyCodeMaxAttempts;
    }

    public ChangeEmailStrategyDto getChangeEmailStrategy() {
        return changeEmailStrategy;
    }
    public void setChangeEmailStrategy(ChangeEmailStrategyDto changeEmailStrategy) {
        this.changeEmailStrategy = changeEmailStrategy;
    }

    public ChangePhoneStrategyDto getChangePhoneStrategy() {
        return changePhoneStrategy;
    }
    public void setChangePhoneStrategy(ChangePhoneStrategyDto changePhoneStrategy) {
        this.changePhoneStrategy = changePhoneStrategy;
    }

    public CookieSettingsDto getCookieSettings() {
        return cookieSettings;
    }
    public void setCookieSettings(CookieSettingsDto cookieSettings) {
        this.cookieSettings = cookieSettings;
    }

    public Boolean getRegisterDisabled() {
        return registerDisabled;
    }
    public void setRegisterDisabled(Boolean registerDisabled) {
        this.registerDisabled = registerDisabled;
    }

    public RegisterAnomalyDetectionConfigDto getRegisterAnomalyDetection() {
        return registerAnomalyDetection;
    }
    public void setRegisterAnomalyDetection(RegisterAnomalyDetectionConfigDto registerAnomalyDetection) {
        this.registerAnomalyDetection = registerAnomalyDetection;
    }

    public Boolean getCompletePasswordAfterPassCodeLogin() {
        return completePasswordAfterPassCodeLogin;
    }
    public void setCompletePasswordAfterPassCodeLogin(Boolean completePasswordAfterPassCodeLogin) {
        this.completePasswordAfterPassCodeLogin = completePasswordAfterPassCodeLogin;
    }

    public LoginAnomalyDetectionConfigDto getLoginAnomalyDetection() {
        return loginAnomalyDetection;
    }
    public void setLoginAnomalyDetection(LoginAnomalyDetectionConfigDto loginAnomalyDetection) {
        this.loginAnomalyDetection = loginAnomalyDetection;
    }

    public Boolean getLoginRequireEmailVerified() {
        return loginRequireEmailVerified;
    }
    public void setLoginRequireEmailVerified(Boolean loginRequireEmailVerified) {
        this.loginRequireEmailVerified = loginRequireEmailVerified;
    }

    public SelfUnlockAccountConfigDto getSelfUnlockAccount() {
        return selfUnlockAccount;
    }
    public void setSelfUnlockAccount(SelfUnlockAccountConfigDto selfUnlockAccount) {
        this.selfUnlockAccount = selfUnlockAccount;
    }

    public Boolean getEnableLoginAccountSwitch() {
        return enableLoginAccountSwitch;
    }
    public void setEnableLoginAccountSwitch(Boolean enableLoginAccountSwitch) {
        this.enableLoginAccountSwitch = enableLoginAccountSwitch;
    }

    public QrcodeLoginStrategyDto getQrcodeLoginStrategy() {
        return qrcodeLoginStrategy;
    }
    public void setQrcodeLoginStrategy(QrcodeLoginStrategyDto qrcodeLoginStrategy) {
        this.qrcodeLoginStrategy = qrcodeLoginStrategy;
    }



}