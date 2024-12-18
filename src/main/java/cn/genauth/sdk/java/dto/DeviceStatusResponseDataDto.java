package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeviceStatusResponseDataDto {
    /**
     * 设备状态:
     * - `activated`: 使用中
     * - `suspended`: 挂起
     * - `deactivated`: 停用
     *
     */
    @JsonProperty("status")
    private Status status;
    /**
     * 设备挂起时的剩余秒数
     */
    @JsonProperty("diffTime")
    private Integer diffTime;

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    public Integer getDiffTime() {
        return diffTime;
    }
    public void setDiffTime(Integer diffTime) {
        this.diffTime = diffTime;
    }


    /**
     * 设备状态:
     * - `activated`: 使用中
     * - `suspended`: 挂起
     * - `deactivated`: 停用
     *
     */
    public static enum Status {

        @JsonProperty("activated")
        ACTIVATED("activated"),

        @JsonProperty("suspended")
        SUSPENDED("suspended"),

        @JsonProperty("deactivated")
        DEACTIVATED("deactivated"),
        ;

        private String value;

        Status(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}