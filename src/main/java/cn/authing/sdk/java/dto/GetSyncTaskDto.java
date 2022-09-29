package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetSyncTaskDto {
    /**
     * 同步任务 ID
     */
    @JsonProperty("syncTaskId")
    private Integer syncTaskId;

    public Integer getSyncTaskId() {
        return syncTaskId;
    }
    public void setSyncTaskId(Integer syncTaskId) {
        this.syncTaskId = syncTaskId;
    }



}