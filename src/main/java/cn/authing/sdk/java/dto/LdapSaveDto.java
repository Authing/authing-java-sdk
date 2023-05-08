package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LdapSaveDto {
    /**
     * LDAP 域名
     */
    @JsonProperty("ldapDomain")
    private String ldapDomain;
    /**
     * LDAP host
     */
    @JsonProperty("linkUrl")
    private String linkUrl;

    public String getLdapDomain() {
        return ldapDomain;
    }
    public void setLdapDomain(String ldapDomain) {
        this.ldapDomain = ldapDomain;
    }

    public String getLinkUrl() {
        return linkUrl;
    }
    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }



}