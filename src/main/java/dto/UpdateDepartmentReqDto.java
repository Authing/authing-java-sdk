package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class UpdateDepartmentReqDto {
    /**
     * 部门名称
     */
    @JsonProperty("getName")
    private String name;
    /**
     * 组织 code
     */
    @JsonProperty("getOrganizationCode")
    private String organizationCode;
    /**
     * 父部门 id
     */
    @JsonProperty("getParentDepartmentId")
    private String parentDepartmentId;
    /**
     * 部门 ID
     */
    @JsonProperty("getDepartmentId")
    private String departmentId;
    /**
     * 部门识别码
     */
    @JsonProperty("getCode")
    private String code;
    /**
     * 部门负责人 ID
     */
    @JsonProperty("getLeaderUserId")
    private String leaderUserId;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getOrganizationCode() {
        return organizationCode;
    }
    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getParentDepartmentId() {
        return parentDepartmentId;
    }
    public void setParentDepartmentId(String parentDepartmentId) {
        this.parentDepartmentId = parentDepartmentId;
    }

    public String getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getLeaderUserId() {
        return leaderUserId;
    }
    public void setLeaderUserId(String leaderUserId) {
        this.leaderUserId = leaderUserId;
    }



}