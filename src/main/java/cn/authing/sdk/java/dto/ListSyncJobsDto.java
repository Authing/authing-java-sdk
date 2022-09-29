package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListSyncJobsDto {
    /**
     * 同步任务 ID
     */
    @JsonProperty("syncTaskId")
    private Integer syncTaskId;
    /**
     * 当前页数，从 1 开始
     */
    @JsonProperty("page")
    private Integer page;
    /**
     * 每页数目，最大不能超过 50，默认为 10
     */
    @JsonProperty("limit")
    private Integer limit;
    /**
     * 同步任务触发类型：
     * - `manually`: 手动触发执行
     * - `timed`: 定时触发
     * - `automatic`: 根据事件自动触发
     *
     */
    @JsonProperty("syncTrigger")
    private String syncTrigger;

    public Integer getSyncTaskId() {
        return syncTaskId;
    }
    public void setSyncTaskId(Integer syncTaskId) {
        this.syncTaskId = syncTaskId;
    }

    public Integer getPage() {
        return page;
    }
    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getSyncTrigger() {
        return syncTrigger;
    }
    public void setSyncTrigger(String syncTrigger) {
        this.syncTrigger = syncTrigger;
    }



}