package cn.authing.core.service;

import org.jetbrains.annotations.NotNull;

import cn.authing.core.http.Call;
import cn.authing.core.param.LoginByEmailParam;
import cn.authing.core.param.LoginByLADPParam;
import cn.authing.core.param.LoginByPhoneParam;
import cn.authing.core.param.RefreshTokenParam;
import cn.authing.core.param.RegisterParam;
import cn.authing.core.param.ResetPasswordParam;
import cn.authing.core.param.SigninParam;
import cn.authing.core.param.UpdateUserInfoParam;
import cn.authing.core.param.UserInfoParam;
import cn.authing.core.param.UserListParam;
import cn.authing.core.result.LoginResult;
import cn.authing.core.result.RefreshTokenResult;
import cn.authing.core.result.RegisterResult;
import cn.authing.core.result.SigninResult;
import cn.authing.core.result.UserInfoResult;
import cn.authing.core.result.UserListResult;

public interface UserService {
    Call<RegisterResult> register(@NotNull RegisterParam param);

    Call<LoginResult> loginByEmail(@NotNull LoginByEmailParam param);

    Call<LoginResult> loginByPhone(@NotNull LoginByPhoneParam param);

    Call<LoginResult> loginByLDAP(@NotNull LoginByLADPParam param);

    Call<UserInfoResult> getUserInfo(@NotNull UserInfoParam param);

    Call<UserInfoResult> updateUserInfo(@NotNull UpdateUserInfoParam param);

    Call<UserInfoResult> resetPassword(@NotNull ResetPasswordParam param);

    Call<RefreshTokenResult> refreshToken(@NotNull RefreshTokenParam param);

    Call<RegisterResult> createUser(@NotNull RegisterParam param);

    Call<UserInfoResult> user(@NotNull UserInfoParam param);

    Call<UserListResult> list(@NotNull UserListParam param);

    Call<SigninResult> signIn(@NotNull SigninParam param);
}
