package cn.authing.core.service;

import javax.annotation.Nonnull;

import cn.authing.core.http.Call;
import cn.authing.core.param.SendResetPasswordEmailParam;
import cn.authing.core.param.SendVerifyEmailParam;
import cn.authing.core.param.VerifyResetPasswordCodeParam;
import cn.authing.core.result.Result;

public interface VerifyService {
    Call<Result> sendPhoneVerifyCode(@Nonnull String phoneNumber);

    Call<Result> sendResetPasswordEmail(@Nonnull SendResetPasswordEmailParam param);

    Call<Result> verifyResetPasswordCode(@Nonnull VerifyResetPasswordCodeParam param);

    Call<Result> sendVerifyEmail(@Nonnull SendVerifyEmailParam param);
}
