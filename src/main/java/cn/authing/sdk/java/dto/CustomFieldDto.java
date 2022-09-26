package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.CustomFieldI18n;
import cn.authing.sdk.java.dto.CustomFieldSelectOption;

public class CustomFieldDto {
    /**
     * 主体类型，目前支持用户、角色、分组和部门
     */
    @JsonProperty("targetType")
    private TargetType targetType;
    /**
     * 创建时间，只针对自定义字段有效，内置字段没有创建时间。
     */
    @JsonProperty("createdAt")
    private String createdAt;
    /**
     * 数据类型，**设置之后将不能进行修改**。
     * - `STRING`: 字符串类型
     * - `NUMBER`: 数字类型
     * - `DATETIME`: 日期类型
     * - `BOOLEAN`: 布尔类型
     * - `ENUM`: 枚举值类型
     *
     */
    @JsonProperty("dataType")
    private DataType dataType;
    /**
     * 字段 key，不能和内置字段的 key 冲突，**设置之后将不能进行修改**。
     */
    @JsonProperty("key")
    private String key;
    /**
     * 显示名称
     */
    @JsonProperty("label")
    private String label;
    /**
     * 详细描述信息
     */
    @JsonProperty("description")
    private String description;
    /**
     * 是否加密存储。开启后，该字段的**新增数据**将被加密，此参数一旦设置不可更改。
     */
    @JsonProperty("encrypted")
    private Boolean encrypted;
    /**
     * 是否为唯一字段，开启之后，当前字段上报的值将进行唯一校验。此参数只针对数据类型为字符串和数字的字段有效。
     */
    @JsonProperty("isUnique")
    private Boolean isUnique;
    /**
     * 用户是否可编辑，如果是手机号、邮箱等特殊字段，用户不能直接修改，需要先通过验证码等方式进行验证。
     */
    @JsonProperty("userEditable")
    private Boolean userEditable;
    /**
     * 是否需要在 Authing 控制台中进行显示：
     * - 如果是用户自定义字段，控制是否在用户详情展示；
     * - 如果是部门自定义字段，控制是否在部门详情中展示；
     * - 如果是角色扩展字段，控制是否在角色详情中展示。
     *
     */
    @JsonProperty("visibleInAdminConsole")
    private Boolean visibleInAdminConsole;
    /**
     * 是否在用户个人中心展示（此参数不控制 API 接口是否返回）。
     */
    @JsonProperty("visibleInUserCenter")
    private Boolean visibleInUserCenter;
    /**
     * 多语言显示名称
     */
    @JsonProperty("i18n")
    private CustomFieldI18n i18n;
    /**
     * 枚举值类型选择项
     */
    @JsonProperty("options")
    private List<CustomFieldSelectOption> options;

    public TargetType getTargetType() {
        return targetType;
    }
    public void setTargetType(TargetType targetType) {
        this.targetType = targetType;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public DataType getDataType() {
        return dataType;
    }
    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getEncrypted() {
        return encrypted;
    }
    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    public Boolean getIsUnique() {
        return isUnique;
    }
    public void setIsUnique(Boolean isUnique) {
        this.isUnique = isUnique;
    }

    public Boolean getUserEditable() {
        return userEditable;
    }
    public void setUserEditable(Boolean userEditable) {
        this.userEditable = userEditable;
    }

    public Boolean getVisibleInAdminConsole() {
        return visibleInAdminConsole;
    }
    public void setVisibleInAdminConsole(Boolean visibleInAdminConsole) {
        this.visibleInAdminConsole = visibleInAdminConsole;
    }

    public Boolean getVisibleInUserCenter() {
        return visibleInUserCenter;
    }
    public void setVisibleInUserCenter(Boolean visibleInUserCenter) {
        this.visibleInUserCenter = visibleInUserCenter;
    }

    public CustomFieldI18n getI18n() {
        return i18n;
    }
    public void setI18n(CustomFieldI18n i18n) {
        this.i18n = i18n;
    }

    public List<CustomFieldSelectOption> getOptions() {
        return options;
    }
    public void setOptions(List<CustomFieldSelectOption> options) {
        this.options = options;
    }


    /**
     * 主体类型，目前支持用户、角色、分组和部门
     */
    public static enum TargetType {

        @JsonProperty("USER")
        USER("USER"),

        @JsonProperty("ROLE")
        ROLE("ROLE"),

        @JsonProperty("GROUP")
        GROUP("GROUP"),

        @JsonProperty("DEPARTMENT")
        DEPARTMENT("DEPARTMENT"),
        ;

        private String value;

        TargetType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * 数据类型，**设置之后将不能进行修改**。
     * - `STRING`: 字符串类型
     * - `NUMBER`: 数字类型
     * - `DATETIME`: 日期类型
     * - `BOOLEAN`: 布尔类型
     * - `ENUM`: 枚举值类型
     *
     */
    public static enum DataType {

        @JsonProperty("STRING")
        STRING("STRING"),

        @JsonProperty("NUMBER")
        NUMBER("NUMBER"),

        @JsonProperty("DATETIME")
        DATETIME("DATETIME"),

        @JsonProperty("BOOLEAN")
        BOOLEAN("BOOLEAN"),

        @JsonProperty("ENUM")
        ENUM("ENUM"),
        ;

        private String value;

        DataType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}