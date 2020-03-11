import cn.authing.core.Authing;
import cn.authing.core.param.CheckLoginStatusParam;
import cn.authing.core.param.InitParam;
import cn.authing.core.result.CheckLoginStatusResult;

import java.io.IOException;

/* 通过 */
public class CheckLoginStatus {
    public static void main(String[] args) throws IOException {
        InitParam param = new InitParam.Builder("5e109c446ef04e93e4a54d69").secret("1dcaa83dd0a0424d7906d7cec76e1935").build();
        // 初始化，全局只需要初始化一次
        Authing.init(param);

        // 检查登录状态的参数
        CheckLoginStatusParam p = new CheckLoginStatusParam.Builder("eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6IjEifQ.eyJqdGkiOiI0MEhDY2RLNUJBN0dweENfdE9obnkiLCJzdWIiOiI1ZTY3NDM5ODZlNDJjNTdmZTRmMDdlZjUiLCJpc3MiOiJodHRwczovL29hdXRoLmF1dGhpbmcuY24vb2F1dGgvb2lkYyIsImlhdCI6MTU4Mzk0MDUwNiwiZXhwIjoxNTgzOTQ0MTA2LCJzY29wZSI6Im9wZW5pZCBwcm9maWxlIGFkZHJlc3MgZW1haWwgcGhvbmUgdW5pb25pZCBhdXRoaW5nX3Rva2VuIG9mZmxpbmVfYWNjZXNzIiwiYXVkIjoiNWU2MDdjNmNlYzRlNzcwYjJkM2MyMGE0In0.Q2--C3I2H48KhL-oUtcRJIwXxnvK8lwL1Tt5QeiqFd3GvJ5GXlfSLaVpZpJMKxIuZIHy6bhX-WHh9nQDC3Dr6or_O-THIjZyu55KMqcC6sqEVPCEcmzdTrKOK5x_9b2BXYgJ1Wvod99LcxrnaFTD5JlD4Induw-BnAQP1lJ2e6lBGklM2MDnCM_nQYDWLZbMgwnXf0QAAboOMAEwW7ekbSTys38q966w-v-KKVd0qvX01WRpoomYKPmDe53JQcAcP93DegPFIKxkWMaipZXp9roGzBQhjEeRvEIa1FSRIjbxEiTx19B7zoFH4JoezIl9Rl77WmWvLL2j-0hM-Bu05g").build();
        // 调用，并获取结果。
        CheckLoginStatusResult info = Authing.getUserService().checkLoginStatus(p).execute();
        System.out.println(info.isStatus());
    }
}
