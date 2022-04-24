package dto;

import java.util.List;

import dto.ResourceItemDto;

public class AuthorizeResourceItem {
    /**
     * 目标对象类型
     */
    private TargetType targetType;
    /**
     * 目标对象唯一标志符
     */
    private List<string> targetIdentifiers;
    /**
     * 授权的资源列表
     */
    private List<ResourceItemDto> resources;

    public TargetType getTargetType() {
        return targetType;
    }
    public void setTargetType(TargetType targetType) {
        this.targetType = targetType;
    }

    public List<string> getTargetIdentifiers() {
        return targetIdentifiers;
    }
    public void setTargetIdentifiers(List<string> targetIdentifiers) {
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


};