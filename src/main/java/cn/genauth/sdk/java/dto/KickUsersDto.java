package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class KickUsersDto {
    /**
     * APP ID 列表
     */
    @JsonProperty("appIds")
    private List<String> appIds;
    /**
     * 用户 ID
     */
    @JsonProperty("userId")
    private String userId;
    /**
     * 可选参数
     */
    @JsonProperty("options")
    private KickUsersOptionsDto options;

    public List<String> getAppIds() {
        return appIds;
    }
    public void setAppIds(List<String> appIds) {
        this.appIds = appIds;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public KickUsersOptionsDto getOptions() {
        return options;
    }
    public void setOptions(KickUsersOptionsDto options) {
        this.options = options;
    }



}