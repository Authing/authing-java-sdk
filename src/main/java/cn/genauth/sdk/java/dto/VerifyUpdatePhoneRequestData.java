package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class VerifyUpdatePhoneRequestData {
    /**
     * 用于修改当前手机号 token，你需要使用此 token 请求**修改手机号**的接口。
     */
    @JsonProperty("updatePhoneToken")
    private String updatePhoneToken;
    /**
     * 过期时间，单位为秒。
     */
    @JsonProperty("tokenExpiresIn")
    private Integer tokenExpiresIn;

    public String getUpdatePhoneToken() {
        return updatePhoneToken;
    }
    public void setUpdatePhoneToken(String updatePhoneToken) {
        this.updatePhoneToken = updatePhoneToken;
    }

    public Integer getTokenExpiresIn() {
        return tokenExpiresIn;
    }
    public void setTokenExpiresIn(Integer tokenExpiresIn) {
        this.tokenExpiresIn = tokenExpiresIn;
    }



}