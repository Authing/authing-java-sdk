package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.DataStatementPermissionDto;

public class CreateDataPolicyDto {
    /**
     * 数据权限列表，策略下数据资源权限列表
     */
    @JsonProperty("statementList")
    private List<DataStatementPermissionDto> statementList;
    /**
     * 数据策略名称，用户池唯一
     */
    @JsonProperty("policyName")
    private String policyName;
    /**
     * 数据策略描述
     */
    @JsonProperty("description")
    private String description;

    public List<DataStatementPermissionDto> getStatementList() {
        return statementList;
    }
    public void setStatementList(List<DataStatementPermissionDto> statementList) {
        this.statementList = statementList;
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