package test;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class CreateWebhookTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        CreateWebhookDto request = new CreateWebhookDto();
        request.setContentType(cn.authing.sdk.java.dto.CreateWebhookDto.ContentType.APPLICATION_JSON);
        request.setEvents(Collections.singletonList("String_8086"));
        request.setUrl("url_8991");
        request.setName("name_6559");
        request.setEnabled(Boolean.TRUE);
        request.setSecret("secret_1883");

        CreateWebhookRespDto response = client.createWebhook(request);
        System.out.println(JsonUtils.serialize(response));
    }

}