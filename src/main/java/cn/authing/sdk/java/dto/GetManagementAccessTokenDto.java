package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetManagementAccessTokenDto {
    /**
     * AccessKey ID: 如果是以用户池全局 AK/SK 初始化，为用户池 ID;如果是以协作管理员的 AK/SK 初始化，为协作管理员的 AccessKey ID。
     */
    @JsonProperty("accessKeyId")
    private String accessKeyId;
    /**
     * AccessKey Secret: 如果是以用户池全局 AK/SK 初始化，为用户池密钥；如果是以协作管理员的 AK/SK 初始化，为协作管理员的 SK。
     */
    @JsonProperty("accessKeySecret")
    private String accessKeySecret;

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



}