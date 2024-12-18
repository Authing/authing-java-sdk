package test.authentication;

import cn.genauth.sdk.java.client.AuthenticationClient;
import cn.genauth.sdk.java.dto.CommonResponseDto;
import cn.genauth.sdk.java.model.AuthenticationClientOptions;

import java.io.IOException;
import java.text.ParseException;

/**
 * @author songxueyan
 * @date 2023/2/24
 **/
public class EventClientPubTest {
    // 需要替换成你的 Authing App ID
    private static final String APP_ID = "AUTHING_APP_ID";
    // 需要替换成你的 Authing App Secret
    private static final String APP_SECRET = "AUTHING_APP_SECRET";

    public static void main(String[] args) throws IOException, ParseException {
        AuthenticationClientOptions authenOptions = new AuthenticationClientOptions();
        authenOptions.setAppId(APP_ID); // Authing 应用 ID
        authenOptions.setAppSecret(APP_SECRET); // Authing 应用密钥

        AuthenticationClient authenticationClient = new AuthenticationClient(authenOptions);
        String eventData = "{\"id\":\"q\",\"createdAt\":1675579686427,\"updatedAt\":1675579686427}";
        CommonResponseDto result = authenticationClient.pubtEvent("yourapp.event.code", eventData);
        System.out.println(result);
    }
}
