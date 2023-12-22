package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetProfileDto {
    /**
     * 是否获取自定义数据
     */
    @JsonProperty("withCustomData")
    private Boolean withCustomData;
    /**
     * 是否获取 identities
     */
    @JsonProperty("withIdentities")
    private Boolean withIdentities;
    /**
     * 是否获取部门 ID 列表
     */
    @JsonProperty("withDepartmentIds")
    private Boolean withDepartmentIds;

    public Boolean getWithCustomData() {
        return withCustomData;
    }
    public void setWithCustomData(Boolean withCustomData) {
        this.withCustomData = withCustomData;
    }

    public Boolean getWithIdentities() {
        return withIdentities;
    }
    public void setWithIdentities(Boolean withIdentities) {
        this.withIdentities = withIdentities;
    }

    public Boolean getWithDepartmentIds() {
        return withDepartmentIds;
    }
    public void setWithDepartmentIds(Boolean withDepartmentIds) {
        this.withDepartmentIds = withDepartmentIds;
    }



}