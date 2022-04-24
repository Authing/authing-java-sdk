package dto;

import java.util.List;


public class AccessTokenDto {
    /**
     * Access Token 内容
     */
    private String access_token;
    /**
     * token 签发时间
     */
    private Integer iat;
    /**
     * token 到期时间
     */
    private Integer exp;

    public String getAccess_token() {
        return access_token;
    }
    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public Integer getIat() {
        return iat;
    }
    public void setIat(Integer iat) {
        this.iat = iat;
    }

    public Integer getExp() {
        return exp;
    }
    public void setExp(Integer exp) {
        this.exp = exp;
    }



}