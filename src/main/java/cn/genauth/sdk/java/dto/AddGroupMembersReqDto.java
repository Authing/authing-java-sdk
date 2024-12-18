package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AddGroupMembersReqDto {
    /**
     * 用户 ID 数组
     */
    @JsonProperty("userIds")
    private List<String> userIds;
    /**
     * 分组 code
     */
    @JsonProperty("code")
    private String code;

    public List<String> getUserIds() {
        return userIds;
    }
    public void setUserIds(List<String> userIds) {
        this.userIds = userIds;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }



}