package cn.genauth.sdk.java.dto;

/**
 * @author songxueyan
 * @date 2023/2/23
 **/
public class EventDto {
    private String eventType ;
    private Object eventData ;

    public EventDto() {
    }

    public EventDto(String eventType, Object eventData) {
        this.eventType = eventType;
        this.eventData = eventData;
    }

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
