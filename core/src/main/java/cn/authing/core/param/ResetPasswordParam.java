package cn.authing.core.param;

import cn.authing.core.business.ImportantParam;
import cn.authing.core.utils.AuthingUtils;

public class ResetPasswordParam extends AuthingParam<ResetPasswordParam.Param> {

    public static class Builder {
        private String email;
        private String clientId;
        private String password;
        private String verifyCode;

        public Builder(String email, String password, String verifyCode) {
            this.email = email;
            this.password = password;
            this.verifyCode = verifyCode;
        }

        public ResetPasswordParam build() {
            this.clientId = ImportantParam.INSTANCE.getClientId();
            this.password = AuthingUtils.INSTANCE.encrypt(password);
            return new ResetPasswordParam(this);
        }
    }

    ResetPasswordParam(Builder builder) {
        super(GRAPHQL);
        Param p = new Param();
        p.email = builder.email;
        p.client = builder.clientId;
        p.password = builder.password;
        p.verifyCode = builder.verifyCode;
        this.setVariables(p);
    }

    static class Param {
        private String email;
        private String client;
        private String password;
        private String verifyCode;
    }

    private static final String GRAPHQL =
            "mutation changePassword(\n" +
                    "    $email: String!,\n" +
                    "    $client: String!,\n" +
                    "    $password: String!,\n" +
                    "    $verifyCode: String!\n" +
                    "){\n" +
                    "    changePassword(\n" +
                    "        email: $email,\n" +
                    "        client: $client,\n" +
                    "        password: $password,\n" +
                    "        verifyCode: $verifyCode\n" +
                    "    ) {\n" +
                    "        _id\n" +
                    "        email\n" +
                    "        emailVerified\n" +
                    "        username\n" +
                    "        nickname\n" +
                    "        company\n" +
                    "        photo\n" +
                    "        browser\n" +
                    "        registerInClient\n" +
                    "        registerMethod\n" +
                    "        oauth\n" +
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
