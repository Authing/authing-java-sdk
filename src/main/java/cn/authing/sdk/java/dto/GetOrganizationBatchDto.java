package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetOrganizationBatchDto {
    /**
     * 组织 Code（organizationCode）列表
     */
    @JsonProperty("organizationCodeList")
    private String organizationCodeList;
    /**
     * 是否获取自定义数据
     */
    @JsonProperty("withCustomData")
    private Boolean withCustomData;

    public String getOrganizationCodeList() {
        return organizationCodeList;
    }
    public void setOrganizationCodeList(String organizationCodeList) {
        this.organizationCodeList = organizationCodeList;
    }

    public Boolean getWithCustomData() {
        return withCustomData;
    }
    public void setWithCustomData(Boolean withCustomData) {
        this.withCustomData = withCustomData;
    }



}