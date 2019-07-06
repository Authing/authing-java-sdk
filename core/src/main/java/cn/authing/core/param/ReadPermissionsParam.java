package cn.authing.core.param;

import cn.authing.core.business.ImportantParam;

public class ReadPermissionsParam extends AuthingParam<ReadPermissionsParam.Param> {

    public static class Builder {
        private String clientId;
        private String userId;

        public Builder(String userId) {
            this.userId = userId;
        }

        public ReadPermissionsParam build() {
            this.clientId = ImportantParam.INSTANCE.getClientId();
            return new ReadPermissionsParam(this);
        }
    }

    static class Param {
        private String client;
        private String user;
    }

    ReadPermissionsParam(Builder builder) {
        super(GRAPHQL);
        Param p = new Param();
        p.client = builder.clientId;
        p.user = builder.userId;
        this.setVariables(p);
    }

    private static final String GRAPHQL = "query QueryRoleByUserId($user: String!, $client: String!){\n" +
            "        queryRoleByUserId(user: $user, client: $client) {\n" +
            "          totalCount\n" +
            "          list {\n" +
            "            group {\n" +
            "              name\n" +
            "              permissions\n" +
            "            }\n" +
            "          }\n" +
            "        }\n" +
            "      }";
}
