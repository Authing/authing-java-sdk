package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeleteDataPolicyDto {
    /**
     * 数据策略 ID
     */
    @JsonProperty("policyId")
    private String policyId;

    public String getPolicyId() {
        return policyId;
    }
    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }



}