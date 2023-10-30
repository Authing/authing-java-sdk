package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetPostOfPublicAccountDto {
    /**
     * 用户 id
     */
    @JsonProperty("userId")
    private String userId;

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }



}