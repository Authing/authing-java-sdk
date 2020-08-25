package cn.authing.core;

import cn.authing.core.types.*;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AuthingTest {
    static Authing client;

    @BeforeClass
    public static void beforeAll() {
        client = new Authing("5e72d65c77932a59a266a5ca", "699b99005bdf51d5f7ca97014ed9fdea");
    }

    @Test
    public void loginBySecret() throws IOException {
        System.out.println(client.loginBySecret().execute());
    }

    @Test
    public void loginByEmail() throws IOException {
        System.out.println(client.loginByEmail(new LoginByEmailParam().email("test@test.com").password("123456").build()).execute());
    }

    @Test
    public void loginByUsername() throws IOException {
        System.out.println(client.loginByUsername(new LoginByUsernameParam().username("test").password("123456").build()).execute());
    }

    @Test
    public void loginByPhonePassword() throws IOException {
        System.out.println(client.loginByPhonePassword(new LoginByPhonePasswordParam().phone("17611161550").password("123456").build()).execute());
    }

    @Test
    public void loginByOidc() throws IOException {
        System.out.println(client.loginByOidc(new LoginByOidcParam("5e72d72e3798fb03e1d57b13", "931f19ce2161e5560c072f586c706ee6","test@test.com", "123456").build()).execute());
    }

    @Test
    public void refreshOidcToken() throws IOException {
        System.out.println(client.refreshOidcToken(new RefreshOidcTokenParam("5e72d72e3798fb03e1d57b13", "931f19ce2161e5560c072f586c706ee6","40C1CpPQvU2RjSPY1c8nWjmblwa").build()).execute());
    }

    @Test
    public void register() throws IOException {
        String username = System.currentTimeMillis() + "";
        UserRegisterInput input = new UserRegisterInput().username(username).password("123456").build();
        System.out.println(client.register(new RegisterParam().userInfo(input).build()).execute());
    }

    @Test
    public void refreshToken() throws IOException {
        String token = client.loginBySecret().execute().getResult();
        client.setAccessToken(token);
        ExtendUser user = client.loginByUsername(new LoginByUsernameParam().username("test").password("123456").build()).execute().getResult();
        System.out.println(client.refreshToken(new RefreshTokenParam().user(user.get_id()).build()).execute());
    }

    @Test
    public void user() throws IOException {
        ExtendUser user = client.loginByUsername(new LoginByUsernameParam().username("test").password("123456").build()).execute().getResult();
        client.setAccessToken(user.getToken());
        System.out.println(client.user(new UserParam().token(user.getToken()).build()).execute());
    }

    @Test
    public void updateUser() throws IOException {
        ExtendUser user = client.loginByUsername(new LoginByUsernameParam().username("test").password("123456").build()).execute().getResult();
        client.setAccessToken(user.getToken());
        UserUpdateInput options = new UserUpdateInput()._id(user.get_id()).nickname("nickname").build();
        System.out.println(client.updateUser(new UpdateUserParam().options(options).build()).execute());
    }

    @Test
    public void checkLoginStatus() throws IOException {
        ExtendUser user = client.loginByUsername(new LoginByUsernameParam().username("test").password("123456").build()).execute().getResult();
        client.setAccessToken(user.getToken());
        System.out.println(client.checkLoginStatus(new CheckLoginStatusParam().token(user.getToken()).build()).execute());
    }

    @Test
    public void readOauthList() throws IOException {
        String token = client.loginBySecret().execute().getResult();
        client.setAccessToken(token);
        System.out.println(client.readOauthList(new ReadOauthListParam().build()).execute());
    }

    @Test
    public void sendVerifyEmail() throws IOException {
        String token = client.loginBySecret().execute().getResult();
        client.setAccessToken(token);
        System.out.println(client.sendVerifyEmail(new SendVerifyEmailParam().email("1498881550@qq.com").build()).execute());
    }

    @Test
    public void sendPhoneVerifyCode() throws IOException {
        System.out.println(client.sendPhoneVerifyCode("17611161550").execute());
    }

    @Test
    public void sendResetPasswordEmail() throws IOException {
        client.sendResetPasswordEmail(new SendResetPasswordEmailParam().email("1498881550@qq.com").build()).execute();
    }

    @Test
    public void userPatch() throws IOException {
        String token = client.loginBySecret().execute().getResult();
        client.setAccessToken(token);
        ExtendUser user = client.loginByUsername(new LoginByUsernameParam().username("test").password("123456").build()).execute().getResult();
        System.out.println(client.userPatch(new UserPatchParam().ids(user.get_id()).build()).execute());
    }

    @Test
    public void users() throws IOException {
        String token = client.loginBySecret().execute().getResult();
        client.setAccessToken(token);
        System.out.println(client.users(new UsersParam().page(1).count(2).build()).execute());
    }

    @Test
    public void removeUsers() throws IOException {
        // 获得管理员权限
        String token = client.loginBySecret().execute().getResult();
        client.setAccessToken(token);

        // 注册用户
        String username = System.currentTimeMillis() + "";
        UserRegisterInput input = new UserRegisterInput().username(username).password("123456").build();
        ExtendUser user = client.register(new RegisterParam().userInfo(input).build()).execute().getResult();

        // 删除用户
        List<String> ids = new ArrayList<String>();
        ids.add(user.get_id());
        System.out.println(client.removeUsers(new RemoveUsersParam().ids(ids).build()).execute());
    }
}
