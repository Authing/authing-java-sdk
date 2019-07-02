package cn.authing.core.param;

import cn.authing.core.business.ImportantParam;

public class ReadRolesParam extends AuthingParam<ReadRolesParam.Param> {

    public static class Builder {
        private int page;
        private int count;
        private String clientId;

        public Builder page(int page) {
            this.page = page;
            return this;
        }

        public Builder count(int count) {
            this.count = count;
            return this;
        }

        public ReadRolesParam build() {
            this.clientId = ImportantParam.INSTANCE.getClientId();
            return new ReadRolesParam(this);
        }
    }

    static class Param {
        private int page;
        private int count;
        private String clientId;
    }

    ReadRolesParam(Builder builder) {
        super(GRAPHQL);
        Param p = new Param();
        p.clientId = builder.clientId;
        p.page = builder.page;
        p.count = builder.count;
        this.setVariables(p);
    }

    private static final String GRAPHQL = "query ClientRoles(\n" +
            "          $clientId: String!\n" +
            "          $page: Int\n" +
            "          $count: Int\n" +
            "        ) {\n" +
            "          clientRoles(\n" +
            "            client: $clientId\n" +
            "            page: $page\n" +
            "            count: $count\n" +
            "          ) {\n" +
            "            totalCount\n" +
            "            list {\n" +
            "              _id\n" +
            "              name\n" +
            "              descriptions\n" +
            "              client\n" +
            "              createdAt\n" +
            "              permissions\n" +
            "            }\n" +
            "          }\n" +
            "        }";
}
