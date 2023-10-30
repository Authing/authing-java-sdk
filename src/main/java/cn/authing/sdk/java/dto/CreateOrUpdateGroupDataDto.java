package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.GroupDto;

public class CreateOrUpdateGroupDataDto {
    /**
     * 是否创建
     */
    @JsonProperty("created")
    private Boolean created;
    /**
     * 群组信息
     */
    @JsonProperty("data")
    private GroupDto data;

    public Boolean getCreated() {
        return created;
    }
    public void setCreated(Boolean created) {
        this.created = created;
    }

    public GroupDto getData() {
        return data;
    }
    public void setData(GroupDto data) {
        this.data = data;
    }



}