package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdatePipelineFunctionDto {
    /**
     * Pipeline 函数 ID
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
     * 函数源代码。如果修改之后，函数会重新上传。
     */
    @JsonProperty("sourceCode")
    private String sourceCode;
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
     * 是否启用此 Pipeline
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

    public String getSourceCode() {
        return sourceCode;
    }
    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
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



}