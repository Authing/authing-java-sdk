import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.service.*;


public class Index {
    public static void main(String[] args) {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").secret("1dcaa83dd0a0424d7906d7cec76e1935").build();
        Authing.init(init);
        UserService userService = Authing.getUserService();
        UserManageService userManageService = Authing.getUserManageService();
        PermissionService permissionService = Authing.getPermissionService();
        VerifyService verifyService = Authing.getVerifyService();
        OAuthService oauthService = Authing.getOAuthService();
    }
}
