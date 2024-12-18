package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ApplicationPermissionRecordItem {
    /**
     * 主体类型
     */
    @JsonProperty("targetType")
    private TargetType targetType;
    /**
     * 权限分组 code，当主体类型为 "ROLE" 时必传
     */
    @JsonProperty("namespaceCode")
    private String namespaceCode;
    /**
     * 当主体类型为 "ORG" 时，授权是否被子节点继承
     */
    @JsonProperty("inheritByChildren")
    private Boolean inheritByChildren;
    /**
     * 主体标识列表，当主体类型为 "USER" 时，值应为用户 ID；当主体类型为 "GROUP" 时，值应为分组 code；当主体类型为 "ROLE" 时，值应为角色 code；当主体类型为 "ORG" 时，值应为组织节点 ID。最多 50 条。
     */
    @JsonProperty("targetIdentifier")
    private List<String> targetIdentifier;
    /**
     * 授权作用，允许或拒绝
     */
    @JsonProperty("effect")
    private Effect effect;

    public TargetType getTargetType() {
        return targetType;
    }
    public void setTargetType(TargetType targetType) {
        this.targetType = targetType;
    }

    public String getNamespaceCode() {
        return namespaceCode;
    }
    public void setNamespaceCode(String namespaceCode) {
        this.namespaceCode = namespaceCode;
    }

    public Boolean getInheritByChildren() {
        return inheritByChildren;
    }
    public void setInheritByChildren(Boolean inheritByChildren) {
        this.inheritByChildren = inheritByChildren;
    }

    public List<String> getTargetIdentifier() {
        return targetIdentifier;
    }
    public void setTargetIdentifier(List<String> targetIdentifier) {
        this.targetIdentifier = targetIdentifier;
    }

    public Effect getEffect() {
        return effect;
    }
    public void setEffect(Effect effect) {
        this.effect = effect;
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
     * 授权作用，允许或拒绝
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


}