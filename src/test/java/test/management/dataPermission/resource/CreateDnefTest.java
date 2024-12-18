package test.management.dataPermission.resource;

import cn.genauth.sdk.java.dto.DnefConfig;
import cn.genauth.sdk.java.dto.Dnef.ValueType;

import cn.genauth.sdk.java.client.ManagementClient;
import cn.genauth.sdk.java.dto.CreateDenfDto;
import cn.genauth.sdk.java.dto.IsSuccessRespDto;
import cn.genauth.sdk.java.model.ManagementClientOptions;
import cn.genauth.sdk.java.util.JsonUtils;
import cn.hutool.core.collection.ListUtil;

public class CreateDnefTest {

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
        CreateDenfDto createDenfDto = new CreateDenfDto();
        createDenfDto.setResourceCode("treeResourceCode");
        createDenfDto.setNamespaceCode("examplePermissionNamespace");
        createDenfDto.setKey("select");
        createDenfDto.setValueType(ValueType.SELECT);
        createDenfDto.setDescription("select");
        createDenfDto.setLabel("select");
        createDenfDto.setConfig(new DnefConfig(ListUtil.of(new DnefConfig.Option("str_value"))));
        IsSuccessRespDto res = client.createDnef(createDenfDto);
        System.out.println(JsonUtils.serialize(res));

        createDenfDto.setKey("str");
        createDenfDto.setValueType(ValueType.STRING);
        createDenfDto.setDescription("str");
        createDenfDto.setLabel("str");

        res = client.createDnef(createDenfDto);
        System.out.println(JsonUtils.serialize(res));
    }


}
