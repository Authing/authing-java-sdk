import cn.authing.core.Authing;
import cn.authing.core.http.Call;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.UserListParam;
import cn.authing.core.result.UserInfoResult;
import cn.authing.core.result.UserListResult;

import java.io.IOException;
import java.util.List;

public class TestUserList {
    public static void main(String[] args) throws IOException {
        InitParam param = new InitParam.Builder("5e109c446ef04e93e4a54d69").secret("1dcaa83dd0a0424d7906d7cec76e1935").build();
        // initialization, global only needs to initialized once
        Authing.init(param);

        // get parameters for userslist
        UserListParam p = new UserListParam.Builder().count(10).build();
        // call and get the result
        Call<UserListResult> call = Authing.getUserService().list(p);
        UserListResult userList = call.execute();
        List<UserInfoResult> list = userList.getList();
        System.out.println(userList.getTotalCount());
    }
}
