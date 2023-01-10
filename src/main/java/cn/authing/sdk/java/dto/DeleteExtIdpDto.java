package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeleteExtIdpDto {
    /**
     * 身份源 ID
     */
    @JsonProperty("id")
    private String id;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }



}