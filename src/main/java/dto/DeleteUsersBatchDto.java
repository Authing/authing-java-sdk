package dto;


public class DeleteUsersBatchDto {
    /**
     * 用户 ID 列表
     */
    private Array<string> userIds

    public Array<string> getUserIds() {
        return userIds;
    }
    public void setUserIds(Array<string> userIds) {
        this.userIds = userIds;
    }

};