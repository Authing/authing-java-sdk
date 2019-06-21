package cn.authing.core.param;

import cn.authing.core.business.ImportantParam;
import cn.authing.core.utils.AuthingUtils;

public class LoginByEmailParam extends AuthingParam<LoginByEmailParam.Param> {

    public static class Builder {
        private String unionId;
        private String email;
        private String password;
        private String lastIP;
        private String verifyCode;
        private String clientId;

        public Builder(String email, String password) {
            this.email = email;
            this.password = password;
        }

        public Builder(String unionId) {
            this.unionId = unionId;
        }

        public Builder lastIP(String lastIP) {
            this.lastIP = lastIP;
            return this;
        }

        public Builder verifyCode(String verifyCode) {
            this.verifyCode = verifyCode;
            return this;
        }

        public LoginByEmailParam build() {
            this.clientId = ImportantParam.INSTANCE.getClientId();
            this.password = AuthingUtils.encrypt(password);
            return new LoginByEmailParam(this);
        }
    }

    static class Param {
        private String registerInClient;
        private String unionid;
        private String email;
        private String password;
        private String lastIP;
        private String verifyCode;
    }


    LoginByEmailParam(Builder builder) {
        super(GRAPHQ);
        Param p = new Param();
        p.registerInClient = builder.clientId;
        p.unionid = builder.unionId;
        p.email = builder.email;
        p.password = builder.password;
        p.lastIP = builder.lastIP;
        p.verifyCode = builder.verifyCode;
        this.setVariables(p);
    }

    private static final String GRAPHQ =
            "mutation login($unionid: String, $email: String, $password: String, $lastIP: String, $registerInClient: String!, $verifyCode: String) {\n" +
                    "    login(unionid: $unionid, email: $email, password: $password, lastIP: $lastIP, registerInClient: $registerInClient, verifyCode: $verifyCode) {\n" +
                    "        _id\n" +
                    "        email\n" +
                    "        emailVerified\n" +
                    "        username\n" +
                    "        nickname\n" +
                    "        company\n" +
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
