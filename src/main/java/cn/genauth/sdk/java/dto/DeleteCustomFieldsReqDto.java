package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DeleteCustomFieldsReqDto {
    /**
     * 租户 ID
     */
    @JsonProperty("tenantId")
    private String tenantId;
    /**
     * 自定义字段列表
     */
    @JsonProperty("list")
    private List<DeleteCustomFieldDto> list;

    public String getTenantId() {
        return tenantId;
    }
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public List<DeleteCustomFieldDto> getList() {
        return list;
    }
    public void setList(List<DeleteCustomFieldDto> list) {
        this.list = list;
    }



}