package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeleteUsersBatchDto {
    /**
     * 用户 ID 列表
     */
    @JsonProperty("userIds")
    private List<String> userIds;

    public List<String> getUserIds() {
        return userIds;
    }
    public void setUserIds(List<String> userIds) {
        this.userIds = userIds;
    }



}