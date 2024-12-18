package cn.genauth.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SendEnrollFactorRequestDto {
    /**
     * MFA 认证要素详细信息
     */
    @JsonProperty("profile")
    private FactorProfile profile;
    /**
     * MFA 认证要素类型：
     * - `OTP`: OTP
     * - `SMS`: 短信
     * - `EMAIL`: 邮件
     * - `FACE`: 人脸
     *
     */
    @JsonProperty("factorType")
    private FactorType factorType;

    public FactorProfile getProfile() {
        return profile;
    }
    public void setProfile(FactorProfile profile) {
        this.profile = profile;
    }

    public FactorType getFactorType() {
        return factorType;
    }
    public void setFactorType(FactorType factorType) {
        this.factorType = factorType;
    }


    /**
     * MFA 认证要素类型：
     * - `OTP`: OTP
     * - `SMS`: 短信
     * - `EMAIL`: 邮件
     * - `FACE`: 人脸
     *
     */
    public static enum FactorType {

        @JsonProperty("OTP")
        OTP("OTP"),

        @JsonProperty("SMS")
        SMS("SMS"),

        @JsonProperty("EMAIL")
        EMAIL("EMAIL"),

        @JsonProperty("FACE")
        FACE("FACE"),
        ;

        private String value;

        FactorType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}