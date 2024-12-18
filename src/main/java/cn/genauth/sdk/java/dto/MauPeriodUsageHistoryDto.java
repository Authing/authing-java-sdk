package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MauPeriodUsageHistoryDto {
    /**
     * 周期开始时间(年月日)
     */
    @JsonProperty("periodStartTime")
    private String periodStartTime;
    /**
     * 周期结束时间(年月日)
     */
    @JsonProperty("periodEndTime")
    private String periodEndTime;
    /**
     * 当前周期使用的 mau 总数量
     */
    @JsonProperty("amount")
    private String amount;
    /**
     * 当前周期使用的 mau 数量
     */
    @JsonProperty("current")
    private String current;

    public String getPeriodStartTime() {
        return periodStartTime;
    }
    public void setPeriodStartTime(String periodStartTime) {
        this.periodStartTime = periodStartTime;
    }

    public String getPeriodEndTime() {
        return periodEndTime;
    }
    public void setPeriodEndTime(String periodEndTime) {
        this.periodEndTime = periodEndTime;
    }

    public String getAmount() {
        return amount;
    }
    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrent() {
        return current;
    }
    public void setCurrent(String current) {
        this.current = current;
    }



}