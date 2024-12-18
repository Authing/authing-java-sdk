package test.management;

import cn.genauth.sdk.java.client.ManagementClient;
import cn.genauth.sdk.java.dto.IsUserInDepartmentDto;
import cn.genauth.sdk.java.dto.IsUserInDepartmentRespDto;
import cn.genauth.sdk.java.model.ManagementClientOptions;
import cn.genauth.sdk.java.util.JsonUtils;

public class IsUserInDepartmentTest {
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

        IsUserInDepartmentDto reqDto = new IsUserInDepartmentDto();
        reqDto.setDepartmentId("root");
        reqDto.setUserId("6229ffaxxxxxxxxcade3e3d9");
        reqDto.setOrganizationCode("steamory");
        IsUserInDepartmentRespDto response = client.isUserInDepartment(reqDto);
        System.out.println(JsonUtils.serialize(response));
    }
}
