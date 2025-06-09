package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetLoginHistoryDto {
    /**
     * 应用 ID，可根据应用 ID 筛选。默认不传获取所有应用的登录历史。
     */
    @JsonProperty("appId")
    private String appId;
    /**
     * 客户端 IP，可根据登录时的客户端 IP 进行筛选。默认不传获取所有登录 IP 的登录历史。
     */
    @JsonProperty("clientIp")
    private String clientIp;
    /**
     * 是否登录成功，可根据是否登录成功进行筛选。默认不传获取的记录中既包含成功也包含失败的的登录历史。
     */
    @JsonProperty("success")
    private Boolean success;
    /**
     * 开始时间，为单位为毫秒的时间戳
     */
    @JsonProperty("start")
    private Long start;
    /**
     * 结束时间，为单位为毫秒的时间戳
     */
    @JsonProperty("end")
    private Long end;
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

    public Boolean getSuccess() {
        return success;
    }
    public void setSuccess(Boolean success) {
        this.success = success;
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