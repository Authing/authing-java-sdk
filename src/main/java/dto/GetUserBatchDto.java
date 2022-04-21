package dto;

import dto.GetUserOptionsDto;

public class GetUserBatchDto {
    /**
     * 用户 ID 数组
     */
    private Array<string> userIds
    /**
     * 可选参数
     */
    private GetUserOptionsDto options

    public Array<string> getUserIds() {
        return userIds;
    }
    public void setUserIds(Array<string> userIds) {
        this.userIds = userIds;
    }

    public GetUserOptionsDto getOptions() {
        return options;
    }
    public void setOptions(GetUserOptionsDto options) {
        this.options = options;
    }

};