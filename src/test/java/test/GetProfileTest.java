package test;

import cn.authing.sdk.java.client.AuthenticationClient;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.AuthenticationClientOptions;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

public class GetProfileTest {
    public static void main(String[] args) throws Throwable {
        AuthenticationClientOptions clientOptions = new AuthenticationClientOptions();
        clientOptions.setAppId("635143ae10d1c1b9afb54c39");
        clientOptions.setAppSecret("441d87d04bc22a0ac3fc5d7c0736278a");
        clientOptions.setAppHost("http://localhost:3000");
        AuthenticationClient client = new AuthenticationClient(clientOptions);

        LoginTokenRespDto response = client.signInByAccountPassword("test", "test", new SignInOptionsDto());
        System.out.println(JsonUtils.serialize(response));

        client.setAccessToken(response.getData().getAccessToken());
        UserSingleRespDto dto = client.getProfile(new GetProfileDto());
        System.out.println(JsonUtils.serialize(dto));
    }
}
