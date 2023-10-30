package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreatePublicAccountFromUserDto {
    /**
     * 公共账号 rowId
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