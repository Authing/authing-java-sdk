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
        request.setAllowedOrigins(Collections.singletonList("String_1855"));
        request.setAuthingTokenExpiresIn(0);
        request.setVerifyCodeLength(0);
        request.setVerifyCodeMaxAttempts(0);
        request.setChangeEmailStrategy(new cn.authing.sdk.java.dto.ChangeEmailStrategyDto());
        request.setChangePhoneStrategy(new cn.authing.sdk.java.dto.ChangePhoneStrategyDto());
        request.setCookieSettings(new cn.authing.sdk.java.dto.CookieSettingsDto());
        request.setRegisterDisabled(Boolean.TRUE);
        request.setRegisterAnomalyDetection(new cn.authing.sdk.java.dto.RegisterAnomalyDetectionConfigDto());
        request.setCompletePasswordAfterPassCodeLogin(Boolean.TRUE);
        request.setLoginAnomalyDetection(new cn.authing.sdk.java.dto.LoginAnomalyDetectionConfigDto());
        request.setLoginRequireEmailVerified(Boolean.TRUE);
        request.setSelfUnlockAccount(new cn.authing.sdk.java.dto.SelfUnlockAccountConfigDto());
        request.setEnableLoginAccountSwitch(Boolean.TRUE);
        request.setQrcodeLoginStrategy(new cn.authing.sdk.java.dto.QrcodeLoginStrategyDto());

        SecuritySettingsRespDto response = client.updateSecuritySettings(request);
        System.out.println(JsonUtils.serialize(response));
    }

}