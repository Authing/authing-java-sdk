package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateOrganizationReqDto {
    /**
     * 组织 code
     */
    @JsonProperty("organizationCode")
    private String organizationCode;
    /**
     * 新组织 code
     */
    @JsonProperty("organizationNewCode")
    private String organizationNewCode;
    /**
     * 组织名称
     */
    @JsonProperty("organizationName")
    private String organizationName;

    public String getOrganizationCode() {
        return organizationCode;
    }
    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getOrganizationNewCode() {
        return organizationNewCode;
    }
    public void setOrganizationNewCode(String organizationNewCode) {
        this.organizationNewCode = organizationNewCode;
    }

    public String getOrganizationName() {
        return organizationName;
    }
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }



}