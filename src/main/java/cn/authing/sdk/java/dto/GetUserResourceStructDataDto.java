package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.TreePermissionDto;

public class GetUserResourceStructDataDto {
    /**
     * 权限空间code
     */
    @JsonProperty("namespaceCode")
    private String namespaceCode;
    /**
     * 资源code
     */
    @JsonProperty("resourceCode")
    private String resourceCode;
    /**
     * 数据资源权限操作列表
     */
    @JsonProperty("permissionBo")
    private TreePermissionDto permissionBo;

    public String getNamespaceCode() {
        return namespaceCode;
    }
    public void setNamespaceCode(String namespaceCode) {
        this.namespaceCode = namespaceCode;
    }

    public String getResourceCode() {
        return resourceCode;
    }
    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    public TreePermissionDto getPermissionBo() {
        return permissionBo;
    }
    public void setPermissionBo(TreePermissionDto permissionBo) {
        this.permissionBo = permissionBo;
    }



}