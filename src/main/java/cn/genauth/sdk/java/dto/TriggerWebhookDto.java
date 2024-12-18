package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TriggerWebhookDto {
    /**
     * Webhook ID
     */
    @JsonProperty("webhookId")
    private String webhookId;
    /**
     * 请求头
     */
    @JsonProperty("requestHeaders")
    private Object requestHeaders;
    /**
     * 请求体
     */
    @JsonProperty("requestBody")
    private Object requestBody;

    public String getWebhookId() {
        return webhookId;
    }
    public void setWebhookId(String webhookId) {
        this.webhookId = webhookId;
    }

    public Object getRequestHeaders() {
        return requestHeaders;
    }
    public void setRequestHeaders(Object requestHeaders) {
        this.requestHeaders = requestHeaders;
    }

    public Object getRequestBody() {
        return requestBody;
    }
    public void setRequestBody(Object requestBody) {
        this.requestBody = requestBody;
    }



}