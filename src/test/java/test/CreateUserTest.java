package test;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

public class CreateUserTest {
    private static final String ACCESS_KEY_ID = "635210dd91457bd104b8ee9e";
    private static final String ACCESS_KEY_SECRET = "affb932a9312fd5f9ea1141cfbfa1530";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        clientOptions.setHost("http://console.test2.authing-inc.co/");
        ManagementClient client = new ManagementClient(clientOptions);

        CreateUserReqDto request = new CreateUserReqDto();
        request.setEmail("test@example.com");
        request.setPassword("passw0rd");
        UserSingleRespDto response = client.createUser(request);
        System.out.println(JsonUtils.serialize(response));
    }
}