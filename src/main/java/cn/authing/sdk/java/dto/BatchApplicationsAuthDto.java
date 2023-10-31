package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BatchApplicationsAuthDto {
    /**
     * 授权 ID
     */
    @JsonProperty("authIds")
    private String authIds;

    public String getAuthIds() {
        return authIds;
    }
    public void setAuthIds(String authIds) {
        this.authIds = authIds;
    }



}