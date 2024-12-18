package cn.genauth.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetUserAuthResourceStructDataDto {
    /**
     * 权限空间 Code
     */
    @JsonProperty("namespaceCode")
    private String namespaceCode;
    /**
     * 数据资源 Code
     */
    @JsonProperty("resourceCode")
    private String resourceCode;
    /**
     * 数据资源类型，目前支持树结构（TREE）、字符串（STRING）、数组（ARRAY）三种类型，根据不同的类型返回不同的结构。
     * - `STRING`: 字符串类型结果 StrResourceAuthAction
     * - `ARRAY`: 数组类型 ArrResourceAuthAction
     * - `TREE`: 树类型 TreeResourceAuthAction
     */
    @JsonProperty("resourceType")
    private ResourceType resourceType;
    /**
     * 字符串资源授权
     */
    @JsonProperty("strResourceAuthAction")
    private StrResourceAuthAction strResourceAuthAction;
    /**
     * 数组资源授权
     */
    @JsonProperty("arrResourceAuthAction")
    private ArrResourceAuthAction arrResourceAuthAction;
    /**
     * 树资源授权
     */
    @JsonProperty("treeResourceAuthAction")
    private TreeResourceAuthAction treeResourceAuthAction;

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

    public ResourceType getResourceType() {
        return resourceType;
    }
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType;
    }

    public StrResourceAuthAction getStrResourceAuthAction() {
        return strResourceAuthAction;
    }
    public void setStrResourceAuthAction(StrResourceAuthAction strResourceAuthAction) {
        this.strResourceAuthAction = strResourceAuthAction;
    }

    public ArrResourceAuthAction getArrResourceAuthAction() {
        return arrResourceAuthAction;
    }
    public void setArrResourceAuthAction(ArrResourceAuthAction arrResourceAuthAction) {
        this.arrResourceAuthAction = arrResourceAuthAction;
    }

    public TreeResourceAuthAction getTreeResourceAuthAction() {
        return treeResourceAuthAction;
    }
    public void setTreeResourceAuthAction(TreeResourceAuthAction treeResourceAuthAction) {
        this.treeResourceAuthAction = treeResourceAuthAction;
    }


    /**
     * 数据资源类型，目前支持树结构（TREE）、字符串（STRING）、数组（ARRAY）三种类型，根据不同的类型返回不同的结构。
     * - `STRING`: 字符串类型结果 StrResourceAuthAction
     * - `ARRAY`: 数组类型 ArrResourceAuthAction
     * - `TREE`: 树类型 TreeResourceAuthAction
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