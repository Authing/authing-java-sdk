package cn.authing.core.param;

import java.util.HashMap;
import java.util.Map;

public class LoginByOidcParam {

    public static class Builder {
        private String clientId;
        private String secret;
        private String scope = "openid profile email phone";
        private String grantType = "password";
        private String email;
        private String phone;
        private String username;
        private String unionId;
        private String psd;
        // 初始化标识
        private int initFlag;

        public Builder(String oidcClientId, String oidcClientSecret) {
            this.clientId = oidcClientId;
            this.secret = oidcClientSecret;
        }

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

        public LoginByOidcParam build() throws Exception {
            if (initFlag <= 0) {
                throw new Exception("please init first");
            }
            return new LoginByOidcParam(this);
        }
    }

    private static final String KEY_CLIENT_ID = "client_id";
    private static final String KEY_CLIENT_SECRET = "client_secret";
    private static final String KEY_GRANT_TYPE = "grant_type";
    private static final String KEY_SCOPE = "scope";
    private static final String KEY_EMAIL = "email";
    private static final String KEY_PHONE = "phone";
    private static final String KEY_USERNAME = "username";
    private static final String KEY_UNION_ID = "unionid";
    private static final String KEY_PSD = "password";
    private Map<String, String> params = new HashMap<>();

    LoginByOidcParam(Builder builder) {
        params.put(KEY_CLIENT_ID, builder.clientId);
        params.put(KEY_CLIENT_SECRET, builder.secret);
        params.put(KEY_GRANT_TYPE, builder.grantType);
        params.put(KEY_SCOPE, builder.scope);
        if (builder.initFlag == 1) {
            params.put(KEY_UNION_ID, builder.unionId);
        } else if (builder.initFlag == 2) {
            params.put(KEY_EMAIL, builder.email);
            params.put(KEY_PSD, builder.psd);
        } else if (builder.initFlag == 3) {
            params.put(KEY_PHONE, builder.phone);
            params.put(KEY_PSD, builder.psd);
        } else if (builder.initFlag == 4) {
            params.put(KEY_USERNAME, builder.username);
            params.put(KEY_PSD, builder.psd);
        }
    }

    public Map<String, String> getParams() {
        return params;
    }
}
