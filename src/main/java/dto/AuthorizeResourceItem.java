package dto;

import dto.ResourceItemDto;

public class AuthorizeResourceItem {
    /**
     * 目标对象类型
     */
    private AuthorizeResourceItem.targetType targetType
    /**
     * 目标对象唯一标志符
     */
    private Array<string> targetIdentifiers
    /**
     * 授权的资源列表
     */
    private Array<ResourceItemDto> resources

    public AuthorizeResourceItem.targetType getTargetType() {
        return targetType;
    }
    public void setTargetType(AuthorizeResourceItem.targetType targetType) {
        this.targetType = targetType;
    }

    public Array<string> getTargetIdentifiers() {
        return targetIdentifiers;
    }
    public void setTargetIdentifiers(Array<string> targetIdentifiers) {
        this.targetIdentifiers = targetIdentifiers;
    }

    public Array<ResourceItemDto> getResources() {
        return resources;
    }
    public void setResources(Array<ResourceItemDto> resources) {
        this.resources = resources;
    }

};