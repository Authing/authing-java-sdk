package test.management.dataPermission.authentication;

import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.CheckUserSameLevelPermissionDto;
import cn.authing.sdk.java.dto.CheckUserSameLevelPermissionRespDto;
import cn.authing.sdk.java.dto.CheckUserSameLevelPermissionResponseDto;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;


public class CheckUserSameLevelPermissionTest {

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

        CheckUserSameLevelPermissionDto request = new CheckUserSameLevelPermissionDto();
        request.setNamespaceCode("examplePermissionNamespace");
        request.setUserId("63721xxxxxxxxxxxxdde14a3");
        request.setAction("get");
        request.setResource("strResourceCode1");

        CheckUserSameLevelPermissionResponseDto response = client
                .checkUserSameLevelPermission(request);
        System.out.println(JsonUtils.serialize(response));
    }

}