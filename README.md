
# Authing SDK for Java

Authing SDK for Java 编写于 JDK 1.8

[官方文档请点击这里](https://docs.authing.cn)。


## 安装

#### maven
``` xml
<dependency>
	<groupId>cn.authing</groupId>
	<artifactId>java-core</artifactId>
	<version>0.5.0</version>
	<type>pom</type>
</dependency>
```

#### gradle
``` groovy
impelementation 'cn.authing:java-core:0.5.0'
```

#### Android 注意
如果用于 Android 开发，需要在 AndroidManifest 文件中加入 INTERNET 权限。
``` xml
<uses-permission android:name="android.permission.INTERNET"/>
```

## 快速上手

先从 [Authing 控制台](https://authing.cn/dashboard) 中 [获取 Client ID](https://docs.authing.cn/#/quick_start/howto)，然后调用初始化函数。初始化调用一次即可，在 Android 开发中，推荐放在 Application 中进行初始化。

``` kotlin
// 初始化
Authing.init(cliendId, secret)

// 注册用户，异步调用
val registerParam: RegisterParam = RegisterParam.Builder(email, psd).nickname(nickname).build()
Authing.getUserService().register(registerParam).enqueue(object: Callback<RegisterResult>{
    override fun onSuccess(result: RegisterResult?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onFailure(error: ErrorInfo?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
})

// 使用邮箱登陆，同步调用
val loginParam: LoginByEmailParam = LoginByEmailParam.Builder(email, psd).build()
val result: LoginResult? = Authing.getUserService().loginByEmail(loginParam).execute()
```

## SDK 简介

#### 提供服务
  Authing SDK 提供了授权服务 (OAuthService)、用户服务 (UserService)、用户管理服务 (UserManageService) 和验证服务 (VerifyService)，你可以直接通过 Authing.getXxxService 获取。

#### 业务封装
每种服务中封装了相关的业务，规定了参数和返回值。
由于参数众多且参数可选，所以参数采用了 Builder 模式，且不能使用构造方法。例如：
``` kotlin
// 使用手机号和验证码登陆的参数
LoginByPhoneParam.Builder(phone, code).build()

// 使用用户 ID 获取用户信息参数
UserInfoParam.Builder(userId).build()
```
返回值都是简单的 Bean，提供了 get 方法，没有业务逻辑，供业务层自行处理。

#### 灵活调用
SDK 提供了同步和异步两种调用方式，适用不同的场景。
若需要等待返回结果处理后面的数据，比较适合同步调用，例如：
``` kotlin
// 获取用户信息
val userInfoParam: UserInfoParam = UserInfoParam.Builder(userId).build()
val info: UserInfoResult = Authing.getUserService().getUserInfo(userInfoParam).execute()
// 获取用户昵称
info.nickname
// 获取用户头像
info.photo
```
如果是在 Android 的主线程中，则需使用异步调用（当然你也可以在子线程中使用同步调用），例如：
``` kotlin
// 重置密码
val resetPsdParam = ResetPasswordParam.Builder(email, newPsd, code).build()
Authing.getUserService().resetPassword(resetPsdParam).enqueue(object :Callback<UserInfoResult>{
    override fun onSuccess(result: UserInfoResult?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

    override fun onFailure(error: ErrorInfo?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }
})
```

## SDK 详细介绍

#### 用户服务
``` java
UserService service = Authing.getUserService();
// 注册
service.register(param).xxx();
// 邮箱登陆
service.loginByEmail(param).xxx();
// 手机验证码登陆
service.loginByPhone(param).xxx();
// LDAP 登陆
service.loginByLDAP(param).xxx();
// 获取用户信息
service.getUserInfo(aram).xxx();
// 更新用户信息
service.updateUserInfo(param).xxx();
// 重置密码
service.resetPassword(param).xxx();
```

#### 授权服务
``` java
OAuthService service = Authing.getOAuthService();
// 解绑邮箱
service.unbindEmail(param).xxx();
// 刷新用户 token
service.refreshToken(param).xxx();
// 读取授权列表
service.readOAuthList(param).xxx();
```

#### 验证服务
``` java
VerifyService service = Authing.getVerifyService();
// 发送验证邮箱的邮件
service.sendVerifyEmail(param).xxx();
// 发送手机验证码
service.sendPhoneVerifyCode(param).xxx();
// 发送重置密码邮件
service.sendResetPasswordEmail(param).xxx();
// 验证重置密码的验证码
service.verifyResetPasswordCode(param).xxx();
```

#### 用户管理服务
``` java
UserManageService service = Authing.getUserManageService();
// 批量获取用户信息
service.getUserInfo(param).xxx();
// 获取用户列表
service.getUserList(param).xxx();
// 删除用户
service.removeUser(param).xxx();
```

## 错误处理

同步调用不会返回错误，所以推荐使用异步调用。
在 onFailure 中会返回错误，你可以通过 error.getCode() 获取错误代码。了解更多报错的详情，请查看[错误代码列表](https://docs.authing.cn/#/quick_start/error_code)。

[接口相关文档请点击这里](https://docs.authing.cn/#/user_service/add_user)。