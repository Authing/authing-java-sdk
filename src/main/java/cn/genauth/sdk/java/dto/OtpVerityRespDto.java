package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OtpVerityRespDto {
    /**
     * 用户 OTP 校验是否成功
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