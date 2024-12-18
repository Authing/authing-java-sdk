package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeleteAuthorizeDataPolicyDto {
    /**
     * 主体类型,包括 USER、GROUP、ROLE、ORG 四种类型
     */
    @JsonProperty("targetType")
    private TargetType targetType;
    /**
     * 主体 ID ，包含用户 ID、用户组 ID、角色 ID、组织机构 ID
     */
    @JsonProperty("targetIdentifier")
    private String targetIdentifier;
    /**
     * 数据策略 ID
     */
    @JsonProperty("policyId")
    private String policyId;

    public TargetType getTargetType() {
        return targetType;
    }
    public void setTargetType(TargetType targetType) {
        this.targetType = targetType;
    }

    public String getTargetIdentifier() {
        return targetIdentifier;
    }
    public void setTargetIdentifier(String targetIdentifier) {
        this.targetIdentifier = targetIdentifier;
    }

    public String getPolicyId() {
        return policyId;
    }
    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }


    /**
     * 主体类型,包括 USER、GROUP、ROLE、ORG 四种类型
     */
    public static enum TargetType {

        @JsonProperty("USER")
        USER("USER"),

        @JsonProperty("ORG")
        ORG("ORG"),

        @JsonProperty("GROUP")
        GROUP("GROUP"),

        @JsonProperty("ROLE")
        ROLE("ROLE"),
        ;

        private String value;

        TargetType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}