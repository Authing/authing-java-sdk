import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.RefreshSigninTokenParam;
import cn.authing.core.param.SigninParam;
import cn.authing.core.result.RefreshSigninTokenResult;
import cn.authing.core.result.SigninResult;

/*pass*/
public class TestRefreshSigninToken {
    public static void main(String[] args) throws Exception {
        InitParam param = new InitParam.Builder("5e607c6bb921fa4df738785f").secret("35023039bb82da7edca0d8db7646e2f3").build(); 
        // Initialization, only need to be initialized once in the global scope
        Authing.init(param);
        // Login parameters
        SigninParam p = new SigninParam.Builder()
                // These four initialization methods only need to call one, multiple initialization, only the first time will take effect
                .initWithEmail("123456@qq.com", "123456")
                // .initWithPhone("telephone number","password")
                // .initWithUsername("username","password")
                // .initWithUnionId("unionId")
                .build();
        // Call and get the result.
        SigninResult result = Authing.getUserService().signIn(p).execute();
        // Get the parameters of the user list
        RefreshSigninTokenParam p1 = new RefreshSigninTokenParam.Builder(result.getRefreshToken())
                .oidcAppId("") // 可选参数
                .build();
        // Call and get the result.
        RefreshSigninTokenResult result1 = Authing.getUserService().refreshSignInToken(p1).execute();
        System.out.println(result1.getAccessToken());
    }
}
