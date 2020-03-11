import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.UnbindEmailParam;
import cn.authing.core.result.UserInfoResult;
import cn.authing.core.service.OAuthService;

import java.io.IOException;

public class UnBindEmail {
    public static void main(String[] args) throws IOException {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").secret("1dcaa83dd0a0424d7906d7cec76e1935").build();
        Authing.init(init);

        OAuthService oauthService = Authing.getOAuthService();
        UnbindEmailParam unbindEmailParam = new UnbindEmailParam.Builder().userId("5e67c2855d5a74fc4e9cffcd").build();
        UserInfoResult userInfoResult = oauthService.unbindEmail(unbindEmailParam).execute();
        System.out.println(userInfoResult.getId());
    }
}
