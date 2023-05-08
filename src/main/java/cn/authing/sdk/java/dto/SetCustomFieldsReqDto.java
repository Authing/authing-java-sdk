package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.SetCustomFieldDto;

public class SetCustomFieldsReqDto {
    /**
     * 自定义字段列表
     */
    @JsonProperty("list")
    private List<SetCustomFieldDto> list;
    /**
     * 租户 ID
     */
    @JsonProperty("tenantId")
    private String tenantId;

    public List<SetCustomFieldDto> getList() {
        return list;
    }
    public void setList(List<SetCustomFieldDto> list) {
        this.list = list;
    }

    public String getTenantId() {
        return tenantId;
    }
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }



}