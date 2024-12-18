package cn.genauth.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataPermissionRespDto {
    /**
     * 数据权限所属的数据资源 id
     */
    @JsonProperty("resourceId")
    private String resourceId;
    /**
     * 数据权限所属的数据资源名称
     */
    @JsonProperty("resourceName")
    private String resourceName;
    /**
     * 数据权限所属的数据资源类型，目前支持树结构（TREE）、字符串（STRING）、数组（ARRAY）
     */
    @JsonProperty("resourceType")
    private ResourceType resourceType;
    /**
     * 数据权限所拥有的数据资源节点,根据不同的节点类型结构不同，支持字符串（String）、树结构（TREE）和数组结构（ARRAY）.
     *
     */
    @JsonProperty("resourceStruct")
    private Object resourceStruct;

    public String getResourceId() {
        return resourceId;
    }
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceName() {
        return resourceName;
    }
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public ResourceType getResourceType() {
        return resourceType;
    }
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType;
    }

    public Object getResourceStruct() {
        return resourceStruct;
    }
    public void setResourceStruct(Object resourceStruct) {
        this.resourceStruct = resourceStruct;
    }


    /**
     * 数据权限所属的数据资源类型，目前支持树结构（TREE）、字符串（STRING）、数组（ARRAY）
     */
    public static enum ResourceType {

        @JsonProperty("TREE")
        TREE("TREE"),

        @JsonProperty("STRING")
        STRING("STRING"),

        @JsonProperty("ARRAY")
        ARRAY("ARRAY"),
        ;

        private String value;

        ResourceType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}