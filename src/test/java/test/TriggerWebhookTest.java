package test;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class TriggerWebhookTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        TriggerWebhookDto request = new TriggerWebhookDto();
        request.setWebhookId("webhookId_2245");
        request.setRequestHeaders(Collections.emptyList());
        request.setRequestBody(Collections.emptyList());

        TriggerWebhookRespDto response = client.triggerWebhook(request);
        System.out.println(JsonUtils.serialize(response));
    }

}