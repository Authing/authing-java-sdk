package cn.authing.sdk.java.model;

import java.util.Map;

/**
 * AuthingClientOptions
 *
 * @author chho
 */
public abstract class AuthingClientOptions {
    
    public static final String SDK_VERSION = "1.0.0";
    
    /**
     * 调用
     *
     * @param url    地址
     * @param method 方法
     * @param body   请求内容
     * @return 响应
     */
    public String doRequest(String url, String method, Map<String, String> headers, Object body) {
        return null;
    }
}
