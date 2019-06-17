package cn.authing.core.param;

import cn.authing.core.business.ImportantParam;

public class SendVerifyEmailParam extends AuthingParam<SendVerifyEmailParam.Param> {

    public static class Builder {
        private String email;
        private String clientId;

        public Builder(String email) {
            this.email = email;
        }

        public SendVerifyEmailParam build() {
            this.clientId = ImportantParam.INSTANCE.getClientId();
            return new SendVerifyEmailParam(this);
        }
    }

    SendVerifyEmailParam(Builder builder) {
        super(GRAPHQl);
        Param p = new Param();
        p.email = builder.email;
        p.client = builder.clientId;
        this.setVariables(p);
    }

    static class Param {
        private String email;
        private String client;
    }

    private static final String GRAPHQl =
            "mutation sendVerifyEmail(\n" +
                    "    $email: String!,\n" +
                    "    $client: String!\n" +
                    "){\n" +
                    "    sendVerifyEmail(\n" +
                    "        email: $email,\n" +
                    "        client: $client\n" +
                    "    ) {\n" +
                    "        message,\n" +
                    "        code,\n" +
                    "        status\n" +
                    "    }\n" +
                    "}";
}
