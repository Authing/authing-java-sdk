package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.RelationOptionalRange;

public class UpdateFunctionModelFieldDto {
    /**
     * 字段 id
     */
    @JsonProperty("id")
    private String id;
    /**
     * 功能 id
     */
    @JsonProperty("modelId")
    private String modelId;
    /**
     * 字段名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 是否展示
     */
    @JsonProperty("show")
    private Boolean show;
    /**
     * 是否可编辑
     */
    @JsonProperty("editable")
    private Boolean editable;
    /**
     * 帮助说明
     */
    @JsonProperty("help")
    private String help;
    /**
     * 默认值
     */
    @JsonProperty("default")
    private Object default;
    /**
     * 是否必填
     */
    @JsonProperty("require")
    private Boolean require;
    /**
     * 是否唯一
     */
    @JsonProperty("unique")
    private Boolean unique;
    /**
     * 字符串长度限制
     */
    @JsonProperty("maxLength")
    private Integer maxLength;
    /**
     * 上限(数字、日期)
     */
    @JsonProperty("max")
    private Integer max;
    /**
     * 下限(数字、日期)
     */
    @JsonProperty("min")
    private Integer min;
    /**
     * 字符串规则
     */
    @JsonProperty("regexp")
    private String regexp;
    /**
     * 前端格式化规则
     */
    @JsonProperty("format")
    private Integer format;
    /**
     * 下拉菜单选项
     */
    @JsonProperty("dropDown")
    private List<String> dropDown;
    /**
     * 是否支持模糊搜索
     */
    @JsonProperty("fuzzySearch")
    private Boolean fuzzySearch;
    /**
     * 是否可用于登录，仅在 user 模块下有意义
     */
    @JsonProperty("forLogin")
    private Boolean forLogin;
    /**
     * 关联数据要展示的属性
     */
    @JsonProperty("relationShowKey")
    private String relationShowKey;
    /**
     * 关联数据可选范围
     */
    @JsonProperty("relationOptionalRange")
    private RelationOptionalRange relationOptionalRange;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getModelId() {
        return modelId;
    }
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Boolean getShow() {
        return show;
    }
    public void setShow(Boolean show) {
        this.show = show;
    }

    public Boolean getEditable() {
        return editable;
    }
    public void setEditable(Boolean editable) {
        this.editable = editable;
    }

    public String getHelp() {
        return help;
    }
    public void setHelp(String help) {
        this.help = help;
    }

    public Object getDefault() {
        return default;
    }
    public void setDefault(Object default) {
        this.default = default;
    }

    public Boolean getRequire() {
        return require;
    }
    public void setRequire(Boolean require) {
        this.require = require;
    }

    public Boolean getUnique() {
        return unique;
    }
    public void setUnique(Boolean unique) {
        this.unique = unique;
    }

    public Integer getMaxLength() {
        return maxLength;
    }
    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    public Integer getMax() {
        return max;
    }
    public void setMax(Integer max) {
        this.max = max;
    }

    public Integer getMin() {
        return min;
    }
    public void setMin(Integer min) {
        this.min = min;
    }

    public String getRegexp() {
        return regexp;
    }
    public void setRegexp(String regexp) {
        this.regexp = regexp;
    }

    public Integer getFormat() {
        return format;
    }
    public void setFormat(Integer format) {
        this.format = format;
    }

    public List<String> getDropDown() {
        return dropDown;
    }
    public void setDropDown(List<String> dropDown) {
        this.dropDown = dropDown;
    }

    public Boolean getFuzzySearch() {
        return fuzzySearch;
    }
    public void setFuzzySearch(Boolean fuzzySearch) {
        this.fuzzySearch = fuzzySearch;
    }

    public Boolean getForLogin() {
        return forLogin;
    }
    public void setForLogin(Boolean forLogin) {
        this.forLogin = forLogin;
    }

    public String getRelationShowKey() {
        return relationShowKey;
    }
    public void setRelationShowKey(String relationShowKey) {
        this.relationShowKey = relationShowKey;
    }

    public RelationOptionalRange getRelationOptionalRange() {
        return relationOptionalRange;
    }
    public void setRelationOptionalRange(RelationOptionalRange relationOptionalRange) {
        this.relationOptionalRange = relationOptionalRange;
    }



}