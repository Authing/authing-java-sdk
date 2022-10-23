package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.EmailTemplateCategoryDto;
import cn.authing.sdk.java.dto.EmailTemplateDto;

public class GetEmailTemplatesDataDto {
    /**
     * 模版列表
     */
    @JsonProperty("templates")
    private List<EmailTemplateDto> templates;
    /**
     * 模版类型列表
     */
    @JsonProperty("categories")
    private List<EmailTemplateCategoryDto> categories;

    public List<EmailTemplateDto> getTemplates() {
        return templates;
    }
    public void setTemplates(List<EmailTemplateDto> templates) {
        this.templates = templates;
    }

    public List<EmailTemplateCategoryDto> getCategories() {
        return categories;
    }
    public void setCategories(List<EmailTemplateCategoryDto> categories) {
        this.categories = categories;
    }



}