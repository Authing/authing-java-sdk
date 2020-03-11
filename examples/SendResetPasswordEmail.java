import cn.authing.core.Authing;
import cn.authing.core.param.SendResetPasswordEmailParam;
import cn.authing.core.result.Result;
import cn.authing.core.service.VerifyService;

import java.io.IOException;

public class SendResetPasswordEmail {
    public static void main(String[] args) throws IOException {
        VerifyService verifyService = Authing.getVerifyService();
        SendResetPasswordEmailParam sendResetPasswordEmailParam = new SendResetPasswordEmailParam.Builder("test@test.com").build();
        Result result = verifyService.sendResetPasswordEmail(sendResetPasswordEmailParam).execute();
        System.out.println(result.getCode());
    }
}
