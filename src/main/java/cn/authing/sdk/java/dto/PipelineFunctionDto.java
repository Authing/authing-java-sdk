package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PipelineFunctionDto {
    /**
     * 函数 ID
     */
    @JsonProperty("funcId")
    private String funcId;
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
     * 函数创建时间
     */
    @JsonProperty("createdAt")
    private String createdAt;
    /**
     * 函数修改时间
     */
    @JsonProperty("updatedAt")
    private String updatedAt;
    /**
     * 是否异步执行。设置为异步执行的函数不会阻塞整个流程的执行，适用于异步通知的场景，比如飞书群通知、钉钉群通知等。
     */
    @JsonProperty("isAsynchronous")
    private Boolean isAsynchronous;
    /**
     * 函数运行超时时间，最短为 1 秒，最长为 60 秒，默认为 3 秒。
     */
    @JsonProperty("timeout")
    private Integer timeout;
    /**
     * 如果函数运行超时，是否终止整个流程，默认为否。
     */
    @JsonProperty("terminateOnTimeout")
    private Boolean terminateOnTimeout;
    /**
     * 函数源代码
     */
    @JsonProperty("sourceCode")
    private String sourceCode;
    /**
     * 函数当前状态：
     * - `uploading`: 上传中
     * - `success`: 上传成功
     * - `failed`: 上传失败
     *
     */
    @JsonProperty("status")
    private Status status;
    /**
     * 上传失败的错误提示
     */
    @JsonProperty("uploadErrMsg")
    private String uploadErrMsg;
    /**
     * 此 Pipeline 是否被启用
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    public String getFuncId() {
        return funcId;
    }
    public void setFuncId(String funcId) {
        this.funcId = funcId;
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

    public Scene getScene() {
        return scene;
    }
    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
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

    public String getSourceCode() {
        return sourceCode;
    }
    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    public String getUploadErrMsg() {
        return uploadErrMsg;
    }
    public void setUploadErrMsg(String uploadErrMsg) {
        this.uploadErrMsg = uploadErrMsg;
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
        ;

        private String value;

        Scene(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * 函数当前状态：
     * - `uploading`: 上传中
     * - `success`: 上传成功
     * - `failed`: 上传失败
     *
     */
    public static enum Status {

        @JsonProperty("uploading")
        UPLOADING("uploading"),

        @JsonProperty("success")
        SUCCESS("success"),

        @JsonProperty("failed")
        FAILED("failed"),
        ;

        private String value;

        Status(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}