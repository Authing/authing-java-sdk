package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AuthenticatorAssertionResponseDto {
    /**
     * 认证器信息，包含认证状态、签名计数等
     */
    @JsonProperty("authenticatorData")
    private String authenticatorData;
    /**
     * 客户端数据，包含 origin（即凭证请求来源）、挑战码等信息
     */
    @JsonProperty("clientDataJSON")
    private String clientDataJSON;
    /**
     * 认证器签名
     */
    @JsonProperty("signature")
    private String signature;
    /**
     * 创建凭证时的用户 ID
     */
    @JsonProperty("userHandle")
    private String userHandle;

    public String getAuthenticatorData() {
        return authenticatorData;
    }
    public void setAuthenticatorData(String authenticatorData) {
        this.authenticatorData = authenticatorData;
    }

    public String getClientDataJSON() {
        return clientDataJSON;
    }
    public void setClientDataJSON(String clientDataJSON) {
        this.clientDataJSON = clientDataJSON;
    }

    public String getSignature() {
        return signature;
    }
    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getUserHandle() {
        return userHandle;
    }
    public void setUserHandle(String userHandle) {
        this.userHandle = userHandle;
    }



}