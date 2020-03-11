import cn.authing.core.Authing;
import cn.authing.core.param.SendVerifyEmailParam;
import cn.authing.core.result.Result;
import cn.authing.core.service.VerifyService;

import java.io.IOException;

public class SendVerifyEmail {
    public static void main(String[] args) throws IOException {
        VerifyService verifyService = Authing.getVerifyService();
        SendVerifyEmailParam sendVerifyEmailParam = new SendVerifyEmailParam.Builder("test@test.com").build();
        Result result = verifyService.sendVerifyEmail(sendVerifyEmailParam).execute();
        System.out.println(result.getCode());
    }
}
