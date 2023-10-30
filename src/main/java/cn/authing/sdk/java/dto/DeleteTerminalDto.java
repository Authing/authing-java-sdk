package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeleteTerminalDto {
    /**
     * 数据行 id，创建设备时返回的 `id`
     */
    @JsonProperty("id")
    private String id;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }



}