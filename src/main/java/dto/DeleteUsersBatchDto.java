package dto;

import java.util.List;


public class DeleteUsersBatchDto {
    /**
     * 用户 ID 列表
     */
    private List<string> userIds;

    public List<string> getUserIds() {
        return userIds;
    }
    public void setUserIds(List<string> userIds) {
        this.userIds = userIds;
    }



}