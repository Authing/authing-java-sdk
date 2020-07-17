package cn.authing.core.service;

import java.util.List;

import javax.annotation.Nonnull;

import cn.authing.core.http.Call;
import cn.authing.core.param.RemoveUserParam;
import cn.authing.core.param.UserListParam;
import cn.authing.core.param.UserPatchParam;
import cn.authing.core.result.RemoveUserResult;
import cn.authing.core.result.UserListResult;
import cn.authing.core.result.UserPatchResult;

public interface UserManageService {
    Call<UserPatchResult> getUserInfo(@Nonnull UserPatchParam param);

    Call<UserListResult> getUserList(@Nonnull UserListParam param);

    Call<List<RemoveUserResult>> removeUser(@Nonnull RemoveUserParam param);
}
