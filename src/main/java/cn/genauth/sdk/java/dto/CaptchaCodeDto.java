package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CaptchaCodeDto {
    /**
     * 随机字符串或者时间戳，防止浏览器缓存
     */
    @JsonProperty("r")
    private String r;

    public String getR() {
        return r;
    }
    public void setR(String r) {
        this.r = r;
    }



}