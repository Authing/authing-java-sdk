package test.authentication;

import cn.genauth.sdk.java.client.AuthenticationClient;
import cn.genauth.sdk.java.dto.BindPhoneDto;
import cn.genauth.sdk.java.dto.CommonResponseDto;
import cn.genauth.sdk.java.model.AuthenticationClientOptions;
import cn.genauth.sdk.java.util.JsonUtils;

public class BindPhoneTest {
    // 需要替换成你的 Authing App ID
    private static final String APP_ID = "AUTHING_APP_ID";
    // 需要替换成你的 Authing App Secret
    private static final String APP_SECRET = "AUTHING_APP_SECRET";
    // 需要替换成你的 Authing App Host
    private static final String APP_HOST = "AUTHING_APP_HOST";
    // 需要替换成你的 Authing Access Token
    private static final String ACCESS_TOKEN = "AUTHING_ACCESS_TOKEN";

    public static void main(String[] args) throws Throwable {
        AuthenticationClientOptions clientOptions = new AuthenticationClientOptions();
        clientOptions.setAppId(APP_ID);
        clientOptions.setAppSecret(APP_SECRET);
        clientOptions.setAppHost(APP_HOST);
        clientOptions.setAccessToken(ACCESS_TOKEN);

        AuthenticationClient client = new AuthenticationClient(clientOptions);

        BindPhoneDto reqDto = new BindPhoneDto();
        reqDto.setPassCode("123");
        reqDto.setPhoneNumber("123456");
        CommonResponseDto response = client.bindPhone(reqDto);
        System.out.println(JsonUtils.serialize(response));
    }
}
