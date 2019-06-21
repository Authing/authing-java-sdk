package cn.authing.core.param;

import cn.authing.core.business.ImportantParam;

public class UserListParam extends AuthingParam<UserListParam.Param> {

    public static class Builder {
        private String clientId;
        private Integer page;
        private Integer count;

        public Builder page(int page) {
            this.page = page;
            return this;
        }

        public Builder count(int count) {
            this.count = count;
            return this;
        }

        public UserListParam build() {
            this.clientId = ImportantParam.INSTANCE.getClientId();
            return new UserListParam(this);
        }
    }

    UserListParam(Builder builder) {
        super(GRAPHQL);
        Param p = new Param();
        p.registerInClient = builder.clientId;
        p.count = builder.count;
        p.page = builder.page;
        this.setVariables(p);
    }

    static class Param {
        private String registerInClient;
        private Integer page;
        private Integer count;
    }

    private static final String GRAPHQL =
            "query users($registerInClient: String, $page: Int, $count: Int){\n" +
                    "  users(registerInClient: $registerInClient, page: $page, count: $count) {\n" +
                    "    totalCount\n" +
                    "    list {\n" +
                    "      _id\n" +
                    "      email\n" +
                    "      emailVerified\n" +
                    "      username\n" +
                    "      nickname\n" +
                    "      company\n" +
                    "      photo\n" +
                    "      browser\n" +
                    "      password\n" +
                    "      registerInClient\n" +
                    "      token\n" +
                    "      tokenExpiredAt\n" +
                    "      loginsCount\n" +
                    "      lastLogin\n" +
                    "      lastIP\n" +
                    "      signedUp\n" +
                    "      blocked\n" +
                    "      isDeleted\n" +
                    "      group {\n" +
                    "        _id\n" +
                    "        name\n" +
                    "        descriptions\n" +
                    "        createdAt\n" +
                    "      }\n" +
                    "      clientType {\n" +
                    "        _id\n" +
                    "        name\n" +
                    "        description\n" +
                    "        image\n" +
                    "        example\n" +
                    "      }\n" +
                    "      userLocation {\n" +
                    "        _id\n" +
                    "        when\n" +
                    "        where\n" +
                    "      }\n" +
                    "      userLoginHistory {\n" +
                    "        totalCount\n" +
                    "        list{\n" +
                    "          _id\n" +
                    "          when\n" +
                    "          success\n" +
                    "          ip\n" +
                    "          result\n" +
                    "        }\n" +
                    "      }\n" +
                    "      systemApplicationType {\n" +
                    "        _id\n" +
                    "        name\n" +
                    "        descriptions\n" +
                    "        price\n" +
                    "      }\n" +
                    "    }\n" +
                    "  }\n" +
                    "}";
}
