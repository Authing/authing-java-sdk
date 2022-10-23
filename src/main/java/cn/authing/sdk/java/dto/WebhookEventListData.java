package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.WebhookCategoryDto;
import cn.authing.sdk.java.dto.WebhookEventDto;

public class WebhookEventListData {
    /**
     * 分类列表
     */
    @JsonProperty("categories")
    private List<WebhookCategoryDto> categories;
    /**
     * 事件列表
     */
    @JsonProperty("events")
    private List<WebhookEventDto> events;

    public List<WebhookCategoryDto> getCategories() {
        return categories;
    }
    public void setCategories(List<WebhookCategoryDto> categories) {
        this.categories = categories;
    }

    public List<WebhookEventDto> getEvents() {
        return events;
    }
    public void setEvents(List<WebhookEventDto> events) {
        this.events = events;
    }



}