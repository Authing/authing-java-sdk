package test.management;

import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.RefreshApplicationSecretDto;
import cn.authing.sdk.java.dto.RefreshApplicationSecretRespDto;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

public class RefreshApplicationSecretTest {
    // 需要替换成你的 Authing Access Key ID
    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    // 需要替换成你的 Authing Access Key Secret
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        // 如果是私有化部署的客户，需要设置 Authing 服务域名
        // clientOptions.setHost("https://api.your-authing-service.com");

        ManagementClient client = new ManagementClient(clientOptions);

        RefreshApplicationSecretDto reqDto = new RefreshApplicationSecretDto();
        reqDto.setAppId("6229ffaxxxxxxxxcade3e3d9");
        RefreshApplicationSecretRespDto response = client.refreshApplicationSecret(reqDto);
        System.out.println(JsonUtils.serialize(response));
    }
}
