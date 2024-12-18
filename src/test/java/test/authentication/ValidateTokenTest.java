package test.authentication;

import cn.genauth.sdk.java.client.AuthenticationClient;
import cn.genauth.sdk.java.dto.ValidateTokenRespDto;
import cn.genauth.sdk.java.dto.authentication.ValidateTokenParams;
import cn.genauth.sdk.java.model.AuthenticationClientOptions;
import cn.genauth.sdk.java.util.JsonUtils;

public class ValidateTokenTest {
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
    ValidateTokenParams validateTokenParams = new ValidateTokenParams();
    String idToken =  "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MzBkYmM3ZGJkODM3NTk2ZjBmYTRhNzkiLCJhdWQiOiI2MzBkYWMzODQ4MjFhYTAxMDA3OTRkMDciLCJpYXQiOjE2NzUwNTk1ODAsImV4cCI6MTY3NjI2OTE4MCwiaXNzIjoiaHR0cHM6Ly9ob2Rha2RlZ25raGxlZWZsLWRlbW8uYXV0aGluZy5jbi9vaWRjIiwibmFtZSI6bnVsbCwiZ2l2ZW5fbmFtZSI6bnVsbCwibWlkZGxlX25hbWUiOm51bGwsImZhbWlseV9uYW1lIjpudWxsLCJuaWNrbmFtZSI6bnVsbCwicHJlZmVycmVkX3VzZXJuYW1lIjpudWxsLCJwcm9maWxlIjpudWxsLCJwaWN0dXJlIjoiaHR0cHM6Ly9maWxlcy5hdXRoaW5nLmNvL2F1dGhpbmctY29uc29sZS9kZWZhdWx0LXVzZXItYXZhdGFyLnBuZyIsIndlYnNpdGUiOm51bGwsImJpcnRoZGF0ZSI6bnVsbCwiZ2VuZGVyIjoiVSIsInpvbmVpbmZvIjpudWxsLCJsb2NhbGUiOm51bGwsInVwZGF0ZWRfYXQiOiIyMDIzLTAxLTMwVDA2OjE5OjM3LjM3N1oiLCJlbWFpbCI6bnVsbCwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJwaG9uZV9udW1iZXIiOiIxODM3MTkxOTU2MyIsInBob25lX251bWJlcl92ZXJpZmllZCI6ZmFsc2V9.98NKXV9LSMt7d4-xERQeUEtMZiiMddKdz_AIcWE3HMc";


    validateTokenParams.setAccessToken(idToken);

    ValidateTokenRespDto response = client.validateToken(validateTokenParams);
    System.out.println(JsonUtils.serialize(response));
  }

}
