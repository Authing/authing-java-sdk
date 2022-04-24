package dto;

import java.util.List;

import dto.GetUserOptionsDto;

public class GetUserDto {
    /**
     * 用户 ID
     */
    private String userId;
    /**
     * 可选参数
     */
    private GetUserOptionsDto options;

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public GetUserOptionsDto getOptions() {
        return options;
    }
    public void setOptions(GetUserOptionsDto options) {
        this.options = options;
    }



}