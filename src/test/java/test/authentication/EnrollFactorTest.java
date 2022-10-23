package test.authentication;

import cn.authing.sdk.java.client.AuthenticationClient;
import cn.authing.sdk.java.dto.EnrollFactorDto;
import cn.authing.sdk.java.dto.EnrollFactorEnrollmentDataDto;
import cn.authing.sdk.java.dto.EnrollFactorRespDto;
import cn.authing.sdk.java.model.AuthenticationClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

public class EnrollFactorTest {
    // 需要替换成你的 Authing App ID
    private static final String APP_ID = "AUTHING_APP_ID";
    // 需要替换成你的 Authing App Secret
    private static final String APP_SECRET = "AUTHING_APP_SECRET";
    // 需要替换成你的 Authing App Host
    private static final String APP_HOST = "AUTHING_APP_HOST";
    // 需要替换成你的 Authing Access Token
    private static final String ACCESS_TOKEN = "AUTHING_ACCESS_TOKEN";

    public static void main(String[] args) throws Throwable {
        AuthenticationClientOptions clientOptions = new AuthenticationClientOptions();
        clientOptions.setAppId(APP_ID);
        clientOptions.setAppSecret(APP_SECRET);
        clientOptions.setAppHost(APP_HOST);
        clientOptions.setAccessToken(ACCESS_TOKEN);

        AuthenticationClient client = new AuthenticationClient(clientOptions);

        EnrollFactorDto reqDto = new EnrollFactorDto();
        reqDto.setFactorType(EnrollFactorDto.FactorType.EMAIL);
        // 「发起绑定 MFA 认证要素请求」接口返回的 enrollmentToken，此 token 有效时间为一分钟。
        reqDto.setEnrollmentToken("xxx");
        EnrollFactorEnrollmentDataDto dataDto = new EnrollFactorEnrollmentDataDto();
        dataDto.setPassCode("123");
        reqDto.setEnrollmentData(dataDto);
        EnrollFactorRespDto response = client.enrollFactor(reqDto);
        System.out.println(JsonUtils.serialize(response));
    }
}
