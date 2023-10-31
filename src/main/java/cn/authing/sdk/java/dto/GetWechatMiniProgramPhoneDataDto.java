package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;



public class GetWechatMiniProgramPhoneDataDto {
    /**
     * 包含区号的手机号
     */
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    /**
     * 不包含区号的手机号
     */
    @JsonProperty("purePhoneNumber")
    private String purePhoneNumber;
    /**
     * 区号
     */
    @JsonProperty("countryCode")
    private String countryCode;

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPurePhoneNumber() {
        return purePhoneNumber;
    }
    public void setPurePhoneNumber(String purePhoneNumber) {
        this.purePhoneNumber = purePhoneNumber;
    }

    public String getCountryCode() {
        return countryCode;
    }
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }



}