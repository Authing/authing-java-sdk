package test.management;

import cn.genauth.sdk.java.client.ManagementClient;
import cn.genauth.sdk.java.dto.HasAnyRoleReqDto;
import cn.genauth.sdk.java.dto.HasAnyRoleRespDto;
import cn.genauth.sdk.java.dto.HasRoleRolesDto;
import cn.genauth.sdk.java.model.ManagementClientOptions;
import cn.genauth.sdk.java.util.JsonUtils;

import java.util.ArrayList;
import java.util.List;

public class HasAnyRoleTest {
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

        HasAnyRoleReqDto reqDto = new HasAnyRoleReqDto();
        reqDto.setUserId("6229ffaxxxxxxxxcade3e3d9");
        List<HasRoleRolesDto> list = new ArrayList<>();
        HasRoleRolesDto rolesDto = new HasRoleRolesDto();
        rolesDto.setCode("xxx");
        rolesDto.setNamespace("xxx");
        list.add(rolesDto);
        reqDto.setRoles(list);
        HasAnyRoleRespDto response = client.hasAnyRole(reqDto);
        System.out.println(JsonUtils.serialize(response));
    }
}
