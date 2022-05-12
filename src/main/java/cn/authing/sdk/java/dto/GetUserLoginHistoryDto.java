package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetUserLoginHistoryDto {
    /**
     * 用户 ID
     */
    @JsonProperty("user_id")
    private String userId;
    /**
     * 应用 ID
     */
    @JsonProperty("app_id")
    private String appId;
    /**
     * 客户端 IP
     */
    @JsonProperty("client_ip")
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