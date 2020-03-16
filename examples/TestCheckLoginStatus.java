import cn.authing.core.Authing;
import cn.authing.core.param.CheckLoginStatusParam;
import cn.authing.core.param.InitParam;
import cn.authing.core.result.CheckLoginStatusResult;

import java.io.IOException;

public class TestCheckLoginStatus {
    public static void main(String[] args) throws IOException {
        InitParam param = new InitParam.Builder("5e607c6bb921fa4df738785f").secret("35023039bb82da7edca0d8db7646e2f3").build();
        // Initialization, only need to be initialized once in the global scope
        Authing.init(param);

        // Parameters for checking login status
        CheckLoginStatusParam p = new CheckLoginStatusParam.Builder("token").build();
        // Call and get the result.
        CheckLoginStatusResult info = Authing.getUserService().checkLoginStatus(p).execute();
        System.out.println(info.isStatus());
    }
}
