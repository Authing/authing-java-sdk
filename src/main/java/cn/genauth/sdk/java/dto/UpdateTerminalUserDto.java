package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateTerminalUserDto {
    /**
     * 数据行 id，创建设备时返回的 `id`
     */
    @JsonProperty("id")
    private String id;
    /**
     * 用户 ID
     */
    @JsonProperty("userId")
    private String userId;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }



}