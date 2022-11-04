package test.generator.management;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class UpdateWebhookTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        UpdateWebhookDto request = new UpdateWebhookDto();
        request.setWebhookId("webhookId_5346");
        request.setName("name_8090");
        request.setUrl("url_1276");
        request.setEvents(Collections.singletonList("String_4010"));
        request.setContentType(cn.authing.sdk.java.dto.UpdateWebhookDto.ContentType.APPLICATION_JSON);
        request.setEnabled(Boolean.TRUE);
        request.setSecret("secret_2173");

        UpdateWebhooksRespDto response = client.updateWebhook(request);
        System.out.println(JsonUtils.serialize(response));
    }

}