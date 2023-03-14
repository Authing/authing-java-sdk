package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TenantCooperatorSingleDto {
    /**
     * 菜单
     */
    @JsonProperty("list")
    private List<String> list;
    /**
     * 策略
     */
    @JsonProperty("authorizedPoliciesCode")
    private List<String> authorizedPoliciesCode;

    public List<String> getList() {
        return list;
    }
    public void setList(List<String> list) {
        this.list = list;
    }

    public List<String> getAuthorizedPoliciesCode() {
        return authorizedPoliciesCode;
    }
    public void setAuthorizedPoliciesCode(List<String> authorizedPoliciesCode) {
        this.authorizedPoliciesCode = authorizedPoliciesCode;
    }



}