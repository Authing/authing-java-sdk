package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.PreCheckEmailCodeDto;
import cn.authing.sdk.java.dto.PreCheckSmsCodeDto;


public class PreCheckCodeDto {
    /**
     * 验证码类型
     */
    @JsonProperty("codeType")
    private CodeType codeType;
    /**
     * 短信验证码检验参数
     */
    @JsonProperty("smsCodePayload")
    private PreCheckSmsCodeDto smsCodePayload;
    /**
     * 邮箱验证码检验参数
     */
    @JsonProperty("emailCodePayload")
    private PreCheckEmailCodeDto emailCodePayload;

    public CodeType getCodeType() {
        return codeType;
    }
    public void setCodeType(CodeType codeType) {
        this.codeType = codeType;
    }

    public PreCheckSmsCodeDto getSmsCodePayload() {
        return smsCodePayload;
    }
    public void setSmsCodePayload(PreCheckSmsCodeDto smsCodePayload) {
        this.smsCodePayload = smsCodePayload;
    }

    public PreCheckEmailCodeDto getEmailCodePayload() {
        return emailCodePayload;
    }
    public void setEmailCodePayload(PreCheckEmailCodeDto emailCodePayload) {
        this.emailCodePayload = emailCodePayload;
    }


    /**
     * 验证码类型
     */
    public static enum CodeType {

        @JsonProperty("SMS")
        SMS("SMS"),

        @JsonProperty("EMAIL")
        EMAIL("EMAIL"),
        ;

        private String value;

        CodeType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}