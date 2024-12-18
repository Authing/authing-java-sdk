package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateEmailByEmailPassCodeDto {
    /**
     * 新邮箱
     */
    @JsonProperty("newEmail")
    private String newEmail;
    /**
     * 新邮箱验证码
     */
    @JsonProperty("newEmailPassCode")
    private String newEmailPassCode;
    /**
     * 旧邮箱，如果用户池开启了修改邮箱需要验证之前的邮箱，此参数必填。
     */
    @JsonProperty("oldEmail")
    private String oldEmail;
    /**
     * 旧邮箱验证码，如果用户池开启了修改邮箱需要验证之前的邮箱，此参数必填。
     */
    @JsonProperty("oldEmailPassCode")
    private String oldEmailPassCode;

    public String getNewEmail() {
        return newEmail;
    }
    public void setNewEmail(String newEmail) {
        this.newEmail = newEmail;
    }

    public String getNewEmailPassCode() {
        return newEmailPassCode;
    }
    public void setNewEmailPassCode(String newEmailPassCode) {
        this.newEmailPassCode = newEmailPassCode;
    }

    public String getOldEmail() {
        return oldEmail;
    }
    public void setOldEmail(String oldEmail) {
        this.oldEmail = oldEmail;
    }

    public String getOldEmailPassCode() {
        return oldEmailPassCode;
    }
    public void setOldEmailPassCode(String oldEmailPassCode) {
        this.oldEmailPassCode = oldEmailPassCode;
    }



}