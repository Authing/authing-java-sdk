package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListTenantExtIdpDto {
    /**
     * 租户 ID
     */
    @JsonProperty("tenantId")
    private String tenantId;
    /**
     * 应用 ID
     */
    @JsonProperty("appId")
    private String appId;
    /**
     * 身份源类型
     */
    @JsonProperty("type")
    private Object type;
    /**
     * 页码
     */
    @JsonProperty("page")
    private String page;
    /**
     * 每页获取的数据量
     */
    @JsonProperty("limit")
    private String limit;

    public String getTenantId() {
        return tenantId;
    }
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }

    public Object getType() {
        return type;
    }
    public void setType(Object type) {
        this.type = type;
    }

    public String getPage() {
        return page;
    }
    public void setPage(String page) {
        this.page = page;
    }

    public String getLimit() {
        return limit;
    }
    public void setLimit(String limit) {
        this.limit = limit;
    }



}