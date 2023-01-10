package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.UpdateLoginConfig;

public class UpdateLoginConfigDto {
    /**
     * 应用登录配置更新内容
     */
    @JsonProperty("update")
    private UpdateLoginConfig update;

    public UpdateLoginConfig getUpdate() {
        return update;
    }
    public void setUpdate(UpdateLoginConfig update) {
        this.update = update;
    }



}