package cn.authing.core.service;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import cn.authing.core.http.Call;
import cn.authing.core.param.RemoveUserParam;
import cn.authing.core.param.UserListParam;
import cn.authing.core.param.UserPatchParam;
import cn.authing.core.result.RemoveUserResult;
import cn.authing.core.result.UserListResult;
import cn.authing.core.result.UserPatchResult;

public interface UserManageService {
    Call<UserPatchResult> getUserInfo(@NotNull UserPatchParam param);

    Call<UserListResult> getUserList(@NotNull UserListParam param);

    Call<List<RemoveUserResult>> removeUser(@NotNull RemoveUserParam param);
}
