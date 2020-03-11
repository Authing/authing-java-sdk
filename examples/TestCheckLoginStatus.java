import cn.authing.core.Authing;
import cn.authing.core.param.CheckLoginStatusParam;
import cn.authing.core.param.InitParam;
import cn.authing.core.result.CheckLoginStatusResult;

import java.io.IOException;

public class TestCheckLoginStatus {
    public static void main(String[] args) throws IOException {
        InitParam param = new InitParam.Builder("5e607c6bb921fa4df738785f").secret("35023039bb82da7edca0d8db7646e2f3").build();
        // 初始化，全局只需要初始化一次
        Authing.init(param);

        // 检查登录状态的参数
        CheckLoginStatusParam p = new CheckLoginStatusParam.Builder("token").build();
        // 调用，并获取结果。
        CheckLoginStatusResult info = Authing.getUserService().checkLoginStatus(p).execute();
        System.out.println(info.isStatus());
    }
}
