package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RestFactorDto {
    /**
     * MFA 认证要素 ID
     */
    @JsonProperty("factorId")
    private String factorId;

    public String getFactorId() {
        return factorId;
    }
    public void setFactorId(String factorId) {
        this.factorId = factorId;
    }



}