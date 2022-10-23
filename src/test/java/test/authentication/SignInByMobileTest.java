package test.authentication;

import cn.authing.sdk.java.client.AuthenticationClient;
import cn.authing.sdk.java.dto.LoginTokenRespDto;
import cn.authing.sdk.java.dto.SignInByApplePayloadDto;
import cn.authing.sdk.java.dto.SigninByMobileDto;
import cn.authing.sdk.java.enums.AuthMethodEnum;
import cn.authing.sdk.java.model.AuthenticationClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

public class SignInByMobileTest {
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

        SigninByMobileDto reqDto = new SigninByMobileDto();
        reqDto.setExtIdpConnidentifier("123");
        reqDto.setConnection(SigninByMobileDto.Connection.APPLE);
        SignInByApplePayloadDto payloadDto = new SignInByApplePayloadDto();
        reqDto.setApplePayload(payloadDto);
        LoginTokenRespDto response = client.signInByMobile(reqDto);
        System.out.println(JsonUtils.serialize(response));
    }
}
