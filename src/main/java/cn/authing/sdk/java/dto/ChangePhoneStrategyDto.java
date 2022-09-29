package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ChangePhoneStrategyDto {
    /**
     * 修改手机号时是否验证旧手机号
     */
    @JsonProperty("verifyOldPhone")
    private Boolean verifyOldPhone;

    public Boolean getVerifyOldPhone() {
        return verifyOldPhone;
    }
    public void setVerifyOldPhone(Boolean verifyOldPhone) {
        this.verifyOldPhone = verifyOldPhone;
    }



}