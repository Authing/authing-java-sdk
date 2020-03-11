import cn.authing.core.Authing;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.RegisterParam;
import cn.authing.core.result.RegisterResult;

import java.io.IOException;

/* 通过 */
public class TestCreateUser {
    public static void main(String[] args) throws IOException {
        InitParam param = new InitParam.Builder("5e109c446ef04e93e4a54d69").secret("1dcaa83dd0a0424d7906d7cec76e1935").build();
        // 初始化，全局只需要初始化一次
        Authing.init(param);

        // 创建用户的参数
        RegisterParam rp = new RegisterParam.Builder("123456@qq.com", "123456").build();
        // 同步调用
        RegisterResult result = Authing.getUserService().createUser(rp).execute();
        System.out.println(result.getEmail());
    }
}
