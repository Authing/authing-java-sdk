package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ApplicationEnabledExtIdpConnInputDto {
    /**
     * 身份源连接 ID
     */
    @JsonProperty("extIdpConnId")
    private String extIdpConnId;

    public String getExtIdpConnId() {
        return extIdpConnId;
    }
    public void setExtIdpConnId(String extIdpConnId) {
        this.extIdpConnId = extIdpConnId;
    }



}