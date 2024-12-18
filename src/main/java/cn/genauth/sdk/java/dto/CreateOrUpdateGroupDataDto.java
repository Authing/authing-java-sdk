package cn.genauth.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

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