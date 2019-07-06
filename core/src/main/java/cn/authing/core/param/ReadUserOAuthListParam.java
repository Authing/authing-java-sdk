package cn.authing.core.param;

import cn.authing.core.business.ImportantParam;

public class ReadUserOAuthListParam extends AuthingParam<ReadUserOAuthListParam.Param> {

    public static class Builder {
        private String userId;
        private String clientId;

        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public ReadUserOAuthListParam build() {
            this.clientId = ImportantParam.INSTANCE.getClientId();
            return new ReadUserOAuthListParam(this);
        }
    }

    ReadUserOAuthListParam(Builder builder) {
        super(GRAPHQL);
        Param p = new Param();
        p.user = builder.userId;
        p.client = builder.clientId;
        this.setVariables(p);
    }

    static class Param {
        private String user;
        private String client;
    }

    private static final String GRAPHQL = "query notBindOAuthList($user: String, $client: String) {\n" +
            "        notBindOAuthList(user: $user, client: $client) {\n" +
            "          type\n" +
            "          oAuthUrl\n" +
            "          image\n" +
            "          name\n" +
            "          binded\n" +
            "        }\n" +
            "}";
}
