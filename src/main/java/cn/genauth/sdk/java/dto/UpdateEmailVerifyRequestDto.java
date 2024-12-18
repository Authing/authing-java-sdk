package cn.genauth.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateEmailVerifyRequestDto {
    /**
     * 使用邮箱验证码方式验证的数据
     */
    @JsonProperty("emailPasscodePayload")
    private UpdateEmailByEmailPassCodeDto emailPasscodePayload;
    /**
     * 修改当前邮箱使用的验证手段：
     * - `EMAIL_PASSCODE`: 通过邮箱验证码进行验证，当前只支持这种验证方式。
     *
     */
    @JsonProperty("verifyMethod")
    private VerifyMethod verifyMethod;

    public UpdateEmailByEmailPassCodeDto getEmailPasscodePayload() {
        return emailPasscodePayload;
    }
    public void setEmailPasscodePayload(UpdateEmailByEmailPassCodeDto emailPasscodePayload) {
        this.emailPasscodePayload = emailPasscodePayload;
    }

    public VerifyMethod getVerifyMethod() {
        return verifyMethod;
    }
    public void setVerifyMethod(VerifyMethod verifyMethod) {
        this.verifyMethod = verifyMethod;
    }


    /**
     * 修改当前邮箱使用的验证手段：
     * - `EMAIL_PASSCODE`: 通过邮箱验证码进行验证，当前只支持这种验证方式。
     *
     */
    public static enum VerifyMethod {

        @JsonProperty("EMAIL_PASSCODE")
        EMAIL_PASSCODE("EMAIL_PASSCODE"),
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