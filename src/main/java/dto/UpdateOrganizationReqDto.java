package dto;

import java.util.List;


public class UpdateOrganizationReqDto {
    /**
     * 组织 code
     */
    private String organizationCode;
    /**
     * 新组织 code
     */
    private String organizationNewCode;
    /**
     * 组织名称
     */
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



};