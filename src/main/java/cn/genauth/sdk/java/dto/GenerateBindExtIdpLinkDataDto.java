package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GenerateBindExtIdpLinkDataDto {
    /**
     * 用户绑定外部身份源的链接
     */
    @JsonProperty("url")
    private String url;

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }



}