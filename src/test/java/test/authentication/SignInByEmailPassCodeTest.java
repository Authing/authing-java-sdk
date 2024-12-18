package test.authentication;

import cn.genauth.sdk.java.client.AuthenticationClient;
import cn.genauth.sdk.java.dto.LoginTokenRespDto;
import cn.genauth.sdk.java.dto.SignInOptionsDto;
import cn.genauth.sdk.java.model.AuthenticationClientOptions;
import cn.genauth.sdk.java.util.JsonUtils;

public class SignInByEmailPassCodeTest {
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
        LoginTokenRespDto response = client.signInByEmailPassCode(
                "123@qq,com",
                "123",
                new SignInOptionsDto()
        );
        System.out.println(JsonUtils.serialize(response));
    }
}
