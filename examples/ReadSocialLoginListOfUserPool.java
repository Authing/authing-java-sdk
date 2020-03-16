import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.ReadOAuthListParam;
import cn.authing.core.result.OAuthData;
import cn.authing.core.service.OAuthService;

import java.io.IOException;
import java.util.List;

public class ReadSocialLoginListOfUserPool {
    public static void main(String[] args) throws IOException {
        InitParam param = new InitParam.Builder("5e109c446ef04e93e4a54d69").secret("1dcaa83dd0a0424d7906d7cec76e1935").build();
        // Initialization, only need to be initialized once in the global scope
        Authing.init(param);
        OAuthService oauthService = Authing.getOAuthService();
        ReadOAuthListParam readOauthListParam = new ReadOAuthListParam.Builder().build();
        List<OAuthData> oauthData = oauthService.readOAuthList(readOauthListParam).execute();
        System.out.println(oauthData.get(0).getId());
    }
}
