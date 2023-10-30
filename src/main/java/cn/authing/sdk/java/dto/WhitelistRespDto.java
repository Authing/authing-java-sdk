package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class WhitelistRespDto {
    /**
     * 数据
     */
    @JsonProperty("value")
    private String value;
    /**
     * 创建时间
     */
    @JsonProperty("createdAt")
    private String createdAt;

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }



}