package test.management;

import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.AddDepartmentMembersReqDto;
import cn.authing.sdk.java.dto.IsSuccessRespDto;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;

public class AddDepartmentMembersTest {
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

        AddDepartmentMembersReqDto reqDto = new AddDepartmentMembersReqDto();
        reqDto.setUserIds(Collections.singletonList("623c20b2axxxaaaaf41b17da"));
        reqDto.setDepartmentId("60b49eb83fdxxxdb96f26e68");
        reqDto.setOrganizationCode("steamory");
        IsSuccessRespDto response = client.addDepartmentMembers(reqDto);
        System.out.println(JsonUtils.serialize(response));
    }
}
