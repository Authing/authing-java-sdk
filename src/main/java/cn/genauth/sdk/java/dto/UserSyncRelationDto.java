package cn.genauth.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserSyncRelationDto {
    /**
     * 外部身份源类型，如：
     * - `wechatwork`: 企业微信
     * - `dingtalk`: 钉钉
     * - `lark`: 飞书
     * - `welink`: Welink
     * - `ldap`: LDAP
     * - `active-directory`: Windows AD
     * - `italent`: 北森
     * - `xiaoshouyi`: 销售易
     * - `maycur`: 每刻报销
     * - `scim`: SCIM
     * - `moka`: Moka HR
     *
     */
    @JsonProperty("provider")
    private String provider;
    /**
     * 在外部身份源中的 ID
     */
    @JsonProperty("userIdInIdp")
    private String userIdInIdp;
    /**
     * 用户在第三方中的身份信息
     */
    @JsonProperty("userInfoInIdp")
    private User userInfoInIdp;

    public String getProvider() {
        return provider;
    }
    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getUserIdInIdp() {
        return userIdInIdp;
    }
    public void setUserIdInIdp(String userIdInIdp) {
        this.userIdInIdp = userIdInIdp;
    }

    public User getUserInfoInIdp() {
        return userInfoInIdp;
    }
    public void setUserInfoInIdp(User userInfoInIdp) {
        this.userInfoInIdp = userInfoInIdp;
    }



}