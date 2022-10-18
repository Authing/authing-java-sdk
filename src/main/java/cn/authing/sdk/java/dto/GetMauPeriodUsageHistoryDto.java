package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetMauPeriodUsageHistoryDto {
    /**
     * 起始时间（年月日）
     */
    @JsonProperty("startTime")
    private String startTime;
    /**
     * 截止时间（年月日）
     */
    @JsonProperty("endTime")
    private String endTime;

    public String getStartTime() {
        return startTime;
    }
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }



}