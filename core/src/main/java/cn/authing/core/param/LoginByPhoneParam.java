package cn.authing.core.param;

import cn.authing.core.business.ImportantParam;
import cn.authing.core.utils.AuthingUtils;

public class LoginByPhoneParam extends AuthingParam<LoginByPhoneParam.Param> {

    public static class Builder {
        private String clientId;
        private String phoneNumber;
        private String psd;
        private int verifyCode;

        public Builder(String phoneNumber, int verifyCode) {
            this.phoneNumber = phoneNumber;
            this.verifyCode = verifyCode;
        }

        public Builder(String phone, String psd) {
            this.phoneNumber = phone;
            this.psd = psd;
        }

        public LoginByPhoneParam build() {
            this.clientId = ImportantParam.INSTANCE.getClientId();
            this.psd = AuthingUtils.INSTANCE.encrypt(psd);
            return new LoginByPhoneParam(this);
        }
    }

    static class Param {
        private String registerInClient;
        private String phone;
        private String password;
        private int phoneCode;
    }

    LoginByPhoneParam(Builder builder) {
        super(GRAPHQL);
        Param p = new Param();
        p.registerInClient = builder.clientId;
        p.phone = builder.phoneNumber;
        p.password = builder.psd;
        p.phoneCode = builder.verifyCode;
        this.setVariables(p);
    }

    private static final String GRAPHQL =
            "mutation login($unionid: String, $email: String, $phone: String, $password: String, " +
                "$lastIP: String, $registerInClient: String!, $verifyCode: String, $browser: " +
                "String, $device: String) {\n" +
                "    login(unionid: $unionid, email: $email, phone: $phone, password: $password, " +
                "lastIP: $lastIP, registerInClient: $registerInClient, verifyCode: $verifyCode, " +
                "browser: $browser, device: $device) {\n" +
                "        _id\n" +
                "        email\n" +
                "        emailVerified\n" +
                "        username\n" +
                "        nickname\n" +
                "        company\n" +
                "        phone\n" +
                "        photo\n" +
                "        browser\n" +
                "        token\n" +
                "        tokenExpiredAt\n" +
                "        loginsCount\n" +
                "        lastLogin\n" +
                "        lastIP\n" +
                "        signedUp\n" +
                "        blocked\n" +
                "        isDeleted\n" +
                "    }\n" +
                "}";
}
