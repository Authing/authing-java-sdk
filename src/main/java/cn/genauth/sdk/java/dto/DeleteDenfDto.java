package cn.genauth.sdk.java.dto;

/**
 * 删除数据资源扩展字段
 */
public class DeleteDenfDto {

    /**
     * 数据资源 code
     */
    private String resourceCode;

    /**
     * 权限空间 code
     */
    private String namespaceCode;

    /**
     * 扩展字段 key
     */
    private String key;

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

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
