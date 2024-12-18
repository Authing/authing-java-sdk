package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class VerifyRegistrationResultDto {
    /**
     * 验证注册认证器结果
     */
    @JsonProperty("verified")
    private Boolean verified;

    public Boolean getVerified() {
        return verified;
    }
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }



}