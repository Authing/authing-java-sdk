package cn.authing.sdk.java.dto;

/**
 * 获取数据资源扩展字段
 */
public class GetDenfListDto {

    /**
     * 起始索引，默认为 1，即从第 1 条开始
     */
    private Integer startIndex;

    /**
     * 当次查询最大数量，默认为 10
     */
    private Integer maxSize;

    /**
     * 关键字搜索，可以是字段唯一标识、展示名称
     */
    private String query;

    /**
     * 数据资源 code
     */
    private String resourceCode;

    /**
     * 权限空间 code
     */
    private String namespaceCode;

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public Integer getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getResourceCode() {
        return resourceCode;
    }

    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    public String getNamespaceCode() {
        return namespaceCode;
    }

    public void setNamespaceCode(String namespaceCode) {
        this.namespaceCode = namespaceCode;
    }
}
