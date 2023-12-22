package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SendEnrollFactorRequestOtpDataDto {
    /**
     * OTP Auth Uri
     */
    @JsonProperty("qrCodeUri")
    private String qrCodeUri;
    /**
     * Base64 编码的 OTP 二维码，前端可以用此渲染二维码。
     */
    @JsonProperty("qrCodeDataUrl")
    private String qrCodeDataUrl;
    /**
     * OTP Recovery Code
     */
    @JsonProperty("recoveryCode")
    private String recoveryCode;

    public String getQrCodeUri() {
        return qrCodeUri;
    }
    public void setQrCodeUri(String qrCodeUri) {
        this.qrCodeUri = qrCodeUri;
    }

    public String getQrCodeDataUrl() {
        return qrCodeDataUrl;
    }
    public void setQrCodeDataUrl(String qrCodeDataUrl) {
        this.qrCodeDataUrl = qrCodeDataUrl;
    }

    public String getRecoveryCode() {
        return recoveryCode;
    }
    public void setRecoveryCode(String recoveryCode) {
        this.recoveryCode = recoveryCode;
    }



}