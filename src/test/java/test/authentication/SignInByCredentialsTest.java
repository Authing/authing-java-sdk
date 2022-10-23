package test.authentication;

import cn.authing.sdk.java.client.AuthenticationClient;
import cn.authing.sdk.java.dto.LoginTokenRespDto;
import cn.authing.sdk.java.dto.SignInByPasswordPayloadDto;
import cn.authing.sdk.java.dto.SigninByCredentialsDto;
import cn.authing.sdk.java.enums.AuthMethodEnum;
import cn.authing.sdk.java.model.AuthenticationClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

public class SignInByCredentialsTest {
    // 需要替换成你的 Authing App ID
    private static final String APP_ID = "AUTHING_APP_ID";
    // 需要替换成你的 Authing App Secret
    private static final String APP_SECRET = "AUTHING_APP_SECRET";
    // 需要替换成你的 Authing App Host
    private static final String APP_HOST = "AUTHING_APP_HOST";

    public static void main(String[] args) throws Throwable {
        AuthenticationClientOptions clientOptions = new AuthenticationClientOptions();
        clientOptions.setTokenEndPointAuthMethod(AuthMethodEnum.CLIENT_SECRET_BASIC.getValue());
        clientOptions.setAppId(APP_ID);
        clientOptions.setAppSecret(APP_SECRET);
        clientOptions.setAppHost(APP_HOST);

        AuthenticationClient client = new AuthenticationClient(clientOptions);

        SigninByCredentialsDto reqDto = new SigninByCredentialsDto();
        reqDto.setConnection(SigninByCredentialsDto.Connection.PASSWORD);
        SignInByPasswordPayloadDto passwordPayloadDto = new SignInByPasswordPayloadDto();
        passwordPayloadDto.setPassword("123");
        passwordPayloadDto.setAccount("test");
        passwordPayloadDto.setEmail("123@qq.com");
        reqDto.setPasswordPayload(passwordPayloadDto);
        LoginTokenRespDto response = client.signInByCredentials(reqDto);
        System.out.println(JsonUtils.serialize(response));
    }
}
