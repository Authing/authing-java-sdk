package cn.authing.core.service;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import cn.authing.core.http.Call;
import cn.authing.core.param.BindThirdPartyOAuthParam;
import cn.authing.core.param.ReadOAuthListParam;
import cn.authing.core.param.ReadUserOAuthListParam;
import cn.authing.core.param.UnbindEmailParam;
import cn.authing.core.param.UnbindThirdPartyOAuthParam;
import cn.authing.core.result.BindThirdPartyOAuthResult;
import cn.authing.core.result.OAuthData;
import cn.authing.core.result.UnbindThirdPartyOAuthResult;
import cn.authing.core.result.UserInfoResult;
import cn.authing.core.result.UserOAuthData;

public interface OAuthService {
    Call<List<OAuthData>> readOAuthList(@NotNull ReadOAuthListParam param);

    Call<List<UserOAuthData>> readUserOAuthList(@NotNull ReadUserOAuthListParam param);

    Call<UserInfoResult> unbindEmail(@NotNull UnbindEmailParam param);

    Call<BindThirdPartyOAuthResult> bindThirdPartyOAuth(@NotNull BindThirdPartyOAuthParam param);

    Call<UnbindThirdPartyOAuthResult> unbindThirdPartyOAuth(@NotNull UnbindThirdPartyOAuthParam param);
}
