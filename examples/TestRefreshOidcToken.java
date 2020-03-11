import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.RefreshOidcTokenParam;
import cn.authing.core.result.RefreshOidcTokenResult;

public class TestRefreshOidcToken {
    public static void main(String[] args) throws Exception {
        InitParam param = new InitParam.Builder("5e607c6bb921fa4df738785f").secret("35023039bb82da7edca0d8db7646e2f3").build();
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
