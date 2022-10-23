package test.management;

import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.SecuritySettingsRespDto;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

public class GetSecuritySettingsTest {
    // 需要替换成你的 Authing Access Key ID
    private static final String ACCESS_KEY_ID = "634cfaa10cdd0b52923d0b35";
    // 需要替换成你的 Authing Access Key Secret
    private static final String ACCESS_KEY_SECRET = "7b1554be16e9f4b8952a80618f9267f4";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        // 如果是私有化部署的客户，需要设置 Authing 服务域名
         clientOptions.setHost("https://kuluqi.test2.authing-inc.co");

        ManagementClient client = new ManagementClient(clientOptions);

        SecuritySettingsRespDto response = client.getSecuritySettings();
        System.out.println(JsonUtils.serialize(response));
    }
}
