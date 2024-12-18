package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeleteWebhookDto {
    /**
     * webhookId 数组
     */
    @JsonProperty("webhookIds")
    private List<String> webhookIds;

    public List<String> getWebhookIds() {
        return webhookIds;
    }
    public void setWebhookIds(List<String> webhookIds) {
        this.webhookIds = webhookIds;
    }



}