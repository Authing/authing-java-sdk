package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateDataPolicyRespDto {
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
    /**
     * 数据策略创建时间
     */
    @JsonProperty("createdAt")
    private String createdAt;
    /**
     * 数据策略更新时间
     */
    @JsonProperty("updatedAt")
    private String updatedAt;

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

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }



}