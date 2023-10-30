package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetPublicAccountsOfGroupDto {
    /**
     * 分组 ID
     */
    @JsonProperty("groupId")
    private String groupId;

    public String getGroupId() {
        return groupId;
    }
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }



}