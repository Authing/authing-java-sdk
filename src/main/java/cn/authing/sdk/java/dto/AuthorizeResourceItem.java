package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.ResourceItemDto;

public class AuthorizeResourceItem {
    /**
     * 目标对象类型
     */
    @JsonProperty("targetType")
    private TargetType targetType;
    /**
     * 目标对象唯一标志符
     */
    @JsonProperty("targetIdentifiers")
    private List<String> targetIdentifiers;
    /**
     * 授权的资源列表
     */
    @JsonProperty("resources")
    private List<ResourceItemDto> resources;

    public TargetType getTargetType() {
        return targetType;
    }
    public void setTargetType(TargetType targetType) {
        this.targetType = targetType;
    }

    public List<String> getTargetIdentifiers() {
        return targetIdentifiers;
    }
    public void setTargetIdentifiers(List<String> targetIdentifiers) {
        this.targetIdentifiers = targetIdentifiers;
    }

    public List<ResourceItemDto> getResources() {
        return resources;
    }
    public void setResources(List<ResourceItemDto> resources) {
        this.resources = resources;
    }


    /**
     * 目标对象类型
     */
    public static enum TargetType {

        @JsonProperty("USER")
        USER("USER"),

        @JsonProperty("ROLE")
        ROLE("ROLE"),

        @JsonProperty("GROUP")
        GROUP("GROUP"),

        @JsonProperty("DEPARTMENT")
        DEPARTMENT("DEPARTMENT"),
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