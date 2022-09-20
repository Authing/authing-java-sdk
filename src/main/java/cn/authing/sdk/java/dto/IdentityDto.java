package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class IdentityDto {
    /**
     * Identity ID
     */
    @JsonProperty("identityId")
    private String identityId;
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
    /**
     * 身份来自的身份源连接 ID 列表
     */
    @JsonProperty("originConnIds")
    private List<String> originConnIds;

    public String getIdentityId() {
        return identityId;
    }
    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

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

    public List<String> getOriginConnIds() {
        return originConnIds;
    }
    public void setOriginConnIds(List<String> originConnIds) {
        this.originConnIds = originConnIds;
    }



}