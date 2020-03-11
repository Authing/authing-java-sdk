import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.RegisterParam;
import cn.authing.core.result.RegisterResult;

import java.io.IOException;

/* pass */
public class TestCreateUser {
    public static void main(String[] args) throws IOException {
        InitParam param = new InitParam.Builder("5e109c446ef04e93e4a54d69").secret("1dcaa83dd0a0424d7906d7cec76e1935").build();
        // Initialization, only need to be initialized once in the global scope
        Authing.init(param);

        // Parameter for create user
        RegisterParam rp = new RegisterParam.Builder("123456@qq.com", "123456").build();
        // Synchronous call
        RegisterResult result = Authing.getUserService().createUser(rp).execute();
        System.out.println(result.getEmail());
    }
}
