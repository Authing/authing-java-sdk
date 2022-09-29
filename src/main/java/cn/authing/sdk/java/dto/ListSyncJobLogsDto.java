package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListSyncJobLogsDto {
    /**
     * 同步作业 ID
     */
    @JsonProperty("syncJobId")
    private Integer syncJobId;
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
     * 根据是否操作成功进行筛选
     */
    @JsonProperty("success")
    private Boolean success;
    /**
     * 根据操作类型进行筛选：
     * - `CreateUser`: 创建用户
     * - `UpdateUser`: 修改用户信息
     * - `DeleteUser`: 删除用户
     * - `UpdateUserIdentifier`: 修改用户唯一标志符
     * - `ChangeUserDepartment`: 修改用户部门
     * - `CreateDepartment`: 创建部门
     * - `UpdateDepartment`: 修改部门信息
     * - `DeleteDepartment`: 删除部门
     * - `MoveDepartment`: 移动部门
     * - `UpdateDepartmentLeader`: 同步部门负责人
     * - `CreateGroup`: 创建分组
     * - `UpdateGroup`: 修改分组
     * - `DeleteGroup`: 删除分组
     * - `Updateless`: 无更新
     *
     */
    @JsonProperty("action")
    private String action;
    /**
     * 操作对象类型:
     * - `department`: 部门
     * - `user`: 用户
     *
     */
    @JsonProperty("objectType")
    private String objectType;

    public Integer getSyncJobId() {
        return syncJobId;
    }
    public void setSyncJobId(Integer syncJobId) {
        this.syncJobId = syncJobId;
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

    public Boolean getSuccess() {
        return success;
    }
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getAction() {
        return action;
    }
    public void setAction(String action) {
        this.action = action;
    }

    public String getObjectType() {
        return objectType;
    }
    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }



}