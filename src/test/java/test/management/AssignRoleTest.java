package test.management;

import cn.genauth.sdk.java.client.ManagementClient;
import cn.genauth.sdk.java.dto.AssignRoleDto;
import cn.genauth.sdk.java.dto.IsSuccessRespDto;
import cn.genauth.sdk.java.dto.TargetDto;
import cn.genauth.sdk.java.model.ManagementClientOptions;
import cn.genauth.sdk.java.util.JsonUtils;

import java.util.ArrayList;
import java.util.List;

public class AssignRoleTest {
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

        AssignRoleDto reqDto = new AssignRoleDto();
        reqDto.setCode("code1");
        List<TargetDto> list = new ArrayList<>();
        TargetDto targetDto = new TargetDto();
        targetDto.setTargetType(TargetDto.TargetType.USER);
        targetDto.setTargetIdentifier("6343b98b7cfxxx9366e9b7c");
        list.add(targetDto);
        reqDto.setTargets(list);
        IsSuccessRespDto response = client.assignRole(reqDto);
        System.out.println(JsonUtils.serialize(response));
    }
}
