package test.management.dataPermission.namespace;

import cn.genauth.sdk.java.client.ManagementClient;
import cn.genauth.sdk.java.dto.GetPermissionNamespaceListResponseDto;
import cn.genauth.sdk.java.dto.GetPermissionNamespacesBatchDto;
import cn.genauth.sdk.java.model.ManagementClientOptions;
import cn.genauth.sdk.java.util.JsonUtils;


public class GetPermissionNamespacesBatchTest {

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
        GetPermissionNamespacesBatchDto request = new GetPermissionNamespacesBatchDto();
        request.setCodes("code1,code2");
        GetPermissionNamespaceListResponseDto response = client.getPermissionNamespacesBatch(request);
        System.out.println(JsonUtils.serialize(response));
    }

}