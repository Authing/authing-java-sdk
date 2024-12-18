package cn.genauth.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

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