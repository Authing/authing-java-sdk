package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListAccessKeyDto {
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
    /**
     * 密钥类型
     */
    @JsonProperty("type")
    private String type;
    /**
     * AccessKey 状态，activated：已激活，staging：分级（可轮换），revoked：已撤销
     */
    @JsonProperty("status")
    private String status;

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

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }



}