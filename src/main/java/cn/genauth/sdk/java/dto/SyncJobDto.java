package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SyncJobDto {
    /**
     * 同步作业 ID
     */
    @JsonProperty("syncJobId")
    private Integer syncJobId;
    /**
     * 此同步作业对应的同步任务 ID
     */
    @JsonProperty("syncTaskId")
    private Integer syncTaskId;
    /**
     * 创建时间
     */
    @JsonProperty("createdAt")
    private String createdAt;
    /**
     * 更新时间
     */
    @JsonProperty("updatedAt")
    private String updatedAt;
    /**
     * 当前同步状态:
     * - `free`: 空闲状态，从未执行
     * - `pending`: 等待系统执行
     * - `onProgress`: 正在执行
     * - `success`: 成功
     * - `failed`: 失败
     *
     */
    @JsonProperty("syncStatus")
    private SyncStatus syncStatus;
    /**
     * 同步任务数据流向：
     * - `upstream`: 作为上游，将数据同步到 Authing
     * - `downstream`: 作为下游，将 Authing 数据同步到此系统
     *
     */
    @JsonProperty("syncFlow")
    private SyncFlow syncFlow;
    /**
     * 同步任务触发类型：
     * - `manually`: 手动触发执行
     * - `timed`: 定时触发
     * - `automatic`: 根据事件自动触发
     *
     */
    @JsonProperty("syncTrigger")
    private SyncTrigger syncTrigger;
    /**
     * 需要同步的部门个数
     */
    @JsonProperty("departmentCountAll")
    private Integer departmentCountAll;
    /**
     * 成功同步的部门个数
     */
    @JsonProperty("departmentCountSucc")
    private Integer departmentCountSucc;
    /**
     * 需要更新的部门个数
     */
    @JsonProperty("departmentUpdateCountAll")
    private Integer departmentUpdateCountAll;
    /**
     * 成功更新的部门个数
     */
    @JsonProperty("departmentUpdateCountSucc")
    private Integer departmentUpdateCountSucc;
    /**
     * 需要同步的用户个数
     */
    @JsonProperty("accountCountAll")
    private Integer accountCountAll;
    /**
     * 成功同步的用户个数
     */
    @JsonProperty("accountCountSucc")
    private Integer accountCountSucc;
    /**
     * 需要更新的用户个数
     */
    @JsonProperty("accountUpdateCountAll")
    private Integer accountUpdateCountAll;
    /**
     * 成功更新的用户个数
     */
    @JsonProperty("accountUpdateCountSucc")
    private Integer accountUpdateCountSucc;
    /**
     * 错误信息
     */
    @JsonProperty("errMsg")
    private String errMsg;

    public Integer getSyncJobId() {
        return syncJobId;
    }
    public void setSyncJobId(Integer syncJobId) {
        this.syncJobId = syncJobId;
    }

    public Integer getSyncTaskId() {
        return syncTaskId;
    }
    public void setSyncTaskId(Integer syncTaskId) {
        this.syncTaskId = syncTaskId;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public SyncStatus getSyncStatus() {
        return syncStatus;
    }
    public void setSyncStatus(SyncStatus syncStatus) {
        this.syncStatus = syncStatus;
    }

    public SyncFlow getSyncFlow() {
        return syncFlow;
    }
    public void setSyncFlow(SyncFlow syncFlow) {
        this.syncFlow = syncFlow;
    }

    public SyncTrigger getSyncTrigger() {
        return syncTrigger;
    }
    public void setSyncTrigger(SyncTrigger syncTrigger) {
        this.syncTrigger = syncTrigger;
    }

    public Integer getDepartmentCountAll() {
        return departmentCountAll;
    }
    public void setDepartmentCountAll(Integer departmentCountAll) {
        this.departmentCountAll = departmentCountAll;
    }

    public Integer getDepartmentCountSucc() {
        return departmentCountSucc;
    }
    public void setDepartmentCountSucc(Integer departmentCountSucc) {
        this.departmentCountSucc = departmentCountSucc;
    }

    public Integer getDepartmentUpdateCountAll() {
        return departmentUpdateCountAll;
    }
    public void setDepartmentUpdateCountAll(Integer departmentUpdateCountAll) {
        this.departmentUpdateCountAll = departmentUpdateCountAll;
    }

    public Integer getDepartmentUpdateCountSucc() {
        return departmentUpdateCountSucc;
    }
    public void setDepartmentUpdateCountSucc(Integer departmentUpdateCountSucc) {
        this.departmentUpdateCountSucc = departmentUpdateCountSucc;
    }

    public Integer getAccountCountAll() {
        return accountCountAll;
    }
    public void setAccountCountAll(Integer accountCountAll) {
        this.accountCountAll = accountCountAll;
    }

    public Integer getAccountCountSucc() {
        return accountCountSucc;
    }
    public void setAccountCountSucc(Integer accountCountSucc) {
        this.accountCountSucc = accountCountSucc;
    }

    public Integer getAccountUpdateCountAll() {
        return accountUpdateCountAll;
    }
    public void setAccountUpdateCountAll(Integer accountUpdateCountAll) {
        this.accountUpdateCountAll = accountUpdateCountAll;
    }

    public Integer getAccountUpdateCountSucc() {
        return accountUpdateCountSucc;
    }
    public void setAccountUpdateCountSucc(Integer accountUpdateCountSucc) {
        this.accountUpdateCountSucc = accountUpdateCountSucc;
    }

    public String getErrMsg() {
        return errMsg;
    }
    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }


    /**
     * 当前同步状态:
     * - `free`: 空闲状态，从未执行
     * - `pending`: 等待系统执行
     * - `onProgress`: 正在执行
     * - `success`: 成功
     * - `failed`: 失败
     *
     */
    public static enum SyncStatus {

        @JsonProperty("free")
        FREE("free"),

        @JsonProperty("pending")
        PENDING("pending"),

        @JsonProperty("onProgress")
        ON_PROGRESS("onProgress"),

        @JsonProperty("success")
        SUCCESS("success"),

        @JsonProperty("failed")
        FAILED("failed"),
        ;

        private String value;

        SyncStatus(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * 同步任务数据流向：
     * - `upstream`: 作为上游，将数据同步到 Authing
     * - `downstream`: 作为下游，将 Authing 数据同步到此系统
     *
     */
    public static enum SyncFlow {

        @JsonProperty("upstream")
        UPSTREAM("upstream"),

        @JsonProperty("downstream")
        DOWNSTREAM("downstream"),
        ;

        private String value;

        SyncFlow(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * 同步任务触发类型：
     * - `manually`: 手动触发执行
     * - `timed`: 定时触发
     * - `automatic`: 根据事件自动触发
     *
     */
    public static enum SyncTrigger {

        @JsonProperty("manually")
        MANUALLY("manually"),

        @JsonProperty("timed")
        TIMED("timed"),

        @JsonProperty("automatic")
        AUTOMATIC("automatic"),
        ;

        private String value;

        SyncTrigger(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}