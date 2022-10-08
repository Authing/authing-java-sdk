package test
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class ConfigEmailProviderTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        ConfigEmailProviderDto request = new ConfigEmailProviderDto();
        request.setType(cn.authing.sdk.java.dto.ConfigEmailProviderDto.Type.SMTP);
        request.setEnabled(Boolean.TRUE);
        request.setSmtpConfig(new cn.authing.sdk.java.dto.SMTPEmailProviderConfigInput());
        request.setSendGridConfig(new cn.authing.sdk.java.dto.SendGridEmailProviderConfigInput());
        request.setAliExmailConfig(new cn.authing.sdk.java.dto.AliExmailEmailProviderConfigInput());
        request.setTencentExmailConfig(new cn.authing.sdk.java.dto.TencentExmailEmailProviderConfigInput());

        EmailProviderDto response = client.configEmailProvider(request);
        System.out.println(JsonUtils.serialize(response));
    }

}