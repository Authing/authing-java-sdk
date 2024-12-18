package cn.genauth.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

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