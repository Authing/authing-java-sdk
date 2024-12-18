package cn.genauth.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OpenResource {
    /**
     * 数据策略下所授权的数据资源 Code
     */
    @JsonProperty("resourceCode")
    private String resourceCode;
    /**
     * 数据策略下所授权的数据资源类型，目前支持树结构（TREE）、字符串（STRING）、数组（ARRAY）三种类型，根据不同的类型返回不同的结构。
     * - `STRING`: 字符串类型结果 StrAuthorize
     * - `ARRAY`: 数组类型 ArrayAuthorize
     * - `TREE`: 树类型 TreeAuthorize
     */
    @JsonProperty("resourceType")
    private ResourceType resourceType;
    /**
     * 数据策略的字符串资源
     */
    @JsonProperty("strAuthorize")
    private StrAuthorize strAuthorize;
    /**
     * 数据策略的数组资源
     */
    @JsonProperty("arrAuthorize")
    private ArrayAuthorize arrAuthorize;
    /**
     * 数据策略的树资源
     */
    @JsonProperty("treeAuthorize")
    private TreeAuthorize treeAuthorize;

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

    public StrAuthorize getStrAuthorize() {
        return strAuthorize;
    }
    public void setStrAuthorize(StrAuthorize strAuthorize) {
        this.strAuthorize = strAuthorize;
    }

    public ArrayAuthorize getArrAuthorize() {
        return arrAuthorize;
    }
    public void setArrAuthorize(ArrayAuthorize arrAuthorize) {
        this.arrAuthorize = arrAuthorize;
    }

    public TreeAuthorize getTreeAuthorize() {
        return treeAuthorize;
    }
    public void setTreeAuthorize(TreeAuthorize treeAuthorize) {
        this.treeAuthorize = treeAuthorize;
    }


    /**
     * 数据策略下所授权的数据资源类型，目前支持树结构（TREE）、字符串（STRING）、数组（ARRAY）三种类型，根据不同的类型返回不同的结构。
     * - `STRING`: 字符串类型结果 StrAuthorize
     * - `ARRAY`: 数组类型 ArrayAuthorize
     * - `TREE`: 树类型 TreeAuthorize
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