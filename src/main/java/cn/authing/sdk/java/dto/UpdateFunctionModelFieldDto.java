package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.RelationOptionalRange;

public class UpdateFunctionModelFieldDto {
    /**
     * 用户中心是否显示，仅在 user 模块下有意义:
     * - true: 用户中心展示
     * - false: 用户中心不展示
     *
     */
    @JsonProperty("userVisible")
    private Boolean userVisible;
    /**
     * 关联数据可选范围
     */
    @JsonProperty("relationOptionalRange")
    private RelationOptionalRange relationOptionalRange;
    /**
     * 关联数据要展示的属性
     */
    @JsonProperty("relationShowKey")
    private String relationShowKey;
    /**
     * 是否可用于登录，仅在 user 模块下有意义:
     * - true: 用于登录
     * - false: 不用于登录
     *
     */
    @JsonProperty("forLogin")
    private Boolean forLogin;
    /**
     * 是否支持模糊搜索:
     * - true: 支持模糊搜索
     * - false: 不支持模糊搜索
     *
     */
    @JsonProperty("fuzzySearch")
    private Boolean fuzzySearch;
    /**
     * 下拉菜单选项
     */
    @JsonProperty("dropDown")
    private List<String> dropDown;
    /**
     * 前端格式化规则
     */
    @JsonProperty("format")
    private Integer format;
    /**
     * 字符串的校验匹配规则
     */
    @JsonProperty("regexp")
    private String regexp;
    /**
     * 如果类型是数字表示数字下限，如果类型是日期表示开始日期
     */
    @JsonProperty("min")
    private Integer min;
    /**
     * 如果类型是数字表示数字上限，如果类型是日期表示结束日期
     */
    @JsonProperty("max")
    private Integer max;
    /**
     * 字符串长度限制
     */
    @JsonProperty("maxLength")
    private Integer maxLength;
    /**
     * 是否唯一:
     * - true: 唯一
     * - false: 不唯一
     *
     */
    @JsonProperty("unique")
    private Boolean unique;
    /**
     * 是否必填:
     * - true: 必填
     * - false: 不必填
     *
     */
    @JsonProperty("require")
    private Boolean require;
    /**
     * 默认值
     */
    @JsonProperty("default")
    private Object _default;
    /**
     * 帮助说明
     */
    @JsonProperty("help")
    private String help;
    /**
     * 是否可编辑:
     * - true: 可编辑
     * - false: 不可编辑
     *
     */
    @JsonProperty("editable")
    private Boolean editable;
    /**
     * 是否展示:
     * - true: 展示
     * - false: 不展示
     *
     */
    @JsonProperty("show")
    private Boolean show;
    /**
     * 字段名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 功能 id
     */
    @JsonProperty("modelId")
    private String modelId;
    /**
     * 字段 id
     */
    @JsonProperty("id")
    private String id;

    public Boolean getUserVisible() {
        return userVisible;
    }
    public void setUserVisible(Boolean userVisible) {
        this.userVisible = userVisible;
    }

    public RelationOptionalRange getRelationOptionalRange() {
        return relationOptionalRange;
    }
    public void setRelationOptionalRange(RelationOptionalRange relationOptionalRange) {
        this.relationOptionalRange = relationOptionalRange;
    }

    public String getRelationShowKey() {
        return relationShowKey;
    }
    public void setRelationShowKey(String relationShowKey) {
        this.relationShowKey = relationShowKey;
    }

    public Boolean getForLogin() {
        return forLogin;
    }
    public void setForLogin(Boolean forLogin) {
        this.forLogin = forLogin;
    }

    public Boolean getFuzzySearch() {
        return fuzzySearch;
    }
    public void setFuzzySearch(Boolean fuzzySearch) {
        this.fuzzySearch = fuzzySearch;
    }

    public List<String> getDropDown() {
        return dropDown;
    }
    public void setDropDown(List<String> dropDown) {
        this.dropDown = dropDown;
    }

    public Integer getFormat() {
        return format;
    }
    public void setFormat(Integer format) {
        this.format = format;
    }

    public String getRegexp() {
        return regexp;
    }
    public void setRegexp(String regexp) {
        this.regexp = regexp;
    }

    public Integer getMin() {
        return min;
    }
    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }
    public void setMax(Integer max) {
        this.max = max;
    }

    public Integer getMaxLength() {
        return maxLength;
    }
    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    public Boolean getUnique() {
        return unique;
    }
    public void setUnique(Boolean unique) {
        this.unique = unique;
    }

    public Boolean getRequire() {
        return require;
    }
    public void setRequire(Boolean require) {
        this.require = require;
    }

    public Object getDefault() {
        return _default;
    }
    public void setDefault(Object _default) {
        this._default = _default;
    }

    public String getHelp() {
        return help;
    }
    public void setHelp(String help) {
        this.help = help;
    }

    public Boolean getEditable() {
        return editable;
    }
    public void setEditable(Boolean editable) {
        this.editable = editable;
    }

    public Boolean getShow() {
        return show;
    }
    public void setShow(Boolean show) {
        this.show = show;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getModelId() {
        return modelId;
    }
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }



}