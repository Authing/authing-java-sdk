package test.authentication;

import cn.genauth.sdk.java.client.AuthenticationClient;
import cn.genauth.sdk.java.dto.SignUpByPasswordDto;
import cn.genauth.sdk.java.dto.SignUpDto;
import cn.genauth.sdk.java.dto.UserSingleRespDto;
import cn.genauth.sdk.java.model.AuthenticationClientOptions;
import cn.genauth.sdk.java.util.JsonUtils;

public class SignUpTest {
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

        SignUpDto reqDto = new SignUpDto();
        reqDto.setConnection(SignUpDto.Connection.PASSWORD);
        SignUpByPasswordDto passwordDto = new SignUpByPasswordDto();
        passwordDto.setPassword("123");
        passwordDto.setEmail("123@qq.com");
        reqDto.setPasswordPayload(passwordDto);
        UserSingleRespDto response = client.signUp(reqDto);
        System.out.println(JsonUtils.serialize(response));
    }
}
