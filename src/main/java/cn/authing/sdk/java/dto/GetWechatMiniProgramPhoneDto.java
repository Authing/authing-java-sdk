package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;



public class GetWechatMiniProgramPhoneDto {
    /**
     * 微信小程序的外部身份源连接标志符
     */
    @JsonProperty("extIdpConnidentifier")
    private String extIdpConnidentifier;
    /**
     * `open-type=getphonecode` 接口返回的 `code`
     */
    @JsonProperty("code")
    private String code;

    public String getExtIdpConnidentifier() {
        return extIdpConnidentifier;
    }
    public void setExtIdpConnidentifier(String extIdpConnidentifier) {
        this.extIdpConnidentifier = extIdpConnidentifier;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }



}