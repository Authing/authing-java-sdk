package dto;

import java.util.List;


public class PrincipalAuthenticationInfoDto {
    /**
     * 是否进行认证
     */
    private Boolean authenticated;
    /**
     * 用户 ID
     */
    private String principalType;
    /**
     * 认证主体证件号码
     */
    private String principalCode;
    /**
     * 认证主体名称
     */
    private String principalName;
    /**
     * 认证时间，标准时间字符串
     */
    private String authenticatedAt;

    public Boolean getAuthenticated() {
        return authenticated;
    }
    public void setAuthenticated(Boolean authenticated) {
        this.authenticated = authenticated;
    }

    public String getPrincipalType() {
        return principalType;
    }
    public void setPrincipalType(String principalType) {
        this.principalType = principalType;
    }

    public String getPrincipalCode() {
        return principalCode;
    }
    public void setPrincipalCode(String principalCode) {
        this.principalCode = principalCode;
    }

    public String getPrincipalName() {
        return principalName;
    }
    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    public String getAuthenticatedAt() {
        return authenticatedAt;
    }
    public void setAuthenticatedAt(String authenticatedAt) {
        this.authenticatedAt = authenticatedAt;
    }



}