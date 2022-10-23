package cn.authing.sdk.java.util;

import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import cn.hutool.http.Method;
import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;

import java.util.Map;
import java.util.Set;

/**
 * @author luojielin
 */
@SuppressWarnings("all")
public class HttpUtils {
    
    private static final Log log = LogFactory.get("[Authing]");
    
    public static String request(String url, String method, Object body, Map<String, String> headers, int timeout) {
        long start = System.currentTimeMillis();
        HttpResponse httpResponse = null;
        switch (method) {
            case "GET":
                url = buildUrlWithQueryParams(url, JsonUtils.deserialize(JsonUtils.serialize(body), Map.class));
                log.info("请求 url： {}", url);
                httpResponse = HttpUtil
                        .createRequest(Method.valueOf(method), url)
                        .setReadTimeout(timeout)
                        .setConnectionTimeout(timeout)
                        .headerMap(headers, true)
                        .execute();
                break;
            case "POST":
                String bodyString = JsonUtils.serialize(body);
                log.info("请求 url：{}, body: {}", url, bodyString);
                httpResponse = HttpUtil
                        .createRequest(Method.valueOf(method), url)
                        .setReadTimeout(timeout)
                        .body(bodyString)
                        .setConnectionTimeout(timeout)
                        .headerMap(headers, true)
                        .execute();
                break;

            case "UrlencodedPOST":
                String urlencodedBodyString = buildQueryParams(JsonUtils.deserialize(JsonUtils.serialize(body), Map.class));
                log.info("请求 url：{}, body: {}", url, urlencodedBodyString);
                httpResponse = HttpUtil
                        .createRequest(Method.valueOf("POST"), url)
                        .setReadTimeout(timeout)
                        .body(urlencodedBodyString)
                        .setConnectionTimeout(timeout)
                        .headerMap(headers, true)
                        .execute();
                break;
            default:
                throw new IllegalArgumentException();
        }
        if (httpResponse.isOk()) {
            String response = httpResponse.body();
            log.info("响应：{}, 耗时：{} ms", response, (System.currentTimeMillis() - start));
            return response;
        } else {
            throw new RuntimeException(httpResponse.body());
        }
    }
    
    public static String buildUrlWithQueryParams(String url, Map<String, Object> params) {
        StringBuilder sb = new StringBuilder(url);
        if(params != null && !params.isEmpty()){
            sb.append("?");
            sb.append(buildQueryParams(params));
            sb.deleteCharAt(sb.length()-1);
        }
        return sb.toString();
    }

    public static String buildQueryParams(Map<String, Object> params) {
        StringBuilder sb = new StringBuilder();
        if (params != null && !params.isEmpty()) {
            Set<Map.Entry<String, Object>> entries = params.entrySet();
            for (Map.Entry<String, Object> entry : entries) {
                if (entry.getValue() != null) {
                    sb.append(entry.getKey()).append("=").append(entry.getValue().toString()).append("&");
                }
            }
        }
        return sb.toString();
    }
    
    
}
