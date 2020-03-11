import cn.authing.core.Authing;
import cn.authing.core.http.Callback;
import cn.authing.core.param.InitParam;
import cn.authing.core.param.UserPatchParam;
import cn.authing.core.result.ErrorInfo;
import cn.authing.core.result.UserPatchResult;
import cn.authing.core.service.UserManageService;

import java.io.IOException;

public class BatchUserInfo {
    public static void main(String[] args) throws IOException {
        InitParam param = new InitParam.Builder("5e109c446ef04e93e4a54d69").secret("1dcaa83dd0a0424d7906d7cec76e1935").build();
        // initialization, global only needs to initialized once
        Authing.init(param);
        UserManageService userManageService = Authing.getUserManageService();
        UserPatchParam.Builder userPatchBuilder = new UserPatchParam.Builder();
        userPatchBuilder.addUserId("5e6902486751b66eda5a94b7");
        UserPatchParam userPatchParam = userPatchBuilder.build();
        userManageService.getUserInfo(userPatchParam).enqueue(new Callback<UserPatchResult>() {
            @Override
            public void onSuccess(UserPatchResult result) {
                System.out.println("success");
            }

            @Override
            public void onFailure(ErrorInfo error) {
                int i =0;
            }
        });
    }
}
