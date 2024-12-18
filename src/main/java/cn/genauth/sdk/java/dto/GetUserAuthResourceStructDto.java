package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetUserAuthResourceStructDto {
    /**
     * 数据资源 Code
     */
    @JsonProperty("resource")
    private String resource;

    public String getResource() {
        return resource;
    }
    public void setResource(String resource) {
        this.resource = resource;
    }



}