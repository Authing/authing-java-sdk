import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class PreviewEmailTemplateTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        PreviewEmailTemplateDto request = new PreviewEmailTemplateDto();
        request.setSender("sender_9590");
        request.setType(cn.authing.sdk.java.dto.PreviewEmailTemplateDto.Type.WELCOME_EMAIL);
        request.setContent("content_3974");
        request.setSubject("subject_4274");
        request.setExpiresIn(0);
        request.setTplEngine(cn.authing.sdk.java.dto.PreviewEmailTemplateDto.TplEngine.HANDLEBAR);

        PreviewEmailTemplateRespDto response = client.previewEmailTemplate(request);
        System.out.println(JsonUtils.serialize(response));
    }

}