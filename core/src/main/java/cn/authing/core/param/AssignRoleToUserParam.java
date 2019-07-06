package cn.authing.core.param;

import cn.authing.core.business.ImportantParam;

public class AssignRoleToUserParam extends AuthingParam<AssignRoleToUserParam.Param> {

    public static class Builder {
        private String roleId;
        private String clientId;
        private String userId;

        public Builder(String roleId, String userId) {
            this.roleId = roleId;
            this.userId = userId;
        }

        public AssignRoleToUserParam build() {
            this.clientId = ImportantParam.INSTANCE.getClientId();
            return new AssignRoleToUserParam(this);
        }
    }

    static class Param {
        private String group;
        private String client;
        private String user;
    }

    AssignRoleToUserParam(Builder builder) {
        super(GRAPHQL);
        Param p = new Param();
        p.client = builder.clientId;
        p.group = builder.roleId;
        p.user = builder.userId;
        this.setVariables(p);
    }

    private static final String GRAPHQL = "mutation AssignUserToRole(\n" +
            "          $group: String!\n" +
            "          $client: String!\n" +
            "          $user: String!\n" +
            "        ) {\n" +
            "          assignUserToRole(\n" +
            "            group: $group\n" +
            "            client: $client\n" +
            "            user: $user\n" +
            "          ) {\n" +
            "            totalCount,\n" +
            "            list {\n" +
            "              _id,\n" +
            "              client {\n" +
            "                _id\n" +
            "              },\n" +
            "              user {\n" +
            "                _id\n" +
            "              },\n" +
            "              createdAt\n" +
            "            }\n" +
            "          }\n" +
            "        }";
}
