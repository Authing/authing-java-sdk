package cn.authing.core.param;

import java.util.HashMap;

public class RefreshOidcTokenParam {
    public static class Builder {
        private String clientId;
        private String secret;
        private String refreshToken;
        private String grantType;

        public Builder(String oidcClientId, String oidcClientSecret, String refreshToken) {
            this.clientId = oidcClientId;
            this.secret = oidcClientSecret;
            this.refreshToken = refreshToken;
        }

        public RefreshOidcTokenParam build() {
            grantType = "refresh_token";
            return new RefreshOidcTokenParam(this);
        }
    }

    private static final String KEY_CLIENT_ID = "client_id";
    private static final String KEY_CLIENT_SECRET = "client_secret";
    private static final String KEY_REFRESH_TOKEN = "refresh_token";
    private static final String KEY_GRANT_TYPE = "grant_type";
    private HashMap<String, String> params = new HashMap<>();

    RefreshOidcTokenParam(Builder builder) {
        params.put(KEY_CLIENT_ID, builder.clientId);
        params.put(KEY_CLIENT_SECRET, builder.secret);
        params.put(KEY_GRANT_TYPE, builder.grantType);
        params.put(KEY_REFRESH_TOKEN, builder.refreshToken);
    }

    public HashMap<String, String> getParams() {
        return params;
    }
}
