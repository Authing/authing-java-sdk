package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetCustomDataDto {
    /**
     * 租户 ID
     */
    @JsonProperty("tenantId")
    private String tenantId;
    /**
     * 目标对象类型：
     * - `USER`: 用户
     * - `ROLE`: 角色
     * - `GROUP`: 分组
     * - `DEPARTMENT`: 部门
     *
     */
    @JsonProperty("targetType")
    private String targetType;
    /**
     * 目标对象的唯一标志符：
     * - 如果是用户，为用户的 ID，如 `6343b98b7cfxxx9366e9b7c`
     * - 如果是角色，为角色的 code，如 `admin`
     * - 如果是分组，为分组的 code，如 `developer`
     * - 如果是部门，为部门的 ID，如 `6343bafc019xxxx889206c4c`
     *
     */
    @JsonProperty("targetIdentifier")
    private String targetIdentifier;
    /**
     * 所属权限分组的 code，当 targetType 为角色的时候需要填写，否则可以忽略
     */
    @JsonProperty("namespace")
    private String namespace;

    public String getTenantId() {
        return tenantId;
    }
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getTargetType() {
        return targetType;
    }
    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public String getTargetIdentifier() {
        return targetIdentifier;
    }
    public void setTargetIdentifier(String targetIdentifier) {
        this.targetIdentifier = targetIdentifier;
    }

    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }



}