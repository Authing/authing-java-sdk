package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UserConnectionPostDto {
    /**
     * 用户 id
     */
    @JsonProperty("userId")
    private String userId;
    /**
     * 部门 id
     */
    @JsonProperty("postId")
    private String postId;

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPostId() {
        return postId;
    }
    public void setPostId(String postId) {
        this.postId = postId;
    }



}