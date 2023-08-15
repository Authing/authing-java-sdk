package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.OrganizationNameI18nDto;

public class CreateOrganizationReqDto {
    /**
     * 元数据信息
     */
    @JsonProperty("metadata")
    private Object metadata;
    /**
     * 组织名称
     */
    @JsonProperty("organizationName")
    private String organizationName;
    /**
     * 组织 code
     */
    @JsonProperty("organizationCode")
    private String organizationCode;
    /**
     * 组织描述信息
     */
    @JsonProperty("description")
    private String description;
    /**
     * 根节点自定义 ID
     */
    @JsonProperty("openDepartmentId")
    private String openDepartmentId;
    /**
     * 多语言设置
     */
    @JsonProperty("i18n")
    private OrganizationNameI18nDto i18n;
    /**
     * 租户 ID
     */
    @JsonProperty("tenantId")
    private String tenantId;
    /**
     * 岗位 id 列表
     */
    @JsonProperty("postIdList")
    private List<String> postIdList;

    public Object getMetadata() {
        return metadata;
    }
    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    public String getOrganizationName() {
        return organizationName;
    }
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationCode() {
        return organizationCode;
    }
    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
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

    public OrganizationNameI18nDto getI18n() {
        return i18n;
    }
    public void setI18n(OrganizationNameI18nDto i18n) {
        this.i18n = i18n;
    }

    public String getTenantId() {
        return tenantId;
    }
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public List<String> getPostIdList() {
        return postIdList;
    }
    public void setPostIdList(List<String> postIdList) {
        this.postIdList = postIdList;
    }



}