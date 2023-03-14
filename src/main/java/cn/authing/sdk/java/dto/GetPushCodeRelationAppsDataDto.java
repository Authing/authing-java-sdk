package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetPushCodeRelationAppsDataDto {
    /**
     * 发起推送登录的应用关联的客户端应用数据
     */
    @JsonProperty("appIds")
    private List<String> appIds;

    public List<String> getAppIds() {
        return appIds;
    }
    public void setAppIds(List<String> appIds) {
        this.appIds = appIds;
    }



}