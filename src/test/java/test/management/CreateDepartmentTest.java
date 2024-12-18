package test.management;

import cn.genauth.sdk.java.client.ManagementClient;
import cn.genauth.sdk.java.dto.CreateDepartmentReqDto;
import cn.genauth.sdk.java.dto.DepartmentSingleRespDto;
import cn.genauth.sdk.java.model.ManagementClientOptions;
import cn.genauth.sdk.java.util.JsonUtils;

public class CreateDepartmentTest {
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

        CreateDepartmentReqDto reqDto = new CreateDepartmentReqDto();
        reqDto.setParentDepartmentId("6229c4deb3e4d8a20b6021ff");
        reqDto.setName("开发部");
        reqDto.setOrganizationCode("steamory");
        DepartmentSingleRespDto response = client.createDepartment(reqDto);
        System.out.println(JsonUtils.serialize(response));
    }
}
