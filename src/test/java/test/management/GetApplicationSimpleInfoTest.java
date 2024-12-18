package test.management;

import cn.genauth.sdk.java.client.ManagementClient;
import cn.genauth.sdk.java.dto.ApplicationSimpleInfoSingleRespDto;
import cn.genauth.sdk.java.dto.GetApplicationSimpleInfoDto;
import cn.genauth.sdk.java.model.ManagementClientOptions;
import cn.genauth.sdk.java.util.JsonUtils;

public class GetApplicationSimpleInfoTest {
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

        GetApplicationSimpleInfoDto reqDto = new GetApplicationSimpleInfoDto();
        reqDto.setAppId("6229ffaxxxxxxxxcade3e3d9");
        ApplicationSimpleInfoSingleRespDto response = client.getApplicationSimpleInfo(reqDto);
        System.out.println(JsonUtils.serialize(response));
    }
}
