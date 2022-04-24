package dto;

import java.util.List;


public class RemoveGroupMembersReqDto {
    /**
     * 用户 ID 数组
     */
    private List<string> userIds;
    /**
     * 分组 code
     */
    private String code;

    public List<string> getUserIds() {
        return userIds;
    }
    public void setUserIds(List<string> userIds) {
        this.userIds = userIds;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }



};