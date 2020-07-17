package cn.authing.core.service;

import java.util.List;

import javax.annotation.Nonnull;

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
    Call<List<OAuthData>> readOAuthList(@Nonnull ReadOAuthListParam param);

    Call<List<UserOAuthData>> readUserOAuthList(@Nonnull ReadUserOAuthListParam param);

    Call<UserInfoResult> unbindEmail(@Nonnull UnbindEmailParam param);

    Call<BindThirdPartyOAuthResult> bindThirdPartyOAuth(@Nonnull BindThirdPartyOAuthParam param);

    Call<UnbindThirdPartyOAuthResult> unbindThirdPartyOAuth(@Nonnull UnbindThirdPartyOAuthParam param);
}
