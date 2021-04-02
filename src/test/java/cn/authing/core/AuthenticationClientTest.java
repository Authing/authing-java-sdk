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
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class AuthenticationClientTest {

    private AuthenticationClient authenticationClient;

    private String randomString() {
        return Integer.toString(new Random().nextInt());
    }

    @Before
    public void before() {
        this.authenticationClient = new AuthenticationClient("6066d1429248923c2d3b98e6");
        this.authenticationClient.setHost("http://localhost:3000");
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
//        String username = "test1";
//        String password = "123456";

        String username = "15566416161";
        String password = "15566416161";
//        CompletableFuture<User> future = new CompletableFuture<>();
//        this.authenticationClient.loginByUsername(new LoginByUsernameInput(username, password))
//            .enqueue(new Callback<User>() {
//                @Override
//                public void onSuccess(User result) {
//                    future.complete(result);
//                    System.out.print(result);
//                }
//
//                @Override
//                public void onFailure(@Nullable GraphQLResponse.ErrorInfo error) {
//                    System.out.print(error);
//                    future.complete(null);
//                }
//            });
//        Assert.assertNotNull(future.get());

        User result = this.authenticationClient.loginByUsername(new LoginByUsernameInput(username, password)).execute();
        Assert.assertNotNull(result);
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
    public void bindEmail() throws IOException, GraphQLException {
        String email = "demo@lihansir.com";
        String password = "demo@lihansir.com";
        this.authenticationClient.loginByEmail(new LoginByEmailInput(email, password)).execute();

        User user = this.authenticationClient.bindEmail("demo@authing.cn", "1234").execute();
        Assert.assertNotNull(user);
    }

    @Test
    public void Logout() throws IOException, GraphQLException {
        String username = "test";
        String password = "andy123456";
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

    @Test
    public void linkAccount() throws IOException {
        String primaryUserToken = "test";
        String secondaryUserToken = "test";
        CommonMessage message = this.authenticationClient.linkAccount(primaryUserToken, secondaryUserToken).execute();
        Assert.assertEquals(Objects.requireNonNull(message.getCode()).intValue(), 200);
    }

    @Test
    public void loginByLdap() throws IOException {
        String username = "test";
        String password = "test";
        LoginByLdapParam loginByLdapParam = new LoginByLdapParam(username, password);
        User user = this.authenticationClient.loginByLdap(loginByLdapParam).execute();
        Assert.assertEquals(username, user.getUsername());
    }

    @Test
    public void loginByAd() throws IOException {
        String username = "test";
        String password = "test";
        User user = this.authenticationClient.loginByAd(username, password).execute();
        Assert.assertEquals(username, user.getUsername());
    }

    @Test
    public void checkPasswordStrength() throws IOException, GraphQLException {
        String password = "test";
        CheckPasswordStrengthResult result = this.authenticationClient.checkPasswordStrength(password).execute();
        Assert.assertTrue(result.getValid());
    }

    @Test
    public void listAuthorizedResources() throws IOException, GraphQLException, ExecutionException, InterruptedException {
        loginByUsername();
        String namespace = "default";
        PaginatedAuthorizedResources result = this.authenticationClient.listAuthorizedResources(namespace).execute();
        Assert.assertNotNull(result.getList());
    }

    @Test
    public void getSecurityLevel() throws IOException, GraphQLException, ExecutionException, InterruptedException {
        loginByUsername();
        SecurityLevel result = this.authenticationClient.getSecurityLevel().execute();
        Assert.assertNotNull(result !=null);
    }

    @Test
    public void UdfValue() throws IOException, GraphQLException, ExecutionException, InterruptedException {
        setUdfValue();
        getUdfValue();
        removeUdfValue();
    }

    @Test
    public void getUdfValue() throws IOException, GraphQLException, ExecutionException, InterruptedException {
        loginByUsername();
        Map result = this.authenticationClient.getUdfValue().execute();
        Assert.assertNotNull(result !=null);
    }

    @Test
    public void setUdfValue() throws IOException, GraphQLException, ExecutionException, InterruptedException {
        loginByUsername();
        Map<String, String> p = new HashMap();
        p.put("dnum","234");
        List<UserDefinedData> result = this.authenticationClient.setUdfValue(p).execute();
        Assert.assertNotNull(result !=null);
    }

    @Test
    public void removeUdfValue() throws IOException, GraphQLException, ExecutionException, InterruptedException {
        loginByUsername();
        List<UserDefinedData> result = this.authenticationClient.removeUdfValue("dnum").execute();
        Assert.assertNotNull(result !=null);
    }

    @Test
    public void getAccessTokenByCode() throws IOException, GraphQLException, ExecutionException, InterruptedException {
        AuthenticationClient testAC = new AuthenticationClient("5f9d0cef2e10f4e465153a7b");
        testAC.setAppId("5f9d0cef2e10f4e465153a7b");
        testAC.setHost("https://1604127979898-demo.authing.cn");
        testAC.setSecret("2b8332093c4b219d0d91f278a46731e4");
        testAC.setRedirectUri("https://baidu.com");

//        testAC.setTokenEndPointAuthMethod(AuthMethodEnum.CLIENT_SECRET_BASIC);
        testAC.setTokenEndPointAuthMethod(AuthMethodEnum.NONE);

        Object result = testAC.getAccessTokenByCode("aNhjg8hc__G8vd7LbO5ZV_hWIzP1BN6KVYpcei1XiOn").execute();
        Assert.assertNotNull(result !=null);
    }

    @Test
    public void getAccessTokenByClientCredentials() throws IOException, GraphQLException, ExecutionException, InterruptedException {
        AuthenticationClient testAC = new AuthenticationClient("5f9d0cef2e10f4e465153a7b");
        testAC.setHost("https://1604127979898-demo.authing.cn");

        ClientCredentialInput clientCredentialInput = new ClientCredentialInput("60519949a70e7dda12785693"
                ,"be1a5596b3185d88c097ae310e3184ed");

        Object result = testAC.getAccessTokenByClientCredentials("testr2",clientCredentialInput).execute();
        Assert.assertNotNull(result !=null);
    }

    @Test
    public void getUserInfoByAccessToken() throws IOException, GraphQLException, ExecutionException, InterruptedException {
        AuthenticationClient testAC = new AuthenticationClient("5f9d0cef2e10f4e465153a7b");
        testAC.setHost("https://1604127979898-demo.authing.cn");

        Object result = testAC.getUserInfoByAccessToken("eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6InA1OENCUTJzZ1JVYVJEdzZWcWxyT3hXT0hDdVN2MVUtN09VbE8zRkg1T2cifQ.eyJqdGkiOiJ5dExETVdzWkphTVExblk3YS1VdVYiLCJzdWIiOiI1ZjlkMjJmZjllMTcxYzY5MzJjZjViMGIiLCJpYXQiOjE2MTU5NTcxNzYsImV4cCI6MTYxNTk2MDc3Niwic2NvcGUiOiJwcm9maWxlIG9wZW5pZCBlbWFpbCBwaG9uZSIsImlzcyI6Imh0dHBzOi8vMTYwNDEyNzk3OTg5OC1kZW1vLmF1dGhpbmcuY24vb2lkYyIsImF1ZCI6IjVmOWQwY2VmMmUxMGY0ZTQ2NTE1M2E3YiJ9.hbfawBWTYHy8NvFHIdOQmeZKVD9Exdx2bHQzbLcsfW3FnATtGO7g1NEgeSXp5e64n15pmsAPNXH6Sq31a6FkmkaJQDNk5xFO9xAobbU8wmaa9taZd7tbTEfeNTuap38J53hRF9xNr5kTvMkTkMWB03CU-DHF-AsBnZTd-g6ZwEMNTGRt9JEz-em58J3RO9JTtKTIaM6YElh-5rDzuukODPVTZIkw8Hjf07beg6LM1C6AKgyH63u_SZGKrBPfDDu8S2-fDWwUgMT5V_Bx-qeX4_9tX9BMuuOnOtq2NkEv1Rf3dFjf8dS_SunV-SlifTciwl_P7u-MaQVHEWTMJkSjvQ").execute();
        Assert.assertNotNull(result !=null);
    }

    @Test
    public void list() throws IOException, InterruptedException, ExecutionException, GraphQLException {
        loginByUsername();

        Pagination<ApplicationPublicDetail> result = authenticationClient.listApplications(1, 10).execute();
        Pagination<ApplicationPublicDetail> resultNotProps = authenticationClient.listApplications().execute();
        Assert.assertNotNull(result);
        Assert.assertNotNull(resultNotProps);
    }

}
