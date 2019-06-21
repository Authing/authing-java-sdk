package cn.authing.core.param;

import cn.authing.core.business.ImportantParam;

public class UserInfoParam extends AuthingParam<UserInfoParam.Param> {

    private static final String GRAPHQL =
            "  query user($id: String!, $registerInClient: String!){\n" +
                    "    user(id: $id, registerInClient: $registerInClient) {\n" +
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
                    "\n" +
                    "}";

    private UserInfoParam(Builder builder) {
        super(GRAPHQL);
        Param p = new Param();
        p.id = builder.userId;
        p.registerInClient = builder.clientId;
        this.setVariables(p);
    }

    class Param {
        private String id;
        private String registerInClient;
    }

    public static class Builder {

        private String userId;
        private String clientId;

        public Builder(String userId) {
            this.userId = userId;
        }

        public UserInfoParam build() {
            this.clientId = ImportantParam.INSTANCE.getClientId();
            return new UserInfoParam(this);
        }
    }
}
