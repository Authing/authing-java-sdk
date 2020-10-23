package cn.authing.core;

import cn.authing.core.auth.AuthenticationClient;
import cn.authing.core.graphql.GraphQLException;
import cn.authing.core.types.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Random;

public class AuthenticationClientTest {
    private AuthenticationClient client;

    private String randomString() {
        return Integer.toString(new Random().nextInt());
    }

    @Before
    public void before() {
        client = new AuthenticationClient("59f86b4832eb28071bdd9214");
        client.setHost("http://localhost:3000");
    }

    @Test
    public void registerByEmail() throws IOException, GraphQLException {
        String email = randomString() + "@gmail.com";
        String password = "123456";
        User user = client.registerByEmail(new RegisterByEmailInput(email, password)).execute();
        Assert.assertEquals(user.getEmail(), email);
    }

    @Test
    public void registerByUsername() throws IOException, GraphQLException {
        String username = randomString();
        String password = "123456";
        User user = client.registerByUsername(new RegisterByUsernameInput(username, password)).execute();
        Assert.assertEquals(user.getUsername(), username);
    }

    @Test
    public void registerByPhonePhoneCode() throws IOException, GraphQLException {
        String phone = "17611161550";
        String code = "123456";
        User user = client.registerByPhoneCode(new RegisterByPhoneCodeInput(phone, code)).execute();
        Assert.assertEquals(user.getPhone(), phone);
    }

    @Test
    public void sendSmsCode() throws IOException {
        String phone = "17611161550";
        client.sendSmsCode(phone).execute();
    }

    @Test
    public void loginByEmail() throws IOException, GraphQLException {
        String email = "test@test.com";
        String password = "123456";
        User user = client.loginByEmail(new LoginByEmailInput(email, password)).execute();
        Assert.assertEquals(user.getEmail(), email);
    }

    @Test
    public void loginByUsername() throws IOException, GraphQLException {
        String username = "test";
        String password = "123456";
        User user = client.loginByUsername(new LoginByUsernameInput(username, password)).execute();
        Assert.assertEquals(user.getUsername(), username);
    }

    @Test
    public void loginByPhoneCode() throws IOException, GraphQLException {
        String phone = "17611161550";
        String code = "2190";
        User user = client.loginByPhoneCode(new LoginByPhoneCodeInput(phone, code)).execute();
        Assert.assertEquals(user.getPhone(), phone);
    }

    @Test
    public void loginByPhonePassword() throws IOException, GraphQLException {
        String phone = "17611161550";
        String password = "123456";
        User user = client.loginByPhonePassword(new LoginByPhonePasswordInput(phone, password)).execute();
        Assert.assertEquals(user.getPhone(), phone);
    }

    @Test
    public void checkLoginStatus() throws IOException, GraphQLException {
        String username = "test";
        String password = "123456";
        client.loginByUsername(new LoginByUsernameInput(username, password)).execute();

        JwtTokenStatus status = client.checkLoginStatus().execute();
        Assert.assertEquals(status.getCode().intValue(), 200);
    }

    @Test
    public void sendEmail() throws IOException, GraphQLException {
        client.sendEmail("1498881550@qq.com", EmailScene.RESET_PASSWORD).execute();
    }

    @Test
    public void resetPasswordByPhoneCode() throws IOException, GraphQLException {
        client.resetPasswordByPhoneCode("17611161550", "1234", "123456").execute();
    }

    @Test
    public void resetPasswordByEmailCode() throws IOException, GraphQLException {
        client.resetPasswordByEmailCode("1498881550@qq.com", "1234", "123456").execute();
    }

    @Test
    public void updateProfile() throws IOException, GraphQLException {
        String username = "test";
        String password = "123456";
        client.loginByUsername(new LoginByUsernameInput(username, password)).execute();

        User user = client.updateProfile(new UpdateUserInput().withNickname("nickname")).execute();
        Assert.assertEquals(user.getNickname(), "nickname");
    }

    @Test
    public void updatePassword() throws IOException, GraphQLException {
        String username = "test";
        String password = "123456";
        client.loginByUsername(new LoginByUsernameInput(username, password)).execute();

        User user = client.updatePassword("111111", "123456").execute();
        Assert.assertNotNull(user);
    }

    @Test
    public void updatePhone() throws IOException, GraphQLException {
        String username = "test";
        String password = "123456";
        client.loginByUsername(new LoginByUsernameInput(username, password)).execute();

        User user = client.updatePhone("17611161550", "1234").execute();
        Assert.assertNotNull(user);
    }

    @Test
    public void updateEmail() throws IOException, GraphQLException {
        String username = "test";
        String password = "123456";
        client.loginByUsername(new LoginByUsernameInput(username, password)).execute();

        User user = client.updateEmail("1498881550@qq.com", "1234").execute();
        Assert.assertNotNull(user);
    }

    @Test
    public void refreshToken() throws IOException, GraphQLException {
        String username = "test";
        String password = "123456";
        client.loginByUsername(new LoginByUsernameInput(username, password)).execute();

        RefreshToken token = client.refreshToken().execute();
        Assert.assertNotNull(token.getToken());
    }

    @Test
    public void bindPhone() throws IOException, GraphQLException {
        String username = "test";
        String password = "123456";
        client.loginByUsername(new LoginByUsernameInput(username, password)).execute();

        User user = client.bindPhone("17611161550", "1234").execute();
        Assert.assertEquals(user.getPhone(), "17611161550");
    }

    @Test
    public void unbindPhone() throws IOException, GraphQLException {
        String username = "test";
        String password = "123456";
        client.loginByUsername(new LoginByUsernameInput(username, password)).execute();

        User user = client.unbindPhone().execute();
        Assert.assertNotNull(user);
    }

    @Test
    public void Logout() throws IOException, GraphQLException {
        String username = "test";
        String password = "123456";
        client.loginByUsername(new LoginByUsernameInput(username, password)).execute();

        client.logout().execute();
    }
}
