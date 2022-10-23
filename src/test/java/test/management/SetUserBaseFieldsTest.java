package test.management;

import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.CustomFieldListRespDto;
import cn.authing.sdk.java.dto.SetUserBaseFieldDto;
import cn.authing.sdk.java.dto.SetUserBaseFieldsReqDto;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.ArrayList;
import java.util.List;

public class SetUserBaseFieldsTest {
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

        SetUserBaseFieldsReqDto reqDto = new SetUserBaseFieldsReqDto();
        List<SetUserBaseFieldDto> list = new ArrayList<>();
        SetUserBaseFieldDto fieldDto = new SetUserBaseFieldDto();
        fieldDto.setKey("key");
        list.add(fieldDto);
        reqDto.setList(list);
        CustomFieldListRespDto response = client.setUserBaseFields(reqDto);
        System.out.println(JsonUtils.serialize(response));
    }
}
