import cn.authing.core.Authing;
import cn.authing.core.http.Callback;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.RegisterParam;
import cn.authing.core.result.ErrorInfo;
import cn.authing.core.result.RegisterResult;
import cn.authing.core.service.UserService;

import java.io.IOException;

public class RegisterUserAsync {
    public static void main(String[] args) throws IOException {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").secret("1dcaa83dd0a0424d7906d7cec76e1935").build();
        Authing.init(init);
        UserService userService = Authing.getUserService();
        RegisterParam registerParam = new RegisterParam.Builder("13116172397", "123").nickname("test_nickname").build();
        userService.createUser(registerParam).enqueue(new Callback<RegisterResult>() {
            @Override
            public void onSuccess(RegisterResult registerResult) {
                registerResult.getId();
            }

            @Override
            public void onFailure(ErrorInfo errorInfo) {
                System.out.println(errorInfo.getCode());
                System.out.println(errorInfo.getMessage());
            }
        });


    }
}
