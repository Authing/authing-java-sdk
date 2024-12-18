package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DataSubjectRespDto {
    /**
     * 主体 ID ，包含用户 ID、用户组 ID、角色 ID、组织机构 ID
     */
    @JsonProperty("targetIdentifier")
    private String targetIdentifier;
    /**
     * 主体类型,包括 USER、GROUP、ROLE、ORG 四种类型
     */
    @JsonProperty("targetType")
    private TargetType targetType;
    /**
     * 主体名称，包含用户名称、用户组名称、角色名称、组织机构名称
     */
    @JsonProperty("targetName")
    private String targetName;
    /**
     * 主体对象被授权时间
     */
    @JsonProperty("authorizationTime")
    private String authorizationTime;

    public String getTargetIdentifier() {
        return targetIdentifier;
    }
    public void setTargetIdentifier(String targetIdentifier) {
        this.targetIdentifier = targetIdentifier;
    }

    public TargetType getTargetType() {
        return targetType;
    }
    public void setTargetType(TargetType targetType) {
        this.targetType = targetType;
    }

    public String getTargetName() {
        return targetName;
    }
    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public String getAuthorizationTime() {
        return authorizationTime;
    }
    public void setAuthorizationTime(String authorizationTime) {
        this.authorizationTime = authorizationTime;
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