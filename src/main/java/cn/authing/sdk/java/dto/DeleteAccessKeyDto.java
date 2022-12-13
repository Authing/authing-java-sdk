package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeleteAccessKeyDto {
    /**
     * accessKeyId
     */
    @JsonProperty("accessKeyId")
    private String accessKeyId;

    public String getAccessKeyId() {
        return accessKeyId;
    }
    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }



}