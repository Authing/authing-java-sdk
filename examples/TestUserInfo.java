import cn.authing.core.Authing;
import cn.authing.core.business.Platform;
import cn.authing.core.http.Call;
import cn.authing.core.http.Callback;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.UserInfoParam;
import cn.authing.core.result.ErrorInfo;
import cn.authing.core.result.UserInfoResult;

import java.io.IOException;

public class TestUserInfo {
    public static void main(String[] args) throws IOException, InterruptedException {
        InitParam param = new InitParam.Builder("5e109c446ef04e93e4a54d69").secret("1dcaa83dd0a0424d7906d7cec76e1935").build();
        // 初始化，全局只需要初始化一次
        Authing.init(param);
        // 获取用户信息的参数
        UserInfoParam p = new UserInfoParam.Builder("5e6902486751b66eda5a94b7").build();
        // 调用，并获取结果。
        Call<UserInfoResult> call = Authing.getUserService().user(p);
        UserInfoResult info = call.execute();
        System.out.println(info.getId());
    }
}
