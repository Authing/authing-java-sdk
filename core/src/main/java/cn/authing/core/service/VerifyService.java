package cn.authing.core.service;

import org.jetbrains.annotations.NotNull;

import cn.authing.core.http.Call;
import cn.authing.core.param.SendResetPasswordEmailParam;
import cn.authing.core.param.SendVerifyEmailParam;
import cn.authing.core.param.VerifyResetPasswordCodeParam;
import cn.authing.core.result.Result;

public interface VerifyService {
    Call<Result> sendPhoneVerifyCode(@NotNull String phoneNumber);

    Call<Result> sendResetPasswordEmail(@NotNull SendResetPasswordEmailParam param);

    Call<Result> verifyResetPasswordCode(@NotNull VerifyResetPasswordCodeParam param);

    Call<Result> sendVerifyEmail(@NotNull SendVerifyEmailParam param);
}
