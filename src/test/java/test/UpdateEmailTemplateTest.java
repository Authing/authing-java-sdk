package test
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class UpdateEmailTemplateTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        UpdateEmailTemplateDto request = new UpdateEmailTemplateDto();
        request.setContent("content_5347");
        request.setSender("sender_9106");
        request.setSubject("subject_2104");
        request.setName("name_9119");
        request.setCustomizeEnabled(Boolean.TRUE);
        request.setType(cn.authing.sdk.java.dto.UpdateEmailTemplateDto.Type.WELCOME_EMAIL);
        request.setExpiresIn(0);
        request.setRedirectTo("redirectTo_833");
        request.setTplEngine(cn.authing.sdk.java.dto.UpdateEmailTemplateDto.TplEngine.HANDLEBAR);

        EmailTemplateSingleItemRespDto response = client.updateEmailTemplate(request);
        System.out.println(JsonUtils.serialize(response));
    }

}