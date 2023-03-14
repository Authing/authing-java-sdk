package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ImportTenantDto {
    /**
     * excel path 地址
     */
    @JsonProperty("excelUrl")
    private String excelUrl;

    public String getExcelUrl() {
        return excelUrl;
    }
    public void setExcelUrl(String excelUrl) {
        this.excelUrl = excelUrl;
    }



}