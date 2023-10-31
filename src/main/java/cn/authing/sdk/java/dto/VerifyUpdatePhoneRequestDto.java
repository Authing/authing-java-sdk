package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.UpdatePhoneByPhonePassCodeDto;


public class VerifyUpdatePhoneRequestDto {
    /**
     * 使用手机号验证码方式验证的数据
     */
    @JsonProperty("phonePassCodePayload")
    private UpdatePhoneByPhonePassCodeDto phonePassCodePayload;
    /**
     * 修改手机号的验证方式：
     * - `PHONE_PASSCODE`: 使用短信验证码的方式进行验证，当前仅支持这一种方式。
     *
     */
    @JsonProperty("verifyMethod")
    private VerifyMethod verifyMethod;

    public UpdatePhoneByPhonePassCodeDto getPhonePassCodePayload() {
        return phonePassCodePayload;
    }
    public void setPhonePassCodePayload(UpdatePhoneByPhonePassCodeDto phonePassCodePayload) {
        this.phonePassCodePayload = phonePassCodePayload;
    }

    public VerifyMethod getVerifyMethod() {
        return verifyMethod;
    }
    public void setVerifyMethod(VerifyMethod verifyMethod) {
        this.verifyMethod = verifyMethod;
    }


    /**
     * 修改手机号的验证方式：
     * - `PHONE_PASSCODE`: 使用短信验证码的方式进行验证，当前仅支持这一种方式。
     *
     */
    public static enum VerifyMethod {

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