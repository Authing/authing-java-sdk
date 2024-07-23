package test.management.dataPermission.resource;

import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.BatchCreateDenfDto;
import cn.authing.sdk.java.dto.Dnef;
import cn.authing.sdk.java.dto.Dnef.ValueType;
import cn.authing.sdk.java.dto.DnefConfig;
import cn.authing.sdk.java.dto.IsSuccessRespDto;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;
import cn.hutool.core.collection.ListUtil;

public class BatchCreateDnefTest {

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
        BatchCreateDenfDto createDenfDto = new BatchCreateDenfDto();
        createDenfDto.setResourceCode("treeResourceCode");
        createDenfDto.setNamespaceCode("examplePermissionNamespace");

        Dnef dnef1 = new Dnef();
        dnef1.setKey("select");
        dnef1.setValueType(ValueType.SELECT);
        dnef1.setDescription("select");
        dnef1.setLabel("select");
        dnef1.setConfig(new DnefConfig(ListUtil.of(new DnefConfig.Option("str_value"))));

        Dnef dnef2 = new Dnef();
        dnef2.setKey("str");
        dnef2.setValueType(ValueType.STRING);
        dnef2.setDescription("str");
        dnef2.setLabel("str");

        createDenfDto.setFieldList( ListUtil.of(dnef1, dnef2));

        IsSuccessRespDto res = client.batchCreateDnef(createDenfDto);
        System.out.println(JsonUtils.serialize(res));
    }

}
