package cn.authing.sdk.java.model;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.http.Header;
import cn.hutool.http.Method;
import com.auth0.jwt.JWT;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.sun.nio.sctp.IllegalReceiveException;
import cn.authing.sdk.java.enums.LanguageEnum;
import cn.authing.sdk.java.util.HttpUtils;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ManagementClientOptions extends AuthingClientOptions {
    
    /**
     * 用户池 ID
     **/
    private String accessKeyId;
    
    /**
     * 用户池/应用密钥
     **/
    private String accessKeySecret;
    
    /**
     * 租户 ID
     **/
    private String tenantId;
    
    /**
     * 超时时间
     */
    private int timeout = 10000;
    

    /**
     * 语言
     */
    private LanguageEnum lang = LanguageEnum.CHINESE;
    
    /**
     * Authing 服务器地址
     */
    private String host = "https://core.authing.cn";
    
    /**
     * 请求头 key，适用于去 Authing 品牌化场景
     */
    private Map<String, String> headers = new HashMap<>();
    
    public ManagementClientOptions() {
    }
    
    public ManagementClientOptions(String accessKeyId, String accessKeySecret) {
        this.accessKeyId = accessKeyId;
        this.accessKeySecret = accessKeySecret;
    }
    
    /**
     * 管理端 token 存储
     **/
    private final ManagementTokenProvider tokenProvider;
    
    {
        tokenProvider = new ManagementTokenProvider(this);
    }
    
    @Override
    public String doRequest(String url, String method, Map<String, String> headers, Object body) {
        headers.put(Header.CONTENT_TYPE.getValue(), "application/json;charset=UTF-8");
        headers.put("x-authing-app-tenant-id", getTenantId());
        headers.put("x-authing-request-from", AuthingClientOptions.REQUEST_FROM);
        headers.put("x-authing-sdk-version", AuthingClientOptions.SDK_VERSION);
        headers.put("x-authing-lang", getLang().getValue());
        if (!Objects.equals("/api/v3/get-management-token", url) && StrUtil.isNotBlank(this.tokenProvider.getAccessToken())) {
            headers.put("Authorization", this.tokenProvider.getAccessToken());
            headers.put("x-authing-userpool-id", tokenProvider.getUserPoolId());
        }
        if (CollectionUtil.isNotEmpty(getHeaders())) {
            headers.putAll(getHeaders());
        }
        return HttpUtils.request(getHost() + url, method, body, headers, getTimeout());
    }
    
    
    public String getAccessKeyId() {
        return accessKeyId;
    }
    
    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }
    
    public String getAccessKeySecret() {
        return accessKeySecret;
    }
    
    public void setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
    }
    
    public String getTenantId() {
        return tenantId;
    }
    
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
    
    public int getTimeout() {
        return timeout;
    }
    
    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }
    
    public LanguageEnum getLang() {
        return lang;
    }
    
    public void setLang(LanguageEnum lang) {
        this.lang = lang;
    }
    
    public String getHost() {
        return host;
    }
    
    public void setHost(String host) {
        this.host = host;
    }
    
    public Map<String, String> getHeaders() {
        return headers;
    }
    
    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }
    
    
    public static class ManagementTokenProvider {
        
        private final ManagementClientOptions options;
        
        private String accessToken;
        private long accessTokenExpiredAt = 0L;
        private String userPoolId;
        
        public ManagementTokenProvider(ManagementClientOptions options) {
            this.options = options;
        }
        
        public String getAccessToken() {
            checkLoginStatus();
            return accessToken;
        }
        
        public String getUserPoolId() {
            checkLoginStatus();
            return userPoolId;
        }
        
        private void checkLoginStatus() {
            if (StrUtil.isNotBlank(this.accessToken) && this.accessTokenExpiredAt > (System.currentTimeMillis() / 1000)) {
                return;
            }
            // token 失效， 登录
            doLogin();
        }
        
        private void doLogin() {
            Map<String, Object> body = new HashMap<>();
            body.put("accessKeyId", options.getAccessKeyId());
            body.put("accessKeySecret", options.getAccessKeySecret());
            String response = HttpUtils.request(options.getHost() + "/api/v3/get-management-token", Method.POST.name(),
                    body, null, options.getTimeout());
            LoginResponse loginResponse = JsonUtils.deserialize(response, LoginResponse.class);
            if (loginResponse == null) {
                throw new IllegalReceiveException("response is null");
            }
            if (loginResponse.statusCode != 200) {
                throw new RuntimeException(loginResponse.getMessage());
            }
            // 重新存储 accessToken，过期时间
            this.accessToken = loginResponse.getData().getAccess_token();
            this.accessTokenExpiredAt = System.currentTimeMillis() / 1000 + loginResponse.getData().getExpires_in();
            // 解析 token
            DecodedJWT decode = JWT.decode(this.accessToken);
            // 存储 token 中的 用户池 ID
            this.userPoolId = decode.getClaim("scoped_userpool_id").asString();
        }
        
        public static class LoginResponse {
            
            private Integer statusCode;
            private String message;
            private Data data;

            public Integer getStatusCode() {
                return statusCode;
            }

            public void setStatusCode(Integer statusCode) {
                this.statusCode = statusCode;
            }

            public String getMessage() {
                return message;
            }
            
            public void setMessage(String message) {
                this.message = message;
            }
            
            public Data getData() {
                return data;
            }
            
            public void setData(Data data) {
                this.data = data;
            }
            
            @SuppressWarnings("all")
            public static class Data {
                
                private String access_token;
                private Long expires_in;
                
                public String getAccess_token() {
                    return access_token;
                }
                
                public void setAccess_token(String access_token) {
                    this.access_token = access_token;
                }
                
                public Long getExpires_in() {
                    return expires_in;
                }
                
                public void setExpires_in(Long expires_in) {
                    this.expires_in = expires_in;
                }
            }
        }
        
    }
}
