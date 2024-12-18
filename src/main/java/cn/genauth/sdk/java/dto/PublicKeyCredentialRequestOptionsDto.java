package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PublicKeyCredentialRequestOptionsDto {
    /**
     * 挑战码, base64Url 编码
     */
    @JsonProperty("challenge")
    private String challenge;
    /**
     * 认证器认证参数
     */
    @JsonProperty("allowCredentials")
    private List<PublicKeyCredentialDescriptorDto> allowCredentials;
    /**
     * 信赖方 ID，和注册认证器时一致
     */
    @JsonProperty("rpId")
    private String rpId;
    /**
     * 超时时间(毫秒值)
     */
    @JsonProperty("timeout")
    private Integer timeout;

    public String getChallenge() {
        return challenge;
    }
    public void setChallenge(String challenge) {
        this.challenge = challenge;
    }

    public List<PublicKeyCredentialDescriptorDto> getAllowCredentials() {
        return allowCredentials;
    }
    public void setAllowCredentials(List<PublicKeyCredentialDescriptorDto> allowCredentials) {
        this.allowCredentials = allowCredentials;
    }

    public String getRpId() {
        return rpId;
    }
    public void setRpId(String rpId) {
        this.rpId = rpId;
    }

    public Integer getTimeout() {
        return timeout;
    }
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }



}