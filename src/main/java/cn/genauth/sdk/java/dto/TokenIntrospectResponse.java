package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TokenIntrospectResponse {
    /**
     * Token 是否有效
     */
    @JsonProperty("active")
    private Boolean active;
    /**
     * 此 Token 对应的用户 ID，当 token 合法时返回。
     */
    @JsonProperty("sub")
    private String sub;
    /**
     * 签发此 Token 的应用 ID，当 token 合法时返回。
     */
    @JsonProperty("client_id")
    private String clientId;
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
    /**
     * Issuer，当 token 合法时返回。
     */
    @JsonProperty("iss")
    private String iss;
    /**
     * JTI，当 token 合法时返回。
     */
    @JsonProperty("jti")
    private String jti;
    /**
     * 使用逗号分割的 scope 数组，当 token 合法时返回。
     */
    @JsonProperty("scope")
    private String scope;
    /**
     * Token Type，默认为 Bearer，当 token 合法时返回。
     */
    @JsonProperty("token_type")
    private String tokenType;

    public Boolean getActive() {
        return active;
    }
    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getSub() {
        return sub;
    }
    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getClientId() {
        return clientId;
    }
    public void setClientId(String clientId) {
        this.clientId = clientId;
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

    public String getIss() {
        return iss;
    }
    public void setIss(String iss) {
        this.iss = iss;
    }

    public String getJti() {
        return jti;
    }
    public void setJti(String jti) {
        this.jti = jti;
    }

    public String getScope() {
        return scope;
    }
    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getTokenType() {
        return tokenType;
    }
    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }



}