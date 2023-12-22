package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.Condition;
import cn.authing.sdk.java.dto.DropDownItemDto;

public class CreateFunctionModelFieldDto {
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
    private Condition relationOptionalRange;
    /**
     * 关联数据要展示的属性
     */
    @JsonProperty("relationShowKey")
    private String relationShowKey;
    /**
     * 关联关系是否为 1-N:
     * - true: 是 1-N 的关系
     * - false: 不是 1-N 的关系
     *
     */
    @JsonProperty("relationMultiple")
    private Boolean relationMultiple;
    /**
     * 关联类型
     */
    @JsonProperty("relationType")
    private String relationType;
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
    private DropDownItemDto dropDown;
    /**
     * 前端格式化显示规则:
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
     * 字段类型:
     * - 1: 单行文本
     * - 2: 多行文本
     * - 3: 数字
     * - 4: 布尔类型
     * - 5: 日期
     * - 6: 枚举
     * - 7: 关联类型
     * - 8: 反向关联数据展示
     *
     */
    @JsonProperty("type")
    private Type type;
    /**
     * 字段属性名
     */
    @JsonProperty("key")
    private String key;
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

    public Boolean getUserVisible() {
        return userVisible;
    }
    public void setUserVisible(Boolean userVisible) {
        this.userVisible = userVisible;
    }

    public Condition getRelationOptionalRange() {
        return relationOptionalRange;
    }
    public void setRelationOptionalRange(Condition relationOptionalRange) {
        this.relationOptionalRange = relationOptionalRange;
    }

    public String getRelationShowKey() {
        return relationShowKey;
    }
    public void setRelationShowKey(String relationShowKey) {
        this.relationShowKey = relationShowKey;
    }

    public Boolean getRelationMultiple() {
        return relationMultiple;
    }
    public void setRelationMultiple(Boolean relationMultiple) {
        this.relationMultiple = relationMultiple;
    }

    public String getRelationType() {
        return relationType;
    }
    public void setRelationType(String relationType) {
        this.relationType = relationType;
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

    public DropDownItemDto getDropDown() {
        return dropDown;
    }
    public void setDropDown(DropDownItemDto dropDown) {
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

    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
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


    /**
     * 字段类型:
     * - 1: 单行文本
     * - 2: 多行文本
     * - 3: 数字
     * - 4: 布尔类型
     * - 5: 日期
     * - 6: 枚举
     * - 7: 关联类型
     * - 8: 反向关联数据展示
     *
     */
    public static enum Type {

        @JsonProperty("Text")
        TEXT("Text"),

        @JsonProperty("Textarea")
        TEXTAREA("Textarea"),

        @JsonProperty("Number")
        NUMBER("Number"),

        @JsonProperty("Boolean")
        BOOLEAN("Boolean"),

        @JsonProperty("Date")
        DATE("Date"),

        @JsonProperty("Enum")
        ENUM("Enum"),

        @JsonProperty("Relation")
        RELATION("Relation"),

        @JsonProperty("ReverseRelation")
        REVERSE_RELATION("ReverseRelation"),

        @JsonProperty("Array")
        ARRAY("Array"),
        ;

        private String value;

        Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}