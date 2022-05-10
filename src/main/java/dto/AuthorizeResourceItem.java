package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import dto.ResourceItemDto;

public class AuthorizeResourceItem {
    /**
     * 目标对象类型
     */
    @JsonProperty("getTargetType")
    private TargetType targetType;
    /**
     * 目标对象唯一标志符
     */
    @JsonProperty("getTargetIdentifiers")
    private List<String> targetIdentifiers;
    /**
     * 授权的资源列表
     */
    @JsonProperty("getResources")
    private List<ResourceItemDto> nase resources;

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

    public List<ResourceItemDto> nase getResources() {
        return resources;
    }
    public void setResources(List<ResourceItemDto> nase resources) {
        this.resources = resources;
    }


    /**
     * 目标对象类型
     */
    public static enum TargetType {
        USER("USER"),
        ROLE("ROLE"),
        GROUP("GROUP"),
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