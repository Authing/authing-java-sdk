package cn.authing.core.param;

import cn.authing.core.business.ImportantParam;

public class UnbindEmailParam extends AuthingParam<UnbindEmailParam.Param> {

    public static class Builder {
        private String userId;
        private String clientId;

        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public UnbindEmailParam build() {
            this.clientId = ImportantParam.INSTANCE.getClientId();
            return new UnbindEmailParam(this);
        }
    }

    UnbindEmailParam(Builder builder) {
        super(GRAPHQL);
        Param param = new Param();
        param.client = builder.clientId;
        param.user = builder.userId;
        this.setVariables(param);
    }

    static class Param {
        private String user;
        private String client;
    }

    private static final String GRAPHQL =
            "mutation unbindEmail($user: String, $client: String){\n" +
                    "    unbindEmail(user: $user, client: $client){\n" +
                    "      _id\n" +
                    "      email\n" +
                    "      emailVerified\n" +
                    "      username\n" +
                    "      nickname\n" +
                    "      company\n" +
                    "      photo\n" +
                    "      browser\n" +
                    "      registerInClient\n" +
                    "      registerMethod\n" +
                    "      oauth\n" +
                    "      token\n" +
                    "      tokenExpiredAt\n" +
                    "      loginsCount\n" +
                    "      lastLogin\n" +
                    "      lastIP\n" +
                    "      signedUp\n" +
                    "      blocked\n" +
                    "      isDeleted\n" +
                    "    }\n" +
                    "}";
}
