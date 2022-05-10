package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class DeleteExtIdpConnDto {
    /**
     * 身份源连接 ID
     */
    @JsonProperty("getId")
    private String id;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }



}