package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AuthenticatorAttestationResponseDto {
    /**
     * CBOR 编码的认证器数据，包含凭证公钥、凭证 ID、签名、签名计数等信息
     */
    @JsonProperty("attestationObject")
    private String attestationObject;
    /**
     * 客户端数据，包含 origin（即凭证请求来源）、挑战等信息
     */
    @JsonProperty("clientDataJSON")
    private String clientDataJSON;

    public String getAttestationObject() {
        return attestationObject;
    }
    public void setAttestationObject(String attestationObject) {
        this.attestationObject = attestationObject;
    }

    public String getClientDataJSON() {
        return clientDataJSON;
    }
    public void setClientDataJSON(String clientDataJSON) {
        this.clientDataJSON = clientDataJSON;
    }



}