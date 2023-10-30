package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetUsersOfPublicAccountDto {
    /**
     * 公共账号 ID
     */
    @JsonProperty("publicAccountId")
    private String publicAccountId;

    public String getPublicAccountId() {
        return publicAccountId;
    }
    public void setPublicAccountId(String publicAccountId) {
        this.publicAccountId = publicAccountId;
    }



}