package test.management.dataPermission.policy;

import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.DataStatementPermissionDto;
import cn.authing.sdk.java.dto.UpdateDataPolicyDto;
import cn.authing.sdk.java.dto.UpdateDataPolicyResponseDto;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.ArrayList;
import java.util.List;

public class UpdateDataPolicyTest {
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

        UpdateDataPolicyDto reqDto = new UpdateDataPolicyDto();
        reqDto.setPolicyId("60b49xxxxxxxxxxxxxxx6e68");
        reqDto.setPolicyName("示例数据策略名称");
        List<DataStatementPermissionDto> list = new ArrayList<>();
        DataStatementPermissionDto permissionDto = new DataStatementPermissionDto();
        List<String> list1 = new ArrayList<>();
        list1.add("namespaceCode/treeResourceCode/path/action");
        permissionDto.setPermissions(list1);
        permissionDto.setEffect(DataStatementPermissionDto.Effect.ALLOW);
        list.add(permissionDto);
        reqDto.setStatementList(list);
        reqDto.setDescription("示例数据策略描述");
        UpdateDataPolicyResponseDto response = client.updateDataPolicy(reqDto);
        System.out.println(JsonUtils.serialize(response));
    }
}
