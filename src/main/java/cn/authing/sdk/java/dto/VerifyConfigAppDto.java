package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class VerifyConfigAppDto {
    /**
     * 搜索关键字
     */
    @JsonProperty("keywords")
    private String keywords;

    public String getKeywords() {
        return keywords;
    }
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }



}