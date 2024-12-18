package test.management.dataPermission.resource;

import cn.genauth.sdk.java.client.ManagementClient;
import cn.genauth.sdk.java.dto.CheckDataResourceExistsDto;
import cn.genauth.sdk.java.dto.CheckParamsDataResourceResponseDto;
import cn.genauth.sdk.java.model.ManagementClientOptions;
import cn.genauth.sdk.java.util.JsonUtils;


public class CheckDataResourceExistsTest {
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

        CheckDataResourceExistsDto request = new CheckDataResourceExistsDto();
        request.setNamespaceCode("examplePermissionNamespace");
        request.setResourceName("示例树数据资源名称");

        CheckParamsDataResourceResponseDto response1 = client.checkDataResourceExists(request);
        System.out.println(JsonUtils.serialize(response1));

        request.setNamespaceCode("examplePermissionNamespace");
        request.setResourceCode("treeResourceCode");

        CheckParamsDataResourceResponseDto response2 = client.checkDataResourceExists(request);
        System.out.println(JsonUtils.serialize(response2));
    }

}