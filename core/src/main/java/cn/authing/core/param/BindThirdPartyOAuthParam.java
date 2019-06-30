package cn.authing.core.param;

import cn.authing.core.business.ImportantParam;
import cn.authing.core.utils.ThirdPartyType;

public class BindThirdPartyOAuthParam extends AuthingParam<BindThirdPartyOAuthParam.Param> {

    public static class Builder {
        private String userId;
        private String clientId;
        private String type;
        private String unionid;
        private String userInfo;

        public Builder(@ThirdPartyType String type, String unionid, String userInfo) {
            this.type = type;
            this.unionid = unionid;
            this.userInfo = userInfo;
        }

        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public BindThirdPartyOAuthParam build() {
            this.clientId = ImportantParam.INSTANCE.getClientId();
            return new BindThirdPartyOAuthParam(this);
        }
    }

    BindThirdPartyOAuthParam(Builder builder) {
        super(GRAPHQL);
        Param p = new Param();
        p.user = builder.userId;
        p.client = builder.clientId;
        p.type = builder.type;
        p.unionid = builder.unionid;
        p.userInfo = builder.userInfo;
        this.setVariables(p);
    }

    static class Param {
        private String user;
        private String client;
        private String type;
        private String unionid;
        private String userInfo;
    }

    private static final String GRAPHQL = "mutation bindOtherOAuth($user: String, $client: String, $type: String!, $unionid: String!, $userInfo: String!){\n" +
            "    bindOtherOAuth(user: $user, client: $client, type: $type, unionid: $unionid, userInfo: $userInfo){\n" +
            "        _id\n" +
            "        user\n" +
            "        client\n" +
            "        type\n" +
            "        unionid\n" +
            "        userInfo\n" +
            "        createdAt\n" +
            "    }\n" +
            "}";
}
