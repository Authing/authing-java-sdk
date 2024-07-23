package cn.authing.sdk.java.dto;

import java.util.List;

/**
 * 批量创建数据资源扩展字段
 */
public class BatchCreateDenfDto {

    /**
     * 扩展字段列表
     */
    private List<Dnef> fieldList;

    /**
     * 数据资源 code
     */
    private String resourceCode;

    /**
     * 权限空间 code
     */
    private String namespaceCode;

    public List<Dnef> getFieldList() {
        return fieldList;
    }

    public void setFieldList(List<Dnef> fieldList) {
        this.fieldList = fieldList;
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
