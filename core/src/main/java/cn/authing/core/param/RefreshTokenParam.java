package cn.authing.core.param;

import cn.authing.core.business.ImportantParam;

public class RefreshTokenParam extends AuthingParam<RefreshTokenParam.Param> {

    public static class Builder {
        private String userId;
        private String clientId;

        public Builder(String userId) {
            this.userId = userId;
        }

        public RefreshTokenParam build() {
            this.clientId = ImportantParam.INSTANCE.getClientId();
            return new RefreshTokenParam(this);
        }
    }

    RefreshTokenParam(Builder builder) {
        super(GRAPHQL);
        Param p = new Param();
        p.client = builder.clientId;
        p.user = builder.userId;
        this.setVariables(p);
    }

    static class Param {
        private String user;
        private String client;
    }

    private static final String GRAPHQL =
            "mutation RefreshToken(\n" +
                    "  $client: String!\n" +
                    "  $user: String!\n" +
                    ") {\n" +
                    "  refreshToken(\n" +
                    "    client: $client\n" +
                    "    user: $user\n" +
                    "  ) {\n" +
                    "    token\n" +
                    "    iat\n" +
                    "    exp\n" +
                    "  }\n" +
                    "}";
}
