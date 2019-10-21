package cn.authing.core.param;

import cn.authing.core.business.ImportantParam;

public class LoginByPhoneParam extends AuthingParam<LoginByPhoneParam.Param> {

    public static class Builder {
        private String clientId;
        private String phoneNumber;
        private int verifyCode;

        public Builder(String phoneNumber, int verifyCode) {
            this.phoneNumber = phoneNumber;
            this.verifyCode = verifyCode;
        }

        public LoginByPhoneParam build() {
            this.clientId = ImportantParam.INSTANCE.getClientId();
            return new LoginByPhoneParam(this);
        }
    }

    static class Param {
        private String registerInClient;
        private String phone;
        private int phoneCode;
    }

    LoginByPhoneParam(Builder builder) {
        super(GRAPHQL);
        Param p = new Param();
        p.registerInClient = builder.clientId;
        p.phone = builder.phoneNumber;
        p.phoneCode = builder.verifyCode;
        this.setVariables(p);
    }

    private static final String GRAPHQL =
            "mutation login($phone: String, $phoneCode: Int, $registerInClient: String!) {\n" +
                    "          login(phone: $phone, phoneCode: $phoneCode, registerInClient: $registerInClient) {\n" +
                    "            _id\n" +
                    "            email\n" +
                    "            emailVerified\n" +
                    "            username\n" +
                    "            nickname\n" +
                    "            phone\n" +
                    "            company\n" +
                    "            photo\n" +
                    "            browser\n" +
                    "            token\n" +
                    "            tokenExpiredAt\n" +
                    "            loginsCount\n" +
                    "            lastLogin\n" +
                    "            lastIP\n" +
                    "            signedUp\n" +
                    "            blocked\n" +
                    "            isDeleted\n" +
                    "          }\n" +
                    "      }";
}
