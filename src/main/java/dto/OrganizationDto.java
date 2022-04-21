package dto;


public class OrganizationDto {
    /**
     * 组织 code
     */
    private String organizationCode
    /**
     * 组织名称
     */
    private String organizationName
    /**
     * 部门负责人 ID
     */
    private String leaderUserId
    /**
     * 部门人数
     */
    private Int membersCount

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

    public String getLeaderUserId() {
        return leaderUserId;
    }
    public void setLeaderUserId(String leaderUserId) {
        this.leaderUserId = leaderUserId;
    }

    public Int getMembersCount() {
        return membersCount;
    }
    public void setMembersCount(Int membersCount) {
        this.membersCount = membersCount;
    }

};