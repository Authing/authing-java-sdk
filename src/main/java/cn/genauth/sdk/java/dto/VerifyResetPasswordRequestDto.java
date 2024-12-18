package cn.genauth.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VerifyResetPasswordRequestDto {
    /**
     * 忘记密码请求使用的验证手段：
     * - `EMAIL_PASSCODE`: 通过邮箱验证码进行验证
     * - `PHONE_PASSCODE`: 通过手机号验证码进行验证
     *
     */
    @JsonProperty("verifyMethod")
    private VerifyMethod verifyMethod;
    /**
     * 使用手机号验证码验证的数据
     */
    @JsonProperty("phonePassCodePayload")
    private ResetPasswordByPhonePassCodeDto phonePassCodePayload;
    /**
     * 使用邮箱验证码验证的数据
     */
    @JsonProperty("emailPassCodePayload")
    private ResetPasswordByEmailPassCodeDto emailPassCodePayload;

    public VerifyMethod getVerifyMethod() {
        return verifyMethod;
    }
    public void setVerifyMethod(VerifyMethod verifyMethod) {
        this.verifyMethod = verifyMethod;
    }

    public ResetPasswordByPhonePassCodeDto getPhonePassCodePayload() {
        return phonePassCodePayload;
    }
    public void setPhonePassCodePayload(ResetPasswordByPhonePassCodeDto phonePassCodePayload) {
        this.phonePassCodePayload = phonePassCodePayload;
    }

    public ResetPasswordByEmailPassCodeDto getEmailPassCodePayload() {
        return emailPassCodePayload;
    }
    public void setEmailPassCodePayload(ResetPasswordByEmailPassCodeDto emailPassCodePayload) {
        this.emailPassCodePayload = emailPassCodePayload;
    }


    /**
     * 忘记密码请求使用的验证手段：
     * - `EMAIL_PASSCODE`: 通过邮箱验证码进行验证
     * - `PHONE_PASSCODE`: 通过手机号验证码进行验证
     *
     */
    public static enum VerifyMethod {

        @JsonProperty("EMAIL_PASSCODE")
        EMAIL_PASSCODE("EMAIL_PASSCODE"),

        @JsonProperty("PHONE_PASSCODE")
        PHONE_PASSCODE("PHONE_PASSCODE"),
        ;

        private String value;

        VerifyMethod(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}