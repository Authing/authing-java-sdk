package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

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