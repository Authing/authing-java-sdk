package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;



public class VerifyUpdateEmailRequestData {
    /**
     * 用于修改当前邮箱的 token，你需要使用此 token 调用**修改邮箱**接口。
     */
    @JsonProperty("updateEmailToken")
    private String updateEmailToken;
    /**
     * Token 有效时间，时间为 60 秒。
     */
    @JsonProperty("tokenExpiresIn")
    private Integer tokenExpiresIn;

    public String getUpdateEmailToken() {
        return updateEmailToken;
    }
    public void setUpdateEmailToken(String updateEmailToken) {
        this.updateEmailToken = updateEmailToken;
    }

    public Integer getTokenExpiresIn() {
        return tokenExpiresIn;
    }
    public void setTokenExpiresIn(Integer tokenExpiresIn) {
        this.tokenExpiresIn = tokenExpiresIn;
    }



}