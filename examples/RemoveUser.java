import cn.authing.core.Authing;
import cn.authing.core.param.RemoveUserParam;
import cn.authing.core.result.RemoveUserResult;
import cn.authing.core.service.UserManageService;

import java.io.IOException;
import java.util.List;

public class RemoveUser {
    public static void main(String[] args) throws IOException {
        UserManageService userManageService = Authing.getUserManageService();
        RemoveUserParam removeUserParam = new RemoveUserParam.Builder("5e6861b46e42c57c5ef141ad").build();
        List<RemoveUserResult> userListResult = userManageService.removeUser(removeUserParam).execute();
        System.out.println(userListResult.get(0).getId());
    }
}
