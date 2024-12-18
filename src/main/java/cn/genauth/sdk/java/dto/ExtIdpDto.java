package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ExtIdpDto {
    /**
     * 身份源 id
     */
    @JsonProperty("id")
    private String id;
    /**
     * 身份源名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 身份源的 Logo
     */
    @JsonProperty("logo")
    private String logo;
    /**
     * 租户 ID
     */
    @JsonProperty("tenantId")
    private String tenantId;
    /**
     * 身份源类型
     */
    @JsonProperty("type")
    private String type;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getTenantId() {
        return tenantId;
    }
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }



}