package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LdapConfigInfoDto {
    /**
     * ID
     */
    @JsonProperty("id")
    private String id;
    /**
     * LDAP 服务是否开启1 是、2 否
     */
    @JsonProperty("enabled")
    private Integer enabled;
    /**
     * 用户池 ID
     */
    @JsonProperty("userPoolId")
    private String userPoolId;
    /**
     * LDAP host
     */
    @JsonProperty("linkUrl")
    private String linkUrl;
    /**
     * LDAPS host
     */
    @JsonProperty("ldapsLinkUrl")
    private String ldapsLinkUrl;
    /**
     * 是否是私有化的 LDAP Server 1 是、2 否
     */
    @JsonProperty("enablePrivatization")
    private Integer enablePrivatization;
    /**
     * 根据 domain 生成的 bindDN
     */
    @JsonProperty("bindDn")
    private String bindDn;
    /**
     * LDAP 域名，用于生成 baseDN
     */
    @JsonProperty("ldapDomain")
    private String ldapDomain;
    /**
     * 私有化时是否开启 SSL 1 是、2 否
     */
    @JsonProperty("enableSsl")
    private Integer enableSsl;
    /**
     * dc=ibm,dc=com,o=authing
     */
    @JsonProperty("baseDn")
    private String baseDn;
    /**
     * 加密存储的 bindDn 密码(16位)
     */
    @JsonProperty("bindPwd")
    private String bindPwd;
    /**
     * 组织机构可见范围，值为组织节点 ID，用逗号分隔
     */
    @JsonProperty("visibleOrgNodes")
    private Object visibleOrgNodes;
    /**
     * 用户基础字段可见范围
     */
    @JsonProperty("visibleFields")
    private Object visibleFields;
    /**
     * 用户拓展字段映射到的 LDAP 字段，存储为 JSON 字符串
     */
    @JsonProperty("udfMapping")
    private Object udfMapping;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Integer getEnabled() {
        return enabled;
    }
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public String getUserPoolId() {
        return userPoolId;
    }
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    public String getLinkUrl() {
        return linkUrl;
    }
    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public String getLdapsLinkUrl() {
        return ldapsLinkUrl;
    }
    public void setLdapsLinkUrl(String ldapsLinkUrl) {
        this.ldapsLinkUrl = ldapsLinkUrl;
    }

    public Integer getEnablePrivatization() {
        return enablePrivatization;
    }
    public void setEnablePrivatization(Integer enablePrivatization) {
        this.enablePrivatization = enablePrivatization;
    }

    public String getBindDn() {
        return bindDn;
    }
    public void setBindDn(String bindDn) {
        this.bindDn = bindDn;
    }

    public String getLdapDomain() {
        return ldapDomain;
    }
    public void setLdapDomain(String ldapDomain) {
        this.ldapDomain = ldapDomain;
    }

    public Integer getEnableSsl() {
        return enableSsl;
    }
    public void setEnableSsl(Integer enableSsl) {
        this.enableSsl = enableSsl;
    }

    public String getBaseDn() {
        return baseDn;
    }
    public void setBaseDn(String baseDn) {
        this.baseDn = baseDn;
    }

    public String getBindPwd() {
        return bindPwd;
    }
    public void setBindPwd(String bindPwd) {
        this.bindPwd = bindPwd;
    }

    public Object getVisibleOrgNodes() {
        return visibleOrgNodes;
    }
    public void setVisibleOrgNodes(Object visibleOrgNodes) {
        this.visibleOrgNodes = visibleOrgNodes;
    }

    public Object getVisibleFields() {
        return visibleFields;
    }
    public void setVisibleFields(Object visibleFields) {
        this.visibleFields = visibleFields;
    }

    public Object getUdfMapping() {
        return udfMapping;
    }
    public void setUdfMapping(Object udfMapping) {
        this.udfMapping = udfMapping;
    }



}