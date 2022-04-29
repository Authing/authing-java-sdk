package dto;

import java.util.List;

import dto.GetUserAuthorizedResourcesOptionsDto;

public class GetUserAuthorizedResourcesDto {
    /**
     * 用户 ID
     */
    private String userId;
    /**
     * 可选参数
     */
    private GetUserAuthorizedResourcesOptionsDto options;

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public GetUserAuthorizedResourcesOptionsDto getOptions() {
        return options;
    }
    public void setOptions(GetUserAuthorizedResourcesOptionsDto options) {
        this.options = options;
    }

}