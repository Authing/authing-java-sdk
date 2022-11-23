package test.management.dataPermission.namespace;

import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.CheckPermissionNamespaceExistsDto;
import cn.authing.sdk.java.dto.PermissionNamespaceCheckExistsRespDto;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;


public class CheckPermissionNamespaceExistsTest {

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

        CheckPermissionNamespaceExistsDto request = new CheckPermissionNamespaceExistsDto();
        request.setName("name_7991");
        request.setCode("code_6301");

        PermissionNamespaceCheckExistsRespDto response = client.checkPermissionNamespaceExists(request);
        System.out.println(JsonUtils.serialize(response));
    }

}