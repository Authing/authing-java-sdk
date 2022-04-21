package dto;

import dto.ListResourcesOptionsDto;

public class ListResourcesDto {
    /**
     * 所属权限分组的 code
     */
    private String namespace
    /**
     * 资源类型
     */
    private ListResourcesDto.type type
    /**
     * 可选参数
     */
    private ListResourcesOptionsDto options

    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ListResourcesDto.type getType() {
        return type;
    }
    public void setType(ListResourcesDto.type type) {
        this.type = type;
    }

    public ListResourcesOptionsDto getOptions() {
        return options;
    }
    public void setOptions(ListResourcesOptionsDto options) {
        this.options = options;
    }

};