package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GeneQRCodeDataDto {
    /**
     * 二维码唯一 ID，可以通过此唯一 ID 查询二维码状态。
     */
    @JsonProperty("qrcodeId")
    private String qrcodeId;
    /**
     * 二维码 URL，前端可以基于此链接渲染二维码。
     */
    @JsonProperty("url")
    private String url;
    /**
     * 如果是小程序扫码登录，并且请求参数 autoMergeQrCode 设置为 false，会返回配置的自定义 Logo，前端可以自行将此 Logo 拼接到二维码 URL 上。
     */
    @JsonProperty("customLogoUrl")
    private String customLogoUrl;

    public String getQrcodeId() {
        return qrcodeId;
    }
    public void setQrcodeId(String qrcodeId) {
        this.qrcodeId = qrcodeId;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public String getCustomLogoUrl() {
        return customLogoUrl;
    }
    public void setCustomLogoUrl(String customLogoUrl) {
        this.customLogoUrl = customLogoUrl;
    }



}