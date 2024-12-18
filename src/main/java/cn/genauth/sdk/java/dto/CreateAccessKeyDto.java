package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateAccessKeyDto {
    /**
     * 密钥类型
     */
    @JsonProperty("type")
    private String type;
    /**
     * 密钥所属用户 ID
     */
    @JsonProperty("userId")
    private String userId;
    /**
     * 密钥所属租户 ID
     */
    @JsonProperty("tenantId")
    private String tenantId;

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTenantId() {
        return tenantId;
    }
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }



}