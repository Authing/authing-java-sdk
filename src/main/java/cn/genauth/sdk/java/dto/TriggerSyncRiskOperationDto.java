package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TriggerSyncRiskOperationDto {
    /**
     * 同步任务风险操作 ID
     */
    @JsonProperty("syncRiskOperationIds")
    private List<Integer> syncRiskOperationIds;

    public List<Integer> getSyncRiskOperationIds() {
        return syncRiskOperationIds;
    }
    public void setSyncRiskOperationIds(List<Integer> syncRiskOperationIds) {
        this.syncRiskOperationIds = syncRiskOperationIds;
    }



}