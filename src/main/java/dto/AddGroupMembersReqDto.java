package dto;

import java.util.List;


public class AddGroupMembersReqDto {
    /**
     * 用户 ID 数组
     */
    private List<String> userIds;
    /**
     * 分组 code
     */
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