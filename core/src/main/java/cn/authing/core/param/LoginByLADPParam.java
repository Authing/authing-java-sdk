package cn.authing.core.param;

import cn.authing.core.business.ImportantParam;
import cn.authing.core.utils.AuthingUtils;

public class LoginByLADPParam extends AuthingParam<LoginByLADPParam.Param> {

    public static class Builder {
        private String username;
        private String password;
        private String clientId;

        public Builder(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public LoginByLADPParam build() {
            this.clientId = ImportantParam.INSTANCE.getClientId();
            this.password = AuthingUtils.INSTANCE.encrypt(password);
            return new LoginByLADPParam(this);
        }
    }

    static class Param {
        private String clientId;
        private String username;
        private String password;
    }


    LoginByLADPParam(Builder builder) {
        super(GRAPHQ);
        Param p = new Param();
        p.clientId = builder.clientId;
        p.username = builder.username;
        p.password = builder.password;
        this.setVariables(p);
    }

    private static final String GRAPHQ =
            "mutation LoginByLDAP($username: String!, $password: String!, $clientId: String!) {\n" +
                    "      LoginByLDAP(username: $username, clientId: $clientId, password: $password) {\n" +
                    "            _id\n" +
                    "            username\n" +
                    "            emailVerified\n" +
                    "            unionid\n" +
                    "            oauth\n" +
                    "            registerMethod\n" +
                    "            username\n" +
                    "            nickname\n" +
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
                    "          }\n" +
                    "      }";
}
