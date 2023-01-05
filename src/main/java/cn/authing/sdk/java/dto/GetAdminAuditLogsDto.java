package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.ListWebhooksDto;

public class GetAdminAuditLogsDto {
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
     * 操作类型，例如 create、update、delete、login 等
     */
    @JsonProperty("operationType")
    private String operationType;
    /**
     * 资源类型，例如 DATA、API、BUTTON 等
     */
    @JsonProperty("resourceType")
    private String resourceType;
    /**
     * 管理员用户 ID
     */
    @JsonProperty("userId")
    private String userId;
    /**
     * 请求是否成功
     */
    @JsonProperty("success")
    private Boolean success;
    /**
     * 开始时间戳
     */
    @JsonProperty("start")
    private Integer start;
    /**
     * 结束时间戳
     */
    @JsonProperty("end")
    private Integer end;
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

    public String getOperationType() {
        return operationType;
    }
    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getResourceType() {
        return resourceType;
    }
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Boolean getSuccess() {
        return success;
    }
    public void setSuccess(Boolean success) {
        this.success = success;
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

    public ListWebhooksDto getPagination() {
        return pagination;
    }
    public void setPagination(ListWebhooksDto pagination) {
        this.pagination = pagination;
    }



}