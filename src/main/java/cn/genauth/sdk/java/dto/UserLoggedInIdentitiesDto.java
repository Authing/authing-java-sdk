package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UserLoggedInIdentitiesDto {
    /**
     * Identity ID
     */
    @JsonProperty("identityId")
    private String identityId;
    /**
     * 身份源名称
     */
    @JsonProperty("idpName")
    private String idpName;
    /**
     * Identity provider name
     */
    @JsonProperty("idpNameEn")
    private String idpNameEn;
    /**
     * 身份源 logo
     */
    @JsonProperty("idpLogo")
    private String idpLogo;
    /**
     * 身份源 id
     */
    @JsonProperty("idpId")
    private String idpId;

    public String getIdentityId() {
        return identityId;
    }
    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    public String getIdpName() {
        return idpName;
    }
    public void setIdpName(String idpName) {
        this.idpName = idpName;
    }

    public String getIdpNameEn() {
        return idpNameEn;
    }
    public void setIdpNameEn(String idpNameEn) {
        this.idpNameEn = idpNameEn;
    }

    public String getIdpLogo() {
        return idpLogo;
    }
    public void setIdpLogo(String idpLogo) {
        this.idpLogo = idpLogo;
    }

    public String getIdpId() {
        return idpId;
    }
    public void setIdpId(String idpId) {
        this.idpId = idpId;
    }



}