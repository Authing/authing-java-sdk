package cn.genauth.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VerifyDeleteAccountRequestDto {
    /**
     * 注销账号的验证手段：
     * - `PHONE_PASSCODE`: 使用手机号验证码方式进行验证。
     * - `EMAIL_PASSCODE`: 使用邮箱验证码方式进行验证。
     * - `PASSWORD`: 如果用户既没有绑定手机号又没有绑定邮箱，可以使用密码作为验证手段。
     *
     */
    @JsonProperty("verifyMethod")
    private VerifyMethod verifyMethod;
    /**
     * 使用手机号验证码验证的数据
     */
    @JsonProperty("phonePassCodePayload")
    private DeleteAccountByPhonePassCodeDto phonePassCodePayload;
    /**
     * 使用邮箱验证码验证的数据
     */
    @JsonProperty("emailPassCodePayload")
    private DeleteAccountByEmailPassCodeDto emailPassCodePayload;
    /**
     * 使用密码验证的数据
     */
    @JsonProperty("passwordPayload")
    private DeleteAccountByPasswordDto passwordPayload;

    public VerifyMethod getVerifyMethod() {
        return verifyMethod;
    }
    public void setVerifyMethod(VerifyMethod verifyMethod) {
        this.verifyMethod = verifyMethod;
    }

    public DeleteAccountByPhonePassCodeDto getPhonePassCodePayload() {
        return phonePassCodePayload;
    }
    public void setPhonePassCodePayload(DeleteAccountByPhonePassCodeDto phonePassCodePayload) {
        this.phonePassCodePayload = phonePassCodePayload;
    }

    public DeleteAccountByEmailPassCodeDto getEmailPassCodePayload() {
        return emailPassCodePayload;
    }
    public void setEmailPassCodePayload(DeleteAccountByEmailPassCodeDto emailPassCodePayload) {
        this.emailPassCodePayload = emailPassCodePayload;
    }

    public DeleteAccountByPasswordDto getPasswordPayload() {
        return passwordPayload;
    }
    public void setPasswordPayload(DeleteAccountByPasswordDto passwordPayload) {
        this.passwordPayload = passwordPayload;
    }


    /**
     * 注销账号的验证手段：
     * - `PHONE_PASSCODE`: 使用手机号验证码方式进行验证。
     * - `EMAIL_PASSCODE`: 使用邮箱验证码方式进行验证。
     * - `PASSWORD`: 如果用户既没有绑定手机号又没有绑定邮箱，可以使用密码作为验证手段。
     *
     */
    public static enum VerifyMethod {

        @JsonProperty("PHONE_PASSCODE")
        PHONE_PASSCODE("PHONE_PASSCODE"),

        @JsonProperty("EMAIL_PASSCODE")
        EMAIL_PASSCODE("EMAIL_PASSCODE"),

        @JsonProperty("PASSWORD")
        PASSWORD("PASSWORD"),
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