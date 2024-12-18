package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TriggerSyncTaskDataDto {
    /**
     * 此次执行同步任务的同步作业 ID
     */
    @JsonProperty("syncJobId")
    private Integer syncJobId;

    public Integer getSyncJobId() {
        return syncJobId;
    }
    public void setSyncJobId(Integer syncJobId) {
        this.syncJobId = syncJobId;
    }



}