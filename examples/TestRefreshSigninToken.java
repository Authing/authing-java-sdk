import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.RefreshSigninTokenParam;
import cn.authing.core.param.SigninParam;
import cn.authing.core.result.RefreshSigninTokenResult;
import cn.authing.core.result.SigninResult;

/*通过*/
public class TestRefreshSigninToken {
    public static void main(String[] args) throws Exception {
        InitParam param = new InitParam.Builder("5e607c6bb921fa4df738785f").secret("35023039bb82da7edca0d8db7646e2f3").build();
        // 初始化，全局只需要初始化一次
        Authing.init(param);
        // 登录的参数
        SigninParam p = new SigninParam.Builder()
                // 这四个 init 方法，只用调用一个，多次 init，只有第一次会生效
                .initWithEmail("123456@qq.com", "123456")
                // .initWithPhone("电话","密码")
                // .initWithUsername("用户名","密码")
                // .initWithUnionId("unionId")
                .build();
        // 调用，并获取结果。
        SigninResult result = Authing.getUserService().signIn(p).execute();
        // 获取用户列表的参数
        RefreshSigninTokenParam p1 = new RefreshSigninTokenParam.Builder(result.getRefreshToken())
                .oidcAppId("") // 可选参数
                .build();
        // 调用，并获取结果。
        RefreshSigninTokenResult result1 = Authing.getUserService().refreshSignInToken(p1).execute();
        System.out.println(result1.getAccessToken());
    }
}
