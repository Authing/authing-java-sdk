package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OpenEventDto {
    /**
     * 事件 ID
     */
    @JsonProperty("id")
    private String id;
    /**
     * 事件标志
     */
    @JsonProperty("code")
    private String code;
    /**
     * 事件 Topic
     */
    @JsonProperty("topic")
    private String topic;
    /**
     * 事件名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 事件描述
     */
    @JsonProperty("desc")
    private String desc;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getTopic() {
        return topic;
    }
    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }



}