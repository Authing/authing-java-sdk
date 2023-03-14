package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class errorEmailMsg {
    /**
     * 邮箱地址
     */
    @JsonProperty("email")
    private String email;
    /**
     * 错误信息描述
     */
    @JsonProperty("message")
    private String message;

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }



}