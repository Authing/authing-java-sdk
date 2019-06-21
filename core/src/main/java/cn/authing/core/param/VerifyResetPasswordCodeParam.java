package cn.authing.core.param;

import cn.authing.core.business.ImportantParam;

public class VerifyResetPasswordCodeParam extends AuthingParam<VerifyResetPasswordCodeParam.Param> {

    public static class Builder {
        private String email;
        private String verifyCode;
        private String clientId;

        public Builder(String email, String verifyCode) {
            this.email = email;
            this.verifyCode = verifyCode;
        }

        public VerifyResetPasswordCodeParam build() {
            this.clientId = ImportantParam.INSTANCE.getClientId();
            return new VerifyResetPasswordCodeParam(this);
        }
    }

    VerifyResetPasswordCodeParam(Builder builder) {
        super(GRAPHQL);
        Param p = new Param();
        p.client = builder.clientId;
        p.email = builder.email;
        p.verifyCode = builder.verifyCode;
        this.setVariables(p);
    }

    static class Param {
        private String email;
        private String verifyCode;
        private String client;
    }

    private static final String GRAPHQL =
            "mutation verifyResetPasswordVerifyCode(\n" +
                    "    $email: String!,\n" +
                    "    $client: String!,\n" +
                    "    $verifyCode: String!\n" +
                    ") {\n" +
                    "    verifyResetPasswordVerifyCode(\n" +
                    "        email: $email,\n" +
                    "        client: $client,\n" +
                    "        verifyCode: $verifyCode\n" +
                    "    ) {\n" +
                    "          message\n" +
                    "          code\n" +
                    "          status\n" +
                    "    }\n" +
                    "}";
}
