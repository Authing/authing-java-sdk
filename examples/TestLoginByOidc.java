import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.LoginByOidcParam;
import cn.authing.core.result.SigninResult;

public class TestLoginByOidc {
    public static void main(String[] args) throws Exception {
        InitParam param = new InitParam.Builder("5e607c6bb921fa4df738785f").secret("35023039bb82da7edca0d8db7646e2f3").build();
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
