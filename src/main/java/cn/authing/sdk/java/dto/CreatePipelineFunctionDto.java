package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreatePipelineFunctionDto {
    /**
     * 函数源代码
     */
    @JsonProperty("sourceCode")
    private String sourceCode;
    /**
     * 函数的触发场景：
     * - `PRE_REGISTER`: 注册前
     * - `POST_REGISTER`: 注册后
     * - `PRE_AUTHENTICATION`: 认证前
     * - `POST_AUTHENTICATION`: 认证后
     * - `PRE_OIDC_ID_TOKEN_ISSUED`: OIDC ID Token 签发前
     * - `PRE_OIDC_ACCESS_TOKEN_ISSUED`: OIDC Access Token 签发前
     * - `PRE_COMPLETE_USER_INFO`: 补全用户信息前
     *
     */
    @JsonProperty("scene")
    private Scene scene;
    /**
     * 函数名称
     */
    @JsonProperty("funcName")
    private String funcName;
    /**
     * 函数描述
     */
    @JsonProperty("funcDescription")
    private String funcDescription;
    /**
     * 是否异步执行。设置为异步执行的函数不会阻塞整个流程的执行，适用于异步通知的场景，比如飞书群通知、钉钉群通知等。
     */
    @JsonProperty("isAsynchronous")
    private Boolean isAsynchronous;
    /**
     * 函数运行超时时间，要求必须为整数，最短为 1 秒，最长为 60 秒，默认为 3 秒。
     */
    @JsonProperty("timeout")
    private Integer timeout;
    /**
     * 如果函数运行超时，是否终止整个流程，默认为否。
     */
    @JsonProperty("terminateOnTimeout")
    private Boolean terminateOnTimeout;
    /**
     * 是否启用此 Pipeline
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    public String getSourceCode() {
        return sourceCode;
    }
    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public Scene getScene() {
        return scene;
    }
    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public String getFuncName() {
        return funcName;
    }
    public void setFuncName(String funcName) {
        this.funcName = funcName;
    }

    public String getFuncDescription() {
        return funcDescription;
    }
    public void setFuncDescription(String funcDescription) {
        this.funcDescription = funcDescription;
    }

    public Boolean getIsAsynchronous() {
        return isAsynchronous;
    }
    public void setIsAsynchronous(Boolean isAsynchronous) {
        this.isAsynchronous = isAsynchronous;
    }

    public Integer getTimeout() {
        return timeout;
    }
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public Boolean getTerminateOnTimeout() {
        return terminateOnTimeout;
    }
    public void setTerminateOnTimeout(Boolean terminateOnTimeout) {
        this.terminateOnTimeout = terminateOnTimeout;
    }

    public Boolean getEnabled() {
        return enabled;
    }
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }


    /**
     * 函数的触发场景：
     * - `PRE_REGISTER`: 注册前
     * - `POST_REGISTER`: 注册后
     * - `PRE_AUTHENTICATION`: 认证前
     * - `POST_AUTHENTICATION`: 认证后
     * - `PRE_OIDC_ID_TOKEN_ISSUED`: OIDC ID Token 签发前
     * - `PRE_OIDC_ACCESS_TOKEN_ISSUED`: OIDC Access Token 签发前
     * - `PRE_COMPLETE_USER_INFO`: 补全用户信息前
     *
     */
    public static enum Scene {

        @JsonProperty("PRE_REGISTER")
        PRE_REGISTER("PRE_REGISTER"),

        @JsonProperty("POST_REGISTER")
        POST_REGISTER("POST_REGISTER"),

        @JsonProperty("PRE_AUTHENTICATION")
        PRE_AUTHENTICATION("PRE_AUTHENTICATION"),

        @JsonProperty("POST_AUTHENTICATION")
        POST_AUTHENTICATION("POST_AUTHENTICATION"),

        @JsonProperty("PRE_OIDC_ID_TOKEN_ISSUED")
        PRE_OIDC_ID_TOKEN_ISSUED("PRE_OIDC_ID_TOKEN_ISSUED"),

        @JsonProperty("PRE_OIDC_ACCESS_TOKEN_ISSUED")
        PRE_OIDC_ACCESS_TOKEN_ISSUED("PRE_OIDC_ACCESS_TOKEN_ISSUED"),

        @JsonProperty("PRE_COMPLETE_USER_INFO")
        PRE_COMPLETE_USER_INFO("PRE_COMPLETE_USER_INFO"),

        @JsonProperty("PRE_MFA_VERIFY")
        PRE_MFA_VERIFY("PRE_MFA_VERIFY"),

        @JsonProperty("POST_MFA_VERIFY")
        POST_MFA_VERIFY("POST_MFA_VERIFY"),
        ;

        private String value;

        Scene(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}