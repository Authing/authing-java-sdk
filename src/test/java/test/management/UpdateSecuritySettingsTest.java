package test.management;

import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.LoginAnomalyDetectionConfigDto;
import cn.authing.sdk.java.dto.LoginAnomalyDetectionConfigDto.LoginFailStrategy;
import cn.authing.sdk.java.dto.LoginFailCheckConfigDto;
import cn.authing.sdk.java.dto.LoginPassowrdFailCheckConfigDto;
import cn.authing.sdk.java.dto.SecuritySettingsRespDto;
import cn.authing.sdk.java.dto.UpdateSecuritySettingsDto;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

public class UpdateSecuritySettingsTest {
    // 需要替换成你的 Authing Access Key ID
    private static final String ACCESS_KEY_ID = "63591654ab04c1d33f7ac3fc";
    // 需要替换成你的 Authing Access Key Secret
    private static final String ACCESS_KEY_SECRET = "1153b67543017662d766ea6a897edcc7";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        // 如果是私有化部署的客户，需要设置 Authing 服务域名
         clientOptions.setHost("http://localhost:3000");

        ManagementClient client = new ManagementClient(clientOptions);

        UpdateSecuritySettingsDto updateSecuritySettingsDto = new UpdateSecuritySettingsDto();
        LoginAnomalyDetectionConfigDto loginAnomalyDetectionConfigDto = new LoginAnomalyDetectionConfigDto();
        updateSecuritySettingsDto.setLoginAnomalyDetection(loginAnomalyDetectionConfigDto);
        LoginPassowrdFailCheckConfigDto loginPasswordFailCheckConfigDto = new LoginPassowrdFailCheckConfigDto();
        loginPasswordFailCheckConfigDto.setEnabled(true);
        loginPasswordFailCheckConfigDto.setTimeInterval(111);
        loginPasswordFailCheckConfigDto.setLimit(1111);
        loginPasswordFailCheckConfigDto.setEnabled(true);

        LoginFailCheckConfigDto loginFailCheckConfigDto = new LoginFailCheckConfigDto();
        loginAnomalyDetectionConfigDto.setAccountLockLoginPasswordFailCheck(loginPasswordFailCheckConfigDto);
        loginFailCheckConfigDto.setTimeInterval(10);
        loginFailCheckConfigDto.setLimit(111);
        loginFailCheckConfigDto.setEnabled(true);
        loginAnomalyDetectionConfigDto.setLoginFailCheck(loginFailCheckConfigDto);
        loginAnomalyDetectionConfigDto.setLoginPasswordFailCheck(loginPasswordFailCheckConfigDto);
        loginAnomalyDetectionConfigDto.setLoginFailStrategy(LoginFailStrategy.BLOCK_ACCOUNT);
        loginAnomalyDetectionConfigDto.setRobotVerify("condition_set");
        loginAnomalyDetectionConfigDto.setRobotVerifyLoginPasswordFailCheck(
                loginPasswordFailCheckConfigDto);
        SecuritySettingsRespDto response = client.updateSecuritySettings(updateSecuritySettingsDto);
        System.out.println(JsonUtils.serialize(response));
    }
}
