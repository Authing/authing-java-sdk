package test.auth;

import cn.authing.sdk.java.client.AuthenticationClient;
import cn.authing.sdk.java.model.AuthenticationClientOptions;


public class getAccessTokenByCodeTest {
    private static final String ACCESS_KEY_ID = "YOUR_APP_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_APP_SECRET";
    private static final String HOST = "YOUR_APP_HOST";
    private static final String REDIRECT_URI = "https://www.baidu.com";

    public static void main(String[] args) throws Exception{
        AuthenticationClientOptions clientOptions = new AuthenticationClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET, REDIRECT_URI);
        AuthenticationClient client = new AuthenticationClient(clientOptions);

        //获取登录页 url
//        BuildAuthUrlParams params = new BuildAuthUrlParams();
//        params.setRedirectUri(REDIRECT_URI);
//
//        System.out.println(client.buildAuthUrl(params).getUrl());

        /*
        登录后人工在回调 url 中获取 code
        code 只能用一次，需要每次登录后重新获取。回调地址填百度可以避免被消费。
        */
        String code = "code";

        System.out.println(client.getAccessTokenByCode(code));
    }
}
