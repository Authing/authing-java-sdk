package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class IsActionAllowedDataDto {
    /**
     * 是否允许
     */
    @JsonProperty("allowed")
    private Boolean allowed;

    public Boolean getAllowed() {
        return allowed;
    }
    public void setAllowed(Boolean allowed) {
        this.allowed = allowed;
    }



}