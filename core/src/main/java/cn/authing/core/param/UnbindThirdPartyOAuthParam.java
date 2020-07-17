package cn.authing.core.param;

import cn.authing.core.business.ImportantParam;

public class UnbindThirdPartyOAuthParam extends AuthingParam<UnbindThirdPartyOAuthParam.Param> {

    public static class Builder {
        private String userId;
        private String clientId;
        private String type;

        public Builder(String type) {
            this.type = type;
        }

        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public UnbindThirdPartyOAuthParam build() {
            this.clientId = ImportantParam.INSTANCE.getClientId();
            return new UnbindThirdPartyOAuthParam(this);
        }
    }

    UnbindThirdPartyOAuthParam(Builder builder) {
        super(GRAPHQL);
        Param p = new Param();
        p.user = builder.userId;
        p.client = builder.clientId;
        p.type = builder.type;
        this.setVariables(p);
    }

    static class Param {
        private String user;
        private String client;
        private String type;
    }

    private static final String GRAPHQL = "mutation unbindOtherOAuth($user: String, $client: String, $type: String!){\n" +
            "    unbindOtherOAuth(user: $user, client: $client, type: $type){\n" +
            "        _id\n" +
            "        user\n" +
            "        client\n" +
            "        type\n" +
            "        unionid\n" +
            "        userInfo\n" +
            "        createdAt\n" +
            "    }\n" +
            "}";
}
