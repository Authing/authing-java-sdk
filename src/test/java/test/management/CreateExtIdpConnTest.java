package test.management;

import cn.genauth.sdk.java.client.ManagementClient;
import cn.genauth.sdk.java.dto.CreateExtIdpConnDto;
import cn.genauth.sdk.java.dto.ExtIdpConnDetailSingleRespDto;
import cn.genauth.sdk.java.model.ManagementClientOptions;
import cn.genauth.sdk.java.util.JsonUtils;

public class CreateExtIdpConnTest {
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

        CreateExtIdpConnDto reqDto = new CreateExtIdpConnDto();
        reqDto.setFields(new Object());
        reqDto.setExtIdpId("60b49eb83fxxxxxdb96f26e68");
        reqDto.setIdentifier("60b49eb83fd80adb96f26e68");
        reqDto.setType(CreateExtIdpConnDto.Type.OIDC);
        reqDto.setDisplayName("登录页");
        ExtIdpConnDetailSingleRespDto response = client.createExtIdpConn(reqDto);
        System.out.println(JsonUtils.serialize(response));
    }
}
