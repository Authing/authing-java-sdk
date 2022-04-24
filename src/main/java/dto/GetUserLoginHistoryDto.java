package dto;

import java.util.List;

import dto.GetUserLoginHistoryOptionsDto;

public class GetUserLoginHistoryDto {
    /**
     * 用户 ID
     */
    private String userId;
    /**
     * 应用 ID
     */
    private String appId;
    /**
     * 客户端 IP
     */
    private String clientIp;
    /**
     * 开始时间戳（毫秒）
     */
    private Integer start;
    /**
     * 结束时间戳（毫秒）
     */
    private Integer end;
    /**
     * 可选参数
     */
    private GetUserLoginHistoryOptionsDto options;

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

    public GetUserLoginHistoryOptionsDto getOptions() {
        return options;
    }
    public void setOptions(GetUserLoginHistoryOptionsDto options) {
        this.options = options;
    }



};