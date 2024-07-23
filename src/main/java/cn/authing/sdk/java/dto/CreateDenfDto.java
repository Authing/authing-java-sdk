package cn.authing.sdk.java.dto;

/**
 * 创建数据资源扩展字段
 */
public class CreateDenfDto extends Dnef {

    /**
     * 数据资源 code
     */
    private String resourceCode;

    /**
     * 权限空间 code
     */
    private String namespaceCode;

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
