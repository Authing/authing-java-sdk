package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CheckDomainAvailableDataDto {
    /**
     * 是否可用
     */
    @JsonProperty("available")
    private Boolean available;

    public Boolean getAvailable() {
        return available;
    }
    public void setAvailable(Boolean available) {
        this.available = available;
    }



}