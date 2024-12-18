package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetFastpassClientAppsDto {
    @JsonProperty("qrcodeId")
    private String qrcodeId;
    @JsonProperty("appId")
    private String appId;

    public String getQrcodeId() {
        return qrcodeId;
    }
    public void setQrcodeId(String qrcodeId) {
        this.qrcodeId = qrcodeId;
    }

    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }



}