package cn.genauth.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EnrollFactorDto {
    /**
     * 绑定 MFA 认证要素时，对应认证要素要求的验证信息。
     */
    @JsonProperty("enrollmentData")
    private EnrollFactorEnrollmentDataDto enrollmentData;
    /**
     * 「发起绑定 MFA 认证要素请求」接口返回的 enrollmentToken，此 token 有效时间为一分钟。
     */
    @JsonProperty("enrollmentToken")
    private String enrollmentToken;
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

    public EnrollFactorEnrollmentDataDto getEnrollmentData() {
        return enrollmentData;
    }
    public void setEnrollmentData(EnrollFactorEnrollmentDataDto enrollmentData) {
        this.enrollmentData = enrollmentData;
    }

    public String getEnrollmentToken() {
        return enrollmentToken;
    }
    public void setEnrollmentToken(String enrollmentToken) {
        this.enrollmentToken = enrollmentToken;
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