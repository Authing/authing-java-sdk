package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SyncTaskTimedScheduler {
    /**
     * 定时周期：
     * - `month`: 每个月执行一次
     * - `week`: 每周执行一次
     * - `days`: 每天执行一次
     * - `sixHours`: 每六小时执行一次
     * - `twoHours`: 每两小时执行一次
     *
     */
    @JsonProperty("cycle")
    private Cycle cycle;
    /**
     * 开始时间
     */
    @JsonProperty("startTime")
    private Integer startTime;

    public Cycle getCycle() {
        return cycle;
    }
    public void setCycle(Cycle cycle) {
        this.cycle = cycle;
    }

    public Integer getStartTime() {
        return startTime;
    }
    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }


    /**
     * 定时周期：
     * - `month`: 每个月执行一次
     * - `week`: 每周执行一次
     * - `days`: 每天执行一次
     * - `sixHours`: 每六小时执行一次
     * - `twoHours`: 每两小时执行一次
     *
     */
    public static enum Cycle {


        @JsonProperty("month")
        MONTH("month"),


        @JsonProperty("week")
        WEEK("week"),


        @JsonProperty("days")
        DAYS("days"),


        @JsonProperty("sixHours")
        SIX_HOURS("sixHours"),


        @JsonProperty("twoHours")
        TWO_HOURS("twoHours"),
        ;

        private String value;

        Cycle(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}