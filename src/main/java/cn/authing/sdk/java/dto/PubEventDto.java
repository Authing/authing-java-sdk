package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PubEventDto {
    /**
     * 事件类型
     */
    @JsonProperty("eventType")
    private String eventType;
    /**
     * 事件体
     */
    @JsonProperty("eventData")
    private Object eventData;

    public String getEventType() {
        return eventType;
    }
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Object getEventData() {
        return eventData;
    }
    public void setEventData(Object eventData) {
        this.eventData = eventData;
    }



}