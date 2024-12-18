package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

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
     * 多个搜索条件的关系：
     * - and: 且
     * - or:  或
     *
     */
    @JsonProperty("conjunction")
    private String conjunction;
    /**
     * 搜索条件
     */
    @JsonProperty("conditions")
    private List<Condition> conditions;
    /**
     * 排序条件
     */
    @JsonProperty("sort")
    private List<Object> sort;
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
     * 是否不分页返回所有（仅支持树形结构获取子节点的场景）
     */
    @JsonProperty("fetchAll")
    private Boolean fetchAll;
    /**
     * 是否返回节点的全路径（仅支持树形结构）
     */
    @JsonProperty("withPath")
    private Boolean withPath;
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
     * 是否返回关联数据的详细用户信息，当前只支持用户。
     */
    @JsonProperty("getRelationFieldDetail")
    private Boolean getRelationFieldDetail;
    /**
     * 限定检索范围为被某个功能关联的部分
     */
    @JsonProperty("scope")
    private ScopeDto scope;
    /**
     * 过滤指定关联数据
     */
    @JsonProperty("filterRelation")
    private ScopeDto filterRelation;
    /**
     * 获取对应关联数据的详细字段
     */
    @JsonProperty("expand")
    private List<Expand> expand;

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

    public List<Condition> getConditions() {
        return conditions;
    }
    public void setConditions(List<Condition> conditions) {
        this.conditions = conditions;
    }

    public List<Object> getSort() {
        return sort;
    }
    public void setSort(List<Object> sort) {
        this.sort = sort;
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

    public Boolean getFetchAll() {
        return fetchAll;
    }
    public void setFetchAll(Boolean fetchAll) {
        this.fetchAll = fetchAll;
    }

    public Boolean getWithPath() {
        return withPath;
    }
    public void setWithPath(Boolean withPath) {
        this.withPath = withPath;
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

    public Boolean getGetRelationFieldDetail() {
        return getRelationFieldDetail;
    }
    public void setGetRelationFieldDetail(Boolean getRelationFieldDetail) {
        this.getRelationFieldDetail = getRelationFieldDetail;
    }

    public ScopeDto getScope() {
        return scope;
    }
    public void setScope(ScopeDto scope) {
        this.scope = scope;
    }

    public ScopeDto getFilterRelation() {
        return filterRelation;
    }
    public void setFilterRelation(ScopeDto filterRelation) {
        this.filterRelation = filterRelation;
    }

    public List<Expand> getExpand() {
        return expand;
    }
    public void setExpand(List<Expand> expand) {
        this.expand = expand;
    }



}