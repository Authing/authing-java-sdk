package dto;

import java.util.List;


public class DeleteUsersBatchDto {
    /**
     * 用户 ID 列表
     */
    private List<String> userIds;

    public List<String> getUserIds() {
        return userIds;
    }
    public void setUserIds(List<String> userIds) {
        this.userIds = userIds;
    }



}