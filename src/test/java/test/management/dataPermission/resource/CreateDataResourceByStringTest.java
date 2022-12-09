package test.management.dataPermission.resource;

import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.CreateStringDataResourceDto;
import cn.authing.sdk.java.dto.CreateStringDataResourceResponseDto;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.ArrayList;
import java.util.List;

public class CreateDataResourceByStringTest {
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

        CreateStringDataResourceDto reqDto = new CreateStringDataResourceDto();
        reqDto.setResourceCode("stringResourceCode");
        reqDto.setNamespaceCode("examplePermissionNamespace");
        reqDto.setResourceName("示例字符串数据资源");
        List<String> list = new ArrayList<>();
        list.add("read");
        list.add("get");
        reqDto.setActions(list);
        reqDto.setStruct("exampleStringStruct");
        reqDto.setDescription("示例字符串数据资源描述");
        CreateStringDataResourceResponseDto response = client.createDataResourceByString(reqDto);
        System.out.println(JsonUtils.serialize(response));
    }
}
