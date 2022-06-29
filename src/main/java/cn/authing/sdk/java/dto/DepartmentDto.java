package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.I18nDto;

public class DepartmentDto {
    /**
     * 部门系统 ID（为 Authing 系统自动生成，不可修改）
     */
    @JsonProperty("departmentId")
    private String departmentId;
    /**
     * 自定义部门 ID，用于存储自定义的 ID
     */
    @JsonProperty("openDepartmentId")
    private String openDepartmentId;
    /**
     * 部门名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 部门描述
     */
    @JsonProperty("description")
    private String description;
    /**
     * 父部门 id
     */
    @JsonProperty("parentDepartmentId")
    private String parentDepartmentId;
    /**
     * 部门识别码
     */
    @JsonProperty("code")
    private String code;
    /**
     * 是否是虚拟部门
     */
    @JsonProperty("isVirtualNode")
    private Boolean isVirtualNode;
    /**
     * 多语言设置
     */
    @JsonProperty("i18n")
    private I18nDto i18n;

    public String getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getOpenDepartmentId() {
        return openDepartmentId;
    }
    public void setOpenDepartmentId(String openDepartmentId) {
        this.openDepartmentId = openDepartmentId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getParentDepartmentId() {
        return parentDepartmentId;
    }
    public void setParentDepartmentId(String parentDepartmentId) {
        this.parentDepartmentId = parentDepartmentId;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getIsVirtualNode() {
        return isVirtualNode;
    }
    public void setIsVirtualNode(Boolean isVirtualNode) {
        this.isVirtualNode = isVirtualNode;
    }

    public I18nDto getI18n() {
        return i18n;
    }
    public void setI18n(I18nDto i18n) {
        this.i18n = i18n;
    }



}