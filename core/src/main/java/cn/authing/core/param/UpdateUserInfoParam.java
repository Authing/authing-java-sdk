package cn.authing.core.param;

import org.jetbrains.annotations.NotNull;

import cn.authing.core.business.ImportantParam;
import cn.authing.core.utils.AuthingUtils;

public class UpdateUserInfoParam extends AuthingParam<UpdateUserInfoParam.Param> {

    public static class Builder {
        private String userId;
        private String clientId;
        private String email;
        private Boolean emailVerified;
        private String username;
        private String nickname;
        private String company;
        private String photo;
        private String browser;
        private String password;
        private String oldPassword;
        private String token;
        private String tokenExpiredAt;
        private Integer loginsCount;
        private String lastLogin;
        private String lastIP;
        private String signedUp;
        private Boolean blocked;
        private Boolean isDeleted;

        public Builder(String userId) {
            this.userId = userId;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder emailVerified(boolean emailVerified) {
            this.emailVerified = emailVerified;
            return this;
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder nickname(String nickname) {
            this.nickname = nickname;
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

        public Builder browser(String browser) {
            this.browser = browser;
            return this;
        }

        public Builder password(@NotNull String oldPassword, @NotNull String password) {
            this.oldPassword = oldPassword;
            this.password = password;
            return this;
        }

        public Builder token(String token) {
            this.token = token;
            return this;
        }

        public Builder tokenExpiredAt(String tokenExpiredAt) {
            this.tokenExpiredAt = tokenExpiredAt;
            return this;
        }

        public Builder loginsCount(int loginsCount) {
            this.loginsCount = loginsCount;
            return this;
        }

        public Builder lastLogin(String lastLogin) {
            this.lastLogin = lastLogin;
            return this;
        }

        public Builder lastIP(String lastIP) {
            this.lastIP = lastIP;
            return this;
        }

        public Builder signedUp(String signedUp) {
            this.signedUp = signedUp;
            return this;
        }

        public Builder blocked(boolean blocked) {
            this.blocked = blocked;
            return this;
        }

        public Builder isDeleted(boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }

        public UpdateUserInfoParam build() {
            this.clientId = ImportantParam.INSTANCE.getClientId();
            if (oldPassword != null && password != null) {
                oldPassword = AuthingUtils.encrypt(oldPassword);
                password = AuthingUtils.encrypt(password);
            }
            return new UpdateUserInfoParam(this);
        }
    }

    static class Param {
        private String _id;
        private String registerInClient;
        private String email;
        private Boolean emailVerified;
        private String username;
        private String nickname;
        private String company;
        private String photo;
        private String browser;
        private String password;
        private String oldPassword;
        private String token;
        private String tokenExpiredAt;
        private Integer loginsCount;
        private String lastLogin;
        private String lastIP;
        private String signedUp;
        private Boolean blocked;
        private Boolean isDeleted;
    }

    UpdateUserInfoParam(Builder builder) {
        super(GRAPHQL);
        Param p = new Param();
        p._id = builder.userId;
        p.registerInClient = builder.clientId;
        p.email = builder.email;
        p.emailVerified = builder.emailVerified;
        p.username = builder.username;
        p.nickname = builder.nickname;
        p.company = builder.company;
        p.photo = builder.photo;
        p.browser = builder.browser;
        p.password = builder.password;
        p.oldPassword = builder.oldPassword;
        p.token = builder.token;
        p.tokenExpiredAt = builder.tokenExpiredAt;
        p.loginsCount = builder.loginsCount;
        p.lastLogin = builder.lastLogin;
        p.lastIP = builder.lastIP;
        p.signedUp = builder.signedUp;
        p.blocked = builder.blocked;
        p.isDeleted = builder.isDeleted;
        this.setVariables(p);
    }

    private static final String GRAPHQL =
            "mutation UpdateUser(\n" +
                    "    $_id: String!,\n" +
                    "    $email: String,\n" +
                    "    $emailVerified: Boolean,\n" +
                    "    $username: String,\n" +
                    "    $nickname: String,\n" +
                    "    $company: String,\n" +
                    "    $photo: String,\n" +
                    "    $browser: String,\n" +
                    "    $password: String,\n" +
                    "    $oldPassword: String,\n" +
                    "    $registerInClient: String!,\n" +
                    "    $token: String,\n" +
                    "    $tokenExpiredAt: String,\n" +
                    "    $loginsCount: Int,\n" +
                    "    $lastLogin: String,\n" +
                    "    $lastIP: String,\n" +
                    "    $signedUp: String,\n" +
                    "    $blocked: Boolean,\n" +
                    "    $isDeleted: Boolean\n" +
                    "){\n" +
                    "  updateUser(options: {\n" +
                    "    _id: $_id,\n" +
                    "    email: $email,\n" +
                    "    emailVerified: $emailVerified,\n" +
                    "    username: $username,\n" +
                    "    nickname: $nickname,\n" +
                    "    company: $company,\n" +
                    "    photo: $photo,\n" +
                    "    browser: $browser,\n" +
                    "    password: $password,\n" +
                    "    oldPassword: $oldPassword,\n" +
                    "    registerInClient: $registerInClient,\n" +
                    "    token: $token,\n" +
                    "    tokenExpiredAt: $tokenExpiredAt,\n" +
                    "    loginsCount: $loginsCount,\n" +
                    "    lastLogin: $lastLogin,\n" +
                    "    lastIP: $lastIP,\n" +
                    "    signedUp: $signedUp,\n" +
                    "    blocked: $blocked,\n" +
                    "    isDeleted: $isDeleted\n" +
                    "  }) {\n" +
                    "    _id\n" +
                    "    email\n" +
                    "    emailVerified\n" +
                    "    username\n" +
                    "    nickname\n" +
                    "    company\n" +
                    "    photo\n" +
                    "    browser\n" +
                    "    registerInClient\n" +
                    "    registerMethod\n" +
                    "    oauth\n" +
                    "    token\n" +
                    "    tokenExpiredAt\n" +
                    "    loginsCount\n" +
                    "    lastLogin\n" +
                    "    lastIP\n" +
                    "    signedUp\n" +
                    "    blocked\n" +
                    "    isDeleted\n" +
                    "  }\n" +
                    "}";
}
