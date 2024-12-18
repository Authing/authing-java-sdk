package test.management.dataPermission.namespace;

import cn.genauth.sdk.java.client.ManagementClient;
import cn.genauth.sdk.java.dto.CreatePermissionNamespacesBatchDto;
import cn.genauth.sdk.java.dto.CreatePermissionNamespacesBatchItemDto;
import cn.genauth.sdk.java.dto.IsSuccessRespDto;
import cn.genauth.sdk.java.model.ManagementClientOptions;
import cn.genauth.sdk.java.util.JsonUtils;

import java.util.ArrayList;
import java.util.List;

public class CreatePermissionNamespacesBatchTest {

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
        CreatePermissionNamespacesBatchDto request = new CreatePermissionNamespacesBatchDto();
        List<CreatePermissionNamespacesBatchItemDto> createPermissionNamespacesBatch =  new ArrayList<>();
        CreatePermissionNamespacesBatchItemDto createPermissionNamespacesBatchItem1 = new CreatePermissionNamespacesBatchItemDto();
        createPermissionNamespacesBatchItem1.setName("示例权限空间1");
        createPermissionNamespacesBatchItem1.setCode("examplePermissionNamespace1");
        createPermissionNamespacesBatchItem1.setDescription("示例权限空间1描述");
        createPermissionNamespacesBatch.add(createPermissionNamespacesBatchItem1);
        CreatePermissionNamespacesBatchItemDto createPermissionNamespacesBatchItem2 = new CreatePermissionNamespacesBatchItemDto();
        createPermissionNamespacesBatchItem2.setName("示例权限空间2");
        createPermissionNamespacesBatchItem2.setCode("examplePermissionNamespace2");
        createPermissionNamespacesBatchItem2.setDescription("示例权限空间2描述");
        createPermissionNamespacesBatch.add(createPermissionNamespacesBatchItem2);
        request.setList(createPermissionNamespacesBatch);
        IsSuccessRespDto response = client.createPermissionNamespacesBatch(request);
        System.out.println(JsonUtils.serialize(response));
    }

}