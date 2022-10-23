package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class FactorToEnrollDto {
    /**
     * MFA Factor 类型
     */
    @JsonProperty("factorType")
    private FactorType factorType;

    public FactorType getFactorType() {
        return factorType;
    }
    public void setFactorType(FactorType factorType) {
        this.factorType = factorType;
    }


    /**
     * MFA Factor 类型
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