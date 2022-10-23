package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SyncTaskWechatworkClientConfig {
    /**
     * 企业 ID（CorpId）
     */
    @JsonProperty("corpID")
    private String corpID;
    /**
     * 企业微信通讯录密钥 Secret
     */
    @JsonProperty("secret")
    private String secret;
    /**
     * 通讯录事件同步 Token
     */
    @JsonProperty("token")
    private String token;
    /**
     * 通讯录事件同步 EncodingAESKey
     */
    @JsonProperty("encodingAESKey")
    private String encodingAESKey;
    /**
     * 代理地址
     */
    @JsonProperty("agentUrl")
    private String agentUrl;

    public String getCorpID() {
        return corpID;
    }
    public void setCorpID(String corpID) {
        this.corpID = corpID;
    }

    public String getSecret() {
        return secret;
    }
    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }

    public String getEncodingAESKey() {
        return encodingAESKey;
    }
    public void setEncodingAESKey(String encodingAESKey) {
        this.encodingAESKey = encodingAESKey;
    }

    public String getAgentUrl() {
        return agentUrl;
    }
    public void setAgentUrl(String agentUrl) {
        this.agentUrl = agentUrl;
    }



}