package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SuspendTerminalUserDto {
    /**
     * 挂起到期时间，时间戳(毫秒)
     */
    @JsonProperty("endTime")
    private String endTime;
    /**
     * 用户 ID
     */
    @JsonProperty("userId")
    private String userId;
    /**
     * 数据行 id，创建设备时返回的 `id`
     */
    @JsonProperty("id")
    private String id;

    public String getEndTime() {
        return endTime;
    }
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }



}