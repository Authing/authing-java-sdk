package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class RemoveGroupMembersReqDto {
    /**
     * 用户 ID 数组
     */
    @JsonProperty("getUserIds")
    private List<String> userIds;
    /**
     * 分组 code
     */
    @JsonProperty("getCode")
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