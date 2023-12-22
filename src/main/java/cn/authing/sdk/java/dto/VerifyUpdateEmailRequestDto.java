package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.UpdateEmailByEmailPassCodeDto;

public class VerifyUpdateEmailRequestDto {
    /**
     * 使用邮箱验证码方式验证的数据
     */
    @JsonProperty("emailPassCodePayload")
    private UpdateEmailByEmailPassCodeDto emailPassCodePayload;
    /**
     * 修改当前邮箱使用的验证手段：
     * - `EMAIL_PASSCODE`: 通过邮箱验证码进行验证，当前只支持这种验证方式。
     *
     */
    @JsonProperty("verifyMethod")
    private VerifyMethod verifyMethod;

    public UpdateEmailByEmailPassCodeDto getEmailPassCodePayload() {
        return emailPassCodePayload;
    }
    public void setEmailPassCodePayload(UpdateEmailByEmailPassCodeDto emailPassCodePayload) {
        this.emailPassCodePayload = emailPassCodePayload;
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