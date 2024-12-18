package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateAccessKeyDto {
    /**
     * 密钥是否生效
     */
    @JsonProperty("enable")
    private Boolean enable;
    /**
     * AccessKey ID
     */
    @JsonProperty("accessKeyId")
    private String accessKeyId;

    public Boolean getEnable() {
        return enable;
    }
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public String getAccessKeyId() {
        return accessKeyId;
    }
    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }



}