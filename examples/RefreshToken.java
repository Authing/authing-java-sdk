import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.RefreshTokenParam;
import cn.authing.core.result.RefreshTokenResult;
import cn.authing.core.service.UserService;

import java.io.IOException;

public class RefreshToken {
    public static void main(String[] args) throws IOException {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").secret("1dcaa83dd0a0424d7906d7cec76e1935").build();
        Authing.init(init);
        UserService userService = Authing.getUserService();
        RefreshTokenParam refreshTokenParam = new RefreshTokenParam.Builder("5e67c2855d5a74fc4e9cffcd").build();
        RefreshTokenResult refreshTokenResult = userService.refreshToken(refreshTokenParam).execute();
        System.out.println(refreshTokenResult.getToken());
    }
}
