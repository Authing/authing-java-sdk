package test.authentication;

import cn.authing.sdk.java.client.AuthenticationClient;
import cn.authing.sdk.java.dto.GetUserAuthResourceStructDto;
import cn.authing.sdk.java.dto.GetUserAuthResourceStructRespDto;
import cn.authing.sdk.java.dto.LoginTokenRespDto;
import cn.authing.sdk.java.dto.SignInOptionsDto;
import cn.authing.sdk.java.model.AuthenticationClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

public class GetUserAuthResourceStructTest {
  // 需要替换成你的 Authing App ID
  private static final String APP_ID = "63f5b514ab248c5a9eb1dcaa";
  // 需要替换成你的 Authing App Secret
  private static final String APP_SECRET = "a1ff88d6c7c40418283a872ced3cdc3a";
  // 需要替换成你的 Authing App Host
  private static final String APP_HOST = "https://check-user-permission.authing.cn";
  // 需要替换成你的 Authing Access Token
  private static final String ACCESS_TOKEN = "AUTHING_ACCESS_TOKEN";

  public static void main(String[] args) throws Throwable {

    AuthenticationClientOptions clientOptions = new AuthenticationClientOptions();
    clientOptions.setAppId(APP_ID);
    clientOptions.setAppSecret(APP_SECRET);
    clientOptions.setAppHost(APP_HOST);

    AuthenticationClient client = new AuthenticationClient(clientOptions);

    LoginTokenRespDto response = client.signInByUsernamePassword(
        "1",
        "1",
        new SignInOptionsDto());
    clientOptions.setAccessToken(response.getData().getAccessToken());

    AuthenticationClient clientAuth = new AuthenticationClient(clientOptions);
    GetUserAuthResourceStructDto dto =
        new GetUserAuthResourceStructDto();

    dto.setResource("r3");

    GetUserAuthResourceStructRespDto userAuthResourceStruct = clientAuth
        .getUserAuthResourceStruct(dto);
    System.out.println(JsonUtils.serialize(userAuthResourceStruct));
  }

}
