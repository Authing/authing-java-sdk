package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.ApplicationPermissionRecordItem;

public class AuthorizeApplicationAccessDto {
    /**
     * 应用 ID
     */
    @JsonProperty("appId")
    private String appId;
    /**
     * 授权主体列表，最多 10 条
     */
    @JsonProperty("list")
    private List<ApplicationPermissionRecordItem> list;

    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }

    public List<ApplicationPermissionRecordItem> getList() {
        return list;
    }
    public void setList(List<ApplicationPermissionRecordItem> list) {
        this.list = list;
    }



}