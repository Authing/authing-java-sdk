package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;



public class DecryptWechatMiniProgramDataDto {
    /**
     * `wx.login` 接口返回的用户 `code`
     */
    @JsonProperty("code")
    private String code;
    /**
     * 对称解密算法初始向量，由微信返回
     */
    @JsonProperty("iv")
    private String iv;
    /**
     * 获取微信开放数据返回的加密数据（encryptedData）
     */
    @JsonProperty("encryptedData")
    private String encryptedData;
    /**
     * 微信小程序的外部身份源连接标志符
     */
    @JsonProperty("extIdpConnidentifier")
    private String extIdpConnidentifier;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getIv() {
        return iv;
    }
    public void setIv(String iv) {
        this.iv = iv;
    }

    public String getEncryptedData() {
        return encryptedData;
    }
    public void setEncryptedData(String encryptedData) {
        this.encryptedData = encryptedData;
    }

    public String getExtIdpConnidentifier() {
        return extIdpConnidentifier;
    }
    public void setExtIdpConnidentifier(String extIdpConnidentifier) {
        this.extIdpConnidentifier = extIdpConnidentifier;
    }



}