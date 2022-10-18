package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SyncRiskOperationDto {
    /**
     * 同步任务风险操作 ID
     */
    @JsonProperty("syncRiskOperationId")
    private Integer syncRiskOperationId;
    /**
     * 同步任务 ID
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
     * 执行状态:
     * - `PENDING`: 待执行
     * - `SUCCESS`: 成功
     * - `FAILED`: 失败
     * - `CANCELED`: 已取消
     * - `EXECUTING`: 执行中
     *
     */
    @JsonProperty("status")
    private Status status;
    /**
     * 优先级，数字越小表示优先级越高。
     */
    @JsonProperty("level")
    private Integer level;
    /**
     * 操作对象类型:
     * - `department`: 部门
     * - `user`: 用户
     *
     */
    @JsonProperty("objectType")
    private ObjectType objectType;
    /**
     * 操作对象（用户、分组、部门）名称
     */
    @JsonProperty("objectName")
    private String objectName;
    /**
     * 操作对象 ID
     */
    @JsonProperty("objectId")
    private String objectId;
    /**
     * 执行失败的错误信息
     */
    @JsonProperty("errMsg")
    private String errMsg;

    public Integer getSyncRiskOperationId() {
        return syncRiskOperationId;
    }
    public void setSyncRiskOperationId(Integer syncRiskOperationId) {
        this.syncRiskOperationId = syncRiskOperationId;
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

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    public Integer getLevel() {
        return level;
    }
    public void setLevel(Integer level) {
        this.level = level;
    }

    public ObjectType getObjectType() {
        return objectType;
    }
    public void setObjectType(ObjectType objectType) {
        this.objectType = objectType;
    }

    public String getObjectName() {
        return objectName;
    }
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getObjectId() {
        return objectId;
    }
    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getErrMsg() {
        return errMsg;
    }
    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }


    /**
     * 执行状态:
     * - `PENDING`: 待执行
     * - `SUCCESS`: 成功
     * - `FAILED`: 失败
     * - `CANCELED`: 已取消
     * - `EXECUTING`: 执行中
     *
     */
    public static enum Status {


        @JsonProperty("PENDING")
        PENDING("PENDING"),


        @JsonProperty("SUCCESS")
        SUCCESS("SUCCESS"),


        @JsonProperty("FAILED")
        FAILED("FAILED"),


        @JsonProperty("CANCELED")
        CANCELED("CANCELED"),


        @JsonProperty("EXECUTING")
        EXECUTING("EXECUTING"),
        ;

        private String value;

        Status(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * 操作对象类型:
     * - `department`: 部门
     * - `user`: 用户
     *
     */
    public static enum ObjectType {


        @JsonProperty("DEPARTMENT")
        DEPARTMENT("DEPARTMENT"),


        @JsonProperty("USER")
        USER("USER"),
        ;

        private String value;

        ObjectType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}