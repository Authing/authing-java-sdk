package cn.authing.core.service;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import cn.authing.core.http.Call;
import cn.authing.core.param.ReadOAuthListParam;
import cn.authing.core.param.RefreshTokenParam;
import cn.authing.core.param.UnbindEmailParam;
import cn.authing.core.result.OAuthData;
import cn.authing.core.result.RefreshTokenResult;
import cn.authing.core.result.UserInfoResult;

public interface OAuthService {
    Call<List<OAuthData>> readOAuthList(@NotNull ReadOAuthListParam param);

    Call<RefreshTokenResult> refreshToken(@NotNull RefreshTokenParam param);

    Call<UserInfoResult> unbindEmail(@NotNull UnbindEmailParam param);
}
