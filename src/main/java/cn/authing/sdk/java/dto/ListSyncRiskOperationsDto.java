package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListSyncRiskOperationsDto {
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
     * 根据执行状态筛选
     */
    @JsonProperty("status")
    private String status;
    /**
     * 根据操作对象类型，默认获取所有类型的记录：
     * - `department`: 部门
     * - `user`: 用户
     *
     */
    @JsonProperty("objectType")
    private String objectType;

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

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getObjectType() {
        return objectType;
    }
    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }



}