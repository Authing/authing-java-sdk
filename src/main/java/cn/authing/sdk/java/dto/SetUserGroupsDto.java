package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SetUserGroupsDto {
    /**
     * 群组 ID 列表
     */
    @JsonProperty("groupIds")
    private List<String> groupIds;
    /**
     * 用户唯一标志，可以是用户 ID、用户名、邮箱、手机号、外部 ID、在外部身份源的 ID。
     */
    @JsonProperty("userId")
    private String userId;

    public List<String> getGroupIds() {
        return groupIds;
    }
    public void setGroupIds(List<String> groupIds) {
        this.groupIds = groupIds;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }



}