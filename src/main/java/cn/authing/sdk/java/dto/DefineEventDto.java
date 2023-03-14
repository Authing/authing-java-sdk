package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DefineEventDto {
    /**
     * 事件描述
     */
    @JsonProperty("eventDescription")
    private String eventDescription;
    /**
     * 事件类型
     */
    @JsonProperty("eventType")
    private String eventType;

    public String getEventDescription() {
        return eventDescription;
    }
    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getEventType() {
        return eventType;
    }
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }



}