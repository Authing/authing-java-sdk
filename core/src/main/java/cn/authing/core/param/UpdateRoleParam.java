package cn.authing.core.param;

import cn.authing.core.business.ImportantParam;

public class UpdateRoleParam extends AuthingParam<UpdateRoleParam.Param> {

    public static class Builder {
        private String roleId;
        private String name;
        private String clientId;
        private String desc;
        private String permissions;

        public Builder(String roleId) {
            this.roleId = roleId;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder desc(String desc) {
            this.desc = desc;
            return this;
        }

        public Builder permissions(String permissions) {
            this.permissions = permissions;
            return this;
        }

        public UpdateRoleParam build() {
            this.clientId = ImportantParam.INSTANCE.getClientId();
            return new UpdateRoleParam(this);
        }
    }

    UpdateRoleParam(Builder builder) {
        super(GRAPHQL);
        Param p = new Param();
        p._id = builder.roleId;
        p.client = builder.clientId;
        p.name = builder.name;
        p.permissions = builder.permissions;
        p.descriptions = builder.desc;
        this.setVariables(p);
    }

    static class Param {
        private String _id;
        private String name;
        private String client;
        private String descriptions;
        private String permissions;
    }

    private static final String GRAPHQL = "mutation UpdateRole(\n" +
            "          $_id: String!\n" +
            "          $name: String!\n" +
            "          $client: String!\n" +
            "          $descriptions: String\n" +
            "          $permissions: String\n" +
            "        ) {\n" +
            "          updateRole(\n" +
            "            _id: $_id\n" +
            "            name: $name\n" +
            "            client: $client\n" +
            "            descriptions: $descriptions\n" +
            "            permissions: $permissions\n" +
            "          ) {\n" +
            "            _id,\n" +
            "            name,\n" +
            "            client,\n" +
            "            descriptions,\n" +
            "            permissions\n" +
            "          }\n" +
            "        }";
}
