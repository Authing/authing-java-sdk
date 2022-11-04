package test.generator.management;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class PreviewEmailTemplateTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        PreviewEmailTemplateDto request = new PreviewEmailTemplateDto();
        request.setType(cn.authing.sdk.java.dto.PreviewEmailTemplateDto.Type.WELCOME_EMAIL);
        request.setContent("content_1145");
        request.setSubject("subject_7660");
        request.setSender("sender_1995");
        request.setExpiresIn(0);
        request.setTplEngine(cn.authing.sdk.java.dto.PreviewEmailTemplateDto.TplEngine.HANDLEBAR);

        PreviewEmailTemplateRespDto response = client.previewEmailTemplate(request);
        System.out.println(JsonUtils.serialize(response));
    }

}