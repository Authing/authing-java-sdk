package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.CustomFieldI18n;

public class SetUserBaseFieldDto {
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
     * 用户是否可编辑
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



}