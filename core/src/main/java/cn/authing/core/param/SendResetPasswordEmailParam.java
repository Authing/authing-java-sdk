package cn.authing.core.param;

import cn.authing.core.business.ImportantParam;

public class SendResetPasswordEmailParam extends AuthingParam<SendResetPasswordEmailParam.Param> {

    SendResetPasswordEmailParam(Builder builder) {
        super(GRAPHQL);
        Param p = new Param();
        p.client = builder.clientId;
        p.email = builder.email;
        this.setVariables(p);
    }

    public static class Builder {
        private String email;
        private String clientId;

        public Builder(String email) {
            this.email = email;
        }

        public SendResetPasswordEmailParam build() {
            this.clientId = ImportantParam.INSTANCE.getClientId();
            return new SendResetPasswordEmailParam(this);
        }
    }

    static class Param {
        private String email;
        private String client;
    }

    private static final String GRAPHQL =
            "mutation sendResetPasswordEmail(\n" +
                    "    $email: String!,\n" +
                    "    $client: String!\n" +
                    "){\n" +
                    "    sendResetPasswordEmail(\n" +
                    "        email: $email,\n" +
                    "        client: $client\n" +
                    "    ) {\n" +
                    "          message\n" +
                    "          code\n" +
                    "          status\n" +
                    "    }\n" +
                    "}";
}
