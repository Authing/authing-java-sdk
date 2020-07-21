package cn.authing.core.service;

import javax.annotation.Nonnull;

import cn.authing.core.http.Call;
import cn.authing.core.param.CheckLoginStatusParam;
import cn.authing.core.param.LoginByEmailParam;
import cn.authing.core.param.LoginByLADPParam;
import cn.authing.core.param.LoginByOidcParam;
import cn.authing.core.param.LoginByPhoneParam;
import cn.authing.core.param.RefreshOidcTokenParam;
import cn.authing.core.param.RefreshSigninTokenParam;
import cn.authing.core.param.RefreshTokenParam;
import cn.authing.core.param.RegisterParam;
import cn.authing.core.param.ResetPasswordParam;
import cn.authing.core.param.SigninParam;
import cn.authing.core.param.UpdatePhoneParam;
import cn.authing.core.param.UpdateUserInfoParam;
import cn.authing.core.param.UserInfoParam;
import cn.authing.core.param.UserListParam;
import cn.authing.core.result.CheckLoginStatusResult;
import cn.authing.core.result.LoginResult;
import cn.authing.core.result.RefreshOidcTokenResult;
import cn.authing.core.result.RefreshSigninTokenResult;
import cn.authing.core.result.RefreshTokenResult;
import cn.authing.core.result.RegisterResult;
import cn.authing.core.result.SigninResult;
import cn.authing.core.result.UserInfoResult;
import cn.authing.core.result.UserListResult;

public interface UserService {
    Call<RegisterResult> register(@Nonnull RegisterParam param);

    Call<LoginResult> loginByEmail(@Nonnull LoginByEmailParam param);

    Call<LoginResult> loginByPhone(@Nonnull LoginByPhoneParam param);

    Call<LoginResult> loginByLDAP(@Nonnull LoginByLADPParam param);

    Call<UserInfoResult> getUserInfo(@Nonnull UserInfoParam param);

    Call<UserInfoResult> updateUserInfo(@Nonnull UpdateUserInfoParam param);

    Call<UserInfoResult> updatePhone(@Nonnull UpdatePhoneParam param);

    Call<UserInfoResult> resetPassword(@Nonnull ResetPasswordParam param);

    Call<RefreshTokenResult> refreshToken(@Nonnull RefreshTokenParam param);

    Call<RegisterResult> createUser(@Nonnull RegisterParam param);

    Call<UserInfoResult> user(@Nonnull UserInfoParam param);

    Call<UserListResult> list(@Nonnull UserListParam param);

    Call<SigninResult> signIn(@Nonnull SigninParam param);

    Call<RefreshSigninTokenResult> refreshSignInToken(@Nonnull RefreshSigninTokenParam param);

    Call<CheckLoginStatusResult> checkLoginStatus(@Nonnull CheckLoginStatusParam param);

    Call<SigninResult> loginByOidc(@Nonnull LoginByOidcParam param);

    Call<RefreshOidcTokenResult> refreshOidcToken(@Nonnull RefreshOidcTokenParam param);
}
