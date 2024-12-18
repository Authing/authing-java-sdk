package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PublicKeyCredentialCreationOptionsDto {
    /**
     * 挑战码, base64Url 编码
     */
    @JsonProperty("challenge")
    private String challenge;
    /**
     * 用于标识要排除的凭证，可以避免同一个用户多次注册同一个认证器
     */
    @JsonProperty("excludeCredentials")
    private List<PublicKeyCredentialDescriptorDto> excludeCredentials;
    /**
     * 算法列表，指明信赖方接受哪些签名算法
     */
    @JsonProperty("pubKeyCredParams")
    private List<PublicKeyCredentialParametersDto> pubKeyCredParams;
    /**
     * 信赖方信息
     */
    @JsonProperty("rp")
    private PublicKeyCredentialRpEntityDto rp;
    /**
     * 超时时间(毫秒值)
     */
    @JsonProperty("timeout")
    private Integer timeout;
    /**
     * 用户信息
     */
    @JsonProperty("user")
    private PublicKeyCredentialUserEntityDto user;

    public String getChallenge() {
        return challenge;
    }
    public void setChallenge(String challenge) {
        this.challenge = challenge;
    }

    public List<PublicKeyCredentialDescriptorDto> getExcludeCredentials() {
        return excludeCredentials;
    }
    public void setExcludeCredentials(List<PublicKeyCredentialDescriptorDto> excludeCredentials) {
        this.excludeCredentials = excludeCredentials;
    }

    public List<PublicKeyCredentialParametersDto> getPubKeyCredParams() {
        return pubKeyCredParams;
    }
    public void setPubKeyCredParams(List<PublicKeyCredentialParametersDto> pubKeyCredParams) {
        this.pubKeyCredParams = pubKeyCredParams;
    }

    public PublicKeyCredentialRpEntityDto getRp() {
        return rp;
    }
    public void setRp(PublicKeyCredentialRpEntityDto rp) {
        this.rp = rp;
    }

    public Integer getTimeout() {
        return timeout;
    }
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public PublicKeyCredentialUserEntityDto getUser() {
        return user;
    }
    public void setUser(PublicKeyCredentialUserEntityDto user) {
        this.user = user;
    }



}