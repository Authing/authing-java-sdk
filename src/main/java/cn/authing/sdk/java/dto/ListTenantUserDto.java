package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.ListTenantUsersOptionsDto;

public class ListTenantUserDto {
    /**
     * 租户 ID
     */
    @JsonProperty("tenantId")
    private String tenantId;
    /**
     * 搜索关键字
     */
    @JsonProperty("keywords")
    private String keywords;
    /**
     * 可选项
     */
    @JsonProperty("options")
    private ListTenantUsersOptionsDto options;

    public String getTenantId() {
        return tenantId;
    }
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getKeywords() {
        return keywords;
    }
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public ListTenantUsersOptionsDto getOptions() {
        return options;
    }
    public void setOptions(ListTenantUsersOptionsDto options) {
        this.options = options;
    }



}