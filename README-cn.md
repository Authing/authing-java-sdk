# Authing SDK for Java
[English](https://github.com/Authing/authing-java-sdk/blob/master/README-en.md)

JDK 版本 1.8

Github 地址：[https://github.com/Authing/authing-java-sdk](https://github.com/Authing/authing-java-sdk)

# 安装

## 创建项目

在 IDEA 中新建一个项目

![create-1](https://cdn.authing.cn/blog/20200311011537.png?v=2)

选择 Gradle，在右侧的额外依赖中勾选 Java 和 Kotlin：
![创建项目 - 2](https://cdn.authing.cn/blog/20200311013755.png)

填写其他信息：

![create-3](https://cdn.authing.cn/blog/20200311011746.png)

![create-4](https://cdn.authing.cn/blog/20200311011811.png)

## 添加依赖

进入 IDE，等待 Gradle 构建完毕，打开 build.gradle 文件：

![ide-1](https://cdn.authing.cn/blog/20200311011901.png?v=2)

在右侧红色箭头处增加以下内容：

    ...
    repositories {
        jcenter()
        mavenCentral()
    }

    dependencies {
        compile "org.jetbrains.kotlin:kotlin-stdlib-jdk8"
        testCompile group: 'junit', name: 'junit', version: '4.12'
        implementation "cn.authing:java-core:1.0.0"
        implementation 'com.squareup.okhttp3:okhttp:3.14.2'
        implementation 'com.google.code.gson:gson:2.8.5'
        implementation 'org.bouncycastle:bcprov-jdk15:1.46'
        implementation 'com.google.android:android:4.1.1.4'

    }
    ...

如下图所示，根据提示开启 Auto-import 功能：

![auto-import](https://cdn.authing.cn/blog/20200311012019.png)

## 开始使用

在 java 文件夹下创建一个 Class，命名为 Demo。

![create-class](https://cdn.authing.cn/blog/20200311012211.png)

在类的 main 函数中，引入 Authing 开始使用

![import-authing](https://cdn.authing.cn/blog/20200311013959.png)

> Android 注意
> 如果用于 Android 开发，需要在 AndroidManifest 文件中加入 INTERNET 权限。

```xml
    <uses-permission android:name="android.permission.INTERNET"/>
```

# 快速上手

先从 Authing 控制台中获取 `UserPool ID`，然后调用初始化函数，初始化调用一次即可。在 Android 开发中，推荐放在 Application 中进行初始化。

```java
import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.service.*;

public class Demo2 {
    public static void main(String[] args) {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").secret("1dcaa83dd0a0424d7906d7cec76e1935").build();
        Authing.init(init);
        UserService userService = Authing.getUserService();
        UserManageService userManageService = Authing.getUserManageService();
        PermissionService permissionService = Authing.getPermissionService();
        VerifyService verifyService = Authing.getVerifyService();
        OAuthService oauthService = Authing.getOAuthService();
    }
}
```

# 如何构建参数对象

SDK 接口函数参数对象需要先进行构建，然后再传入。

## 创建参数构造器并初始化必填参数

```java
import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.RegisterParam;
import cn.authing.core.result.RegisterResult;
import cn.authing.core.service.UserService;

import java.io.IOException;

public class Register {
    public static void main(String[] args) throws IOException {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").secret("1dcaa83dd0a0424d7906d7cec76e1935").build();
        Authing.init(init);
        UserService userService = Authing.getUserService();
        // 创建构造器
        RegisterParam.Builder registerParamBuilder = new RegisterParam.Builder("test@123.com", "123456");
    }
}
```

## 使用参数构造器添加可选参数

```java
    import cn.authing.core.Authing;
    import cn.authing.core.param.InitParam;
    import cn.authing.core.param.RegisterParam;
    import cn.authing.core.result.RegisterResult;
    import cn.authing.core.service.UserService;

    import java.io.IOException;

    public class Register {
        public static void main(String[] args) throws IOException {
            InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").secret("1dcaa83dd0a0424d7906d7cec76e1935").build();
            Authing.init(init);
            UserService userService = Authing.getUserService();
            RegisterParam.Builder registerParamBuilder = new RegisterParam.Builder("test@123.com", "123456");
            // 创建可选参数
            registerParamBuilder.nickname("test_nickname");
            registerParamBuilder.company("Authing");
        }
    }
```

## 创建参数对象

```java
import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.RegisterParam;
import cn.authing.core.result.RegisterResult;
import cn.authing.core.service.UserService;

import java.io.IOException;

public class Register {
    public static void main(String[] args) throws IOException {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").secret("1dcaa83dd0a0424d7906d7cec76e1935").build();
        Authing.init(init);
        UserService userService = Authing.getUserService();
        RegisterParam.Builder registerParamBuilder = new RegisterParam.Builder("test@123.com", "123456");
        registerParamBuilder.nickname("test_nickname");
        registerParamBuilder.company("Authing");
        // 创建参数对象
        RegisterParam registerParam = registerParamBuilder.build();
        // 使用参数对象调用接口函数
        RegisterResult registerResult = userService.createUser(registerParam).execute();
        System.out.println(registerResult.getId());
    }
}
```

# SDK 总览

Authing SDK 提供了授权服务 (OAuthService)、用户服务 (UserService)、用户管理服务 (UserManageService) 和验证服务 (VerifyService)，你可以直接通过 Authing.getOAuthService，Authing.getUserService，Authing.getUserManageService，Authing.getVerifyService 获取相关实例。

# 调用方式

## 同步调用

SDK 提供了**同步**和**异步**两种调用方式，适用不同的场景。

若需要等待返回结果处理后面的数据，比较适合同步调用，例如：

```java
import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.RegisterParam;
import cn.authing.core.result.RegisterResult;
import cn.authing.core.service.UserService;

import java.io.IOException;

public class Register {
    public static void main(String[] args) throws IOException {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").secret("1dcaa83dd0a0424d7906d7cec76e1935").build();
        Authing.init(init);
        UserService userService = Authing.getUserService();
        RegisterParam.Builder registerParamBuilder = new RegisterParam.Builder("test@123.com", "123456");
        registerParamBuilder.nickname("test_nickname");
        registerParamBuilder.company("Authing");
        RegisterParam registerParam = registerParamBuilder.build();
        // 同步调用
        RegisterResult registerResult = userService.createUser(registerParam).execute();
        System.out.println(registerResult.getId());
    }
}
```

## 异步调用

如果是在 Android 的主线程中，则需使用异步调用（当然你也可以在子线程中使用同步调用），例如：

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
    public static void main(String[] args) throws IOException {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").secret("1dcaa83dd0a0424d7906d7cec76e1935").build();
        Authing.init(init);
        UserService userService = Authing.getUserService();
        RegisterParam registerParam = new RegisterParam.Builder("13812341234", "123").nickname("test_nickname").build();
        userService.createUser(registerParam).enqueue(new Callback<RegisterResult>() {
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

# 错误处理

同步调用不会返回错误，所以推荐使用异步调用。 在 `onFailure` 中会返回错误，你可以通过 `error.getCode()` 获取错误代码。了解更多报错的详情，请查看错误代码列表。

# 用户服务

## 初始化

Authing.getUserService()
请按照以下方式初始化 User 相关服务：

```java
import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.service.UserService;

public class Demo2 {
    public static void main(String[] args) {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").secret("1dcaa83dd0a0424d7906d7cec76e1935").build();
        Authing.init(init);
        UserService userService = Authing.getUserService();
    }
}
```

## 创建用户

userService.createUser(params)

- params {Object}
  - params.unionid {String}，unionid 和 email 参数只能填写一个
  - params.email {String}，unionid 和 email 参数只能填写一个
  - params.password {String}，不填 unionid 时必填，填 unionid 时不填
  - params.username {String}，可选，用户名
  - params.company {String}，可选，公司
  - params.lastIP {String}，可选，上次登录 IP 地址
  - params.oauth {String}，可选，用户社会化登录信息或其他自定义数据
  - params.photo {String}，可选，头像

示例：

```java
import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.RegisterParam;
import cn.authing.core.result.RegisterResult;
import cn.authing.core.service.UserService;

import java.io.IOException;

public class Register {
    public static void main(String[] args) throws IOException {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").secret("1dcaa83dd0a0424d7906d7cec76e1935").build();
        Authing.init(init);
        UserService userService = Authing.getUserService();
        RegisterParam registerParam = new RegisterParam.Builder("test@123.com", "123456").nickname("test_nickname").build();
        RegisterResult registerResult = userService.createUser(registerParam).execute();
        System.out.println(registerResult.getId());
    }
}
```

## 邮箱登录

userService.loginByEmail(params)

- params {Object}
  - params.email {String}，必填，用户邮箱
  - params.password {String}，必填，用户密码

示例：

```java
import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.LoginByEmailParam;
import cn.authing.core.result.LoginResult;
import cn.authing.core.service.UserService;

import java.io.IOException;

public class LoginByEmail {
    public static void main(String[] args) throws IOException {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").secret("1dcaa83dd0a0424d7906d7cec76e1935").build();
        Authing.init(init);
        UserService userService = Authing.getUserService();
        LoginByEmailParam loginByEmailParam = new LoginByEmailParam.Builder("test@123.com", "123456").build();
        LoginResult loginResult = userService.loginByEmail(loginByEmailParam).execute();
        System.out.println(loginResult.getId());
    }
}
```

## 手机验证码登录

userService.loginByPhone(params)

- params {Object}
  - params.phone {String}，手机号
  - params.verifyCode {Int}，短信验证码

示例：

```java
import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.LoginByPhoneParam;
import cn.authing.core.result.LoginResult;
import cn.authing.core.service.UserService;

import java.io.IOException;

public class loginByPhone {
    public static void main(String[] args) throws IOException {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").secret("1dcaa83dd0a0424d7906d7cec76e1935").build();
        Authing.init(init);
        UserService userService = Authing.getUserService();
        LoginByPhoneParam loginByPhoneParam = new LoginByPhoneParam.Builder("13812341234", 1234).build();
        LoginResult loginResult = userService.loginByPhone(loginByPhoneParam).execute();
        System.out.println(loginResult.getId());
    }
}
```

## LDAP 登录

userService.loginByLDAP(params)

- params {Object}
  - params.username {String}，必填，用户名
  - params.password {String}，必填，密码

示例：

```java
import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.LoginByLADPParam;
import cn.authing.core.result.LoginResult;
import cn.authing.core.service.UserService;

import java.io.IOException;

public class loginByLDAP {
    public static void main(String[] args) throws IOException {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").secret("1dcaa83dd0a0424d7906d7cec76e1935").build();
        Authing.init(init);
        UserService userService = Authing.getUserService();
        LoginByLADPParam loginByLDAPParam = new LoginByLADPParam.Builder("13812341234", "123456").build();
        LoginResult loginResult = userService.loginByLDAP(loginByLDAPParam).execute();
        System.out.println(loginResult.getId());
    }
}
```

## 使用 OIDC Password 模式登录

userService.loginByOidc(params)

- params {Object}
  - params.client_id {String}，必填，OIDC 应用 ID
  - params.client_secret {String}，必填，OIDC 应用密钥
  - params.phone {String}，选填，phone/email/username/unionid 互斥
  - params.email，选填，phone/email/username/unionid 互斥
  - params.username，选填，phone/email/username/unionid 互斥
  - params.unionid，选填，phone/email/username/unionid 互斥
  - params.password，unionid 未填时必填，使用 unionid 登录时不填
  - params.phone {String}，选填，phone/email/username/unionid 互斥
  - params.email，选填，phone/email/username/unionid 互斥
  - params.username，选填，phone/email/username/unionid 互斥
  - params.unionid，选填，phone/email/username/unionid 互斥
  - params.password，unionid 未填时必填，使用 unionid 登录时不填

示例：

```java
import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.LoginByOidcParam;
import cn.authing.core.result.SigninResult;

public class TestLoginByOidc {
    public static void main(String[] args) throws Exception {
        InitParam param = new InitParam.Builder("5e109c446ef04e93e4a54d69").secret("1dcaa83dd0a0424d7906d7cec76e1935").build();
        // 初始化，全局只需要初始化一次
        Authing.init(param);

        // oidc 登录的参数
        LoginByOidcParam p = new LoginByOidcParam.Builder("oidcClientId", "oidcSecret")
                // 这四个 init 方法，只用调用一个，多次 init，只有第一次会生效
                .initWithEmail("邮箱","密码")
                // .initWithPhone("电话","密码")
                // .initWithUsername("用户名","密码")
                // .initWithUnionId("unionId")
                .build();
        // 调用，并获取结果。
        SigninResult result = Authing.getUserService().loginByOidc(p).execute();
        System.out.println(result.getAccessToken());
    }
}
```

## 刷新 OIDC Token

userService.refreshOidcToken(params)

- params {Object}
  - params.client_id {String}，必填，OIDC 应用 ID
  - params.client_secret {String}，必填，OIDC 应用密钥
  - params.refresh_token {String}，必填，刷新 token

示例：

```java
import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.RefreshOidcTokenParam;
import cn.authing.core.result.RefreshOidcTokenResult;

public class TestRefreshOidcToken {
    public static void main(String[] args) throws Exception {
        InitParam param = new InitParam.Builder("5e109c446ef04e93e4a54d69").secret("1dcaa83dd0a0424d7906d7cec76e1935").build();
        // 初始化，全局只需要初始化一次
        Authing.init(param);

        // 刷新 OidcToken 的参数
        RefreshOidcTokenParam p = new RefreshOidcTokenParam.Builder("oidcClientId", "oidcSecret","refresh token")
                .build();
        // 调用，并获取结果。
        RefreshOidcTokenResult result = Authing.getUserService().refreshOidcToken(p).execute();
        System.out.println(result.getAccessToken());
    }
}
```

## 登录

userService.signIn(params)

- params {Object}
  - params.phone {String}，选填，phone/email/username/unionid 互斥
  - params.email，选填，phone/email/username/unionid 互斥
  - params.username，选填，phone/email/username/unionid 互斥
  - params.unionid，选填，phone/email/username/unionid 互斥
  - params.password，unionid 未填时必填，使用 unionid 登录时不填

示例：

```java
import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.SigninParam;
import cn.authing.core.result.SigninResult;

public class TestSignin {
    public static void main(String[] args) throws Exception {
        InitParam param = new InitParam.Builder("5e109c446ef04e93e4a54d69").secret("1dcaa83dd0a0424d7906d7cec76e1935").build();
        // 初始化，全局只需要初始化一次
        Authing.init(param);

        // 登录的参数
        SigninParam p = new SigninParam.Builder()
            // 这四个 init 方法，只用调用一个，多次 init，只有第一次会生效
            .initWithEmail("邮箱","密码")
            // .initWithPhone("电话","密码")
            // .initWithUsername("用户名","密码")
            // .initWithUnionId("unionId")
            .build();
        // 调用，并获取结果。
        SigninResult result = Authing.getUserService().signIn(p).execute();
        System.out.println(result.getAccessToken());
    }
}
```

## 刷新 signIn Token

userService.refreshSignInToken(params)

- params {Object}
  - params.refresh_token {String}，必填，刷新 token

示例：

```java
import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.RefreshSigninTokenParam;
import cn.authing.core.result.RefreshSigninTokenResult;

public class TestRefreshSigninToken {
    public static void main(String[] args) throws Exception {
        InitParam param = new InitParam.Builder("5e109c446ef04e93e4a54d69").secret("1dcaa83dd0a0424d7906d7cec76e1935").build();
        // 初始化，全局只需要初始化一次
        Authing.init(param);

        // 获取用户列表的参数
        RefreshSigninTokenParam p = new RefreshSigninTokenParam.Builder("refresh token")
            .oidcAppId("") // 可选参数
            .build();
        // 调用，并获取结果。
        RefreshSigninTokenResult result = Authing.getUserService().refreshSignInToken(p).execute();
        System.out.println(result.getAccessToken());
    }
}
```

## 刷新用户 Authing Token

userService.refreshToken(params)

- params {Object}
  - params.userId {String}，必填，用户 ID

示例：

```java
import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.RefreshTokenParam;
import cn.authing.core.result.RefreshTokenResult;
import cn.authing.core.service.UserService;

import java.io.IOException;

public class RefreshToken {
    public static void main(String[] args) throws IOException {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").secret("1dcaa83dd0a0424d7906d7cec76e1935").build();
        Authing.init(init);
        UserService userService = Authing.getUserService();
        RefreshTokenParam refreshTokenParam = new RefreshTokenParam.Builder("5e109c446ef04e93e4a54d69").build();
        RefreshTokenResult refreshTokenResult = userService.refreshToken(refreshTokenParam).execute();
        System.out.println(refreshTokenResult.getToken());
    }
}
```

## 获取用户信息

userService.user(params)

- params {Object}
  - params.userId {String}，必填，用户 ID

示例：

```java
import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.UserInfoParam;
import cn.authing.core.result.UserInfoResult;
import cn.authing.core.service.UserService;

import java.io.IOException;

public class GetUserInfo {
    public static void main(String[] args) throws IOException {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").secret("1dcaa83dd0a0424d7906d7cec76e1935").build();
        Authing.init(init);

        UserService userService = Authing.getUserService();
        UserInfoParam userInfoParam = new UserInfoParam.Builder("5e109c446ef04e93e4a54d69").build();
        UserInfoResult userInfoResult = userService.user(userInfoParam).execute();
        System.out.println(userInfoResult.getId());
    }
}
```

## 更新用户信息

userService.updateUserInfo(params)

- params {Object}
  - params.userId {userId}，必填，用户 ID
  - params.blocked {Boolean}，可选，是否被锁定
  - params.browser {String}，可选，浏览器信息
  - params.company {String}，可选，公司
  - params.email {String}，可选，邮箱
  - params.emailVerified {Boolean}，可选，邮箱是否被验证
  - params.lastLogin {String}，可选，上次登录时间
  - params.lastIP {String}，可选，上次登录 IP 地址
  - params.loginsCount {Int}，可选，登录次数
  - params.nickname {String}，可选，昵称
  - params.signUp {String}，可选，注册时间
  - params.photo {String}，可选，头像
  - params.password {String}，可选，密码
  - params.token {String}，可选，Authing Token
  - params.tokenExpiredAt {String}，可选，Authing Token 过期时间
  - params.username {String}，可选，用户名

示例：

```java
import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.UpdateUserInfoParam;
import cn.authing.core.result.UserInfoResult;
import cn.authing.core.service.UserService;

import java.io.IOException;

public class UpdateUserInfo {
    public static void main(String[] args) throws IOException {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").secret("1dcaa83dd0a0424d7906d7cec76e1935").build();
        Authing.init(init);

        UserService userService = Authing.getUserService();
        UpdateUserInfoParam updateUpdateUserInfoParam = new UpdateUserInfoParam.Builder("5e109c446ef04e93e4a54d69").build();
        UserInfoResult userInfoResult = userService.updateUserInfo(updateUpdateUserInfoParam).execute();
        System.out.println(userInfoResult.getId());
    }
}
```

## 查询用户登录状态

userService.checkLoginStatus(params)

- params {Object}
  - params.token {String}，必填，用户 Authing Token

示例：

```java
import cn.authing.core.Authing;
import cn.authing.core.param.CheckLoginStatusParam;
import cn.authing.core.param.InitParam;
import cn.authing.core.result.CheckLoginStatusResult;

import java.io.IOException;

public class TestCheckLoginStatus {
    public static void main(String[] args) throws IOException {
        InitParam param = new InitParam.Builder("5e109c446ef04e93e4a54d69").secret("1dcaa83dd0a0424d7906d7cec76e1935").build();
        // 初始化，全局只需要初始化一次
        Authing.init(param);

        // 检查登录状态的参数
        CheckLoginStatusParam p = new CheckLoginStatusParam.Builder("token").build();
        // 调用，并获取结果。
        CheckLoginStatusResult info = Authing.getUserService().checkLoginStatus(p).execute();
        System.out.println(info.isStatus());
    }
}
```

## 重置密码

userService.resetPasword(params)

- params {Object}
  - params.email {String}，必填，用户邮箱
  - params.password {String}，必填，用户新密码
  - params.verifyCode {String}，必填，验证码

示例：

```java
import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.ResetPasswordParam;
import cn.authing.core.result.UserInfoResult;
import cn.authing.core.service.UserService;

import java.io.IOException;

public class ResetPassword {
    public static void main(String[] args) throws IOException {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").secret("1dcaa83dd0a0424d7906d7cec76e1935").build();
        Authing.init(init);

        UserService userService = Authing.getUserService();
        ResetPasswordParam resetPasswordParam = new ResetPasswordParam.Builder("5e109c446ef04e93e4a54d69", "123456", "1234").build();
        UserInfoResult userInfoResult = userService.resetPassword(resetPasswordParam).execute();
        System.out.println(userInfoResult.getId());
    }
}
```

# 授权服务

## 初始化

Authing.getOAuthService()
请按照以下方式初始化授权相关服务：

```java
import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.service.*;

public class Demo2 {
    public static void main(String[] args) {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").secret("1dcaa83dd0a0424d7906d7cec76e1935").build();
        Authing.init(init);
        OAuthService oauthService = Authing.getOAuthService();
    }
}
```

## 解绑邮箱

oauthService.unbindEmail(params)

- params {Object}
  - params.userId {String}，必填，用户 ID

示例：

```java
import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.UnbindEmailParam;
import cn.authing.core.result.UserInfoResult;
import cn.authing.core.service.OAuthService;

import java.io.IOException;

public class UnBindEmail {
    public static void main(String[] args) throws IOException {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").secret("1dcaa83dd0a0424d7906d7cec76e1935").build();
        Authing.init(init);

        OAuthService oauthService = Authing.getOAuthService();
        UnbindEmailParam unbindEmailParam = new UnbindEmailParam.Builder().userId("5e109c446ef04e93e4a54d69").build();
        UserInfoResult userInfoResult = oauthService.unbindEmail(unbindEmailParam).execute();
        System.out.println(userInfoResult.getId());
    }
}
```

## 读取用户池开启的社会化登录列表

oauthService.readOAuthList()

示例：

```java
import cn.authing.core.Authing;
import cn.authing.core.param.ReadOAuthListParam;
import cn.authing.core.result.OAuthData;
import cn.authing.core.service.OAuthService;

import java.io.IOException;
import java.util.List;

public class ReadSocialLoginListOfUserPool {
    public static void main(String[] args) throws IOException {
        OAuthService oauthService = Authing.getOAuthService();
        ReadOAuthListParam readOauthListParam = new ReadOAuthListParam.Builder().build();
        List<OAuthData> oauthData = oauthService.readOAuthList(readOauthListParam).execute();
        System.out.println(oauthData.get(0).getId());
    }
}
```

# 验证服务

## 初始化

Authing.getVerifyService()

请按照以下方式初始化验证服务：

```java
import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.service.UserService;

public class Demo2 {
    public static void main(String[] args) {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").secret("1dcaa83dd0a0424d7906d7cec76e1935").build();
        Authing.init(init);
        VerifyService verifyService = Authing.getVerifyService();
    }
}
```

## 发送邮箱验证邮件

verifyService.sendVerifyEmail(params)

- params {Object}
  - params.email {String}，必填，邮箱地址

示例：

    import cn.authing.core.Authing;
    import cn.authing.core.param.SendVerifyEmailParam;
    import cn.authing.core.result.Result;
    import cn.authing.core.service.VerifyService;

    import java.io.IOException;

    public class SendVerifyEmail {
        public static void main(String[] args) throws IOException {
            VerifyService verifyService = Authing.getVerifyService();
            SendVerifyEmailParam sendVerifyEmailParam = new SendVerifyEmailParam.Builder("test@test.com").build();
            Result result = verifyService.sendVerifyEmail(sendVerifyEmailParam).execute();
            System.out.println(result.getCode());
        }
    }

## 发送手机验证码

verifyService.sendPhoneVerifyCode(phone)

- phone {String}，必填，手机号

示例：

```java
import cn.authing.core.Authing;
import cn.authing.core.result.Result;
import cn.authing.core.service.VerifyService;

import java.io.IOException;

public class SendPhoneVerifyCode {
    public static void main(String[] args) throws IOException {
        VerifyService verifyService = Authing.getVerifyService();
        Result result = verifyService.sendPhoneVerifyCode("13812341234").execute();
        System.out.println(result.getCode());
    }
}
```

## 发送重置密码邮件

verifyService.sendResetPasswordEmail(params)

- params {Object}
  - params.email {String}，必填，邮箱地址

示例：

```java
    import cn.authing.core.Authing;
    import cn.authing.core.param.SendResetPasswordEmailParam;
    import cn.authing.core.result.Result;
    import cn.authing.core.service.VerifyService;

    import java.io.IOException;

    public class SendResetPasswordEmail {
        public static void main(String[] args) throws IOException {
            VerifyService verifyService = Authing.getVerifyService();
            SendResetPasswordEmailParam sendResetPasswordEmailParam = new SendResetPasswordEmailParam.Builder("test@test.com").build();
            Result result = verifyService.sendResetPasswordEmail(sendResetPasswordEmailParam).execute();
            System.out.println(result.getCode());
        }
    }
```

## 验证重置密码的验证码

verifyService.verifyResetPasswordCode(params)

- params {Object}
  - params.email {String}，必填，邮箱地址
  - params.verifyCode {String}，必填，验证码

示例：

```java
import cn.authing.core.Authing;
import cn.authing.core.param.VerifyResetPasswordCodeParam;
import cn.authing.core.result.Result;
import cn.authing.core.service.VerifyService;

import java.io.IOException;

public class VerifyResetPasswordCode {
    public static void main(String[] args) throws IOException {
        VerifyService verifyService = Authing.getVerifyService();
        VerifyResetPasswordCodeParam verifyResetPasswordCodeParam = new VerifyResetPasswordCodeParam.Builder("test@test.com", "1234").build();
        Result result = verifyService.verifyResetPasswordCode(verifyResetPasswordCodeParam).execute();
        System.out.println(result.getCode());
    }
}
```

# 用户管理服务

## 初始化

Authing.getUserManageService()

请按照以下方式初始化用户管理相关服务：

```java
import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.service.*;

public class Demo2 {
    public static void main(String[] args) {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").secret("1dcaa83dd0a0424d7906d7cec76e1935").build();
        Authing.init(init);
        UserManageService userManageService = Authing.getUserManageService();
    }
}
```

## 批量获取用户信息

userManageService.getUserInfo(params)

- params {Object}
  - params.addUserId {String}，必填，需要查询的用户的 ID

示例：

```java
import cn.authing.core.Authing;
import cn.authing.core.param.UserPatchParam;
import cn.authing.core.result.UserPatchResult;
import cn.authing.core.service.UserManageService;

import java.io.IOException;

public class BatchUserInfo {
    public static void main(String[] args) throws IOException {
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

## 获取用户列表

userManageService.getUserList(params)

- params {Object}
  - params.page {Int}，选填，默认为 1
  - params.count {Int}，选填，默认为 10

示例：

```java
import cn.authing.core.Authing;
import cn.authing.core.param.UserListParam;
import cn.authing.core.result.UserListResult;
import cn.authing.core.result.UserPatchResult;
import cn.authing.core.service.UserManageService;

import java.io.IOException;

public class GetUserList {
    public static void main(String[] args) throws IOException {
        UserManageService userManageService = Authing.getUserManageService();
        UserListParam userListParam = new UserListParam.Builder().page(1).count(10).build();
        UserListResult userListResult = userManageService.getUserList(userListParam).execute();
        System.out.println(userListResult.getList());
    }
}
```

## 删除用户

userManageService.removeUser(params)

- params {Object}
  - params.userId，必填，用户 ID

示例：

```java
import cn.authing.core.Authing;
import cn.authing.core.param.RemoveUserParam;
import cn.authing.core.result.RemoveUserResult;
import cn.authing.core.service.UserManageService;

import java.io.IOException;
import java.util.List;

public class RemoveUser {
    public static void main(String[] args) throws IOException {
        UserManageService userManageService = Authing.getUserManageService();
        RemoveUserParam removeUserParam = new RemoveUserParam.Builder("5e109c4461f04e93e4a54d60").build();
        List<RemoveUserResult> userListResult = userManageService.removeUser(removeUserParam).execute();
        System.out.println(userListResult.get(0).getId());
    }
}
```

# Demo

完整的使用案例请参考：[https://github.com/Authing/authing-java-sdk/tree/master/testdemo](https://github.com/Authing/authing-java-sdk/tree/master/testdemo)
