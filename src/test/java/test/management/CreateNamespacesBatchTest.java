package test.management;

import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.CreateNamespacesBatchDto;
import cn.authing.sdk.java.dto.CreateNamespacesBatchItemDto;
import cn.authing.sdk.java.dto.IsSuccessRespDto;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.ArrayList;
import java.util.List;

public class CreateNamespacesBatchTest {
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

        CreateNamespacesBatchDto reqDto = new CreateNamespacesBatchDto();
        List<CreateNamespacesBatchItemDto> list = new ArrayList<>();
        CreateNamespacesBatchItemDto batchItemDto = new CreateNamespacesBatchItemDto();
        batchItemDto.setCode("code1");
        batchItemDto.setName("name1");
        list.add(batchItemDto);
        reqDto.setList(list);
        IsSuccessRespDto response = client.createNamespacesBatch(reqDto);
        System.out.println(JsonUtils.serialize(response));
    }
}
