package test;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class UpdateSecuritySettingsTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        UpdateSecuritySettingsDto request = new UpdateSecuritySettingsDto();

        request.setAllowedOrigins(Collections.singletonList("https://example.com"));
        request.setAuthingTokenExpiresIn(129600);
        request.setVerifyCodeLength(6);
        request.setVerifyCodeMaxAttempts(1);

        ChangeEmailStrategyDto changeEmailStrategyDto = new ChangeEmailStrategyDto();
        changeEmailStrategyDto.setVerifyOldEmail(Boolean.TRUE);
        request.setChangeEmailStrategy(changeEmailStrategyDto);

        ChangePhoneStrategyDto changePhoneStrategyDto = new ChangePhoneStrategyDto();
        changePhoneStrategyDto.setVerifyOldPhone(Boolean.TRUE);
        request.setChangePhoneStrategy(changePhoneStrategyDto);

        CookieSettingsDto cookieSettingsDto = new CookieSettingsDto();
        cookieSettingsDto.setCookieExpiresIn(1209600);
        cookieSettingsDto.setCookieExpiresOnBrowserSession(Boolean.FALSE);
        request.setCookieSettings(cookieSettingsDto);

        request.setRegisterDisabled(Boolean.FALSE);

        RegisterAnomalyDetectionConfigDto registerAnomalyDetectionConfigDto = new RegisterAnomalyDetectionConfigDto();
        registerAnomalyDetectionConfigDto.setEnabled(Boolean.FALSE);
        registerAnomalyDetectionConfigDto.setLimit(50);
        registerAnomalyDetectionConfigDto.setTimeInterval(300);
        request.setRegisterAnomalyDetection(registerAnomalyDetectionConfigDto);

        request.setCompletePasswordAfterPassCodeLogin(Boolean.FALSE);

        LoginAnomalyDetectionConfigDto loginAnomalyDetectionConfigDto = new LoginAnomalyDetectionConfigDto();
//        loginAnomalyDetectionConfigDto.setLoginFailStrategy(LoginAnomalyDetectionConfigDto.LoginFailStrategy.CAPTCHA.getValue());
        LoginFailCheckConfigDto loginFailCheckConfigDto = new LoginFailCheckConfigDto();
        loginFailCheckConfigDto.setEnabled(Boolean.FALSE);
        loginFailCheckConfigDto.setLimit(50);
        loginFailCheckConfigDto.setTimeInterval(300);
        loginAnomalyDetectionConfigDto.setLoginFailCheck(loginFailCheckConfigDto);
        LoginPassowrdFailCheckConfigDto loginPassowrdFailCheckConfigDto = new LoginPassowrdFailCheckConfigDto();
        loginPassowrdFailCheckConfigDto.setEnabled(Boolean.FALSE);
        loginPassowrdFailCheckConfigDto.setLimit(50);
        loginPassowrdFailCheckConfigDto.setTimeInterval(300);
        loginAnomalyDetectionConfigDto.setLoginPasswordFailCheck(loginPassowrdFailCheckConfigDto);
        request.setLoginAnomalyDetection(loginAnomalyDetectionConfigDto);

        request.setLoginRequireEmailVerified(Boolean.FALSE);

        SelfUnlockAccountConfigDto selfUnlockAccountConfigDto = new SelfUnlockAccountConfigDto();
        selfUnlockAccountConfigDto.setEnabled(Boolean.FALSE);
//        selfUnlockAccountConfigDto.setStrategy(SelfUnlockAccountConfigDto.Strategy.CAPTCHA.getValue());
        request.setSelfUnlockAccount(selfUnlockAccountConfigDto);

        request.setEnableLoginAccountSwitch(Boolean.FALSE);

        QrcodeLoginStrategyDto qrcodeLoginStrategyDto = new QrcodeLoginStrategyDto();
        qrcodeLoginStrategyDto.setQrcodeExpiresIn(120);
        qrcodeLoginStrategyDto.setTicketExpiresIn(300);
        qrcodeLoginStrategyDto.setReturnFullUserInfo(Boolean.FALSE);
        qrcodeLoginStrategyDto.setAllowExchangeUserInfoFromBrowser(Boolean.TRUE);
        request.setQrcodeLoginStrategy(qrcodeLoginStrategyDto);

        SecuritySettingsRespDto response = client.updateSecuritySettings(request);
        System.out.println(JsonUtils.serialize(response));
    }

}