package test.management;

import cn.genauth.sdk.java.client.ManagementClient;
import cn.genauth.sdk.java.dto.CreateWebhookDto;
import cn.genauth.sdk.java.dto.CreateWebhookRespDto;
import cn.genauth.sdk.java.model.ManagementClientOptions;
import cn.genauth.sdk.java.util.JsonUtils;

import java.util.ArrayList;
import java.util.List;

public class CreateWebhookTest {
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

        CreateWebhookDto createWebhookDto = new CreateWebhookDto();
        createWebhookDto.setContentType(CreateWebhookDto.ContentType.APPLICATION_JSON);
        List<String> events = new ArrayList<>();
        events.add("user");
        createWebhookDto.setEvents(events);
        createWebhookDto.setUrl("https://example.com/callback");
        createWebhookDto.setName("example");
        CreateWebhookRespDto webhook = client.createWebhook(createWebhookDto);
        System.out.println(JsonUtils.serialize(webhook));
    }
}
