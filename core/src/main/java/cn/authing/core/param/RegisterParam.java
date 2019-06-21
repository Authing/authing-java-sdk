package cn.authing.core.param;

import cn.authing.core.business.ImportantParam;
import cn.authing.core.utils.AuthingUtils;

public class RegisterParam extends AuthingParam<RegisterParam.Param> {

    public static class Builder {
        private String email;
        private String password;
        private String unionId;
        private String oauth;
        private String username;
        private String nickname;
        private String company;
        private String photo;
        private String lastIP;
        private String clientId;

        public Builder(String email, String password) {
            this.email = email;
            this.password = password;
        }

        public Builder(String unionId) {
            this.unionId = unionId;
        }

        public Builder nickname(String nickname) {
            this.nickname = nickname;
            return this;
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder company(String company) {
            this.company = company;
            return this;
        }

        public Builder photo(String photo) {
            this.photo = photo;
            return this;
        }

        public Builder oauth(String oauth) {
            this.oauth = oauth;
            return this;
        }

        public Builder lastIP(String lastIP) {
            this.lastIP = lastIP;
            return this;
        }

        public RegisterParam build() {
            this.password = AuthingUtils.encrypt(password);
            this.clientId = ImportantParam.INSTANCE.getClientId();
            return new RegisterParam(this);
        }
    }

    static class Param {
        private String email;
        private String password;
        private String unionid;
        private String oauth;
        private String username;
        private String nickname;
        private String company;
        private String photo;
        private String lastIP;
        private String registerInClient;
    }

    private RegisterParam(Builder builder) {
        super(GRAPHQL);
        Param p = new Param();
        p.email = builder.email;
        p.password = builder.password;
        p.unionid = builder.unionId;
        p.oauth = builder.oauth;
        p.username = builder.username;
        p.nickname = builder.nickname;
        p.company = builder.company;
        p.photo = builder.photo;
        p.lastIP = builder.lastIP;
        p.registerInClient = builder.clientId;
        this.setVariables(p);
    }

    private static final String GRAPHQL =
            "mutation register(\n" +
                    "    $unionid: String,\n" +
                    "    $email: String, \n" +
                    "    $password: String, \n" +
                    "    $lastIP: String, \n" +
                    "    $forceLogin: Boolean,\n" +
                    "    $registerInClient: String!,\n" +
                    "    $oauth: String,\n" +
                    "    $username: String,\n" +
                    "    $nickname: String,\n" +
                    "    $registerMethod: String,\n" +
                    "    $photo: String\n" +
                    ") {\n" +
                    "    register(userInfo: {\n" +
                    "        unionid: $unionid,\n" +
                    "        email: $email,\n" +
                    "        password: $password,\n" +
                    "        lastIP: $lastIP,\n" +
                    "        forceLogin: $forceLogin,\n" +
                    "        registerInClient: $registerInClient,\n" +
                    "        oauth: $oauth,\n" +
                    "        registerMethod: $registerMethod,\n" +
                    "        photo: $photo,\n" +
                    "        username: $username,\n" +
                    "        nickname: $nickname\n" +
                    "    }) {\n" +
                    "        _id,\n" +
                    "        email,\n" +
                    "        emailVerified,\n" +
                    "        username,\n" +
                    "        nickname,\n" +
                    "        company,\n" +
                    "        photo,\n" +
                    "        browser,\n" +
                    "        password,\n" +
                    "        token,\n" +
                    "        group {\n" +
                    "            name\n" +
                    "        },\n" +
                    "        blocked\n" +
                    "    }\n" +
                    "}";
}
