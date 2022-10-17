package test.auth;

import cn.authing.sdk.java.client.AuthenticationClient;
import cn.authing.sdk.java.dto.LoginTokenRespDto;
import cn.authing.sdk.java.dto.SignInOptionsDto;
import cn.authing.sdk.java.enums.AuthMethodEnum;
import cn.authing.sdk.java.model.AuthenticationClientOptions;

public class SignInTest {
    private static final String ACCESS_KEY_ID = "6343b99bd968375153712c3c";
    private static final String ACCESS_KEY_SECRET = "2140f44a44fcf7684954e37c25d70ce4";
    private static final String HOST = "http://localhost:3000";
    private static final String REDIRECT_URI = "https://www.baidu.com";

    public static void main(String[] args) throws Exception{
        AuthenticationClientOptions clientOptions = new AuthenticationClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET, REDIRECT_URI);
        clientOptions.setAppHost(HOST);
        clientOptions.setTokenEndPointAuthMethod(AuthMethodEnum.CLIENT_SECRET_BASIC.getValue());
        AuthenticationClient client = new AuthenticationClient(clientOptions);

       LoginTokenRespDto resp = client.signInByUsernamePassword(
                "test",
                "test",
                new SignInOptionsDto()
        );
        System.out.println(resp);
    }
}
