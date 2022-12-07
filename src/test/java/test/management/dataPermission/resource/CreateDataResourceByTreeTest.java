package test.management.dataPermission.resource;

import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.CreateTreeDataResourceDto;
import cn.authing.sdk.java.dto.CreateTreeDataResourceResponseDto;
import cn.authing.sdk.java.dto.DataResourceTreeStructs;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CreateDataResourceByTreeTest {
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

        CreateTreeDataResourceDto reqDto = new CreateTreeDataResourceDto();
        reqDto.setActions(Collections.singletonList("read"));
        reqDto.setResourceCode("resource_code");
        reqDto.setResourceName("resource_name");
        reqDto.setNamespaceCode("namespace_code");
        List<DataResourceTreeStructs> treeList = new ArrayList<>();
        DataResourceTreeStructs struct = new DataResourceTreeStructs();
        struct.setCode("code");
        struct.setName("name");
        List<DataResourceTreeStructs> children = new ArrayList<>();
        DataResourceTreeStructs child = new DataResourceTreeStructs();
        child.setName("child_name");
        child.setCode("child_code");
        child.setValue("child_value");
        children.add(child);
        struct.setChildren(children);
        treeList.add(struct);
        reqDto.setStruct(treeList);
        CreateTreeDataResourceResponseDto response = client.createDataResourceByTree(reqDto);
        System.out.println(JsonUtils.serialize(response));
    }
}
