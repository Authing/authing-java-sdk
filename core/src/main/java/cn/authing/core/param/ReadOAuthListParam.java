package cn.authing.core.param;

import cn.authing.core.business.ImportantParam;

public class ReadOAuthListParam extends AuthingParam<ReadOAuthListParam.Param> {

    public static class Builder {
        private String clientId;

        public ReadOAuthListParam build() {
            this.clientId = ImportantParam.INSTANCE.getClientId();
            return new ReadOAuthListParam(this);
        }
    }

    ReadOAuthListParam(Builder builder) {
        super(GRAPHQL);
        Param p = new Param();
        p.clientId = builder.clientId;
        this.setVariables(p);
    }

    static class Param {
        private String clientId;
    }

    private static final String GRAPHQL =
            "  query ReadOAuthList($clientId: String!) {\n" +
                    "        ReadOauthList(clientId: $clientId) {\n" +
                    "            _id\n" +
                    "            name\n" +
                    "            image\n" +
                    "            description\n" +
                    "            enabled\n" +
                    "            client\n" +
                    "            user\n" +
                    "            url\n" +
                    "        }\n" +
                    "    }";

}
