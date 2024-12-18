package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AuthenticateByWechatMiniProgramCodeDto {
    /**
     * 获取微信开放数据返回的加密数据（encryptedData）
     */
    @JsonProperty("encryptedData")
    private String encryptedData;
    /**
     * 对称解密算法初始向量，由微信返回
     */
    @JsonProperty("iv")
    private String iv;
    /**
     * `wx.login` 接口返回的用户 `code`
     */
    @JsonProperty("code")
    private String code;

    public String getEncryptedData() {
        return encryptedData;
    }
    public void setEncryptedData(String encryptedData) {
        this.encryptedData = encryptedData;
    }

    public String getIv() {
        return iv;
    }
    public void setIv(String iv) {
        this.iv = iv;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }



}