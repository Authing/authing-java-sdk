package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class UpdateExtIdpDto {
    /**
     * 身份源 ID
     */
    @JsonProperty("getId")
    private String id;
    /**
     * 名称
     */
    @JsonProperty("getName")
    private String name;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }



}