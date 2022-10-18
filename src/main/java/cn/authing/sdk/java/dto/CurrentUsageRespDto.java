package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.CurrentUsageDto;

public class CurrentUsageRespDto {
    /**
     * 当前用量实体
     */
    @JsonProperty("usages")
    private List<CurrentUsageDto> usages;

    public List<CurrentUsageDto> getUsages() {
        return usages;
    }
    public void setUsages(List<CurrentUsageDto> usages) {
        this.usages = usages;
    }



}