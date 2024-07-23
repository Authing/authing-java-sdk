package test.management.dataPermission.resource;

import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.Dnef.ValueType;
import cn.authing.sdk.java.dto.DnefConfig;
import cn.authing.sdk.java.dto.IsSuccessRespDto;
import cn.authing.sdk.java.dto.UpdateDenfDto;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;
import cn.hutool.core.collection.ListUtil;

public class UpdateDnefTest {

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
        UpdateDenfDto updateDenfDto = new UpdateDenfDto();
        updateDenfDto.setResourceCode("treeResourceCode");
        updateDenfDto.setNamespaceCode("examplePermissionNamespace");
        updateDenfDto.setKey("select");
        updateDenfDto.setValueType(ValueType.SELECT);
        updateDenfDto.setDescription("select1");
        updateDenfDto.setLabel("select1");
        updateDenfDto.setConfig(new DnefConfig(ListUtil.of(new DnefConfig.Option("str_value_1"))));
        IsSuccessRespDto res = client.UpdateDnef(updateDenfDto);
        System.out.println(JsonUtils.serialize(res));
    }


}
