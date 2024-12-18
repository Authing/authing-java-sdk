package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UnlinkExtIdpDto {
    /**
     * 外部身份源 ID
     */
    @JsonProperty("extIdpId")
    private String extIdpId;

    public String getExtIdpId() {
        return extIdpId;
    }
    public void setExtIdpId(String extIdpId) {
        this.extIdpId = extIdpId;
    }



}