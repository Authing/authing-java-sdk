package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class VerifyDeleteAccountRequestDataDto {
    /**
     * 用于注销账号的临时 Token，你需要调用**注销账号**接口执行实际注销账号操作。
     */
    @JsonProperty("deleteAccountToken")
    private String deleteAccountToken;
    /**
     * Token 有效时间，默认为 60 秒。
     */
    @JsonProperty("tokenExpiresIn")
    private Integer tokenExpiresIn;

    public String getDeleteAccountToken() {
        return deleteAccountToken;
    }
    public void setDeleteAccountToken(String deleteAccountToken) {
        this.deleteAccountToken = deleteAccountToken;
    }

    public Integer getTokenExpiresIn() {
        return tokenExpiresIn;
    }
    public void setTokenExpiresIn(Integer tokenExpiresIn) {
        this.tokenExpiresIn = tokenExpiresIn;
    }



}