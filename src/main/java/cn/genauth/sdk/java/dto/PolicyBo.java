package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PolicyBo {
    /**
     * 数据策略 id
     */
    @JsonProperty("dataPolicyId")
    private String dataPolicyId;
    /**
     * 数据策略名称名称
     */
    @JsonProperty("dataPolicyName")
    private String dataPolicyName;

    public String getDataPolicyId() {
        return dataPolicyId;
    }
    public void setDataPolicyId(String dataPolicyId) {
        this.dataPolicyId = dataPolicyId;
    }

    public String getDataPolicyName() {
        return dataPolicyName;
    }
    public void setDataPolicyName(String dataPolicyName) {
        this.dataPolicyName = dataPolicyName;
    }



}