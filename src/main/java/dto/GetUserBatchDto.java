package dto;

import java.util.List;

import dto.GetUserOptionsDto;

public class GetUserBatchDto {
    /**
     * 用户 ID 数组
     */
    private List<String> userIds;
    /**
     * 可选参数
     */
    private GetUserOptionsDto options;

    public List<String> getUserIds() {
        return userIds;
    }
    public void setUserIds(List<String> userIds) {
        this.userIds = userIds;
    }

    public GetUserOptionsDto getOptions() {
        return options;
    }
    public void setOptions(GetUserOptionsDto options) {
        this.options = options;
    }



}