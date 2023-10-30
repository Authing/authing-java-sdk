package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetAllGroupsDto {
    /**
     * 是否获取成员列表
     */
    @JsonProperty("fetchMembers")
    private Boolean fetchMembers;
    /**
     * 是否获取自定义数据
     */
    @JsonProperty("withCustomData")
    private Boolean withCustomData;

    public Boolean getFetchMembers() {
        return fetchMembers;
    }
    public void setFetchMembers(Boolean fetchMembers) {
        this.fetchMembers = fetchMembers;
    }

    public Boolean getWithCustomData() {
        return withCustomData;
    }
    public void setWithCustomData(Boolean withCustomData) {
        this.withCustomData = withCustomData;
    }



}