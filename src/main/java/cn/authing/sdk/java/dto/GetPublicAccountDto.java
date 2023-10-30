package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetPublicAccountDto {
    /**
     * 公共账号用户 ID
     */
    @JsonProperty("userId")
    private String userId;
    /**
     * 用户 ID 类型，默认值为 `user_id`，可选值为：
     * - `user_id`: Authing 用户 ID，如 `6319a1504f3xxxxf214dd5b7`
     * - `phone`: 用户手机号
     * - `email`: 用户邮箱
     * - `username`: 用户名
     * - `external_id`: 用户在外部系统的 ID，对应 Authing 用户信息的 `externalId` 字段
     *
     */
    @JsonProperty("userIdType")
    private String userIdType;
    /**
     * 是否获取自定义数据
     */
    @JsonProperty("withCustomData")
    private Boolean withCustomData;
    /**
     * 是否获取部门 ID 列表
     */
    @JsonProperty("withDepartmentIds")
    private Boolean withDepartmentIds;

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserIdType() {
        return userIdType;
    }
    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    public Boolean getWithCustomData() {
        return withCustomData;
    }
    public void setWithCustomData(Boolean withCustomData) {
        this.withCustomData = withCustomData;
    }

    public Boolean getWithDepartmentIds() {
        return withDepartmentIds;
    }
    public void setWithDepartmentIds(Boolean withDepartmentIds) {
        this.withDepartmentIds = withDepartmentIds;
    }



}