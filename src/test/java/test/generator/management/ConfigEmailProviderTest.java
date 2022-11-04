package test.generator.management;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class ConfigEmailProviderTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        ConfigEmailProviderDto request = new ConfigEmailProviderDto();
        request.setType(cn.authing.sdk.java.dto.ConfigEmailProviderDto.Type.ALI);
        request.setEnabled(Boolean.TRUE);
        request.setSmtpConfig(new cn.authing.sdk.java.dto.SMTPEmailProviderConfigInput());
        request.setSendGridConfig(new cn.authing.sdk.java.dto.SendGridEmailProviderConfigInput());
        request.setAliExmailConfig(new cn.authing.sdk.java.dto.AliExmailEmailProviderConfigInput());
        request.setTencentExmailConfig(new cn.authing.sdk.java.dto.TencentExmailEmailProviderConfigInput());

        EmailProviderRespDto response = client.configEmailProvider(request);
        System.out.println(JsonUtils.serialize(response));
    }

}