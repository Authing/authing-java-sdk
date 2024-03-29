package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.MauPeriodUsageHistoryDto;

public class MauPeriodUsageHistory {
    /**
     * 响应数据
     */
    @JsonProperty("records")
    private List<MauPeriodUsageHistoryDto> records;

    public List<MauPeriodUsageHistoryDto> getRecords() {
        return records;
    }
    public void setRecords(List<MauPeriodUsageHistoryDto> records) {
        this.records = records;
    }



}