import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.LoginByOidcParam;
import cn.authing.core.result.SigninResult;

public class TestLoginByOidc {
    public static void main(String[] args) throws Exception {
        InitParam param = new InitParam.Builder("5e607c6bb921fa4df738785f").secret("35023039bb82da7edca0d8db7646e2f3").build();
        // Initialization, only need to be initialized once in the global scope
        Authing.init(param);

        // Parameters for oidc login
        LoginByOidcParam p = new LoginByOidcParam.Builder("oidcClientId", "oidcSecret")
                // These four initialization methods only need to call one, multiple initialization, only the first time will take effect
                .initWithEmail("email","password")
                // .initWithPhone("telephone number","password")
                // .initWithUsername("username","password")
                // .initWithUnionId("unionId")
                .build();
        // Call and get the result.
        SigninResult result = Authing.getUserService().loginByOidc(p).execute();
        System.out.println(result.getAccessToken());
    }
}
