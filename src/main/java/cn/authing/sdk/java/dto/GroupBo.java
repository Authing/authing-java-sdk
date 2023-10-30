package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GroupBo {
    /**
     * 用户组 id
     */
    @JsonProperty("groupId")
    private String groupId;
    /**
     * 用户组名称
     */
    @JsonProperty("groupName")
    private String groupName;
    /**
     * 用户组 Code
     */
    @JsonProperty("groupCode")
    private String groupCode;

    public String getGroupId() {
        return groupId;
    }
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupCode() {
        return groupCode;
    }
    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }



}