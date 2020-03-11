package cn.authing.core.param;

public class CheckLoginStatusParam extends AuthingParam<CheckLoginStatusParam.Param> {

    public static class Builder {
        private String token;

        public Builder(String token) {
            this.token = token;
        }

        public CheckLoginStatusParam build() {
            return new CheckLoginStatusParam(this);
        }
    }

    static class Param {
        private String token;
    }

    CheckLoginStatusParam(Builder builder) {
        super(GRAPHSQL);
        Param p = new Param();
        p.token = builder.token;
        this.setVariables(p);
    }

    private static final String GRAPHSQL = "query checkLoginStatus($token: String) {\n" +
        "      checkLoginStatus(token: $token) {\n" +
        "        status\n" +
        "        code\n" +
        "        message\n" +
        "        token {\n" +
        "          data {\n" +
        "            email\n" +
        "            id\n" +
        "            clientId\n" +
        "            unionid\n" +
        "          }\n" +
        "          iat\n" +
        "          exp\n" +
        "        }\n" +
        "      }\n" +
        "    }";
}  