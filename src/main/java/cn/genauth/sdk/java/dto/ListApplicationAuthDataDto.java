package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListApplicationAuthDataDto {
    /**
     * 授权 id
     */
    @JsonProperty("id")
    private String id;
    /**
     * 主体 id
     */
    @JsonProperty("targetId")
    private String targetId;
    /**
     * 主体名称
     */
    @JsonProperty("targetName")
    private String targetName;
    /**
     * 主体类型，USER/ORG/GROUP/ROLE
     */
    @JsonProperty("targetType")
    private TargetType targetType;
    /**
     * 主体类型，ALLOW/DENY
     */
    @JsonProperty("effect")
    private Effect effect;
    /**
     * 授权开关
     */
    @JsonProperty("enabled")
    private Boolean enabled;
    /**
     * 授权类型, ALL:所有人 SUBJECT:主体
     */
    @JsonProperty("permissionType")
    private PermissionType permissionType;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getTargetId() {
        return targetId;
    }
    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public String getTargetName() {
        return targetName;
    }
    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public TargetType getTargetType() {
        return targetType;
    }
    public void setTargetType(TargetType targetType) {
        this.targetType = targetType;
    }

    public Effect getEffect() {
        return effect;
    }
    public void setEffect(Effect effect) {
        this.effect = effect;
    }

    public Boolean getEnabled() {
        return enabled;
    }
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public PermissionType getPermissionType() {
        return permissionType;
    }
    public void setPermissionType(PermissionType permissionType) {
        this.permissionType = permissionType;
    }


    /**
     * 主体类型，USER/ORG/GROUP/ROLE
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
     * 主体类型，ALLOW/DENY
     */
    public static enum Effect {

        @JsonProperty("ALLOW")
        ALLOW("ALLOW"),

        @JsonProperty("DENY")
        DENY("DENY"),
        ;

        private String value;

        Effect(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * 授权类型, ALL:所有人 SUBJECT:主体
     */
    public static enum PermissionType {

        @JsonProperty("ALL")
        ALL("ALL"),

        @JsonProperty("SUBJECT")
        SUBJECT("SUBJECT"),
        ;

        private String value;

        PermissionType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}