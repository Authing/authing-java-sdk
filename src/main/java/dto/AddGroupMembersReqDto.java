package dto;


public class AddGroupMembersReqDto {
    /**
     * 用户 ID 数组
     */
    private Array<string> userIds
    /**
     * 分组 code
     */
    private String code

    public Array<string> getUserIds() {
        return userIds;
    }
    public void setUserIds(Array<string> userIds) {
        this.userIds = userIds;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

};