package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ExtIdpDetail {
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
     * 租户 ID
     */
    @JsonProperty("tenantId")
    private String tenantId;
    /**
     * 身份源类型
     */
    @JsonProperty("type")
    private String type;
    /**
     * 身份源的连接列表
     */
    @JsonProperty("connections")
    private Object connections;
    /**
     * 租户场景下自动加入
     */
    @JsonProperty("autoJoin")
    private Boolean autoJoin;

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

    public Object getConnections() {
        return connections;
    }
    public void setConnections(Object connections) {
        this.connections = connections;
    }

    public Boolean getAutoJoin() {
        return autoJoin;
    }
    public void setAutoJoin(Boolean autoJoin) {
        this.autoJoin = autoJoin;
    }



}