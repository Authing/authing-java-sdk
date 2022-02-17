package cn.authing.core;

import cn.authing.core.auth.AuthenticationClient;
import cn.authing.core.types.User;
import cn.authing.core.types.VerifyAppEmailMfaParams;
import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class MfaAuthenticationClientTest {

    private AuthenticationClient authenticationClient;

    private final String APP_ID = "6123532b7e39d8e579bd045b";
    private final String APP_SECRET = "b268f1820b292e2141aca09a489fcf53";
    private final String USER_POOL_ID = "60e043f8cd91b87d712b6365";
    private final String APP_HOST = "https://core.authing.cn";

    // 替换上自己手机号呦～
    private final String PHONE = "15566416161";

    Gson gson = new Gson();

    @Before
    public void before() {
        this.authenticationClient = new AuthenticationClient(USER_POOL_ID);
        this.authenticationClient.setAppId(APP_ID);
        this.authenticationClient.setSecret(APP_SECRET);
        this.authenticationClient.setHost(APP_HOST);
    }

    @Test
    private void verifyAppEmailMfa() throws IOException {
        VerifyAppEmailMfaParams params = new VerifyAppEmailMfaParams("zy@wm.com","1123","");
        User user =  this.authenticationClient.mfa().verifyAppEmailMfa(params).execute();
        System.out.println(gson.toJson(user));
    }

}
