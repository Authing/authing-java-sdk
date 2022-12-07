package test.management.dataPermission.policy;

import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.CreateDataPolicyDto;
import cn.authing.sdk.java.dto.CreateDataPolicyResponseDto;
import cn.authing.sdk.java.dto.DataStatementPermissionDto;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CreateDataPolicyTest {
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

        CreateDataPolicyDto reqDto = new CreateDataPolicyDto();
        reqDto.setPolicyName("policy_name");
        List<DataStatementPermissionDto> list = new ArrayList<>();
        DataStatementPermissionDto permissionDto = new DataStatementPermissionDto();
        permissionDto.setDataPermissions(Collections.singletonList("read"));
        permissionDto.setEffect(DataStatementPermissionDto.Effect.ALLOW);
        list.add(permissionDto);
        reqDto.setStatementList(list);
        CreateDataPolicyResponseDto response = client.createDataPolicy(reqDto);
        System.out.println(JsonUtils.serialize(response));
    }
}
