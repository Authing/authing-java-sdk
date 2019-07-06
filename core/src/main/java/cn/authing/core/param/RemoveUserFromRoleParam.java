package cn.authing.core.param;

import cn.authing.core.business.ImportantParam;

public class RemoveUserFromRoleParam extends AuthingParam<RemoveUserFromRoleParam.Param> {

    public static class Builder {
        private String roleId;
        private String clientId;
        private String userId;

        public Builder(String roleId, String userId) {
            this.roleId = roleId;
            this.userId = userId;
        }

        public RemoveUserFromRoleParam build() {
            this.clientId = ImportantParam.INSTANCE.getClientId();
            return new RemoveUserFromRoleParam(this);
        }
    }

    static class Param {
        private String group;
        private String client;
        private String user;
    }

    RemoveUserFromRoleParam(Builder builder) {
        super(GRAPHQL);
        Param p = new Param();
        p.client = builder.clientId;
        p.group = builder.roleId;
        p.user = builder.userId;
        this.setVariables(p);
    }

    private static final String GRAPHQL = "mutation RemoveUserFromGroup(\n" +
            "          $group: String!\n" +
            "          $client: String!\n" +
            "          $user: String!\n" +
            "        ) {\n" +
            "          removeUserFromGroup(\n" +
            "            group: $group\n" +
            "            client: $client\n" +
            "            user: $user\n" +
            "          ) {\n" +
            "            _id,\n" +
            "            group {\n" +
            "              _id\n" +
            "            },\n" +
            "            client {\n" +
            "              _id\n" +
            "            },\n" +
            "            user {\n" +
            "              _id\n" +
            "            }\n" +
            "          }\n" +
            "        }";
}
