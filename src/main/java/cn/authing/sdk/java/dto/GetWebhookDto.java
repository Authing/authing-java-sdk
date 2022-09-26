package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetWebhookDto {
    /**
     * Webhook ID
     */
    @JsonProperty("webhookId")
    private String webhookId;

    public String getWebhookId() {
        return webhookId;
    }
    public void setWebhookId(String webhookId) {
        this.webhookId = webhookId;
    }



}