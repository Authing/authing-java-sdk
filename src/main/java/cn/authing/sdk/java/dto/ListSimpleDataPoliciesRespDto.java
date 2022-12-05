package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListSimpleDataPoliciesRespDto {
    /**
     * 数据策略 ID
     */
    @JsonProperty("policyId")
    private String policyId;
    /**
     * 数据策略名称权限空间内唯一
     */
    @JsonProperty("policyName")
    private String policyName;
    /**
     * 数据策略描述， 限长 200 字符
     */
    @JsonProperty("description")
    private String description;

    public String getPolicyId() {
        return policyId;
    }
    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public String getPolicyName() {
        return policyName;
    }
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }



}