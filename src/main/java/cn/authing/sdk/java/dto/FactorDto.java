package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class FactorDto {
    /**
     * MFA 认证要素ID
     */
    @JsonProperty("factorId")
    private String factorId;
    /**
     * MFA 认证要素类型
     */
    @JsonProperty("factorType")
    private FactorType factorType;
    /**
     * MFA 认证要素信息
     */
    @JsonProperty("profile")
    private Object profile;

    public String getFactorId() {
        return factorId;
    }
    public void setFactorId(String factorId) {
        this.factorId = factorId;
    }

    public FactorType getFactorType() {
        return factorType;
    }
    public void setFactorType(FactorType factorType) {
        this.factorType = factorType;
    }

    public Object getProfile() {
        return profile;
    }
    public void setProfile(Object profile) {
        this.profile = profile;
    }


    /**
     * MFA 认证要素类型
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