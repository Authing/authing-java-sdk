package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.SyncTaskLarkClientConfig;

public class SyncTaskClientConfig {
    /**
     * 飞书同步任务配置
     */
    @JsonProperty("larkConfig")
    private SyncTaskLarkClientConfig larkConfig;

    public SyncTaskLarkClientConfig getLarkConfig() {
        return larkConfig;
    }
    public void setLarkConfig(SyncTaskLarkClientConfig larkConfig) {
        this.larkConfig = larkConfig;
    }



}