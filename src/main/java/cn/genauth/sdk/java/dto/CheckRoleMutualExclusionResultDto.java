package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CheckRoleMutualExclusionResultDto {
    /**
     * 角色列表中是否存在互斥关系
     */
    @JsonProperty("existMutuallyExclusive")
    private Boolean existMutuallyExclusive;

    public Boolean getExistMutuallyExclusive() {
        return existMutuallyExclusive;
    }
    public void setExistMutuallyExclusive(Boolean existMutuallyExclusive) {
        this.existMutuallyExclusive = existMutuallyExclusive;
    }



}