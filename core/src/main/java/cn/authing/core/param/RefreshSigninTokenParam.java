package cn.authing.core.param;

import cn.authing.core.business.ImportantParam;

public class RefreshSigninTokenParam extends AuthingParam<RefreshSigninTokenParam.Param> {

    public static class Builder {
        private String oidcAppId;
        private String userPoolId;
        private String refreshToken;

        public Builder(String refreshToken) {
            this.refreshToken = refreshToken;
        }

        public Builder oidcAppId(String oidcAppId) {
            this.oidcAppId = oidcAppId;
            return this;
        }

        public RefreshSigninTokenParam build() {
            this.userPoolId = ImportantParam.INSTANCE.getClientId();
            return new RefreshSigninTokenParam(this);
        }
    }

    static class Param {
        private String oidcAppId;
        private String userPoolId;
        private String refreshToken;
    }

    RefreshSigninTokenParam(Builder builder) {
        super(GRAPHSQL);
        Param p = new Param();
        p.oidcAppId = builder.oidcAppId;
        p.userPoolId = builder.userPoolId;
        p.refreshToken = builder.refreshToken;
        this.setVariables(p);
    }


    private static final String GRAPHSQL = "mutation RefreshSignInToken(\n" +
        "        $oidcAppId: String,\n" +
        "        $userPoolId: String,\n" +
        "        $refreshToken: String!\n" +
        "      ) {\n" +
        "        refreshSignInToken(\n" +
        "          oidcAppId: $oidcAppId\n" +
        "          userPoolId: $userPoolId\n" +
        "          refreshToken: $refreshToken\n" +
        "        ) {\n" +
        "          id_token\n" +
        "          access_token\n" +
        "          refresh_token\n" +
        "          scope\n" +
        "          expires_in\n" +
        "        }\n" +
        "      }";
}
