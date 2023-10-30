package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetPublicAccountsOfPostDto {
    /**
     * 岗位 ID
     */
    @JsonProperty("postId")
    private String postId;

    public String getPostId() {
        return postId;
    }
    public void setPostId(String postId) {
        this.postId = postId;
    }



}