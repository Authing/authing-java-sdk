package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListAuthSubjectDto {
    /**
     * 主体类型
     */
    @JsonProperty("targetType")
    private TargetType targetType;
    /**
     * 主体 id
     */
    @JsonProperty("targetId")
    private String targetId;
    /**
     * 应用名称
     */
    @JsonProperty("appName")
    private String appName;
    /**
     * 应用类型列表
     */
    @JsonProperty("appTypeList")
    private List<String> appTypeList;
    /**
     * 操作类型列表
     */
    @JsonProperty("effect")
    private List<String> effect;
    /**
     * 开关
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    public TargetType getTargetType() {
        return targetType;
    }
    public void setTargetType(TargetType targetType) {
        this.targetType = targetType;
    }

    public String getTargetId() {
        return targetId;
    }
    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public String getAppName() {
        return appName;
    }
    public void setAppName(String appName) {
        this.appName = appName;
    }

    public List<String> getAppTypeList() {
        return appTypeList;
    }
    public void setAppTypeList(List<String> appTypeList) {
        this.appTypeList = appTypeList;
    }

    public List<String> getEffect() {
        return effect;
    }
    public void setEffect(List<String> effect) {
        this.effect = effect;
    }

    public Boolean getEnabled() {
        return enabled;
    }
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }


    /**
     * 主体类型
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


}