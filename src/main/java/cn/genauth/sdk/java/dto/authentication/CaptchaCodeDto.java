package cn.genauth.sdk.java.dto.authentication;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CaptchaCodeDto {
    /**
     * 验证码图片 svg
     */
    @JsonProperty("captchaCodeSvg")
    private String captchaCodeSvg;

    /**
     * 验证码对应 token，需要在登录接口中与用户输入的验证码一起提交
     */
    @JsonProperty("captchaToken")
    private String captchaToken;

    public String getCaptchaCodeSvg() {
        return captchaCodeSvg;
    }

    public void setCaptchaCodeSvg(String captchaCodeSvg) {
        this.captchaCodeSvg = captchaCodeSvg;
    }

    public String getCaptchaToken() {
        return captchaToken;
    }

    public void setCaptchaToken(String captchaToken) {
        this.captchaToken = captchaToken;
    }
}
