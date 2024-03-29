package test.authentication;

import cn.authing.sdk.java.client.AuthenticationClient;
import cn.authing.sdk.java.dto.SendEmailDto;
import cn.authing.sdk.java.dto.SendEmailRespDto;
import cn.authing.sdk.java.model.AuthenticationClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

public class SendEmailTest {
    // 需要替换成你的 Authing App ID
    private static final String APP_ID = "AUTHING_APP_ID";
    // 需要替换成你的 Authing App Secret
    private static final String APP_SECRET = "AUTHING_APP_SECRET";
    // 需要替换成你的 Authing App Host
    private static final String APP_HOST = "AUTHING_APP_HOST";

    public static void main(String[] args) throws Throwable {
        AuthenticationClientOptions clientOptions = new AuthenticationClientOptions();
        clientOptions.setAppId(APP_ID);
        clientOptions.setAppSecret(APP_SECRET);
        clientOptions.setAppHost(APP_HOST);

        AuthenticationClient client = new AuthenticationClient(clientOptions);

        SendEmailDto reqDto = new SendEmailDto();
        reqDto.setChannel(SendEmailDto.Channel.CHANNEL_COMPLETE_EMAIL);
        reqDto.setEmail("123@qq.com");
        SendEmailRespDto response = client.sendEmail(reqDto);
        System.out.println(JsonUtils.serialize(response));
    }
}
