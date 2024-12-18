package test.management.dataPermission.namespace;

import cn.genauth.sdk.java.client.ManagementClient;
import cn.genauth.sdk.java.dto.UpdatePermissionNamespaceDto;
import cn.genauth.sdk.java.dto.UpdatePermissionNamespaceResponseDto;
import cn.genauth.sdk.java.model.ManagementClientOptions;
import cn.genauth.sdk.java.util.JsonUtils;


public class UpdatePermissionNamespaceTest {
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

        UpdatePermissionNamespaceDto request = new UpdatePermissionNamespaceDto();
        request.setCode("examplePermissionNamespace");
        request.setName("示例新权限空间名称");
        request.setNewCode("exampleNewPermissionNamespace");
        request.setDescription("示例新权限空间描述");

        UpdatePermissionNamespaceResponseDto response = client.updatePermissionNamespace(request);
        System.out.println(JsonUtils.serialize(response));
    }

}