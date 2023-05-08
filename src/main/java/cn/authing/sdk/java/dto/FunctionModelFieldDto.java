package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.RelationOptionalRange;

public class FunctionModelFieldDto {
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
     * 字段属性名
     */
    @JsonProperty("key")
    private String key;
    /**
     * 字段类型
     */
    @JsonProperty("type")
    private Integer type;
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
    private String default;
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
    private Integer dropDown;
    /**
     * 关联数据要展示的属性
     */
    @JsonProperty("relationType")
    private String relationType;
    /**
     * 关联关系是否为 1-N
     */
    @JsonProperty("relationMultiple")
    private Boolean relationMultiple;
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

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
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

    public String getDefault() {
        return default;
    }
    public void setDefault(String default) {
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

    public Integer getDropDown() {
        return dropDown;
    }
    public void setDropDown(Integer dropDown) {
        this.dropDown = dropDown;
    }

    public String getRelationType() {
        return relationType;
    }
    public void setRelationType(String relationType) {
        this.relationType = relationType;
    }

    public Boolean getRelationMultiple() {
        return relationMultiple;
    }
    public void setRelationMultiple(Boolean relationMultiple) {
        this.relationMultiple = relationMultiple;
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