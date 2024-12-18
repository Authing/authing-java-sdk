package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetAccessKeyDto {
    /**
     * 用户 ID
     */
    @JsonProperty("userId")
    private String userId;
    /**
     * accessKeyId
     */
    @JsonProperty("accessKeyId")
    private String accessKeyId;

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccessKeyId() {
        return accessKeyId;
    }
    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }



}