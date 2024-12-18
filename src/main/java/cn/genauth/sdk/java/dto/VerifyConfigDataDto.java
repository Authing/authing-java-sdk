package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class VerifyConfigDataDto {
    /**
     * 主键 ID
     */
    @JsonProperty("id")
    private String id;
    /**
     * 应用 ID
     */
    @JsonProperty("appId")
    private String appId;
    /**
     * 是否开启接管 Windows 登录
     */
    @JsonProperty("isWinLogin")
    private Boolean isWinLogin;
    /**
     * 是否开启接管 Windows 更改密码
     */
    @JsonProperty("isWinChangePwd")
    private Boolean isWinChangePwd;
    /**
     * 密钥
     */
    @JsonProperty("appSecret")
    private String appSecret;
    /**
     * 固定值，public-key
     */
    @JsonProperty("publicKey")
    private String publicKey;
    /**
     * 公钥地址
     */
    @JsonProperty("authAddress")
    private String authAddress;
    /**
     * 应用图片
     */
    @JsonProperty("logo")
    private String logo;
    /**
     * 应用图片
     */
    @JsonProperty("name")
    private String name;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }

    public Boolean getIsWinLogin() {
        return isWinLogin;
    }
    public void setIsWinLogin(Boolean isWinLogin) {
        this.isWinLogin = isWinLogin;
    }

    public Boolean getIsWinChangePwd() {
        return isWinChangePwd;
    }
    public void setIsWinChangePwd(Boolean isWinChangePwd) {
        this.isWinChangePwd = isWinChangePwd;
    }

    public String getAppSecret() {
        return appSecret;
    }
    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public String getPublicKey() {
        return publicKey;
    }
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getAuthAddress() {
        return authAddress;
    }
    public void setAuthAddress(String authAddress) {
        this.authAddress = authAddress;
    }

    public String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }



}