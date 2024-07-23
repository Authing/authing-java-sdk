package test.management.dataPermission.resource;

import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.CreateTreeDataResourceDto;
import cn.authing.sdk.java.dto.CreateTreeDataResourceResponseDto;
import cn.authing.sdk.java.dto.DataResourceTreeStructs;
import cn.authing.sdk.java.dto.Dnef;
import cn.authing.sdk.java.dto.DnefConfig;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;
import cn.hutool.core.collection.ListUtil;
import cn.hutool.core.map.MapUtil;

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
        reqDto.setResourceCode("treeResourceCode");
        reqDto.setResourceName("示例树数据资源");
        reqDto.setNamespaceCode("examplePermissionNamespace");
        List<DataResourceTreeStructs> treeList = new ArrayList<>();
        DataResourceTreeStructs struct = new DataResourceTreeStructs();
        struct.setCode("tree1");
        struct.setName("树节点1");
        struct.setExtendFieldValue(MapUtil.of("str", "str_value"));
        struct.setValue("树节点1描述");
        List<Object> children = new ArrayList<>();
        DataResourceTreeStructs child = new DataResourceTreeStructs();
        child.setName("树节点11");
        child.setCode("tree11");
        child.setValue("树节点11描述");
        children.add(child);
        struct.setChildren(children);
        treeList.add(struct);
        reqDto.setStruct(treeList);
        reqDto.setDescription("示例树数据资源描述");
        reqDto.setExtendFieldList(buildDnef());
        CreateTreeDataResourceResponseDto response = client.createDataResourceByTree(reqDto);
        System.out.println(JsonUtils.serialize(response));
    }

    private static List<Dnef> buildDnef() {
        List<Dnef> dnefs = new ArrayList<>();
        Dnef str = new Dnef();
        str.setKey("str");
        str.setLabel("str_label");
        str.setValueType(Dnef.ValueType.STRING);
        str.setDescription("string");
        dnefs.add(str);

        Dnef select = new Dnef();
        select.setKey("select");
        select.setLabel("select_label");
        select.setValueType(Dnef.ValueType.SELECT);
        select.setDescription("select");
        List<DnefConfig.Option> options = ListUtil.of(new DnefConfig.Option("option1"),
                new DnefConfig.Option("option2"),
                new DnefConfig.Option("option3"));
        DnefConfig config = new DnefConfig(options);
        select.setConfig(config);
        dnefs.add(select);

        return dnefs;
    }
}
