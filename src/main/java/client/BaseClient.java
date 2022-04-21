package client;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import model.AuthingRequestConfig;
import model.ManagementClientOptions;

/**
 * @author luojielin
 */
public class BaseClient {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    protected ManagementClientOptions options = new ManagementClientOptions();

    static {
        //属性为NULL不被序列化
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        //反序列化的时候如果多了其他属性,不抛出异常
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        //如果是空对象的时候,不抛异常
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    }

    public static <T> T deserialize(String content, Class<T> valueType) {
        try {
            T t = objectMapper.readValue(content, valueType);
            return t;
        } catch (Exception e) {
            return null;
        }
    }

    public static String request (AuthingRequestConfig config) {
        return "";
    }
}
