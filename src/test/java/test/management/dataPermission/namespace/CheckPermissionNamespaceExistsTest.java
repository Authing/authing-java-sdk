package test.management.dataPermission.namespace;

import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.CheckPermissionNamespaceExistsDto;
import cn.authing.sdk.java.dto.PermissionNamespaceCheckExistsRespDto;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;


public class CheckPermissionNamespaceExistsTest {

    // 需要替换成你的 Authing Access Key ID
    private static final String ACCESS_KEY_ID = "63805c471fad0e46f020ba3d";
    // 需要替换成你的 Authing Access Key Secret
    private static final String ACCESS_KEY_SECRET = "6559485abfae9c0918a9ec6578dfb006";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        // 如果是私有化部署的客户，需要设置 Authing 服务域名
        // clientOptions.setHost("https://api.your-authing-service.com");
        ManagementClient client = new ManagementClient(clientOptions);

        CheckPermissionNamespaceExistsDto request1 = new CheckPermissionNamespaceExistsDto();
        request1.setName("示例权限空间名称");
        PermissionNamespaceCheckExistsRespDto response1 = client.checkPermissionNamespaceExists(request1);
        System.out.println(JsonUtils.serialize(response1));

        CheckPermissionNamespaceExistsDto request2 = new CheckPermissionNamespaceExistsDto();
        request2.setCode("examplePermissionNamespace");
        PermissionNamespaceCheckExistsRespDto response2 = client.checkPermissionNamespaceExists(request2);
        System.out.println(JsonUtils.serialize(response2));
    }
}