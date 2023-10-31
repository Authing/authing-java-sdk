package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;



public class UploadDataDto {
    /**
     * key
     */
    @JsonProperty("key")
    private String key;
    /**
     * url
     */
    @JsonProperty("url")
    private String url;

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }



}