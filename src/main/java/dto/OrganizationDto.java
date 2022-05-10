package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class OrganizationDto {
    /**
     * 组织 code
     */
    @JsonProperty("getOrganizationCode")
    private String organizationCode;
    /**
     * 组织名称
     */
    @JsonProperty("getOrganizationName")
    private String organizationName;
    /**
     * 根节点 ID
     */
    @JsonProperty("getDepartmentId")
    private String departmentId;
    /**
     * 是否包含子节点
     */
    @JsonProperty("getHasChildren")
    private Boolean hasChildren;
    /**
     * 部门负责人 ID
     */
    @JsonProperty("getLeaderUserId")
    private String leaderUserId;
    /**
     * 部门人数
     */
    @JsonProperty("getMembersCount")
    private Integer membersCount;

    public String getOrganizationCode() {
        return organizationCode;
    }
    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getOrganizationName() {
        return organizationName;
    }
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public Boolean getHasChildren() {
        return hasChildren;
    }
    public void setHasChildren(Boolean hasChildren) {
        this.hasChildren = hasChildren;
    }

    public String getLeaderUserId() {
        return leaderUserId;
    }
    public void setLeaderUserId(String leaderUserId) {
        this.leaderUserId = leaderUserId;
    }

    public Integer getMembersCount() {
        return membersCount;
    }
    public void setMembersCount(Integer membersCount) {
        this.membersCount = membersCount;
    }



}