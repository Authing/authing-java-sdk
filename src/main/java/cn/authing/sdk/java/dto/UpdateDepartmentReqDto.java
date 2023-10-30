package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.DepartmentI18nDto;

public class UpdateDepartmentReqDto {
    /**
     * 组织 Code（organizationCode）
     */
    @JsonProperty("organizationCode")
    private String organizationCode;
    /**
     * 部门系统 ID（为 Authing 系统自动生成，不可修改）
     */
    @JsonProperty("departmentId")
    private String departmentId;
    /**
     * 部门负责人 ID
     */
    @JsonProperty("leaderUserIds")
    private List<String> leaderUserIds;
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
     * 多语言设置
     */
    @JsonProperty("i18n")
    private DepartmentI18nDto i18n;
    /**
     * 部门状态
     */
    @JsonProperty("status")
    private Boolean status;
    /**
     * 部门名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 此次调用中使用的部门 ID 的类型
     */
    @JsonProperty("departmentIdType")
    private DepartmentIdType departmentIdType;
    /**
     * 父部门 ID
     */
    @JsonProperty("parentDepartmentId")
    private String parentDepartmentId;
    /**
     * 自定义数据，传入的对象中的 key 必须先在用户池定义相关自定义字段
     */
    @JsonProperty("customData")
    private Object customData;
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

    public String getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public List<String> getLeaderUserIds() {
        return leaderUserIds;
    }
    public void setLeaderUserIds(List<String> leaderUserIds) {
        this.leaderUserIds = leaderUserIds;
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

    public DepartmentI18nDto getI18n() {
        return i18n;
    }
    public void setI18n(DepartmentI18nDto i18n) {
        this.i18n = i18n;
    }

    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public DepartmentIdType getDepartmentIdType() {
        return departmentIdType;
    }
    public void setDepartmentIdType(DepartmentIdType departmentIdType) {
        this.departmentIdType = departmentIdType;
    }

    public String getParentDepartmentId() {
        return parentDepartmentId;
    }
    public void setParentDepartmentId(String parentDepartmentId) {
        this.parentDepartmentId = parentDepartmentId;
    }

    public Object getCustomData() {
        return customData;
    }
    public void setCustomData(Object customData) {
        this.customData = customData;
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
     * 此次调用中使用的部门 ID 的类型
     */
    public static enum DepartmentIdType {

        @JsonProperty("department_id")
        DEPARTMENT_ID("department_id"),

        @JsonProperty("open_department_id")
        OPEN_DEPARTMENT_ID("open_department_id"),

        @JsonProperty("sync_relation")
        SYNC_RELATION("sync_relation"),

        @JsonProperty("custom_field")
        CUSTOM_FIELD("custom_field"),

        @JsonProperty("code")
        CODE("code"),
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