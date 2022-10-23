package test.management;

import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.ApplicationPermissionRecordItem;
import cn.authing.sdk.java.dto.AuthorizeApplicationAccessDto;
import cn.authing.sdk.java.dto.IsSuccessRespDto;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AuthorizeApplicationAccessTest {
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

        AuthorizeApplicationAccessDto reqDto = new AuthorizeApplicationAccessDto();
        reqDto.setAppId("6229ffaxxxxxxxxcade3e3d9");
        List<ApplicationPermissionRecordItem> list = new ArrayList<>();
        ApplicationPermissionRecordItem recordItem = new ApplicationPermissionRecordItem();
        recordItem.setTargetType(ApplicationPermissionRecordItem.TargetType.USER);
        recordItem.setTargetIdentifier(Collections.singletonList("6sd9ffaxxxxxcade3eds9"));
        recordItem.setEffect(ApplicationPermissionRecordItem.Effect.ALLOW);
        list.add(recordItem);
        reqDto.setList(list);
        IsSuccessRespDto response = client.authorizeApplicationAccess(reqDto);
        System.out.println(JsonUtils.serialize(response));
    }
}
