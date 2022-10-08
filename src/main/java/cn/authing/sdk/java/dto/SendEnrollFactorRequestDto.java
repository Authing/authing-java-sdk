package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.FactorProfile;

public class SendEnrollFactorRequestDto {
    /**
     * MFA 认证要素详细信息
     */
    @JsonProperty("profile")
    private FactorProfile profile;
    /**
     * MFA 认证要素类型，目前共支持短信、邮箱验证码、OTP、人脸四种类型的认证要素。
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
     * MFA 认证要素类型，目前共支持短信、邮箱验证码、OTP、人脸四种类型的认证要素。
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