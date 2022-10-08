package test
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class UpdateWebhookTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        UpdateWebhookDto request = new UpdateWebhookDto();
        request.setWebhookId("webhookId_5326");
        request.setName("name_1818");
        request.setUrl("url_4547");
        request.setEvents(Collections.singletonList("String_9069"));
        request.setContentType(cn.authing.sdk.java.dto.UpdateWebhookDto.ContentType.APPLICATION_JSON);
        request.setEnabled(Boolean.TRUE);
        request.setSecret("secret_3598");

        UpdateWebhooksRespDto response = client.updateWebhook(request);
        System.out.println(JsonUtils.serialize(response));
    }

}