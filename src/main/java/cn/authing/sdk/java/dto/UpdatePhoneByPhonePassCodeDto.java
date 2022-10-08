package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdatePhoneByPhonePassCodeDto {
    /**
     * 新手机号码，不带去号。如果是国外手机号，请在 newPhoneCountryCode 参数中指定区号。
     */
    @JsonProperty("newPhoneNumber")
    private String newPhoneNumber;
    /**
     * 验证码
     */
    @JsonProperty("newPhonePassCode")
    private String newPhonePassCode;
    /**
     * 手机区号，中国大陆手机号可不填。Authing 短信服务暂不内置支持国际手机号，你需要在 Authing 控制台配置对应的国际短信服务。完整的手机区号列表可参阅 https://en.wikipedia.org/wiki/List_of_country_calling_codes。
     */
    @JsonProperty("newPhoneCountryCode")
    private String newPhoneCountryCode;
    /**
     * 旧手机号码，不带去号。如果是国外手机号，请在 oldPhoneCountryCode 参数中指定区号。如果用户池开启了修改手机号需要验证之前的手机号，此参数必填。
     */
    @JsonProperty("oldPhoneNumber")
    private String oldPhoneNumber;
    /**
     * 旧手机号的验证码，如果用户池开启了修改手机号需要验证之前的手机号，此参数必填
     */
    @JsonProperty("oldPhonePassCode")
    private String oldPhonePassCode;
    /**
     * 手机区号，中国大陆手机号可不填。Authing 短信服务暂不内置支持国际手机号，你需要在 Authing 控制台配置对应的国际短信服务。完整的手机区号列表可参阅 https://en.wikipedia.org/wiki/List_of_country_calling_codes。
     */
    @JsonProperty("oldPhoneCountryCode")
    private String oldPhoneCountryCode;

    public String getNewPhoneNumber() {
        return newPhoneNumber;
    }
    public void setNewPhoneNumber(String newPhoneNumber) {
        this.newPhoneNumber = newPhoneNumber;
    }

    public String getNewPhonePassCode() {
        return newPhonePassCode;
    }
    public void setNewPhonePassCode(String newPhonePassCode) {
        this.newPhonePassCode = newPhonePassCode;
    }

    public String getNewPhoneCountryCode() {
        return newPhoneCountryCode;
    }
    public void setNewPhoneCountryCode(String newPhoneCountryCode) {
        this.newPhoneCountryCode = newPhoneCountryCode;
    }

    public String getOldPhoneNumber() {
        return oldPhoneNumber;
    }
    public void setOldPhoneNumber(String oldPhoneNumber) {
        this.oldPhoneNumber = oldPhoneNumber;
    }

    public String getOldPhonePassCode() {
        return oldPhonePassCode;
    }
    public void setOldPhonePassCode(String oldPhonePassCode) {
        this.oldPhonePassCode = oldPhonePassCode;
    }

    public String getOldPhoneCountryCode() {
        return oldPhoneCountryCode;
    }
    public void setOldPhoneCountryCode(String oldPhoneCountryCode) {
        this.oldPhoneCountryCode = oldPhoneCountryCode;
    }



}