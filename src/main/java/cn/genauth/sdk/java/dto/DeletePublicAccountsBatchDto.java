package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DeletePublicAccountsBatchDto {
    /**
     * 公共账号用户 ID 列表
     */
    @JsonProperty("userIds")
    private List<String> userIds;
    /**
     * 可选参数
     */
    @JsonProperty("options")
    private DeletePublicAccountsBatchOptionsDto options;

    public List<String> getUserIds() {
        return userIds;
    }
    public void setUserIds(List<String> userIds) {
        this.userIds = userIds;
    }

    public DeletePublicAccountsBatchOptionsDto getOptions() {
        return options;
    }
    public void setOptions(DeletePublicAccountsBatchOptionsDto options) {
        this.options = options;
    }



}