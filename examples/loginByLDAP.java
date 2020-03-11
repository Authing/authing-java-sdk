import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.LoginByLADPParam;
import cn.authing.core.result.LoginResult;
import cn.authing.core.service.UserService;

import java.io.IOException;

public class loginByLDAP {
    public static void main(String[] args) throws IOException {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").secret("1dcaa83dd0a0424d7906d7cec76e1935").build();
        Authing.init(init);
        UserService userService = Authing.getUserService();
        LoginByLADPParam loginByLDAPParam = new LoginByLADPParam.Builder("13812341234", "123456").build();
        LoginResult loginResult = userService.loginByLDAP(loginByLDAPParam).execute();
        System.out.println(loginResult.getId());
    }
}
