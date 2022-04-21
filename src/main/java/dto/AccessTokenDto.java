package dto;


public class AccessTokenDto {
    /**
     * Access Token 内容
     */
    private String access_token
    /**
     * token 签发时间
     */
    private Int iat
    /**
     * token 到期时间
     */
    private Int exp

    public String getAccess_token() {
        return access_token;
    }
    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public Int getIat() {
        return iat;
    }
    public void setIat(Int iat) {
        this.iat = iat;
    }

    public Int getExp() {
        return exp;
    }
    public void setExp(Int exp) {
        this.exp = exp;
    }

};