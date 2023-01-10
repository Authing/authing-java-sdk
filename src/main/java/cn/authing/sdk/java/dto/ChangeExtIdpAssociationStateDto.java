package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ChangeExtIdpAssociationStateDto {
    /**
     * 是否关联身份源
     */
    @JsonProperty("association")
    private Boolean association;
    /**
     * 身份源连接 ID
     */
    @JsonProperty("id")
    private String id;
    /**
     * 租户 ID
     */
    @JsonProperty("tenantId")
    private String tenantId;

    public Boolean getAssociation() {
        return association;
    }
    public void setAssociation(Boolean association) {
        this.association = association;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getTenantId() {
        return tenantId;
    }
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }



}