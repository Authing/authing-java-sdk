package test.management.dataPermission.resource;

import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.CreateArrayDataResourceDto;
import cn.authing.sdk.java.dto.CreateArrayDataResourceResponseDto;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CreateDataResourceByArrayTest {
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

        CreateArrayDataResourceDto reqDto = new CreateArrayDataResourceDto();
        reqDto.setResourceCode("arrayResourceCode");
        reqDto.setResourceName("示例数组数据资源");
        reqDto.setNamespaceCode("examplePermissionNamespace");
        List<String> list = new ArrayList<>();
        list.add("read");
        list.add("get");
        reqDto.setActions(list);
        List<String> list1 = new ArrayList<>();
        list1.add("exampleArrayStruct1");
        list1.add("exampleArrayStruct2");
        reqDto.setStruct(list1);
        reqDto.setDescription("示例数组数据资源描述");
        CreateArrayDataResourceResponseDto response = client.createDataResourceByArray(reqDto);
        System.out.println(JsonUtils.serialize(response));
    }
}
