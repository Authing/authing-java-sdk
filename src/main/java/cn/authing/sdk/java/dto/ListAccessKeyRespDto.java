package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListAccessKeyRespDto {
    /**
     * 用户所拥有的 accessKeyId
     */
    @JsonProperty("accessKeyId")
    private String accessKeyId;
    /**
     * 用户所拥有的 accessKeySecret
     */
    @JsonProperty("accessKeySecret")
    private String accessKeySecret;
    /**
     * 用户 ID
     */
    @JsonProperty("userId")
    private String userId;
    /**
     * 创建时间
     */
    @JsonProperty("createdAt")
    private String createdAt;
    /**
     * accessKeyId 状态
     */
    @JsonProperty("status")
    private String status;
    /**
     * 最后使用时间
     */
    @JsonProperty("lastDate")
    private String lastDate;
    /**
     * accessKeyId 所在用户池
     */
    @JsonProperty("userPoolId")
    private String userPoolId;
    /**
     * 密钥是否启用
     */
    @JsonProperty("enable")
    private Boolean enable;

    public String getAccessKeyId() {
        return accessKeyId;
    }
    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public String getAccessKeySecret() {
        return accessKeySecret;
    }
    public void setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getLastDate() {
        return lastDate;
    }
    public void setLastDate(String lastDate) {
        this.lastDate = lastDate;
    }

    public String getUserPoolId() {
        return userPoolId;
    }
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    public Boolean getEnable() {
        return enable;
    }
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }



}