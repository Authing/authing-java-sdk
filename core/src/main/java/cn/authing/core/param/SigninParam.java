package cn.authing.core.param;

import cn.authing.core.business.ImportantParam;

public class SigninParam extends AuthingParam<SigninParam.Param> {

    public static class Builder {
        private String oidcAppId;
        private String email;
        private String userPoolId;
        private String phone;
        private String username;
        private String unionId;
        private String psd;
        // 初始化标识
        private int initFlag;

        public Builder initWithUnionId(String unionId) {
            if (initFlag > 0) {
                return this;
            }
            this.unionId = unionId;
            initFlag = 1;
            return this;
        }

        public Builder initWithEmail(String email, String psd) {
            if (initFlag > 0) {
                return this;
            }
            this.email = email;
            this.psd = psd;
            initFlag = 2;
            return this;
        }

        public Builder initWithPhone(String phone, String psd) {
            if (initFlag > 0) {
                return this;
            }
            this.phone = phone;
            this.psd = psd;
            initFlag = 3;
            return this;
        }

        public Builder initWithUsername(String username, String psd) {
            if (initFlag > 0) {
                return this;
            }
            this.username = username;
            this.psd = psd;
            initFlag = 4;
            return this;
        }

        public Builder oidcAppId(String oidcAppId) {
            this.oidcAppId = oidcAppId;
            return this;
        }

        public SigninParam build() throws Exception {
            if (initFlag <= 0) {
                throw new Exception("please init first");
            }
            this.userPoolId = ImportantParam.INSTANCE.getClientId();
            return new SigninParam(this);
        }
    }

    static class Param {
        private String oidcAppId;
        private String email;
        private String userPoolId;
        private String phone;
        private String username;
        private String unionid;
        private String password;
    }

    SigninParam(Builder builder) {
        super(GRAPHSQL);
        Param p = new Param();
        p.oidcAppId = builder.oidcAppId;
        p.email = builder.email;
        p.userPoolId = builder.userPoolId;
        p.phone = builder.phone;
        p.username = builder.username;
        p.unionid = builder.unionId;
        p.password = builder.psd;
        this.setVariables(p);
    }


    private static final String GRAPHSQL = "mutation SignIn($oidcAppId: String, $email: String, " +
        "$userPoolId: String, $phone: String, $username: String, $unionid: String, $password: " +
        "String) {\n" +
        "      signIn(oidcAppId: $oidcAppId,\n" +
        "      userPoolId: $userPoolId,\n" +
        "      email: $email,\n" +
        "      phone: $phone,\n" +
        "      password: $password,\n" +
        "      username: $username,\n" +
        "      unionid: $unionid) {\n" +
        "        sub\n" +
        "        birthdate\n" +
        "        family_name\n" +
        "        gender\n" +
        "        given_name\n" +
        "        locale\n" +
        "        middle_name\n" +
        "        name\n" +
        "        nickname\n" +
        "        picture\n" +
        "        preferred_username\n" +
        "        profile\n" +
        "        updated_at\n" +
        "        website\n" +
        "        zoneinfo\n" +
        "        username\n" +
        "        _id\n" +
        "        company\n" +
        "        browser\n" +
        "        device\n" +
        "        logins_count\n" +
        "        register_method\n" +
        "        blocked,\n" +
        "        last_ip\n" +
        "        register_in_userpool\n" +
        "        last_login\n" +
        "        signed_up\n" +
        "        email\n" +
        "        email_verified,\n" +
        "        phone_number\n" +
        "        phone_number_verified\n" +
        "        token\n" +
        "        access_token\n" +
        "        id_token\n" +
        "        refresh_token\n" +
        "        expires_in\n" +
        "        token_type\n" +
        "        scope\n" +
        "      }\n" +
        "    }";
}
