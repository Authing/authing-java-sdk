package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LinkExtidpDto {
    /**
     * 外部身份源连接唯一标志
     */
    @JsonProperty("ext_idp_conn_identifier")
    private String extIdpConnIdentifier;
    /**
     * Authing 应用 ID
     */
    @JsonProperty("app_id")
    private String appId;
    /**
     * 用户的 id_token
     */
    @JsonProperty("id_token")
    private String idToken;

    public String getExtIdpConnIdentifier() {
        return extIdpConnIdentifier;
    }
    public void setExtIdpConnIdentifier(String extIdpConnIdentifier) {
        this.extIdpConnIdentifier = extIdpConnIdentifier;
    }

    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getIdToken() {
        return idToken;
    }
    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }



}