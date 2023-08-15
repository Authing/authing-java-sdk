package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.DepartmentI18nDto;

public class CreateDepartmentReqDto {
    /**
     * 组织 Code（organizationCode）
     */
    @JsonProperty("organizationCode")
    private String organizationCode;
    /**
     * 部门名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 父部门 id
     */
    @JsonProperty("parentDepartmentId")
    private String parentDepartmentId;
    /**
     * 元数据信息
     */
    @JsonProperty("metadata")
    private Object metadata;
    /**
     * 自定义部门 ID，用于存储自定义的 ID
     */
    @JsonProperty("openDepartmentId")
    private String openDepartmentId;
    /**
     * 部门描述
     */
    @JsonProperty("description")
    private String description;
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
    private DepartmentI18nDto i18n;
    /**
     * 部门的扩展字段数据
     */
    @JsonProperty("customData")
    private Object customData;
    /**
     * 此次调用中使用的父部门 ID 的类型
     */
    @JsonProperty("departmentIdType")
    private DepartmentIdType departmentIdType;
    /**
     * 岗位 id 列表
     */
    @JsonProperty("postIdList")
    private List<String> postIdList;
    /**
     * 租户 ID
     */
    @JsonProperty("tenantId")
    private String tenantId;

    public String getOrganizationCode() {
        return organizationCode;
    }
    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getParentDepartmentId() {
        return parentDepartmentId;
    }
    public void setParentDepartmentId(String parentDepartmentId) {
        this.parentDepartmentId = parentDepartmentId;
    }

    public Object getMetadata() {
        return metadata;
    }
    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    public String getOpenDepartmentId() {
        return openDepartmentId;
    }
    public void setOpenDepartmentId(String openDepartmentId) {
        this.openDepartmentId = openDepartmentId;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
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

    public DepartmentI18nDto getI18n() {
        return i18n;
    }
    public void setI18n(DepartmentI18nDto i18n) {
        this.i18n = i18n;
    }

    public Object getCustomData() {
        return customData;
    }
    public void setCustomData(Object customData) {
        this.customData = customData;
    }

    public DepartmentIdType getDepartmentIdType() {
        return departmentIdType;
    }
    public void setDepartmentIdType(DepartmentIdType departmentIdType) {
        this.departmentIdType = departmentIdType;
    }

    public List<String> getPostIdList() {
        return postIdList;
    }
    public void setPostIdList(List<String> postIdList) {
        this.postIdList = postIdList;
    }

    public String getTenantId() {
        return tenantId;
    }
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }


    /**
     * 此次调用中使用的父部门 ID 的类型
     */
    public static enum DepartmentIdType {

        @JsonProperty("department_id")
        DEPARTMENT_ID("department_id"),

        @JsonProperty("open_department_id")
        OPEN_DEPARTMENT_ID("open_department_id"),

        @JsonProperty("sync_relation")
        SYNC_RELATION("sync_relation"),
        ;

        private String value;

        DepartmentIdType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}