package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateIdentityDto {
    /**
     * 外部身份源的 ID
     */
    @JsonProperty("extIdpId")
    private String extIdpId;
    /**
     * 外部身份源类型，如 lark, wechat
     */
    @JsonProperty("provider")
    private String provider;
    /**
     * Identity 类型，如 unionid, openid, primary
     */
    @JsonProperty("type")
    private String type;
    /**
     * 在外部身份源的 id
     */
    @JsonProperty("userIdInIdp")
    private String userIdInIdp;

    public String getExtIdpId() {
        return extIdpId;
    }
    public void setExtIdpId(String extIdpId) {
        this.extIdpId = extIdpId;
    }

    public String getProvider() {
        return provider;
    }
    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getUserIdInIdp() {
        return userIdInIdp;
    }
    public void setUserIdInIdp(String userIdInIdp) {
        this.userIdInIdp = userIdInIdp;
    }



}