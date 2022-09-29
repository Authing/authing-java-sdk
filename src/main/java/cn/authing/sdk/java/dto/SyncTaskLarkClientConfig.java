package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SyncTaskLarkClientConfig {
    /**
     * 飞书应用 App ID
     */
    @JsonProperty("app_id")
    private String appId;
    /**
     * 飞书应用 App Secret
     */
    @JsonProperty("app_secret")
    private String appSecret;
    /**
     * 飞书事件订阅的 Encrypt Key，可以在飞书开放平台应用详情的「事件订阅」页面获取。如果你需要开启实时同步，此参数必填。
     */
    @JsonProperty("encrypt_key")
    private String encryptKey;
    /**
     * 飞书事件订阅的 Verification Token，可以在飞书开放平台应用详情的「事件订阅」页面获取。如果你需要开启实时同步，此参数必填。
     */
    @JsonProperty("verification_token")
    private String verificationToken;

    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppSecret() {
        return appSecret;
    }
    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public String getEncryptKey() {
        return encryptKey;
    }
    public void setEncryptKey(String encryptKey) {
        this.encryptKey = encryptKey;
    }

    public String getVerificationToken() {
        return verificationToken;
    }
    public void setVerificationToken(String verificationToken) {
        this.verificationToken = verificationToken;
    }



}