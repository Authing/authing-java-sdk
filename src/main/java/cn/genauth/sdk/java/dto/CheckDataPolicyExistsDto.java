package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CheckDataPolicyExistsDto {
    /**
     * 数据策略名称，用户池唯一
     */
    @JsonProperty("policyName")
    private String policyName;

    public String getPolicyName() {
        return policyName;
    }
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }



}