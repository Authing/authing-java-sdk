package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.Condition;
import cn.authing.sdk.java.dto.ScopeDto;

public class FilterDto {
    /**
     * 功能 id
     */
    @JsonProperty("modelId")
    private String modelId;
    /**
     * 关键字
     */
    @JsonProperty("keywords")
    private String keywords;
    /**
     * 连词
     */
    @JsonProperty("conjunction")
    private String conjunction;
    /**
     * 搜索条件
     */
    @JsonProperty("conditions")
    private Condition conditions;
    /**
     * 当前页数，从 1 开始
     */
    @JsonProperty("page")
    private Integer page;
    /**
     * 每页数目，最大不能超过 50，默认为 10
     */
    @JsonProperty("limit")
    private Integer limit;
    /**
     * 返回结果中是否使用字段 id 作为 key
     */
    @JsonProperty("showFieldId")
    private Boolean showFieldId;
    /**
     * 返回结果中是包含关联数据的预览（前三个）
     */
    @JsonProperty("previewRelation")
    private Boolean previewRelation;
    /**
     * 限定检索范围为被某个功能关联的部分
     */
    @JsonProperty("scope")
    private ScopeDto scope;

    public String getModelId() {
        return modelId;
    }
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getKeywords() {
        return keywords;
    }
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getConjunction() {
        return conjunction;
    }
    public void setConjunction(String conjunction) {
        this.conjunction = conjunction;
    }

    public Condition getConditions() {
        return conditions;
    }
    public void setConditions(Condition conditions) {
        this.conditions = conditions;
    }

    public Integer getPage() {
        return page;
    }
    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Boolean getShowFieldId() {
        return showFieldId;
    }
    public void setShowFieldId(Boolean showFieldId) {
        this.showFieldId = showFieldId;
    }

    public Boolean getPreviewRelation() {
        return previewRelation;
    }
    public void setPreviewRelation(Boolean previewRelation) {
        this.previewRelation = previewRelation;
    }

    public ScopeDto getScope() {
        return scope;
    }
    public void setScope(ScopeDto scope) {
        this.scope = scope;
    }



}