import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.RegisterParam;
import cn.authing.core.result.RegisterResult;
import cn.authing.core.service.UserService;

import java.io.IOException;

public class Register {
    public static void main(String[] args) throws IOException {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").secret("1dcaa83dd0a0424d7906d7cec76e1935").build();
        Authing.init(init);
        UserService userService = Authing.getUserService();
        RegisterParam registerParam = new RegisterParam.Builder("13116172397", "123").nickname("test_nickname").build();
//        RegisterParam registerParam2 = new RegisterParam.Builder("1");
//        RegisterResult registerResult = userService.createUser(registerParam).execute();
        RegisterResult registerResult = userService.createUser(registerParam).execute();
        System.out.println(registerResult.getId());

    }
}
