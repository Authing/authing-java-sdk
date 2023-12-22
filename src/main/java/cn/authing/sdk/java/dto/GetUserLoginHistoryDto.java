package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetUserLoginHistoryDto {
    /**
     * 用户的唯一标志，可以是用户 ID、用户名、邮箱、手机号、externalId、在外部身份源的 ID，详情见 userIdType 字段的说明。默认为用户 id 。
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
     * - `identity`: 用户的外部身份源信息，格式为 `<extIdpId>:<userIdInIdp>`，其中 `<extIdpId>` 为 Authing 身份源的 ID，`<userIdInIdp>` 为用户在外部身份源的 ID。
     * 示例值：`62f20932716fbcc10d966ee5:ou_8bae746eac07cd2564654140d2a9ac61`。
     * - `sync_relation`: 用户的外部身份源信息，格式为 `<provier>:<userIdInIdp>`，其中 `<provier>` 为同步身份源类型，如 wechatwork, lark；`<userIdInIdp>` 为用户在外部身份源的 ID。
     * 示例值：`lark:ou_8bae746eac07cd2564654140d2a9ac61`。
     *
     */
    @JsonProperty("userIdType")
    private String userIdType;
    /**
     * 应用 ID
     */
    @JsonProperty("appId")
    private String appId;
    /**
     * 客户端 IP
     */
    @JsonProperty("clientIp")
    private String clientIp;
    /**
     * 开始时间戳（毫秒）
     */
    @JsonProperty("start")
    private Integer start;
    /**
     * 结束时间戳（毫秒）
     */
    @JsonProperty("end")
    private Integer end;
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

    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getClientIp() {
        return clientIp;
    }
    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public Integer getStart() {
        return start;
    }
    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getEnd() {
        return end;
    }
    public void setEnd(Integer end) {
        this.end = end;
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



}