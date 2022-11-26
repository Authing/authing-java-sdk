package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListDataResourcesRespDto {
    /**
     * 数据资源名称,权限空间内唯一
     */
    @JsonProperty("resourceName")
    private String resourceName;
    /**
     * 数据资源 Code,权限空间内唯一
     */
    @JsonProperty("resourceCode")
    private String resourceCode;
    /**
     * 数据资源类型，目前支持树结构（TREE）、字符串（STRING）、数组（ARRAY）
     */
    @JsonProperty("type")
    private Type type;
    /**
     * 数据资源描述
     */
    @JsonProperty("description")
    private String description;
    /**
     * 数据资源所属的权限空间 Code
     */
    @JsonProperty("namespaceCode")
    private String namespaceCode;
    /**
     * 数据资源所属的权限空间名称
     */
    @JsonProperty("namespaceName")
    private String namespaceName;
    /**
     * 数据资源关联授权的数量
     */
    @JsonProperty("authorizationNum")
    private Integer authorizationNum;
    /**
     * 数据资源更新时间
     */
    @JsonProperty("updatedAt")
    private String updatedAt;

    public String getResourceName() {
        return resourceName;
    }
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getResourceCode() {
        return resourceCode;
    }
    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getNamespaceCode() {
        return namespaceCode;
    }
    public void setNamespaceCode(String namespaceCode) {
        this.namespaceCode = namespaceCode;
    }

    public String getNamespaceName() {
        return namespaceName;
    }
    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    public Integer getAuthorizationNum() {
        return authorizationNum;
    }
    public void setAuthorizationNum(Integer authorizationNum) {
        this.authorizationNum = authorizationNum;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }


    /**
     * 数据资源类型，目前支持树结构（TREE）、字符串（STRING）、数组（ARRAY）
     */
    public static enum Type {

        @JsonProperty("TREE")
        TREE("TREE"),

        @JsonProperty("STRING")
        STRING("STRING"),

        @JsonProperty("ARRAY")
        ARRAY("ARRAY"),
        ;

        private String value;

        Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}