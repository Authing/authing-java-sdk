package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.ListApplicationActiveUsersOptionsDto;

public class ListApplicationActiveUsersDto {
    /**
     * 应用 ID
     */
    @JsonProperty("appId")
    private String appId;
    /**
     * 可选项
     */
    @JsonProperty("options")
    private ListApplicationActiveUsersOptionsDto options;

    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }

    public ListApplicationActiveUsersOptionsDto getOptions() {
        return options;
    }
    public void setOptions(ListApplicationActiveUsersOptionsDto options) {
        this.options = options;
    }



}