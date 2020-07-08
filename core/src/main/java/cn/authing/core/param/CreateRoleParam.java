package cn.authing.core.param;

import cn.authing.core.business.ImportantParam;

public class CreateRoleParam extends AuthingParam<CreateRoleParam.Param> {

    public static class Builder {
        private String name;
        private String clientId;
        private String descriptions;

        public Builder(String name, String desc) {
            this.name = name;
            this.descriptions = desc;
        }

        public CreateRoleParam build() {
            this.clientId = ImportantParam.INSTANCE.getClientId();
            return new CreateRoleParam(this);
        }
    }

    static class Param {
        private String name;
        private String client;
        private String descriptions;
    }

    CreateRoleParam(Builder builder) {
        super(GRAPHQL);
        Param p = new Param();
        p.client = builder.clientId;
        p.name = builder.name;
        p.descriptions = builder.descriptions;
        this.setVariables(p);
    }

    private static final String GRAPHQL = "mutation CreateRole(\n" +
            "          $name: String!,\n" +
            "          $client: String!,\n" +
            "          $descriptions: String\n" +
            "        ) {\n" +
            "          createRole(\n" +
            "            name: $name,\n" +
            "            client: $client,\n" +
            "            descriptions: $descriptions\n" +
            "          ) {\n" +
            "            _id,\n" +
            "            name,\n" +
            "            client,\n" +
            "            descriptions\n" +
            "          }\n" +
            "        }";
}
