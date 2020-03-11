import cn.authing.core.Authing;
import cn.authing.core.http.Callback;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.UserListParam;
import cn.authing.core.result.ErrorInfo;
import cn.authing.core.result.UserInfoResult;
import cn.authing.core.result.UserListResult;
import cn.authing.core.service.UserManageService;

import java.io.IOException;

public class GetUserList {
    public static void main(String[] args) throws IOException, InterruptedException {
        InitParam init = new InitParam.Builder("5e109c446ef04e93e4a54d69").secret("1dcaa83dd0a0424d7906d7cec76e1935").build();
        Authing.init(init);
        UserManageService userManageService = Authing.getUserManageService();
        UserListParam userListParam = new UserListParam.Builder().page(1).count(10).build();
//        UserListResult userListResult = userManageService.getUserList(userListParam).execute();

        userManageService.getUserList(userListParam).enqueue(new Callback<UserListResult>() {

            @Override
            public void onSuccess(UserListResult userListResult) {
                System.out.println(userListResult.getList());
            }

            @Override
            public void onFailure(ErrorInfo errorInfo) {
                System.out.println(errorInfo.getCode());
                System.out.println(errorInfo.getMessage());
            }
        });
//        System.out.println(userListResult.getList());
    }
}
