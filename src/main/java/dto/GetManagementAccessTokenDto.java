package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class GetManagementAccessTokenDto {
    /**
     * AccessKey Secret: 如果是以用户池全局 AK/SK 初始化，为用户池密钥；如果是以协作管理员的 AK/SK 初始化，为协作管理员的 SK。
     */
    @JsonProperty("getAccessKeySecret")
    private String accessKeySecret;
    /**
     * AccessKey ID: 如果是以用户池全局 AK/SK 初始化，为用户池 ID；如果是以协作管理员的 AK/SK 初始化，为协作管理员的 AccessKey ID。
     */
    @JsonProperty("getAccessKeyId")
    private String accessKeyId;

    public String getAccessKeySecret() {
        return accessKeySecret;
    }
    public void setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
    }

    public String getAccessKeyId() {
        return accessKeyId;
    }
    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }



}