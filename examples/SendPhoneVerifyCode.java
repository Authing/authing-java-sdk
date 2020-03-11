import cn.authing.core.Authing;
import cn.authing.core.result.Result;
import cn.authing.core.service.VerifyService;

import java.io.IOException;

public class SendPhoneVerifyCode {
    public static void main(String[] args) throws IOException {
        VerifyService verifyService = Authing.getVerifyService();
        Result result = verifyService.sendPhoneVerifyCode("13812341234").execute();
        System.out.println(result.getCode());
    }
}