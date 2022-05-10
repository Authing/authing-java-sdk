package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class ResourceAction {
    /**
     * 资源操作名称
     */
    @JsonProperty("getName")
    private String name;
    /**
     * 资源操作描述
     */
    @JsonProperty("getDescription")
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