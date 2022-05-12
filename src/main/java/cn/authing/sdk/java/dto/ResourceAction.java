package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ResourceAction {
    /**
     * 资源操作名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 资源操作描述
     */
    @JsonProperty("description")
    private String description;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }



}