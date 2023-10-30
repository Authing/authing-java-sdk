package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SetUserPostsDto {
    /**
     * 岗位 id 列表
     */
    @JsonProperty("postIds")
    private List<String> postIds;
    /**
     * 用户 id
     */
    @JsonProperty("userId")
    private String userId;

    public List<String> getPostIds() {
        return postIds;
    }
    public void setPostIds(List<String> postIds) {
        this.postIds = postIds;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }



}