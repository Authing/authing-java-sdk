package test.authentication;

import cn.authing.sdk.java.client.AuthenticationClient;
import cn.authing.sdk.java.dto.PasswordResetVerifyResp;
import cn.authing.sdk.java.dto.ResetPasswordByEmailPassCodeDto;
import cn.authing.sdk.java.dto.VerifyResetPasswordRequestDto;
import cn.authing.sdk.java.model.AuthenticationClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

public class VerifyResetPasswordRequestTest {
    // 需要替换成你的 Authing App ID
    private static final String APP_ID = "AUTHING_APP_ID";
    // 需要替换成你的 Authing App Secret
    private static final String APP_SECRET = "AUTHING_APP_SECRET";
    // 需要替换成你的 Authing App Host
    private static final String APP_HOST = "AUTHING_APP_HOST";

    public static void main(String[] args) throws Throwable {
        AuthenticationClientOptions clientOptions = new AuthenticationClientOptions();
        clientOptions.setAppId(APP_ID);
        clientOptions.setAppSecret(APP_SECRET);
        clientOptions.setAppHost(APP_HOST);

        AuthenticationClient client = new AuthenticationClient(clientOptions);

        VerifyResetPasswordRequestDto reqDto = new VerifyResetPasswordRequestDto();
        reqDto.setVerifyMethod(VerifyResetPasswordRequestDto.VerifyMethod.EMAIL_PASSCODE);
        ResetPasswordByEmailPassCodeDto passCodeDto = new ResetPasswordByEmailPassCodeDto();
        // 邮箱验证码，一个短信验证码只能使用一次，默认有效时间为 5 分钟。你需要通过发送邮件接口获取。
        passCodeDto.setPassCode("xxx");
        passCodeDto.setEmail("123@qq.com");
        reqDto.setEmailPassCodePayload(passCodeDto);
        PasswordResetVerifyResp response = client.verifyResetPasswordRequest(reqDto);
        System.out.println(JsonUtils.serialize(response));
    }
}
