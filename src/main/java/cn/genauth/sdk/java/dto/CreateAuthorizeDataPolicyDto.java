package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateAuthorizeDataPolicyDto {
    /**
     * 数据权限列表，每个策略下所有的数据权限
     */
    @JsonProperty("targetList")
    private List<SubjectDto> targetList;
    /**
     * 数据策略 id 列表
     */
    @JsonProperty("policyIds")
    private List<String> policyIds;

    public List<SubjectDto> getTargetList() {
        return targetList;
    }
    public void setTargetList(List<SubjectDto> targetList) {
        this.targetList = targetList;
    }

    public List<String> getPolicyIds() {
        return policyIds;
    }
    public void setPolicyIds(List<String> policyIds) {
        this.policyIds = policyIds;
    }



}