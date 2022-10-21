package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.ResourceItemDto;

public class AuthorizeResourceItem {
    /**
     * 目标对象类型：
     * - `USER`: 用户
     * - `ROLE`: 角色
     * - `GROUP`: 分组
     * - `DEPARTMENT`: 部门
     *
     */
    @JsonProperty("targetType")
    private TargetType targetType;
    /**
     * 目标对象的唯一标志符：
     * - 如果是用户，为用户的 ID，如 `6343b98b7cfxxx9366e9b7c`
     * - 如果是角色，为角色的 code，如 `admin`
     * - 如果是分组，为分组的 code，如 `developer`
     * - 如果是部门，为部门的 ID，如 `6343bafc019xxxx889206c4c`
     *
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
     * 目标对象类型：
     * - `USER`: 用户
     * - `ROLE`: 角色
     * - `GROUP`: 分组
     * - `DEPARTMENT`: 部门
     *
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