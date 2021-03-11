# Authing - Java / Kotlin

Authing Java SDK 由两部分组成：`ManagementClient` 和 `AuthenticationClient`。`ManagementClient` 中进行的所有操作均以管理员的身份进行，包含管理用户、管理角色、管理权限策略、管理用户池配置等模块。`AuthenticationClient` 中的所有操作以当前终端用户的身份进行，包含登录、注册、修改用户资料、退出登录等方法。

你应该将初始化过后的 `ManagementClient` 实例设置为一个全局变量（只初始化一次），而 `AuthenticationClient` 应该每次请求初始化一个。

## 安装

### gradle 项目

在 build.gradle 内的 dependencies 中添加：

```
implementation "cn.authing:java-core:<LATEST_VERSION>"
```

> 你可以在 [https://search.maven.org/artifact/cn.authing/java-core](https://search.maven.org/artifact/cn.authing/java-core) 查看最新的版本。

### maven 项目

在 pom.xml 内的 dependencies 中添加：

> 如果你需要在 `spring` 中使用此 SDK，由于 `spring` 依赖的 `OkHttp` 版本过低，所以你需要手动指定一下 `OkHttp` 的版本。

```
<dependency>
    <groupId>cn.authing</groupId>
    <artifactId>java-core</artifactId>
    <version><LATEST_VERSION></version>
</dependency>
<properties>
    <okhttp3.version>4.8.0</okhttp3.version>
</properties>
```

## 使用管理模块

初始化 `ManagementClient` 需要 `userPoolId`（用户池 ID） 和 `secret`（用户池密钥）:

> 你可以在此[了解如何获取 UserPoolId 和 Secret](https://docs.authing.cn/v2/guides/faqs/get-userpool-id-and-secret.html) .

```java
import cn.authing.core.mgmt.ManagementClient;

public class ManagementClientTest {
    public static void main(String[] args){
      ManagementClient managementClient = new ManagementClient("AUTHING_USERPOOL_ID", "AUTHING_USERPOOL_SECRET");

      // 获取管理员权限
      managementClient.requestToken().execute();
    }
}
```

现在 `managementClient` 实例就可以使用了。例如可以获取用户池中的用户列表：

```java
import cn.authing.core.mgmt.ManagementClient;

public class ManagementClientTest {
    public static void main(String[] args){
        ManagementClient managementClient = new ManagementClient("AUTHING_USERPOOL_ID", "AUTHING_USERPOOL_SECRET");
        // 获取管理员权限
        managementClient.requestToken().execute();

        PaginatedUsers users = managementClient.users().list().execute();
    }
}
```

## 使用认证模块

初始化 `ManagementClient` 需要 `userPoolId`（用户池 ID）和 `appId`（应用 ID）：

> 你可以在此[了解如何获取 UserPoolId](https://docs.authing.cn/v2/guides/faqs/get-userpool-id-and-secret.html), 在控制台的**应用**中查看自己的应用列表。

```java
import cn.authing.core.auth.AuthenticationClient;

public class AuthenticationClientTest {
    public static void main(String[] args){
        AuthenticationClient authenticationClient = new AuthenticationClient("AUTHING_USERPOOL_ID");
        authenticationClient.setAppId("AUTHING_APP_ID");
    }
}
```

接下来可以进行注册登录等操作：

```java
import cn.authing.core.auth.AuthenticationClient;

public class AuthenticationClientTest {
    public static void main(String[] args){
        AuthenticationClient authenticationClient = new AuthenticationClient("AUTHING_USERPOOL_ID");
        authenticationClient.setAppId("AUTHING_APP_ID");

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
        authenticationClient.setAppId("AUTHING_APP_ID");

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
        authenticationClient.setAppId("AUTHING_APP_ID");
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
import cn.authing.core.graphql.GraphQLException;
import java.io.IOException;


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

## 私有化部署

**私有化部署**场景需要指定你私有化的 Authing 服务的 GraphQL 端点（**不带协议头和 Path**）以及密码加密公钥，如果你不清楚可以联系 Authing IDaaS 服务管理员。

### 使用管理模块

初始化 `ManagementClient` 需要 `userPoolId`（用户池 ID） 和 `secret`（用户池密钥）:

```java
import cn.authing.core.mgmt.ManagementClient;

public class ManagementClientTest {
    public static void main(String[] args){
      ManagementClient managementClient = new ManagementClient("AUTHING_USERPOOL_ID", "AUTHING_USERPOOL_SECRET");
      // 配置自定义域名
      managementClient.setHost("https://core.you-authing-service.com");
      // 配置自定义公钥
      managementClient.setPublicKey("public key");
      // 获取管理员权限
      managementClient.requestToken().execute();
    }
}
```

### 使用认证模块

初始化 `ManagementClient` 需要 `userPoolId`（用户池 ID）：

```java
import cn.authing.core.auth.AuthenticationClient;

public class AuthenticationClientTest {
    public static void main(String[] args){
        AuthenticationClient authenticationClient = new AuthenticationClient("AUTHING_USERPOOL_ID");
        // 配置自定义域名
        authenticationClient.setHost("https://core.you-authing-service.com");
        // 配置自定义公钥
        authenticationClient.setPublicKey("public key");
    }
}
```

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

详情请见：

[用户认证模块](https://docs.authing.cn/v2/reference/sdk-for-java/authentication/)

管理模块包含以下子模块：

[管理用户](https://docs.authing.cn/v2/reference/sdk-for-java/management/UsersManagementClient.html)

[管理角色](https://docs.authing.cn/v2/reference/sdk-for-java/management/RolesManagementClient.html)

[管理策略](https://docs.authing.cn/v2/reference/sdk-for-java/management/PoliciesManagementClient.html)

[管理权限、访问控制](https://docs.authing.cn/v2/reference/sdk-for-java/management/AclManagementClient.html)

[管理用户自定义字段](https://docs.authing.cn/v2/reference/sdk-for-java/management/UdfManagementClient.html)

[管理分组](https://docs.authing.cn/v2/reference/sdk-for-java/management/GroupsManagementClient.html)

[管理组织机构](https://docs.authing.cn/v2/reference/sdk-for-java/management/OrgManagementClient.html)

[管理用户池配置](https://docs.authing.cn/v2/reference/sdk-for-java/management/UserpoolManagementClient.html)

[管理注册白名单](https://docs.authing.cn/v2/reference/sdk-for-java/management/WhitelistManagementClient.html)

[管理应用](https://docs.authing.cn/v2/reference/sdk-for-java/management/ApplicationManagementClient.html)

## 获取帮助

Join us on Gitter: [#authing-chat](https://gitter.im/authing-chat/community)
