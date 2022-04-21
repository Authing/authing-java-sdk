package model;

public class ManagementClientOptions {

    /** 用户池 ID **/
    private String userPoolId;

    /** 用户池/应用密钥 **/
    private String secret;

    /** Authing 服务器地址 */
    private String host = "https://core.authing.cn";

    public ManagementClientOptions() {}

    public ManagementClientOptions(String userPoolId, String secret) {
        this.userPoolId = userPoolId;
        this.secret = secret;
    }

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

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

}
