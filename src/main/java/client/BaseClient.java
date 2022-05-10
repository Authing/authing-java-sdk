package client;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import model.AuthingRequestConfig;
import model.ManagementClientOptions;
import okhttp3.*;
import util.HttpClientUtils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * @author luojielin
 */
public class BaseClient {

    private static final OkHttpClient okHttpClient = new OkHttpClient.Builder()
            .connectTimeout(50L, TimeUnit.SECONDS)
            .readTimeout(60L, TimeUnit.SECONDS)
            .build();
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

    public static String serialize(Object value) {
        try {
            String result = objectMapper.writeValueAsString(value);
            return result;
        } catch (Exception e) {
            return null;
        }
    }

    public String request (AuthingRequestConfig config) {
        Request request;

        switch (config.getMethod()) {
            case "GET":
                request = new Request.Builder().get().url(config.getUrl()).build();
                break;
            case "POST":
                RequestBody requestBody = RequestBody.create(BaseClient.serialize(config.getBody()), MediaType.get("application/json;charset=UTF-8"));
                request = new Request.Builder().post(requestBody).url(options.getHost() + config.getUrl()).build();
            default:
                return null;
        }
        Call call = okHttpClient.newCall(request);
        Response response = null;
        try {
            response = okHttpClient.newCall(request).execute();
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected code " + response);
            }
            return String.valueOf(response.body());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
