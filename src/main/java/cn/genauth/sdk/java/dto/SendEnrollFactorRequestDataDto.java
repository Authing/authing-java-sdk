package cn.genauth.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SendEnrollFactorRequestDataDto {
    /**
     * 临时凭证 enrollmentToken，有效时间为一分钟。在进行「绑定 MFA 认证要素」时，需要带上此参数。
     */
    @JsonProperty("enrollmentToken")
    private String enrollmentToken;
    /**
     * 发起绑定 OTP 类型认证要素时，接口会返回此数据。
     */
    @JsonProperty("otpData")
    private SendEnrollFactorRequestOtpDataDto otpData;

    public String getEnrollmentToken() {
        return enrollmentToken;
    }
    public void setEnrollmentToken(String enrollmentToken) {
        this.enrollmentToken = enrollmentToken;
    }

    public SendEnrollFactorRequestOtpDataDto getOtpData() {
        return otpData;
    }
    public void setOtpData(SendEnrollFactorRequestOtpDataDto otpData) {
        this.otpData = otpData;
    }



}