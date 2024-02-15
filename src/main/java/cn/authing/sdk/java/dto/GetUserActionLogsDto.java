package cn.authing.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetUserActionLogsDto {
    /**
     * 请求 ID
     */
    @JsonProperty("requestId")
    private String requestId;
    /**
     * 客户端 IP
     */
    @JsonProperty("clientIp")
    private String clientIp;
    /**
     * 事件类型，用户的一系列操作，比如 login、logout、register、verifyMfa 等
     */
    @JsonProperty("eventType")
    private String eventType;
    /**
     * 用户 ID
     */
    @JsonProperty("userId")
    private String userId;
    /**
     * 应用 ID
     */
    @JsonProperty("appId")
    private String appId;
    /**
     * 开始时间戳
     */
    @JsonProperty("start")
    private Long start;
    /**
     * 结束时间戳
     */
    @JsonProperty("end")
    private Long end;
    /**
     * 请求是否成功
     */
    @JsonProperty("success")
    private Boolean success;
    /**
     * 分页
     */
    @JsonProperty("pagination")
    private ListWebhooksDto pagination;

    public String getRequestId() {
        return requestId;
    }
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getClientIp() {
        return clientIp;
    }
    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public String getEventType() {
        return eventType;
    }
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }

    public Long getStart() {
        return start;
    }
    public void setStart(Long start) {
        this.start = start;
    }

    public Long getEnd() {
        return end;
    }
    public void setEnd(Long end) {
        this.end = end;
    }

    public Boolean getSuccess() {
        return success;
    }
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public ListWebhooksDto getPagination() {
        return pagination;
    }
    public void setPagination(ListWebhooksDto pagination) {
        this.pagination = pagination;
    }



}