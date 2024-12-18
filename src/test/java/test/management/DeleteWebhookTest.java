package test.management;

import cn.genauth.sdk.java.client.ManagementClient;
import cn.genauth.sdk.java.dto.DeleteWebhookDto;
import cn.genauth.sdk.java.dto.DeleteWebhookRespDto;
import cn.genauth.sdk.java.model.ManagementClientOptions;
import cn.genauth.sdk.java.util.JsonUtils;

import java.util.ArrayList;

public class DeleteWebhookTest {
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

        DeleteWebhookDto deleteWebhookDto = new DeleteWebhookDto();
        ArrayList<String> webhookIds = new ArrayList<>();
        deleteWebhookDto.setWebhookIds(webhookIds);
        DeleteWebhookRespDto deleteWebhookRespDto = client.deleteWebhook(deleteWebhookDto);
        System.out.println(JsonUtils.serialize(deleteWebhookRespDto));
    }
}
