package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class WebhookLogDto {
    /**
     * Webhook ID
     */
    @JsonProperty("webhookId")
    private String webhookId;
    /**
     * Webhook 事件名称
     */
    @JsonProperty("eventName")
    private String eventName;
    /**
     * Webhook 请求体
     */
    @JsonProperty("requestBody")
    private Object requestBody;
    /**
     * Webhook 请求头
     */
    @JsonProperty("requestHeaders")
    private Object requestHeaders;
    /**
     * Webhook 响应码
     */
    @JsonProperty("responseStatusCode")
    private Integer responseStatusCode;
    /**
     * Webhook 响应头
     */
    @JsonProperty("responseHeaders")
    private Object responseHeaders;
    /**
     * Webhook 响应体
     */
    @JsonProperty("responseBody")
    private Object responseBody;
    /**
     * 时间戳
     */
    @JsonProperty("timestamp")
    private String timestamp;
    /**
     * 是否请求成功
     */
    @JsonProperty("success")
    private Boolean success;
    /**
     * 请求失败时返回的错误信息
     */
    @JsonProperty("errorMessage")
    private String errorMessage;

    public String getWebhookId() {
        return webhookId;
    }
    public void setWebhookId(String webhookId) {
        this.webhookId = webhookId;
    }

    public String getEventName() {
        return eventName;
    }
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Object getRequestBody() {
        return requestBody;
    }
    public void setRequestBody(Object requestBody) {
        this.requestBody = requestBody;
    }

    public Object getRequestHeaders() {
        return requestHeaders;
    }
    public void setRequestHeaders(Object requestHeaders) {
        this.requestHeaders = requestHeaders;
    }

    public Integer getResponseStatusCode() {
        return responseStatusCode;
    }
    public void setResponseStatusCode(Integer responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
    }

    public Object getResponseHeaders() {
        return responseHeaders;
    }
    public void setResponseHeaders(Object responseHeaders) {
        this.responseHeaders = responseHeaders;
    }

    public Object getResponseBody() {
        return responseBody;
    }
    public void setResponseBody(Object responseBody) {
        this.responseBody = responseBody;
    }

    public String getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Boolean getSuccess() {
        return success;
    }
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }



}