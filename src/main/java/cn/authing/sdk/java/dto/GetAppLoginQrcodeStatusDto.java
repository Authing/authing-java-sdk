package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetAppLoginQrcodeStatusDto {
    /**
     * 二维码唯一 ID
     */
    @JsonProperty("qrcodeId")
    private String qrcodeId;

    public String getQrcodeId() {
        return qrcodeId;
    }
    public void setQrcodeId(String qrcodeId) {
        this.qrcodeId = qrcodeId;
    }



}