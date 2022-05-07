package util;

import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import cn.hutool.http.Method;

import java.util.Map;

/**
 * @author luojielin
 */
public class HttpUtils {
    
    
    public static String request(String url, String method, String body, Map<String, String> headers, int timeout) {
        HttpResponse httpResponse = HttpUtil
                .createRequest(Method.valueOf(method), url)
                .setReadTimeout(timeout)
                .setConnectionTimeout(timeout)
                .body(body)
                .headerMap(headers, true)
                .execute();
        if (httpResponse.isOk()) {
            return httpResponse.body();
        } else {
            throw new RuntimeException(httpResponse.body());
        }
    }
    
    
}
