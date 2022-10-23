package test.management;

import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.AuthorizedResourcePaginatedRespDto;
import cn.authing.sdk.java.dto.GetAuthorizedResourcesDto;
import cn.authing.sdk.java.dto.TargetDto;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

public class GetAuthorizedResourcesTest {
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

        GetAuthorizedResourcesDto reqDto = new GetAuthorizedResourcesDto();
        reqDto.setTargetType(TargetDto.TargetType.USER.getValue());
        reqDto.setTargetIdentifier("6343b98b7cfxxx9366e9b7c");
        AuthorizedResourcePaginatedRespDto response = client.getAuthorizedResources(reqDto);
        System.out.println(JsonUtils.serialize(response));
    }
}
