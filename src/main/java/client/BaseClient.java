package client;

import model.AuthingClientOptions;
import model.AuthingRequestConfig;
import util.JsonUtils;

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
        return options.doRequest(config.getUrl(), config.getMethod(), config.getBody());
    }
    
    
}
