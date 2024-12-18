package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LinkIdentityDto {
    /**
     * 必传，用户在该外部身份源的唯一标识，需要从外部身份源的认证返回值中获取。
     */
    @JsonProperty("userIdInIdp")
    private String userIdInIdp;
    /**
     * 必传，进行绑定操作的 Authing 用户 ID。
     */
    @JsonProperty("userId")
    private String userId;
    /**
     * 必传，身份源 ID，用于指定该身份属于哪个身份源。
     */
    @JsonProperty("extIdpId")
    private String extIdpId;
    /**
     * 非必传，表示该条身份的具体类型，可从用户身份信息的 type 字段中获取。如果不传，默认为 generic
     */
    @JsonProperty("type")
    private String type;
    /**
     * 已废弃，可任意传入，未来将移除该字段。
     */
    @JsonProperty("isSocial")
    private Boolean isSocial;

    public String getUserIdInIdp() {
        return userIdInIdp;
    }
    public void setUserIdInIdp(String userIdInIdp) {
        this.userIdInIdp = userIdInIdp;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getExtIdpId() {
        return extIdpId;
    }
    public void setExtIdpId(String extIdpId) {
        this.extIdpId = extIdpId;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public Boolean getIsSocial() {
        return isSocial;
    }
    public void setIsSocial(Boolean isSocial) {
        this.isSocial = isSocial;
    }



}