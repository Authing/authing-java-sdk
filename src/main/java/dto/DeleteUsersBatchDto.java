package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class DeleteUsersBatchDto {
    /**
     * 用户 ID 列表
     */
    @JsonProperty("getUserIds")
    private List<String> userIds;

    public List<String> getUserIds() {
        return userIds;
    }
    public void setUserIds(List<String> userIds) {
        this.userIds = userIds;
    }



}