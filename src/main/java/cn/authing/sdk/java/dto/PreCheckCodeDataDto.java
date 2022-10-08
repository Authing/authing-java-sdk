package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PreCheckCodeDataDto {
    /**
     * 验证码是否正确且有效
     */
    @JsonProperty("isValid")
    private Boolean isValid;
    /**
     * 如果验证码不正确或者已失效，具体的错误信息
     */
    @JsonProperty("message")
    private String message;

    public Boolean getIsValid() {
        return isValid;
    }
    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }



}