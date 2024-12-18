package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListWhitelistDto {
    /**
     * 白名单类型
     */
    @JsonProperty("type")
    private String type;

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }



}