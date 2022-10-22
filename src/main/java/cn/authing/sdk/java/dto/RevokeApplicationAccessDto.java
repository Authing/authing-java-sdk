package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.DeleteApplicationPermissionRecordItem;

public class RevokeApplicationAccessDto {
    /**
     * 授权主体列表，最多 10 条
     */
    @JsonProperty("list")
    private List<DeleteApplicationPermissionRecordItem> list;
    /**
     * 应用 ID
     */
    @JsonProperty("appId")
    private String appId;

    public List<DeleteApplicationPermissionRecordItem> getList() {
        return list;
    }
    public void setList(List<DeleteApplicationPermissionRecordItem> list) {
        this.list = list;
    }

    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }



}