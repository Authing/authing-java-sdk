package cn.authing.sdk.java.model;

import java.util.Map;

/**
 * AuthingClientOptions
 *
 * @author chho
 */
public abstract class AuthingClientOptions {

    /**
     * SDK 版本
     */
    public static final String SDK_VERSION = "1.0.0";

    /**
     * 请求来源
     */
    public static final String REQUEST_FROM = "java-sdk";

    /**
     * 调用
     *
     * @param url    地址
     * @param method 方法
     * @param body   请求内容
     * @return 响应
     */
    public abstract String doRequest(String url, String method, Map<String, String> headers, Object body);
}
