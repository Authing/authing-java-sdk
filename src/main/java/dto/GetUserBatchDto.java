package dto;

import java.util.List;

import dto.GetUserOptionsDto;

public class GetUserBatchDto {
    /**
     * 用户 ID 数组
     */
    private List<string> userIds;
    /**
     * 可选参数
     */
    private GetUserOptionsDto options;

    public List<string> getUserIds() {
        return userIds;
    }
    public void setUserIds(List<string> userIds) {
        this.userIds = userIds;
    }

    public GetUserOptionsDto getOptions() {
        return options;
    }
    public void setOptions(GetUserOptionsDto options) {
        this.options = options;
    }



};