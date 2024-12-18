package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDepartmentRespDto {
    /**
     * 组织 Code（organizationCode）
     */
    @JsonProperty("organizationCode")
    private String organizationCode;
    /**
     * 部门 ID
     */
    @JsonProperty("departmentId")
    private String departmentId;
    /**
     * 是否为根部门
     */
    @JsonProperty("isRoot")
    private Boolean isRoot;
    /**
     * 部门创建时间
     */
    @JsonProperty("createdAt")
    private String createdAt;
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
     * 自定义部门 ID，用于存储自定义的 ID
     */
    @JsonProperty("openDepartmentId")
    private String openDepartmentId;
    /**
     * 是否是部门 Leader
     */
    @JsonProperty("isLeader")
    private Boolean isLeader;
    /**
     * 部门识别码
     */
    @JsonProperty("code")
    private String code;
    /**
     * 是否是主部门
     */
    @JsonProperty("isMainDepartment")
    private Boolean isMainDepartment;
    /**
     * 加入部门时间
     */
    @JsonProperty("joinedAt")
    private String joinedAt;
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
     * 部门 ID 路径
     */
    @JsonProperty("departmentIdPath")
    private List<String> departmentIdPath;
    /**
     * 部门 Code 路径
     */
    @JsonProperty("departmentCodePath")
    private List<String> departmentCodePath;
    /**
     * 部门名路径
     */
    @JsonProperty("departmentNamePath")
    private List<String> departmentNamePath;

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

    public Boolean getIsRoot() {
        return isRoot;
    }
    public void setIsRoot(Boolean isRoot) {
        this.isRoot = isRoot;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
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

    public String getOpenDepartmentId() {
        return openDepartmentId;
    }
    public void setOpenDepartmentId(String openDepartmentId) {
        this.openDepartmentId = openDepartmentId;
    }

    public Boolean getIsLeader() {
        return isLeader;
    }
    public void setIsLeader(Boolean isLeader) {
        this.isLeader = isLeader;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getIsMainDepartment() {
        return isMainDepartment;
    }
    public void setIsMainDepartment(Boolean isMainDepartment) {
        this.isMainDepartment = isMainDepartment;
    }

    public String getJoinedAt() {
        return joinedAt;
    }
    public void setJoinedAt(String joinedAt) {
        this.joinedAt = joinedAt;
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

    public List<String> getDepartmentIdPath() {
        return departmentIdPath;
    }
    public void setDepartmentIdPath(List<String> departmentIdPath) {
        this.departmentIdPath = departmentIdPath;
    }

    public List<String> getDepartmentCodePath() {
        return departmentCodePath;
    }
    public void setDepartmentCodePath(List<String> departmentCodePath) {
        this.departmentCodePath = departmentCodePath;
    }

    public List<String> getDepartmentNamePath() {
        return departmentNamePath;
    }
    public void setDepartmentNamePath(List<String> departmentNamePath) {
        this.departmentNamePath = departmentNamePath;
    }



}