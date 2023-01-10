package test.management.dataPermission.authentication;

import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.GetUserPermissionListDto;
import cn.authing.sdk.java.dto.GetUserPermissionListRespDto;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class GetUserPermissionListTest {

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

        GetUserPermissionListDto request = new GetUserPermissionListDto();
        List<String> userIds = new ArrayList<>();
        userIds.add("63bc134b6d3cd2781d8724cb");
        userIds.add("63bc133e45386813f0848c1e");
        request.setUserIds(userIds);
        List<String> namespaceCodes = new ArrayList<>();
        namespaceCodes.add("examplePermissionNamespace1");
        namespaceCodes.add("examplePermissionNamespace2");
        request.setNamespaceCodes(namespaceCodes);

        GetUserPermissionListRespDto response = client.getUserPermissionList(request);
        System.out.println(JsonUtils.serialize(response));
    }

}