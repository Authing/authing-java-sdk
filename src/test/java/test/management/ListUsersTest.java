package test.management;

import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.ListUsersRequestDto;
import cn.authing.sdk.java.dto.UserPaginatedRespDto;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

public class ListUsersTest {
    // 需要替换成你的 Authing Access Key ID
    private static final String ACCESS_KEY_ID = "65420f25860b4d15fc3cb5f7";
    // 需要替换成你的 Authing Access Key Secret
    private static final String ACCESS_KEY_SECRET = "bce50ebc079ffab84de4426e71fd6336";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        // 如果是私有化部署的客户，需要设置 Authing 服务域名
        // clientOptions.setHost("https://api.your-authing-service.com");

        ManagementClient client = new ManagementClient(clientOptions);

        UserPaginatedRespDto response = client.listUsers(new ListUsersRequestDto());
        System.out.println(JsonUtils.serialize(response));
    }
}
