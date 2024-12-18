package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetSubjectAuthDataDto {
    /**
     * 应用 ID
     */
    @JsonProperty("appId")
    private String appId;
    /**
     * 应用名称
     */
    @JsonProperty("appName")
    private String appName;
    /**
     * 请求的主体id
     */
    @JsonProperty("reqTargetId")
    private String reqTargetId;
    /**
     * 请求的主体名称
     */
    @JsonProperty("reqTargetName")
    private String reqTargetName;
    /**
     * 请求的主体类型
     */
    @JsonProperty("reqTargetType")
    private ReqTargetType reqTargetType;
    /**
     * 目标主体类型
     */
    @JsonProperty("targetType")
    private TargetType targetType;
    /**
     * 目标主体名称
     */
    @JsonProperty("targetName")
    private String targetName;
    /**
     * 授权类型
     */
    @JsonProperty("authType")
    private AuthType authType;

    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return appName;
    }
    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getReqTargetId() {
        return reqTargetId;
    }
    public void setReqTargetId(String reqTargetId) {
        this.reqTargetId = reqTargetId;
    }

    public String getReqTargetName() {
        return reqTargetName;
    }
    public void setReqTargetName(String reqTargetName) {
        this.reqTargetName = reqTargetName;
    }

    public ReqTargetType getReqTargetType() {
        return reqTargetType;
    }
    public void setReqTargetType(ReqTargetType reqTargetType) {
        this.reqTargetType = reqTargetType;
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

    public AuthType getAuthType() {
        return authType;
    }
    public void setAuthType(AuthType authType) {
        this.authType = authType;
    }


    /**
     * 请求的主体类型
     */
    public static enum ReqTargetType {

        @JsonProperty("USER")
        USER("USER"),

        @JsonProperty("ROLE")
        ROLE("ROLE"),

        @JsonProperty("GROUP")
        GROUP("GROUP"),

        @JsonProperty("ORG")
        ORG("ORG"),

        @JsonProperty("AK_SK")
        AK_SK("AK_SK"),
        ;

        private String value;

        ReqTargetType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * 目标主体类型
     */
    public static enum TargetType {

        @JsonProperty("USER")
        USER("USER"),

        @JsonProperty("ROLE")
        ROLE("ROLE"),

        @JsonProperty("GROUP")
        GROUP("GROUP"),

        @JsonProperty("ORG")
        ORG("ORG"),

        @JsonProperty("AK_SK")
        AK_SK("AK_SK"),
        ;

        private String value;

        TargetType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * 授权类型
     */
    public static enum AuthType {

        @JsonProperty("DEFAULT")
        DEFAULT("DEFAULT"),

        @JsonProperty("ALL")
        ALL("ALL"),

        @JsonProperty("SELF")
        SELF("SELF"),

        @JsonProperty("SUBJECT")
        SUBJECT("SUBJECT"),
        ;

        private String value;

        AuthType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}