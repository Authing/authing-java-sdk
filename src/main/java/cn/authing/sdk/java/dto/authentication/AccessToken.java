package cn.authing.sdk.java.dto.authentication;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccessToken {
    /**
     * 令牌标识符声明
     */
    @JsonProperty("jti")
    private String jti;

    /**
     * subject 的缩写，唯一标识，一般为用户 ID
     */
    @JsonProperty("sub")
    private String sub;

    /**
     * “Issued At”表示针对此令牌进行身份验证的时间。
     */
    @JsonProperty("iat")
    private String iat;

    /**
     * “exp”（过期时间）声明指定只能在哪个时间（含）之前接受 JWT 的处理。
     */
    @JsonProperty("exp")
    private String exp;

    /**
     * 应用侧向 Authing 请求的权限
     */
    @JsonProperty("scope")
    private String scope;

    /**
     * 标识构造并返回令牌的安全令牌服务 (STS)
     */
    @JsonProperty("iss")
    private String iss;

    /**
     * 标识令牌的目标接收方
     */
    @JsonProperty("aud")
    private String aud;

    public String getJti() {
        return jti;
    }

    public void setJti(String jti) {
        this.jti = jti;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getIat() {
        return iat;
    }

    public void setIat(String iat) {
        this.iat = iat;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getIss() {
        return iss;
    }

    public void setIss(String iss) {
        this.iss = iss;
    }

    public String getAud() {
        return aud;
    }

    public void setAud(String aud) {
        this.aud = aud;
    }
}