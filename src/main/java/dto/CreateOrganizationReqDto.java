package dto;


public class CreateOrganizationReqDto {
    /**
     * 组织名称
     */
    private String organizationName
    /**
     * 组织 code
     */
    private String organizationCode

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

};