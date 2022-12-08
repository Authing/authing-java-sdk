package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.DataStatementPermissionDto;

public class UpdateDataPolicyDto {
    /**
     * 数据策略名称，用户池唯一
     */
    @JsonProperty("policyName")
    private String policyName;
    /**
     * 数据策略 ID
     */
    @JsonProperty("policyId")
    private String policyId;
    /**
     * 数据策略描述
     */
    @JsonProperty("description")
    private String description;
    /**
     * 数据权限列表，每个策略下所有的数据权限
     */
    @JsonProperty("statementList")
    private List<DataStatementPermissionDto> statementList;

    public String getPolicyName() {
        return policyName;
    }
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public String getPolicyId() {
        return policyId;
    }
    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public List<DataStatementPermissionDto> getStatementList() {
        return statementList;
    }
    public void setStatementList(List<DataStatementPermissionDto> statementList) {
        this.statementList = statementList;
    }



}