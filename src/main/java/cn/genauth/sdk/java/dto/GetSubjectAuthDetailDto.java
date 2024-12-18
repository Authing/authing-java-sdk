package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetSubjectAuthDetailDto {
    /**
     * 主体 id
     */
    @JsonProperty("targetId")
    private String targetId;
    /**
     * 主体类型
     */
    @JsonProperty("targetType")
    private String targetType;
    /**
     * 应用 ID
     */
    @JsonProperty("appId")
    private String appId;

    public String getTargetId() {
        return targetId;
    }
    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public String getTargetType() {
        return targetType;
    }
    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }



}