package cn.genauth.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ImportOtpItemDto {
    /**
     * 用户 ID
     */
    @JsonProperty("userId")
    private String userId;
    /**
     * OTP 数据
     */
    @JsonProperty("otp")
    private ImportOtpItemDataDto otp;

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ImportOtpItemDataDto getOtp() {
        return otp;
    }
    public void setOtp(ImportOtpItemDataDto otp) {
        this.otp = otp;
    }



}