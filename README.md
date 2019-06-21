
# authing-java-sdk  
  
----------  
  
Authing SDK for JAVA 编写于 JDK 1.8  
  
[官方文档请点击这里](https://docs.authing.cn)。  
  
## 安装  
  
----------  
  
#### maven  
  
计划最近开始支持 maven 安装  
  
## 开始使用  
  
----------  
  
``` java  
Authing.init(cliendId, secret);  
  
// 注册  
Authing.getUserService().register(  
    RegisterParam.Builder(email, psd)  
        .nickname(nickname)  
        .build()  
).enqueue(object: Callback<RegisterResult>{  
    override fun onSuccess(result: RegisterResult?) {  
        // TODO  
  }  
  
    override fun onFailure(error: ErrorInfo?) {  
        // TODO  
  }  
})  
```  
  
[怎样获取 Client ID ?](https://docs.authing.cn/#/quick_start/howto)。  
  
获取 Client ID 和 Client Secret，请[点击这里](https://docs.authing.cn/#/quick_start/howto)。  

## 提供服务
  
----------  
Authing SDK 提供了授权服务 (OAuthService）、用户服务 (UserService)、用户管理服务 (UserManageService) 和验证服务 (VerifyService)，你可以直接通过 Authing.getXxxService 获取。

## 错误处理
  
----------  
  
统一使用 try...catch 处理错误  
  
了解更多报错的详情，请查看[错误代码列表](https://docs.authing.cn/#/quick_start/error_code)。  
  
[接口相关文档请点击这里](https://docs.authing.cn/#/user_service/add_user)。