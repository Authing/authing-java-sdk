# Authing SDK for Java

JDK version 1.8

Github address: [https://github.com/Authing/authing-java-sdk](https://github.com/Authing/authing-java-sdk)

# Installation

## Create project

Create a new project in IDEA

![create-1](https://cdn.authing.cn/blog/20200311011537.png)

Select Gradle and check Java and Kotlin in the extra dependencies on the right:
![Create Project-2](https://cdn.authing.cn/blog/20200311013755.png)

Fill in other information:

![create-3](https://cdn.authing.cn/blog/20200311011746.png)

![create-4](https://cdn.authing.cn/blog/20200311011811.png)

## Adding dependencies

Enter the IDE and wait for Gradle to finish building. Open the build.gradle file:

![ide-1](https://cdn.authing.cn/blog/20200311011901.png)

Add the following to the red arrow on the right:

```
   ...
    repositories {
        jcenter()
        mavenCentral()
    }

    dependencies {
        compile "org.jetbrains.kotlin: kotlin-stdlib-jdk8"
        testCompile group: 'junit', name: 'junit', version: '4.12'
        implementation "cn.authing: java-core: 1.0.0"
        implementation 'com.squareup.okhttp3: okhttp: 3.14.2'
        implementation 'com.google.code.gson: gson: 2.8.5'
        implementation 'org.bouncycastle: bcprov-jdk15: 1.46'
        implementation 'com.google.android:android:4.1.1.4'

    }
   ...
```

As shown in the figure below, follow the prompts to enable the Auto-import feature:

![auto-import](https://cdn.authing.cn/blog/20200311012019.png)

## Start using

Create a Class under the java folder and name it Demo.

![create-class](https://cdn.authing.cn/blog/20200311012211.png)

In the main function of the class, introduce Authing and start using Authing

![import-authing](https://cdn.authing.cn/blog/20200311013959.png)

> Android Note
> For Android development, you need to add the INTERNET permission to the AndroidManifest file.

```xml
    <uses-permission android:name="android.permission.INTERNET" />
```

# Quick start

First get the `UserPool ID` from the Authing console, and then call the initialization function, which should be called once. In Android development, it is recommended to initialize in Application.

```java
import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.service.*;

public class Demo2 {
    public static void main(String [] args) {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").Secret("1dcaa83dd0a0424d7906d7cec76e1935").Build();
        Authing.init(init);
        UserService userService = Authing.getUserService();
        UserManageService userManageService = Authing.getUserManageService();
        PermissionService permissionService = Authing.getPermissionService();
        VerifyService verifyService = Authing.getVerifyService();
        OAuthService oauthService = Authing.getOAuthService();
    }
}
```

# How to build a parameter object

SDK interface function parameter objects need to be constructed before being passed in.

## Create parameter constructor and initialize required parameters

```java
import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.RegisterParam;
import cn.authing.core.result.RegisterResult;
import cn.authing.core.service.UserService;

import java.io.IOException;

public class Register {
    public static void main(String [] args) throws IOException {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").Secret("1dcaa83dd0a0424d7906d7cec76e1935").Build();
        Authing.init(init);
        UserService userService = Authing.getUserService();
        // create a constructor
        RegisterParam.Builder registerParamBuilder = new RegisterParam.Builder("test@123.com", "123456");
    }
}
```

## Add optional parameters using parameter constructor

```java
    import cn.authing.core.Authing;
    import cn.authing.core.param.InitParam;
    import cn.authing.core.param.RegisterParam;
    import cn.authing.core.result.RegisterResult;
    import cn.authing.core.service.UserService;

    import java.io.IOException;

    public class Register {
        public static void main(String [] args) throws IOException {
            InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").Secret("1dcaa83dd0a0424d7906d7cec76e1935").Build();
            Authing.init(init);
            UserService userService = Authing.getUserService();
            RegisterParam.Builder registerParamBuilder = new RegisterParam.Builder("test@123.com", "123456");
            // create optional parameters
            registerParamBuilder.nickname("test_nickname");
            registerParamBuilder.company("Authing");
        }
    }
```

## Create Parameter Object

```java
import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.RegisterParam;
import cn.authing.core.result.RegisterResult;
import cn.authing.core.service.UserService;

import java.io.IOException;

public class Register {
    public static void main(String [] args) throws IOException {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").Secret("1dcaa83dd0a0424d7906d7cec76e1935").Build();
        Authing.init(init);
        UserService userService = Authing.getUserService();
        RegisterParam.Builder registerParamBuilder = new RegisterParam.Builder("test@123.com", "123456");
        registerParamBuilder.nickname("test_nickname");
        registerParamBuilder.company("Authing");
        // create a parameter object
        RegisterParam registerParam = registerParamBuilder.build();
        // call interface function with parameter object
        RegisterResult registerResult = userService.createUser(registerParam).execute();
        System.out.println(registerResult.getId());
    }
}
```

# SDK Overview

The Authing SDK provides authorization service(OAuthService), user service(UserService), user management service(UserManageService) and verification service(VerifyService).You can directly obtain related information through Authing.getOAuthService, Authing.getUserService, Authing.getUserManageService, Authing.getVerifyService Instance.

# How to call

## Call synchronously

The SDK provides two calling methods: **synchronous** and **asynchronous**, which are suitable for different scenarios.

If you need to wait for the result to process the subsequent data, it is more suitable for synchronous call, for example:

```java
import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.RegisterParam;
import cn.authing.core.result.RegisterResult;
import cn.authing.core.service.UserService;

import java.io.IOException;

public class Register {
    public static void main(String [] args) throws IOException {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").Secret("1dcaa83dd0a0424d7906d7cec76e1935").Build();
        Authing.init(init);
        UserService userService = Authing.getUserService();
        RegisterParam.Builder registerParamBuilder = new RegisterParam.Builder("test@123.com", "123456");
        registerParamBuilder.nickname("test_nickname");
        registerParamBuilder.company("Authing");
        RegisterParam registerParam = registerParamBuilder.build();
        // synchronous call
        RegisterResult registerResult = userService.createUser(registerParam).execute();
        System.out.println(registerResult.getId());
    }
}
```

## Asynchronous call

If you are in Android's main thread, you need to use asynchronous calls(of course you can also use synchronous calls in child threads), for example:

```java
import cn.authing.core.Authing;
import cn.authing.core.http.Callback;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.RegisterParam;
import cn.authing.core.result.ErrorInfo;
import cn.authing.core.result.RegisterResult;
import cn.authing.core.service.UserService;

import java.io.IOException;

public class RegisterUserAsync {
    public static void main(String [] args) throws IOException {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").Secret("1dcaa83dd0a0424d7906d7cec76e1935").Build();
        Authing.init(init);
        UserService userService = Authing.getUserService();
        RegisterParam registerParam = new RegisterParam.Builder("13812341234", "123").Nickname("test_nickname").Build();
        userService.createUser(registerParam).enqueue(new Callback <RegisterResult> () {
            @Override
            public void onSuccess(RegisterResult registerResult) {
                registerResult.getId();
            }

            @Override
            public void onFailure(ErrorInfo errorInfo) {
                System.out.println(errorInfo.getCode());
                System.out.println(errorInfo.getMessage());
            }
        });
    }
}
```

# Error handling

Synchronous calls do not return errors, so asynchronous calls are recommended.An error is returned in `onFailure`, you can get the error code by`error.getCode()`.For more details on error reporting, please see the list of error codes.

# User service

## Initialization

Authing.getUserService()

Please initialize User related services as follows:

```java
import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.service.UserService;

public class Demo2 {
    public static void main(String [] args) {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").Secret("1dcaa83dd0a0424d7906d7cec76e1935").Build();
        Authing.init(init);
        UserService userService = Authing.getUserService();
    }
}
```

## Create user

userService.createUser(params)

- params {Object}
  - params.unionid {String}, only one for unionid and email parameters
  - params.email {String}, unionid and email parameters can only be filled in one
  - params.password {String}, required if unionid is not specified, not required if unionid is specified
  - params.username {String}, optional, username
  - params.company {String}, optional, company
  - params.lastIP {String}, optional, last login IP address
  - params.oauth {String}, optional, user social login information or other custom data
  - params.photo {String}, optional, avatar

Example:

```java
import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.RegisterParam;
import cn.authing.core.result.RegisterResult;
import cn.authing.core.service.UserService;

import java.io.IOException;

public class Register {
    public static void main(String [] args) throws IOException {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").Secret("1dcaa83dd0a0424d7906d7cec76e1935").Build();
        Authing.init(init);
        UserService userService = Authing.getUserService();
        RegisterParam registerParam = new RegisterParam.Builder("test@123.com", "123456").Nickname("test_nickname").Build();
        RegisterResult registerResult = userService.createUser(registerParam).execute();
        System.out.println(registerResult.getId());
    }
}
```

## Email Login

userService.loginByEmail(params)

- params {Object}
  - params.email {String}, required, user email
  - params.password {String}, required, user password

Example:

```java
import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.LoginByEmailParam;
import cn.authing.core.result.LoginResult;
import cn.authing.core.service.UserService;

import java.io.IOException;

public class LoginByEmail {
    public static void main(String [] args) throws IOException {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").Secret("1dcaa83dd0a0424d7906d7cec76e1935").Build();
        Authing.init(init);
        UserService userService = Authing.getUserService();
        LoginByEmailParam loginByEmailParam = new LoginByEmailParam.Builder("test@123.com", "123456").Build();
        LoginResult loginResult = userService.loginByEmail(loginByEmailParam).execute();
        System.out.println(loginResult.getId());
    }
}
```

## Mobile Verification Code Login

userService.loginByPhone(params)

- params {Object}
  - params.phone {String}, phone number
  - params.verifyCode {Int}, SMS verification code

Example:

```java
import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.LoginByPhoneParam;
import cn.authing.core.result.LoginResult;
import cn.authing.core.service.UserService;

import java.io.IOException;

public class loginByPhone {
    public static void main(String [] args) throws IOException {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").Secret("1dcaa83dd0a0424d7906d7cec76e1935").Build();
        Authing.init(init);
        UserService userService = Authing.getUserService();
        LoginByPhoneParam loginByPhoneParam = new LoginByPhoneParam.Builder("13812341234", 1234).build();
        LoginResult loginResult = userService.loginByPhone(loginByPhoneParam).execute();
        System.out.println(loginResult.getId());
    }
}
```

## LDAP login

userService.loginByLDAP(params)

- params {Object}
  - params.username {String}, required, username
  - params.password {String}, required, password

Example:

```java
import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.LoginByLADPParam;
import cn.authing.core.result.LoginResult;
import cn.authing.core.service.UserService;

import java.io.IOException;

public class loginByLDAP {
    public static void main(String [] args) throws IOException {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").Secret("1dcaa83dd0a0424d7906d7cec76e1935").Build();
        Authing.init(init);
        UserService userService = Authing.getUserService();
        LoginByLADPParam loginByLDAPParam = new LoginByLADPParam.Builder("13812341234", "123456").Build();
        LoginResult loginResult = userService.loginByLDAPloginByLDAPParam).execute();
        System.out.println(loginResult.getId());
    }
}
```

## Login using OIDC Password mode

userService.loginByOidc(params)

- params {Object}
  - params.client_id {String}, required, OIDC application ID
  - params.client_secret {String}, required, OIDC application key
  - params.phone {String}, optional, phone / email / username / unionid mutually exclusive
  - params.email, optional, phone / email / username / unionid mutually exclusive
  - params.username, optional, phone / email / username / unionid mutually exclusive
  - params.unionid, optional, phone / email / username / unionid mutually exclusive
  - params.password, required if unionid is missing, not required when logging in with unionid
  - params.phone {String}, optional, phone / email / username / unionid mutually exclusive
  - params.email, optional, phone / email / username / unionid mutually exclusive
  - params.username, optional, phone / email / username / unionid mutually exclusive
  - params.unionid, optional, phone / email / username / unionid mutually exclusive
  - params.password, required if unionid is missing, not required when logging in with unionid

Example:

```java
import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.LoginByOidcParam;
import cn.authing.core.result.SigninResult;

public class TestLoginByOidc {
    public static void main(String [] args) throws Exception {
        InitParam param = new InitParam.Builder("5e109c446ef04e93e4a54d69").Secret("1dcaa83dd0a0424d7906d7cec76e1935").Build();
        // Initialize, only need to initialize once globally
        Authing.init(param);

        // oidc login parameters
        LoginByOidcParam p = new LoginByOidcParam.Builder("oidcClientId", "oidcSecret")
                // These four init methods, only one call, multiple init, only the first time will take effect
               .initWithEmail("Email", "Password")
                //.initWithPhone("Phone", "Password")
                //.initWithUsername("user name", "password")
                //.initWithUnionId("unionId")
               .build();
        // call and get the result.
        SigninResult result = Authing.getUserService().LoginByOidc(p).execute();
        System.out.println(result.getAccessToken());
    }
}
```

## Refresh OIDC Token

userService.refreshOidcToken(params)

- params {Object}
  - params.client_id {String}, required, OIDC application ID
  - params.client_secret {String}, required, OIDC application key
  - params.refresh_token {String}, required, refresh token

Example:

```java
import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.RefreshOidcTokenParam;
import cn.authing.core.result.RefreshOidcTokenResult;

public class TestRefreshOidcToken {
    public static void main(String [] args) throws Exception {
        InitParam param = new InitParam.Builder("5e109c446ef04e93e4a54d69").Secret("1dcaa83dd0a0424d7906d7cec76e1935").Build();
        // Initialize, only need to initialize once globally
        Authing.init(param);

        // Refresh the parameters of OidcToken
        RefreshOidcTokenParam p = new RefreshOidcTokenParam.Builder("oidcClientId", "oidcSecret", "refresh token")
               .build();
        // call and get the result.
        RefreshOidcTokenResult result = Authing.getUserService().RefreshOidcToken(p).execute();
        System.out.println(result.getAccessToken());
    }
}
```

## log in

userService.signIn(params)

- params {Object}
  - params.phone {String}, optional, phone / email / username / unionid mutually exclusive
  - params.email, optional, phone / email / username / unionid mutually exclusive
  - params.username, optional, phone / email / username / unionid mutually exclusive
  - params.unionid, optional, phone / email / username / unionid mutually exclusive
  - params.password, required if unionid is missing, not required when logging in with unionid

Example:

```java
import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.SigninParam;
import cn.authing.core.result.SigninResult;

public class TestSignin {
    public static void main(String [] args) throws Exception {
        InitParam param = new InitParam.Builder("5e109c446ef04e93e4a54d69").Secret("1dcaa83dd0a0424d7906d7cec76e1935").Build();
        // Initialize, only need to initialize once globally
        Authing.init(param);

        // Login parameters
        SigninParam p = new SigninParam.Builder()
            // These four init methods, only one call, multiple init, only the first time will take effect
           .initWithEmail("Email", "Password")
            //.initWithPhone("Phone", "Password")
            //.initWithUsername("user name", "password")
            //.initWithUnionId("unionId")
           .build();
        // call and get the result.
        SigninResult result = Authing.getUserService().SignIn(p).execute();
        System.out.println(result.getAccessToken());
    }
}
```

## Refresh signIn Token

userService.refreshSignInToken(params)

- params {Object}
  - params.refresh_token {String}, required, refresh token

Example:

```java
import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.RefreshSigninTokenParam;
import cn.authing.core.result.RefreshSigninTokenResult;

public class TestRefreshSigninToken {
    public static void main(String [] args) throws Exception {
        InitParam param = new InitParam.Builder("5e109c446ef04e93e4a54d69").Secret("1dcaa83dd0a0424d7906d7cec76e1935").Build();
        // Initialize, only need to initialize once globally
        Authing.init(param);

        // Get the parameters of the user list
        RefreshSigninTokenParam p = new RefreshSigninTokenParam.Builder("refresh token")
           .oidcAppId("") // optional parameter
           .build();
        // call and get the result.
        RefreshSigninTokenResult result = Authing.getUserService().RefreshSignInToken(p).execute();
        System.out.println(result.getAccessToken());
    }
}
```

## Refresh user Authing Token

userService.refreshToken(params)

- params {Object}
  - params.userId {String}, required, user ID

Example:

```java
import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.RefreshTokenParam;
import cn.authing.core.result.RefreshTokenResult;
import cn.authing.core.service.UserService;

import java.io.IOException;

public class RefreshToken {
    public static void main(String [] args) throws IOException {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").Secret("1dcaa83dd0a0424d7906d7cec76e1935").Build();
        Authing.init(init);
        UserService userService = Authing.getUserService();
        RefreshTokenParam refreshTokenParam = new RefreshTokenParam.Builder("5e109c446ef04e93e4a54d69").Build();
        RefreshTokenResult refreshTokenResult = userService.refreshToken(refreshTokenParam).execute();
        System.out.println(refreshTokenResult.getToken());
    }
}
```

## Get user information

userService.user(params)

- params {Object}
  - params.userId {String}, required, user ID

Example:

```java
import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.UserInfoParam;
import cn.authing.core.result.UserInfoResult;
import cn.authing.core.service.UserService;

import java.io.IOException;

public class GetUserInfo {
    public static void main(String [] args) throws IOException {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").Secret("1dcaa83dd0a0424d7906d7cec76e1935").Build();
        Authing.init(init);

        UserService userService = Authing.getUserService();
        UserInfoParam userInfoParam = new UserInfoParam.Builder("5e109c446ef04e93e4a54d69").Build();
        UserInfoResult userInfoResult = userService.user(userInfoParam).execute();
        System.out.println(userInfoResult.getId());
    }
}
```

## Update user information

userService.updateUserInfo(params)

- params {Object}
  - params.userId {userId}, required, user ID
  - params.blocked {Boolean}, optional, whether to be locked
  - params.browser {String}, optional, browser information
  - params.company {String}, optional, company
  - params.email {String}, optional, email
  - params.emailVerified {Boolean}, optional, whether the mailbox is verified
  - params.lastLogin {String}, optional, last login time
  - params.lastIP {String}, optional, last login IP address
  - params.loginsCount {Int}, optional, number of logins
  - params.nickname {String}, optional, nickname
  - params.signUp {String}, optional, registration time
  - params.photo {String}, optional, avatar
  - params.password {String}, optional, password
  - params.token {String}, optional, Authing Token
  - params.tokenExpiredAt {String}, optional, expiration time of Authing Token
  - params.username {String}, optional, username

Example:

```java
import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.UpdateUserInfoParam;
import cn.authing.core.result.UserInfoResult;
import cn.authing.core.service.UserService;

import java.io.IOException;

public class UpdateUserInfo {
    public static void main(String [] args) throws IOException {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").Secret("1dcaa83dd0a0424d7906d7cec76e1935").Build();
        Authing.init(init);

        UserService userService = Authing.getUserService();
        UpdateUserInfoParam updateUpdateUserInfoParam = new UpdateUserInfoParam.Builder("5e109c446ef04e93e4a54d69").Build();
        UserInfoResult userInfoResult = userService.updateUserInfo(updateUpdateUserInfoParam).execute();
        System.out.println(userInfoResult.getId());
    }
}
```

## Query user login status

userService.checkLoginStatus(params)

- params {Object}
  - params.token {String}, required, user Authing Token

Example:

```java
import cn.authing.core.Authing;
import cn.authing.core.param.CheckLoginStatusParam;
import cn.authing.core.param.InitParam;
import cn.authing.core.result.CheckLoginStatusResult;

import java.io.IOException;

public class TestCheckLoginStatus {
    public static void main(String [] args) throws IOException {
        InitParam param = new InitParam.Builder("5e109c446ef04e93e4a54d69").Secret("1dcaa83dd0a0424d7906d7cec76e1935").Build();
        // Initialize, only need to initialize once globally
        Authing.init(param);

        // Check parameters for login status
        CheckLoginStatusParam p = new CheckLoginStatusParam.Builder("token").Build();
        // call and get the result.
        CheckLoginStatusResult info = Authing.getUserService().CheckLoginStatus(p).execute();
        System.out.println(info.isStatus());
    }
}
```

## reset Password

userService.resetPasword(params)

- params {Object}
  - params.email {String}, required, user email
  - params.password {String}, required, user's new password
  - params.verifyCode {String}, required, verification code

Example:

```java
import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.ResetPasswordParam;
import cn.authing.core.result.UserInfoResult;
import cn.authing.core.service.UserService;

import java.io.IOException;

public class ResetPassword {
    public static void main(String [] args) throws IOException {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").Secret("1dcaa83dd0a0424d7906d7cec76e1935").Build();
        Authing.init(init);

        UserService userService = Authing.getUserService();
        ResetPasswordParam resetPasswordParam = new ResetPasswordParam.Builder("5e109c446ef04e93e4a54d69", "123456", "1234").Build();
        UserInfoResult userInfoResult = userService.resetPassword(resetPasswordParam).execute();
        System.out.println(userInfoResult.getId());
    }
}
```

# Authorization service

## Initialization

Authing.getOAuthService()

Please initialize authorization related services as follows:

```java
import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.service. *;

public class Demo2 {
    public static void main(String [] args) {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").Secret("1dcaa83dd0a0424d7906d7cec76e1935").Build();
        Authing.init(init);
        OAuthService oauthService = Authing.getOAuthService();
    }
}
```

## Unbind mailbox

oauthService.unbindEmail(params)

- params {Object}
  - params.userId {String}, required, user ID

Example:

```java
import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.UnbindEmailParam;
import cn.authing.core.result.UserInfoResult;
import cn.authing.core.service.OAuthService;

import java.io.IOException;

public class UnBindEmail {
    public static void main(String [] args) throws IOException {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").Secret("1dcaa83dd0a0424d7906d7cec76e1935").Build();
        Authing.init(init);

        OAuthService oauthService = Authing.getOAuthService();
        UnbindEmailParam unbindEmailParam = new UnbindEmailParam.Builder().UserId("5e109c446ef04e93e4a54d69").Build();
        UserInfoResult userInfoResult = oauthService.unbindEmail(unbindEmailParam).execute();
        System.out.println(userInfoResult.getId());
    }
}
```

## Read the social login list opened by the user pool

oauthService.readOAuthList()

Example:

```java
import cn.authing.core.Authing;
import cn.authing.core.param.ReadOAuthListParam;
import cn.authing.core.result.OAuthData;
import cn.authing.core.service.OAuthService;

import java.io.IOException;
import java.util.List;

public class ReadSocialLoginListOfUserPool {
    public static void main(String [] args) throws IOException {
        OAuthService oauthService = Authing.getOAuthService();
        ReadOAuthListParam readOauthListParam = new ReadOAuthListParam.Builder().Build();
        List <OAuthData> oauthData = oauthService.readOAuthList(readOauthListParam).execute();
        System.out.println(oauthData.get(0).getId());
    }
}
```

# Authentication service

## Initialization

Authing.getVerifyService()

Please initialize the authentication service as follows:

```java
import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.service.UserService;

public class Demo2 {
    public static void main(String [] args) {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").Secret("1dcaa83dd0a0424d7906d7cec76e1935").Build();
        Authing.init(init);
        VerifyService verifyService = Authing.getVerifyService();
    }
}
```

## Send Email Verification Email

verifyService.sendVerifyEmail(params)

- params {Object}
  - params.email {String}, required, email address

Example:

```java
    import cn.authing.core.Authing;
    import cn.authing.core.param.SendVerifyEmailParam;
    import cn.authing.core.result.Result;
    import cn.authing.core.service.VerifyService;

    import java.io.IOException;

    public class SendVerifyEmail {
        public static void main(String [] args) throws IOException {
            VerifyService verifyService = Authing.getVerifyService();
            SendVerifyEmailParam sendVerifyEmailParam = new SendVerifyEmailParam.Builder("test@test.com").Build();
            Result result = verifyService.sendVerifyEmailsendVerifyEmailParam).execute();
            System.out.println(result.getCode());
        }
    }
```

## Send mobile verification code

verifyService.sendPhoneVerifyCode(phone)

-phone {String}, required, phone number

Example:

```java
import cn.authing.core.Authing;
import cn.authing.core.result.Result;
import cn.authing.core.service.VerifyService;

import java.io.IOException;

public class SendPhoneVerifyCode {
    public static void main(String [] args) throws IOException {
        VerifyService verifyService = Authing.getVerifyService();
        Result result = verifyService.sendPhoneVerifyCode("13812341234").Execute();
        System.out.println(result.getCode());
    }
}
```

## Send password reset email

verifyService.sendResetPasswordEmail(params)

- params {Object}
  - params.email {String}, required, email address

Example:

```java
    import cn.authing.core.Authing;
    import cn.authing.core.param.SendResetPasswordEmailParam;
    import cn.authing.core.result.Result;
    import cn.authing.core.service.VerifyService;

    import java.io.IOException;

    public class SendResetPasswordEmail {
        public static void main(String [] args) throws IOException {
            VerifyService verifyService = Authing.getVerifyService();
            SendResetPasswordEmailParam sendResetPasswordEmailParam = new SendResetPasswordEmailParam.Builder("test@test.com").Build();
            Result result = verifyService.sendResetPasswordEmail(sendResetPasswordEmailParam).execute();
            System.out.println(result.getCode());
        }
    }
```

## Verification code for reset password

verifyService.verifyResetPasswordCode(params)

- params {Object}
  - params.email {String}, required, email address
  - params.verifyCode {String}, required, verification code

Example:

```java
import cn.authing.core.Authing;
import cn.authing.core.param.VerifyResetPasswordCodeParam;
import cn.authing.core.result.Result;
import cn.authing.core.service.VerifyService;

import java.io.IOException;

public class VerifyResetPasswordCode {
    public static void main(String [] args) throws IOException {
        VerifyService verifyService = Authing.getVerifyService();
        VerifyResetPasswordCodeParam verifyResetPasswordCodeParam = new VerifyResetPasswordCodeParam.Builder("test@test.com", "1234").Build();
        Result result = verifyService.verifyResetPasswordCode(verifyResetPasswordCodeParam).execute();
        System.out.println(result.getCode());
    }
}
```

# User management services

## Initialization

Authing.getUserManageService()

Please initialize the user management related services as follows:

```java
import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.service. *;

public class Demo2 {
    public static void main(String [] args) {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").Secret("1dcaa83dd0a0424d7906d7cec76e1935").Build();
        Authing.init(init);
        UserManageService userManageService = Authing.getUserManageService();
    }
}
```

## Get user information in batches

userManageService.getUserInfo(params)

- params {Object}
  - params.addUserId {String}, required, ID of the user to query

Example:

```java
import cn.authing.core.Authing;
import cn.authing.core.param.UserPatchParam;
import cn.authing.core.result.UserPatchResult;
import cn.authing.core.service.UserManageService;

import java.io.IOException;

public class BatchUserInfo {
    public static void main(String [] args) throws IOException {
        UserManageService userManageService = Authing.getUserManageService();
        UserPatchParam.Builder userPatchBuilder = new UserPatchParam.Builder();
        userPatchBuilder.addUserId("5e67c2855d5a74fc4e9cffcd");
        userPatchBuilder.addUserId("5e67c2712da3f4269e750088");
        UserPatchParam userPatchParam = userPatchBuilder.build();
        UserPatchResult userPatchResult = userManageService.getUserInfo(userPatchParam).execute();
        System.out.println(userPatchResult.getList());
    }
}
```

## Get user list

userManageService.getUserList(params)

- params {Object}
  - params.page {Int}, optional, default is 1
  - params.count {Int}, optional, default is 10

Example:

```java
import cn.authing.core.Authing;
import cn.authing.core.param.UserListParam;
import cn.authing.core.result.UserListResult;
import cn.authing.core.result.UserPatchResult;
import cn.authing.core.service.UserManageService;

import java.io.IOException;

public class GetUserList {
    public static void main(String [] args) throws IOException {
        UserManageService userManageService = Authing.getUserManageService();
        UserListParam userListParam = new UserListParam.Builder().Page(1).count(10).build();
        UserListResult userListResult = userManageService.getUserList(userListParam).execute();
        System.out.println(userListResult.getList());
    }
}
```

## delete users

userManageService.removeUser(params)

- params {Object}
  - params.userId, required, user ID

Example:

```java
import cn.authing.core.Authing;
import cn.authing.core.param.RemoveUserParam;
import cn.authing.core.result.RemoveUserResult;
import cn.authing.core.service.UserManageService;

import java.io.IOException;
import java.util.List;

public class RemoveUser {
    public static void main(String [] args) throws IOException {
        UserManageService userManageService = Authing.getUserManageService();
        RemoveUserParam removeUserParam = new RemoveUserParam.Builder("5e109c4461f04e93e4a54d60").Build();
        List <RemoveUserResult> userListResult = userManageService.removeUser(removeUserParam).execute();
        System.out.println(userListResult.get(0).getId());
    }
}
```

# Demo

完整的使用案例请参考：[https://github.com/Authing/authing-java-sdk/tree/master/testdemo](https://github.com/Authing/authing-java-sdk/tree/master/testdemo)
