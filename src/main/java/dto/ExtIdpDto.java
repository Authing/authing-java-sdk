package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class ExtIdpDto {
    /**
     * 身份源 id
     */
    @JsonProperty("getId")
    private String id;
    /**
     * 身份源名称
     */
    @JsonProperty("getName")
    private String name;
    /**
     * 租户 ID
     */
    @JsonProperty("getTenantId")
    private String tenantId;
    /**
     * 身份源类型
     */
    @JsonProperty("getType")
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