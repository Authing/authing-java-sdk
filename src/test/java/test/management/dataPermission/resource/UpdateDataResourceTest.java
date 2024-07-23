package test.management.dataPermission.resource;

import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.DataResourceTreeStructs;
import cn.authing.sdk.java.dto.UpdateDataResourceDto;
import cn.authing.sdk.java.dto.UpdateDataResourceResponseDto;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;
import cn.hutool.core.map.MapUtil;

import java.util.ArrayList;
import java.util.Map;


public class UpdateDataResourceTest {

    // 需要替换成你的 Authing Access Key ID
    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    // 需要替换成你的 Authing Access Key Secret
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        UpdateDataResourceDto request = new UpdateDataResourceDto();
        request.setNamespaceCode("examplePermissionNamespace");
        request.setResourceCode("treeResourceCode");
        request.setResourceName("示例新树数据资源");
        request.setDescription("示例数据资源新描述");
        ArrayList<DataResourceTreeStructs> dataResourceTreeStructList = new ArrayList<>();
        DataResourceTreeStructs dataResourceTreeStruct = new DataResourceTreeStructs();
        dataResourceTreeStruct.setCode("tree1");
        dataResourceTreeStruct.setName("树节点1");
        dataResourceTreeStruct.setValue("树节点1描述");
        Map<String, Object> extendFieldValue = MapUtil.of("str", "str_valu3");
        extendFieldValue.put("select", "option2");
        dataResourceTreeStruct.setExtendFieldValue(extendFieldValue);
        dataResourceTreeStructList.add(dataResourceTreeStruct);
        request.setStruct(dataResourceTreeStructList);
        ArrayList<String> actionList = new ArrayList<>();
        actionList.add("get");
        actionList.add("read");
        actionList.add("delete");
        actionList.add("update");
        request.setActions(actionList);
        UpdateDataResourceResponseDto response = client.updateDataResource(request);
        System.out.println(JsonUtils.serialize(response));
    }

}