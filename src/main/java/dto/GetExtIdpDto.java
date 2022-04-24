package dto;

import java.util.List;


public class GetExtIdpDto {
    /**
     * 身份源 id
     */
    private String id;
    /**
     * 租户 ID
     */
    private String tenantId;

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



};