import cn.authing.core.Authing;
import cn.authing.core.param.VerifyResetPasswordCodeParam;
import cn.authing.core.result.Result;
import cn.authing.core.service.VerifyService;

import java.io.IOException;

public class VerifyResetPasswordCode {
    public static void main(String[] args) throws IOException {
        VerifyService verifyService = Authing.getVerifyService();
        VerifyResetPasswordCodeParam verifyResetPasswordCodeParam = new VerifyResetPasswordCodeParam.Builder("test@test.com", "1234").build();
        Result result = verifyService.verifyResetPasswordCode(verifyResetPasswordCodeParam).execute();
        System.out.println(result.getCode());
    }
}
