package test.management.dataPermission.resource;

import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.CreateDataResourceDto;
import cn.authing.sdk.java.dto.CreateDataResourceResponseDto;
import cn.authing.sdk.java.dto.DataResourceTreeStructs;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CreateDataResourceTest {
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

        CreateDataResourceDto request = new CreateDataResourceDto();
        request.setNamespaceCode("examplePermissionNamespace");
        request.setResourceCode("treeResourceCode");
        request.setResourceName("示例树数据资源");
        request.setType(CreateDataResourceDto.Type.TREE);
        ArrayList<DataResourceTreeStructs> dataResourceTreeStructList = new ArrayList<>();
        DataResourceTreeStructs dataResourceTreeStruct1 = new DataResourceTreeStructs();
        dataResourceTreeStruct1.setCode("tree1");
        dataResourceTreeStruct1.setName("树节点1");
        dataResourceTreeStruct1.setValue("树节点1描述");
        List<DataResourceTreeStructs> childrenList = new ArrayList<>();
        DataResourceTreeStructs dataResourceTreeStructChildren = new DataResourceTreeStructs();
        dataResourceTreeStructChildren.setCode("tree11");
        dataResourceTreeStructChildren.setName("树节点11");
        dataResourceTreeStructChildren.setValue("树节点11描述");
        childrenList.add(dataResourceTreeStructChildren);
        dataResourceTreeStruct1.setChildren(childrenList);
        DataResourceTreeStructs dataResourceTreeStruct2 = new DataResourceTreeStructs();
        dataResourceTreeStruct1.setCode("tree2");
        dataResourceTreeStruct1.setName("树节点2");
        dataResourceTreeStruct1.setValue("树节点2描述");
        dataResourceTreeStructList.add(dataResourceTreeStruct2);
        request.setStruct(dataResourceTreeStructList);
        request.setDescription("示例树数据资源描述");
        ArrayList<String> actions = new ArrayList<>();
        actions.add("get");
        actions.add("read");
        request.setActionList(actions);






        CreateDataResourceResponseDto response = client.createDataResource(request);
        System.out.println(JsonUtils.serialize(response));
    }

}