package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MfaTokenIntrospectResponse {
    /**
     * Token 是否有效
     */
    @JsonProperty("active")
    private Boolean active;
    /**
     * 签发此 Token 的用户池 ID，当 token 合法时返回。
     */
    @JsonProperty("userPoolId")
    private String userPoolId;
    /**
     * 签发此 Token 的用户 ID，当 token 合法时返回。
     */
    @JsonProperty("userId")
    private String userId;
    /**
     * Token 的到期时间，为单位为秒的时间戳。当 token 合法时返回。
     */
    @JsonProperty("exp")
    private Integer exp;
    /**
     * Token 的签发时间，为单位为秒的时间戳。当 token 合法时返回。
     */
    @JsonProperty("iat")
    private Integer iat;

    public Boolean getActive() {
        return active;
    }
    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getUserPoolId() {
        return userPoolId;
    }
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getExp() {
        return exp;
    }
    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public Integer getIat() {
        return iat;
    }
    public void setIat(Integer iat) {
        this.iat = iat;
    }



}