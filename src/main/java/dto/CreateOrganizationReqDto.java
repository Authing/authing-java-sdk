package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class CreateOrganizationReqDto {
    /**
     * 组织名称
     */
    @JsonProperty("getOrganizationName")
    private String organizationName;
    /**
     * 组织 code
     */
    @JsonProperty("getOrganizationCode")
    private String organizationCode;

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



}