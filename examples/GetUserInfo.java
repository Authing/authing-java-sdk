import cn.authing.core.Authing;
import cn.authing.core.http.Callback;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.UserInfoParam;
import cn.authing.core.result.ErrorInfo;
import cn.authing.core.result.RegisterResult;
import cn.authing.core.result.UserInfoResult;
import cn.authing.core.service.UserService;


import java.io.IOException;

public class GetUserInfo {
    public static void main(String[] args) throws IOException {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").secret("1dcaa83dd0a0424d7906d7cec76e1935").build();
        Authing.init(init);

        UserService userService = Authing.getUserService();
        UserInfoParam userInfoParam = new UserInfoParam.Builder("5e6902486751b66eda5a94b7").build();
        UserInfoResult userInfoResult = userService.user(userInfoParam).execute();
        System.out.println(userInfoResult.getId());
    }
}
