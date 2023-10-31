package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.AuthenticatorAssertionResponseDto;


public class AuthenticationCredentialDto {
    /**
     * Base64URL 编码的凭证 ID
     */
    @JsonProperty("id")
    private String id;
    /**
     * 原始凭证 ID
     */
    @JsonProperty("rawId")
    private String rawId;
    /**
     * 固定值，'public-key'
     */
    @JsonProperty("response")
    private AuthenticatorAssertionResponseDto response;
    /**
     * 固定值，'public-key'
     */
    @JsonProperty("type")
    private String type;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getRawId() {
        return rawId;
    }
    public void setRawId(String rawId) {
        this.rawId = rawId;
    }

    public AuthenticatorAssertionResponseDto getResponse() {
        return response;
    }
    public void setResponse(AuthenticatorAssertionResponseDto response) {
        this.response = response;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }



}