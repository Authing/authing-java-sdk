package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class DeleteOrganizationReqDto {
    /**
     * 组织 code
     */
    @JsonProperty("getOrganizationCode")
    private String organizationCode;

    public String getOrganizationCode() {
        return organizationCode;
    }
    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }



}