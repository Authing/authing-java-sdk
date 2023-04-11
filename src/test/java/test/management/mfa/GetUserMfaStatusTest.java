package test.management.mfa;

import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.GetMapInfoRespDto;
import cn.authing.sdk.java.dto.GetMfaStatusDto;
import cn.authing.sdk.java.dto.GetMfaTriggerDataDto;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

public class GetUserMfaStatusTest {
    // 需要替换成你的 Authing Access Key ID
    private static final String ACCESS_KEY_ID = "63b3fbc36cdc24e3b58f3943";
    // 需要替换成你的 Authing Access Key Secret
    private static final String ACCESS_KEY_SECRET = "e88a21b819f86e6be9d21df0bfa71f9e";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        // 如果是私有化部署的客户，需要设置 Authing 服务域名
        // clientOptions.setHost("https://api.your-authing-service.com");

        ManagementClient client = new ManagementClient(clientOptions);

        GetMfaStatusDto getMfaStatusDto = new GetMfaStatusDto();
        getMfaStatusDto.setUserId("64355e5f20dfae11d8ae12dc");
        GetMapInfoRespDto response = client.getUserMfaStatus(getMfaStatusDto);
        System.out.println(JsonUtils.serialize(response));
    }
}
