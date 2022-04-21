package dto;

import dto.ResourceAction;

public class CreateResourceBatchItemDto {
    /**
     * 资源唯一标志符
     */
    private String code
    /**
     * 资源描述
     */
    private String description
    /**
     * 资源类型，如数据、API、按钮、菜单
     */
    private CreateResourceBatchItemDto.type type
    /**
     * 资源定义的操作类型
     */
    private Array<ResourceAction> actions
    /**
     * API 资源的 URL 标识
     */
    private String apiIdentifier

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public CreateResourceBatchItemDto.type getType() {
        return type;
    }
    public void setType(CreateResourceBatchItemDto.type type) {
        this.type = type;
    }

    public Array<ResourceAction> getActions() {
        return actions;
    }
    public void setActions(Array<ResourceAction> actions) {
        this.actions = actions;
    }

    public String getApiIdentifier() {
        return apiIdentifier;
    }
    public void setApiIdentifier(String apiIdentifier) {
        this.apiIdentifier = apiIdentifier;
    }

};