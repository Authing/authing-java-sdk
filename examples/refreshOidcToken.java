import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.RefreshOidcTokenParam;
import cn.authing.core.result.RefreshOidcTokenResult;

public class refreshOidcToken {
    public static void main(String[] args) throws Exception {
        InitParam param = new InitParam.Builder("5e109c446ef04e93e4a54d69").secret("1dcaa83dd0a0424d7906d7cec76e1935").build();
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
