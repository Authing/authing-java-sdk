# authing-java-sdk

[Authing](https://authing.cn) 身份云 `Java` 语言客户端，包含 [Authing Open API](https://api.authing.cn/openapi/) 所有 Management API 的请求方法以及通过 OIDC 协议实现的认证侧的认证相关方法。

Management 模块以管理员（Administrator）的身份进行请求，用于管理 Authing 用户、角色、分组、组织机构等资源；一般来说，你在 Authing 控制台中能做的所有操作，都能用此模块完成。

AuthenticationClient 模块提供认证相关的调用方法，支持包括获取认证地址、获取登录态（用户信息，令牌）、检查令牌、登出等认证相关方法。

如果你需要以终端用户（End User）的身份进行登录、注册、登出等操作，请使用 [Guard](https://www.authing.cn/learn/guard) .

## 安装

### Gradle

```bash
implementation "cn.authing:authing-java-sdk:<{final_version}>"
```

### Maven

```xml
<dependency>
    <groupId>cn.authing</groupId>
    <artifactId>authing-java-sdk</artifactId>
    <version>{final_version}</version>
</dependency>
```

## 初始化

初始化 `ManagementClient` 需要使用 `accessKeyId` 和 `accessKeySecret` 参数:

```java
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.model.ManagementClientOptions;

ManagementClientOptions clientOptions = new ManagementClientOptions("AUTHING_USERPOOL_ID", "AUTHING_USERPOOL_SECRET");
ManagementClient managementClient = new ManagementClient(clientOptions);
```

`ManagementClient` 会自动从 Authing 服务器获取 Management API Token，并通过返回的 Token 过期时间自动对 Token 进行缓存。

完整的参数和释义如下：

- `accessKeyId`: Authing 用户池 ID;
- `accessKeySecret`: Authing 用户池密钥;
- `timeout`: 超时时间，单位为 ms，默认为 10000 ms;
- `host`: Authing 服务器地址，默认为 `https://api.authing.cn`。如果你使用的是 Authing 公有云版本，请忽略此参数。如果你使用的是私有化部署的版本，此参数必填，格式如下: https://authing-api.my-authing-service.com（最后不带斜杠 /）。
- `lang`: 接口 Message 返回语言格式（可选），可选值为 zh-CN 和 en-US，默认为 zh-CN。

初始化 `AuthenticationClient` 需要使用 `appId` 、 `appSecret` 、 `host` 、 `redirectUri` 参数:

```java
import cn.authing.sdk.java.client.AuthenticationClient;
import cn.authing.sdk.java.model.AuthenticationClientOptions;

AuthenticationClientOptions clientOptions = new AuthenticationClientOptions("APP_ID", "APP_SECRET", "HOST", "REDIRECT_URI");
AuthenticationClient authenticationClient = new AuthenticationClient(clientOptions);

```

完整的参数和释义如下：

- `appId`: Authing 应用 ID ;
- `appSecret`: Authing 应用 Secret;
- `host`: 应用对应的用户池域名，例如 pool.authing.cn;
- `redirectUri`: 认证完成后的重定向目标 URL, 会进行校验，需要和控制台的设置保持一致。
- `logoutRedirectUri`: 登出完成后的重定向目标 URL。
- `scope`: 应用侧向 Authing 请求的权限，以空格分隔，默认为 'openid profile'，成功获取的权限会出现在 Access Token 的 scope 字段中。
- `serverJWKS`: 服务端的 JWKS 公钥，用于验证 Token 签名，默认会通过网络请求从服务端的 JWKS 端点自动获取。
- `cookieKey`: 存储认证上下文的 Cookie 名称。

认证侧相关的使用和方法说明，你可以在 [Authing Nodejs SDK](https://docs.authing.cn/v2/reference-new/sdk/v5/node/authentication.html) 中查看。

## 快速开始

初始化完成 `ManagementClient` 之后，你可以获取 `ManagementClient` 的实例，然后调用此实例上的方法。例如：

- 获取用户列表

```java
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.model.ManagementClientOptions;

public static void main(String[] args) {
    ManagementClientOptions clientOptions = new ManagementClientOptions("AUTHING_USERPOOL_ID", "AUTHING_USERPOOL_SECRET");
    ManagementClient managementClient = new ManagementClient(clientOptions);
    ListUsersDto request = new ListUsersDto();
    request.setPage(1);
    request.setLimit(10);
    UserPaginatedRespDto response = managementClient.listUsers(request);
    System.out.println(response);
}
```

- 创建角色

```java
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.model.ManagementClientOptions;

public static void main(String[] args) {
    ManagementClientOptions clientOptions = new ManagementClientOptions("AUTHING_USERPOOL_ID", "AUTHING_USERPOOL_SECRET");
    ManagementClient managementClient = new ManagementClient(clientOptions);
    CreateRoleDto request = new CreateRoleDto();
    request.setCode("code");
    request.setNamespace("namespace");
    request.setDescription("description");
    RoleSingleRespDto response = managementClient.createRole(request);
    System.out.println(response);
}
```

完整的接口列表，你可以在 [Authing Open API](https://api.authing.cn/openapi/) 和 [SDK 文档](https://authing-open-api.readme.io/reference/java) 中获取。

## 错误处理

`ManagementClient` 中的每个方法，遵循统一的返回结构：

- `statusCode`: 请求是否成功状态码，当 `statusCode` 为 200 时，表示操作成功，非 200 全部为失败。
- `apiCode`: 细分错误码，当 `apiCode` 非 200 时，可通过此错误码得到具体的错误类型。
- `message`: 具体的错误信息。
- `data`: 具体返回的接口数据。

一般情况下，如果你只需要判断操作是否成功，只需要对比一下 `code` 是否为 200。如果非 200，可以在代码中通抛出异常或者任何你项目中使用的异常处理方式。

```java
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.model.ManagementClientOptions;

public static void main(String[] args) {
    ManagementClientOptions clientOptions = new ManagementClientOptions("AUTHING_USERPOOL_ID", "AUTHING_USERPOOL_SECRET");
    ManagementClient managementClient = new ManagementClient(clientOptions);
    CreateRoleDto request = new CreateRoleDto();
    request.setCode("code");
    request.setNamespace("namespace");
    request.setDescription("description");
    RoleSingleRespDto response = managementClient.createRole(request);

    if (response.getCode() != 200) {
    throw new RuntimeException(response.getMessage()); // 抛出异常，由全局异常捕捉中间件进行异常捕捉
    }

    // 继续你的业务逻辑 ...
}
```

## 私有化部署

如果你使用的是私有化部署的 Authing IDaaS 服务，需要指定此 Authing 私有化实例的 `host`，如：

```java
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;

public class ManagementClientTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";
    // 您的 Authing 私有化实例 HOST 地址，格式例如 https://core.authing.cn
    private static final String HOST = "YOUR_HOST";
    private ManagementClient managementClient = null;

    public ManagementClientTest() {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        clientOptions.setHost(HOST);
        managementClient = new ManagementClient(clientOptions);
    }

}
```

如果你不清楚如何获取，可以联系 Authing IDaaS 服务管理员。

## 资源

- [官网](https://authing.cn)
- [开发者文档](https://docs.authing.cn/)
- [Authing Open API](https://api.authing.cn/openapi/)
- [SDK 文档](https://authing-open-api.readme.io/reference/nodejs)
- [论坛社区](https://forum.authing.cn/)

## 获取帮助

有任何疑问，可以在 Authing 论坛提出: [#authing-forum](https://forum.authing.cn/)
