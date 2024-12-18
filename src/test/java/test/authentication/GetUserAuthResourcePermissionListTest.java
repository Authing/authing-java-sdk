package test.authentication;

import cn.genauth.sdk.java.client.AuthenticationClient;
import cn.genauth.sdk.java.dto.GetUserAuthResourcePermissionListDto;
import cn.genauth.sdk.java.dto.GetUserAuthResourcePermissionListRespDto;
import cn.genauth.sdk.java.dto.LoginTokenRespDto;
import cn.genauth.sdk.java.dto.SignInOptionsDto;
import cn.genauth.sdk.java.model.AuthenticationClientOptions;
import cn.genauth.sdk.java.util.JsonUtils;
import java.util.ArrayList;
import java.util.List;

public class GetUserAuthResourcePermissionListTest {
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

    AuthenticationClient client = new AuthenticationClient(clientOptions);

    LoginTokenRespDto response = client.signInByUsernamePassword(
        "4",
        "4",
        new SignInOptionsDto());
    clientOptions.setAccessToken(response.getData().getAccessToken());

    AuthenticationClient clientAuth = new AuthenticationClient(clientOptions);
    List<String> list = new ArrayList<>();
    list.add("r1");
    list.add("r2");
    list.add("r3/1");
    list.add("r3/1/11");
    GetUserAuthResourcePermissionListDto dto = new GetUserAuthResourcePermissionListDto();

    dto.setResources(list);

    GetUserAuthResourcePermissionListRespDto userAuthResourcePermissionList = clientAuth
        .getUserAuthResourcePermissionList(dto);
    System.out.println(JsonUtils.serialize(userAuthResourcePermissionList));
  }

}
