package cn.genauth.sdk.java.client;

import cn.genauth.sdk.java.model.AuthingClientOptions;
import cn.genauth.sdk.java.model.AuthingRequestConfig;
import cn.genauth.sdk.java.util.JsonUtils;
import cn.genauth.sdk.java.model.Receiver;

/**
 * @author luojielin
 */
public class BaseClient {

    protected AuthingClientOptions options;

    public BaseClient(AuthingClientOptions options) {
        this.options = options;
    }

    public static <T> T deserialize(String content, Class<T> valueType) {
         return JsonUtils.deserialize(content, valueType);
    }

    public static String serialize(Object value) {
        return JsonUtils.serialize(value);
    }

    public String request(AuthingRequestConfig config) {
        return options.doRequest(config.getUrl(), config.getMethod(), config.getHeaders(), config.getBody());
    }

    public void subEvent(String eventCode, Receiver receiver){
    }
}
