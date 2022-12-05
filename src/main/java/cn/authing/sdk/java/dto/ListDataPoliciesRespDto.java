package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.DataResourceSimpleRespDto;
import cn.authing.sdk.java.dto.SubjectRespDto;

public class ListDataPoliciesRespDto {
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
    /**
     * 数据权限列表，每个策略下所有的数据资源 ID 和名称
     */
    @JsonProperty("resourceList")
    private List<DataResourceSimpleRespDto> resourceList;
    /**
     * 数据策略 ID
     */
    @JsonProperty("policyId")
    private String policyId;
    /**
     * 主体对象列表,包含数据策略下所有的主体对象,包括 USER、GROUP、ROLE、ORG
     */
    @JsonProperty("targetList")
    private List<SubjectRespDto> targetList;
    /**
     * 数据策略更新时间
     */
    @JsonProperty("updatedAt")
    private String updatedAt;

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

    public List<DataResourceSimpleRespDto> getResourceList() {
        return resourceList;
    }
    public void setResourceList(List<DataResourceSimpleRespDto> resourceList) {
        this.resourceList = resourceList;
    }

    public String getPolicyId() {
        return policyId;
    }
    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public List<SubjectRespDto> getTargetList() {
        return targetList;
    }
    public void setTargetList(List<SubjectRespDto> targetList) {
        this.targetList = targetList;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }



}