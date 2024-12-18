package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AlipayAuthInfoDataDto {
    /**
     * 拉起支付宝需要的 AuthInfo
     */
    @JsonProperty("authInfo")
    private String authInfo;

    public String getAuthInfo() {
        return authInfo;
    }
    public void setAuthInfo(String authInfo) {
        this.authInfo = authInfo;
    }



}