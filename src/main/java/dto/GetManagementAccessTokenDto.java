package dto;

/**
 * @author luojielin
 */
public class GetManagementAccessTokenDto {

    /**
     * 用户池 ID
     */
    private String userPoolId;
    /**
     * 用户池密钥
     */
    private String secret;

    public String getUserPoolId() {
        return userPoolId;
    }

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
}
