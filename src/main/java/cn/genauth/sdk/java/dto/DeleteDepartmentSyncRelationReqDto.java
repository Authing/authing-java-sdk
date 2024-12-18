package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeleteDepartmentSyncRelationReqDto {
    /**
     * 外部身份源类型，如：
     * - `wechatwork`: 企业微信
     * - `dingtalk`: 钉钉
     * - `lark`: 飞书
     * - `welink`: Welink
     * - `ldap`: LDAP
     * - `active-directory`: Windows AD
     * - `italent`: 北森
     * - `xiaoshouyi`: 销售易
     * - `maycur`: 每刻报销
     * - `scim`: SCIM
     * - `moka`: Moka HR
     *
     */
    @JsonProperty("provider")
    private String provider;
    /**
     * 部门 ID，根部门传 `root`
     */
    @JsonProperty("departmentId")
    private String departmentId;
    /**
     * 组织 code
     */
    @JsonProperty("organizationCode")
    private String organizationCode;
    /**
     * 此次调用中使用的部门 ID 的类型
     */
    @JsonProperty("departmentIdType")
    private DepartmentIdType departmentIdType;

    public String getProvider() {
        return provider;
    }
    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getOrganizationCode() {
        return organizationCode;
    }
    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public DepartmentIdType getDepartmentIdType() {
        return departmentIdType;
    }
    public void setDepartmentIdType(DepartmentIdType departmentIdType) {
        this.departmentIdType = departmentIdType;
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