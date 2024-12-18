package cn.genauth.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TriggerWebhookData {
    /**
     * 原来接口返回的 response 数据
     */
    @JsonProperty("response")
    private Any response;

    public Any getResponse() {
        return response;
    }
    public void setResponse(Any response) {
        this.response = response;
    }



}