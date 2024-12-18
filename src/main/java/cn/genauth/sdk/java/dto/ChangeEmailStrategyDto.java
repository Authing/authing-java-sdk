package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ChangeEmailStrategyDto {
    /**
     * 修改邮箱时是否验证旧邮箱
     */
    @JsonProperty("verifyOldEmail")
    private Boolean verifyOldEmail;

    public Boolean getVerifyOldEmail() {
        return verifyOldEmail;
    }
    public void setVerifyOldEmail(Boolean verifyOldEmail) {
        this.verifyOldEmail = verifyOldEmail;
    }



}