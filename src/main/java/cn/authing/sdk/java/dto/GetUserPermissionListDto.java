package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetUserPermissionListDto {
    /**
     * 用户 ID 列表
     */
    @JsonProperty("userIds")
    private List<String> userIds;
    /**
     * 权限空间 Code 列表
     */
    @JsonProperty("namespaceCodes")
    private List<String> namespaceCodes;

    public List<String> getUserIds() {
        return userIds;
    }
    public void setUserIds(List<String> userIds) {
        this.userIds = userIds;
    }

    public List<String> getNamespaceCodes() {
        return namespaceCodes;
    }
    public void setNamespaceCodes(List<String> namespaceCodes) {
        this.namespaceCodes = namespaceCodes;
    }



}