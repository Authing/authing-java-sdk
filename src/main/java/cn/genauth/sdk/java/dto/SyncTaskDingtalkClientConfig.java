package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SyncTaskDingtalkClientConfig {
    /**
     * 企业 ID（CorpId）
     */
    @JsonProperty("corpId")
    private String corpId;
    /**
     * 钉钉应用的 AppKey
     */
    @JsonProperty("appKey")
    private String appKey;
    /**
     * 钉钉应用的 AppSecret
     */
    @JsonProperty("appSecret")
    private String appSecret;
    /**
     * 加密 aes_key
     */
    @JsonProperty("aes_key")
    private String aesKey;
    /**
     * 签名 token
     */
    @JsonProperty("token")
    private String token;

    public String getCorpId() {
        return corpId;
    }
    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }

    public String getAppKey() {
        return appKey;
    }
    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getAppSecret() {
        return appSecret;
    }
    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public String getAesKey() {
        return aesKey;
    }
    public void setAesKey(String aesKey) {
        this.aesKey = aesKey;
    }

    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }



}