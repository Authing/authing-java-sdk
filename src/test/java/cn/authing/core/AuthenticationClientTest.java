package cn.authing.core;

import cn.authing.core.auth.AuthenticationClient;
import cn.authing.core.graphql.GraphQLException;
import cn.authing.core.graphql.GraphQLResponse;
import cn.authing.core.http.Callback;
import cn.authing.core.types.*;
import org.jetbrains.annotations.Nullable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class AuthenticationClientTest {

    private AuthenticationClient authenticationClient;

    private String randomString() {
        return Integer.toString(new Random().nextInt());
    }

    @Before
    public void before() {
        this.authenticationClient = new AuthenticationClient("6006d6820d57817ed7a95f84");
        this.authenticationClient.setHost("https://core.authing.cn");
    }

    @Test
    public void registerByEmail() throws IOException, GraphQLException {
        String email = randomString() + "@gmail.com";
        String password = "123456";
        User user = this.authenticationClient.registerByEmail(new RegisterByEmailInput(email, password)).execute();
        Assert.assertEquals(user.getEmail(), email);
    }

    @Test
    public void registerByUsername() throws IOException, GraphQLException {
        String username = randomString();
        String password = "123456";
        User user =
            this.authenticationClient.registerByUsername(new RegisterByUsernameInput(username, password)).execute();
        Assert.assertEquals(user.getUsername(), username);
    }

    @Test
    public void registerByPhonePhoneCode() throws IOException, GraphQLException {
        String phone = "18311302182";
        String code = "123456";
        User user = this.authenticationClient.registerByPhoneCode(new RegisterByPhoneCodeInput(phone, code)).execute();
        Assert.assertEquals(user.getPhone(), phone);
    }

    @Test
    public void sendSmsCode() throws ExecutionException, InterruptedException {
        this.authenticationClient.loginByEmail(new LoginByEmailInput("demo@lihansir.com", "demo@lihansir.com"));
        CompletableFuture<CommonMessage> future = new CompletableFuture<>();
        this.authenticationClient.sendSmsCode("111111").enqueue(new Callback<CommonMessage>() {
            @Override
            public void onSuccess(CommonMessage result) {
                future.complete(result);
                System.out.print(result);
            }

            @Override
            public void onFailure(@Nullable GraphQLResponse.ErrorInfo error) {
                System.out.print(error);
                future.complete(null);
            }
        });
        Assert.assertNotNull(future.get());
    }

    @Test
    public void loginByEmail() throws IOException, GraphQLException {
        String email = "demo@lihansir.com";
        String password = "demo@lihansir.com";
        User user = this.authenticationClient.loginByEmail(new LoginByEmailInput(email, password)).execute();
        Assert.assertEquals(user.getEmail(), email);
    }

    @Test
    public void loginByWechat() throws IOException, GraphQLException {
        String code = "021I11Ga1hP9Uz0GJbGa1SVgxo4I11G7";
        User user = this.authenticationClient.loginByWechat(code).execute();
        Assert.assertNotNull(user);
    }

    @Test
    public void loginByUsername() throws IOException, GraphQLException, ExecutionException, InterruptedException {
        String username = "test";
        String password = "andy123456";
        CompletableFuture<User> future = new CompletableFuture<>();
        this.authenticationClient.loginByUsername(new LoginByUsernameInput(username, password))
            .enqueue(new Callback<User>() {
                @Override
                public void onSuccess(User result) {
                    future.complete(result);
                    System.out.print(result);
                }

                @Override
                public void onFailure(@Nullable GraphQLResponse.ErrorInfo error) {
                    System.out.print(error);
                    future.complete(null);
                }
            });
        Assert.assertNotNull(future.get());
    }

    @Test
    public void loginByPhoneCode() throws IOException, GraphQLException {
        String phone = "18311302182";
        String code = "2190";
        User user = this.authenticationClient.loginByPhoneCode(new LoginByPhoneCodeInput(phone, code)).execute();
        Assert.assertEquals(user.getPhone(), phone);
    }

    @Test
    public void loginByPhonePassword() throws IOException, GraphQLException {
        String phone = "18311302182";
        String password = "123456";
        User user =
            this.authenticationClient.loginByPhonePassword(new LoginByPhonePasswordInput(phone, password)).execute();
        Assert.assertEquals(user.getPhone(), phone);
    }

    @Test
    public void checkLoginStatus() throws IOException, GraphQLException {
        String username = "test";
        String password = "123456";
        this.authenticationClient.loginByUsername(new LoginByUsernameInput(username, password)).execute();

        JwtTokenStatus status = this.authenticationClient.checkLoginStatus().execute();
        Assert.assertEquals(status.getCode().intValue(), 200);
    }

    @Test
    public void sendEmail() throws IOException, GraphQLException {
        this.authenticationClient.sendEmail("demo@lihansir.com", EmailScene.RESET_PASSWORD).execute();
    }

    @Test
    public void resetPasswordByPhoneCode() throws IOException, GraphQLException {
        this.authenticationClient.resetPasswordByPhoneCode("18311302182", "1234", "123456").execute();
    }

    @Test
    public void resetPasswordByEmailCode() throws IOException, GraphQLException {
        this.authenticationClient.resetPasswordByEmailCode("demo@lihansir.com", "1234", "123456").execute();
    }

    @Test
    public void updateProfile() throws IOException, GraphQLException {
        String username = "test";
        String password = "123456";
        this.authenticationClient.loginByUsername(new LoginByUsernameInput(username, password)).execute();

        User user = this.authenticationClient.updateProfile(new UpdateUserInput().withNickname("nickname")).execute();
        Assert.assertEquals(user.getNickname(), "nickname");
    }

    @Test
    public void updatePassword() throws IOException, GraphQLException {
        String username = "test";
        String password = "123456";
        this.authenticationClient.loginByUsername(new LoginByUsernameInput(username, password)).execute();

        User user = this.authenticationClient.updatePassword("111111", "123456").execute();
        Assert.assertNotNull(user);
    }

    @Test
    public void updatePhone() throws IOException, GraphQLException {
        String username = "test";
        String password = "123456";
        this.authenticationClient.loginByUsername(new LoginByUsernameInput(username, password)).execute();

        User user = this.authenticationClient.updatePhone("18311302182", "1234").execute();
        Assert.assertNotNull(user);
    }

    @Test
    public void updateEmail() throws IOException, GraphQLException {
        String username = "test";
        String password = "123456";
        this.authenticationClient.loginByUsername(new LoginByUsernameInput(username, password)).execute();

        User user = this.authenticationClient.updateEmail("1498881550@qq.com", "1234").execute();
        Assert.assertNotNull(user);
    }

    @Test
    public void refreshToken() throws IOException, GraphQLException {
        String username = "test";
        String password = "123456";
        this.authenticationClient.loginByUsername(new LoginByUsernameInput(username, password)).execute();

        RefreshToken token = this.authenticationClient.refreshToken().execute();
        Assert.assertNotNull(token.getToken());
    }

    @Test
    public void bindPhone() throws IOException, GraphQLException {
        String username = "test";
        String password = "123456";
        this.authenticationClient.loginByUsername(new LoginByUsernameInput(username, password)).execute();

        User user = this.authenticationClient.bindPhone("18311302182", "1234").execute();
        Assert.assertEquals(user.getPhone(), "18311302182");
    }

    @Test
    public void unbindPhone() throws IOException, GraphQLException {
        String username = "test";
        String password = "123456";
        this.authenticationClient.loginByUsername(new LoginByUsernameInput(username, password)).execute();

        User user = this.authenticationClient.unbindPhone().execute();
        Assert.assertNotNull(user);
    }

    @Test
    public void Logout() throws IOException, GraphQLException {
        String username = "test";
        String password = "123456";
        this.authenticationClient.loginByUsername(new LoginByUsernameInput(username, password)).execute();

        this.authenticationClient.logout().execute();
    }

    @Test
    public void listUdv() throws IOException, GraphQLException {
        String username = "test";
        String password = "123456";
        this.authenticationClient.loginByUsername(new LoginByUsernameInput(username, password)).execute();

        List<UserDefinedData> udv = this.authenticationClient.listUdv().execute();
        Assert.assertEquals(0, udv.size());
    }

    @Test
    public void listOrgs() throws IOException, GraphQLException {
        String username = "test";
        String password = "test";
        this.authenticationClient.loginByUsername(new LoginByUsernameInput(username, password)).execute();

        List<List<Org>> orgs = this.authenticationClient.listOrgs().execute();
        Assert.assertEquals(0, orgs.size());
    }
}
