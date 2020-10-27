# Authing - Java

[[toc]]

Authing Java SDK 由两部分组成：`ManagementClient` 和 `AuthenticationClient`。`ManagementClient` 中进行的所有操作均以管理员的身份进行，包含管理用户、管理角色、管理权限策略、管理用户池配置等模块。`AuthenticationClient` 中的所有操作以当前终端用户的身份进行，包含登录、注册、修改用户资料、退出登录等方法。

你应该将初始化过后的 `ManagementClient` 实例设置为一个全局变量（只初始化一次），而 `AuthenticationClient` 应该每次请求初始化一个。

## 安装

在 build.gradle 内的 dependencies 中添加：

```
implementation "cn.authing:java-core:3.0.1"
```

## 使用用户管理模块

初始化 `ManagementClient` 需要 `userPoolId`（用户池 ID） 和 `secret`（用户池密钥）:

> 你可以在此[了解如何获取 UserPoolId 和 Secret](https://docs.authing.cn/others/faq.html) .

```java
import cn.authing.core.mgmt.ManagementClient;

public class ManagementClientTest {
    public static void main(String[] args){
      ManagementClient managementClient = new ManagementClient("AUTHING_USERPOOL_ID", "AUTHING_USERPOOL_SECRET");
    }
}
```

现在 `managementClient` 实例就可以使用了。例如可以获取用户池中的用户列表：

```java
import cn.authing.core.mgmt.ManagementClient;

public class ManagementClientTest {
    public static void main(String[] args){
        ManagementClient managementClient = new ManagementClient("AUTHING_USERPOOL_ID", "AUTHING_USERPOOL_SECRET");
        PaginatedUsers users = managementClient.users().list().execute();
    }
}
```

## 使用用户认证模块

初始化 `ManagementClient` 需要 `userPoolId`（用户池 ID）：

> 你可以在此[了解如何获取 UserPoolId](https://docs.authing.cn/others/faq.html) .

```java
import cn.authing.core.auth.AuthenticationClient;

public class AuthenticationClientTest {
    public static void main(String[] args){
        AuthenticationClient authenticationClient = new AuthenticationClient("AUTHING_USERPOOL_ID");
    }
}
```

接下来可以进行注册登录等操作：

```java
import cn.authing.core.auth.AuthenticationClient;

public class AuthenticationClientTest {
    public static void main(String[] args){
        AuthenticationClient authenticationClient = new AuthenticationClient("AUTHING_USERPOOL_ID");
        
        String email = "test@example.com";
        String password = "123456";
        User user = authenticationClient.registerByEmail(new RegisterByEmailInput(email, password)).execute();
    }
}
```

完成登录之后，`update_profile` 等要求用户登录的方法就可用了：

```java
import cn.authing.core.auth.AuthenticationClient;

public class AuthenticationClientTest {
    public static void main(String[] args){
        AuthenticationClient authenticationClient = new AuthenticationClient("AUTHING_USERPOOL_ID");

        String email = "test@example.com";
        String password = "123456";
        authenticationClient.loginByEmail(new LoginByEmailInput(email, password)).execute();

        User user = authenticationClient.updateProfile(new UpdateUserInput().withNickname("nickname")).execute();
    }
}
```

你也可以在初始化后设置 `AccessToken` 参数, 不需要每次都调用 `LoginByXXX` 方法:

```java
import cn.authing.core.auth.AuthenticationClient;

public class AuthenticationClientTest {
    public static void main(String[] args){
        AuthenticationClient authenticationClient = new AuthenticationClient("AUTHING_USERPOOL_ID");
        authenticationClient.setAccessToken("ACCESS_TOKEN");
    }
}
```

再次执行 `UpdateProfile` 方法，发现也成功了:

```java
import cn.authing.core.auth.AuthenticationClient;

public class AuthenticationClientTest {
    public static void main(String[] args){
        AuthenticationClient authenticationClient = new AuthenticationClient("AUTHING_USERPOOL_ID");
        authenticationClient.setAccessToken("ACCESS_TOKEN");
        User user = authenticationClient.updateProfile(new UpdateUserInput().withNickname("nickname")).execute();
    }
}
```

## 错误处理

```java
import cn.authing.core.auth.AuthenticationClient;
import cn.authing.core.graphql.GraphQLException;import java.io.IOException;


public class AuthenticationClientTest {
    public static void main(String[] args){
        AuthenticationClient authenticationClient = new AuthenticationClient("AUTHING_USERPOOL_ID");
        authenticationClient.setAccessToken("ACCESS_TOKEN");
        
        try {
            User user = authenticationClient.updateProfile(new UpdateUserInput().withNickname("nickname")).execute();
        } catch (GraphQLException | IOException e) {
            e.printStackTrace();
        }
    }
}
```

## 获取帮助

Join us on Gitter: [#authing-chat](https://gitter.im/authing-chat/community)

## 接口索引

可用的 Authentication 方法

- 获取当前用户的用户资料: `getCurrentUser`
- 使用邮箱注册: `registerByEmail`
- 使用用户名注册: `registerByUsername`
- 使用手机号验证码注册: `registerByPhoneCode`
- 使用邮箱登录: `loginByEmail`
- 使用用户名登录: `loginByUsername`
- 使用手机号验证码登录 `loginByPhoneCode`
- 使用手机号密码登录: `loginByPhonePassword`
- 发送邮件: `sendEmail`
- 发送短信验证码: `sendSmsCode`
- 检查 token 的有效状态: `checkLoginStatus`
- 使用手机号验证码重置密码: `resetPasswordByPhoneCode`
- 使用邮件验证码重置密码: `resetPasswordByEmailCode`
- 更新用户资料: `updateProfile`
- 更新密码: `updatePassword`
- 更新手机号: `updatePhone`
- 更新邮箱: `updateEmail`
- 刷新 token: `refreshToken`
- 绑定手机号: `bindPhone`
- 解绑手机号: `unbindPhone`


完整的接口文档请见：
- [https://docs.authing.co/sdk/sdk-for-java/authentication/](https://docs.authing.co/sdk/sdk-for-java/authentication/)
- [https://docs.authing.co/sdk/sdk-for-java/management/](https://docs.authing.co/sdk/sdk-for-java/management/)
