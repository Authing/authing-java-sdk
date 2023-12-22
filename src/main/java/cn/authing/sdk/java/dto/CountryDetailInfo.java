package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.LangObject;

public class CountryDetailInfo {
    /**
     * [ISO 3166 国际标准](https://www.iban.com/country-codes)中国家的 Alpha-2 简称
     */
    @JsonProperty("alpha2")
    private String alpha2;
    /**
     * [ISO 3166 国际标准](https://www.iban.com/country-codes)中国家的 Alpha-3 简称
     */
    @JsonProperty("alpha3")
    private String alpha3;
    /**
     * 国家手机区号
     */
    @JsonProperty("phoneCountryCode")
    private String phoneCountryCode;
    /**
     * 国旗图标
     */
    @JsonProperty("flag")
    private String flag;
    /**
     * 名称，多语言结构，目前只支持中文和英文
     */
    @JsonProperty("name")
    private LangObject name;

    public String getAlpha2() {
        return alpha2;
    }
    public void setAlpha2(String alpha2) {
        this.alpha2 = alpha2;
    }

    public String getAlpha3() {
        return alpha3;
    }
    public void setAlpha3(String alpha3) {
        this.alpha3 = alpha3;
    }

    public String getPhoneCountryCode() {
        return phoneCountryCode;
    }
    public void setPhoneCountryCode(String phoneCountryCode) {
        this.phoneCountryCode = phoneCountryCode;
    }

    public String getFlag() {
        return flag;
    }
    public void setFlag(String flag) {
        this.flag = flag;
    }

    public LangObject getName() {
        return name;
    }
    public void setName(LangObject name) {
        this.name = name;
    }



}