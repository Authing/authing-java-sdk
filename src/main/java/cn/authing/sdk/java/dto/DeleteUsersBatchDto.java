package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.DeleteUsersBatchOptionsDto;

public class DeleteUsersBatchDto {
    /**
     * 用户 ID 列表
     */
    @JsonProperty("userIds")
    private List<String> userIds;
    /**
     * 可选参数
     */
    @JsonProperty("options")
    private DeleteUsersBatchOptionsDto options;

    public List<String> getUserIds() {
        return userIds;
    }
    public void setUserIds(List<String> userIds) {
        this.userIds = userIds;
    }

    public DeleteUsersBatchOptionsDto getOptions() {
        return options;
    }
    public void setOptions(DeleteUsersBatchOptionsDto options) {
        this.options = options;
    }



}