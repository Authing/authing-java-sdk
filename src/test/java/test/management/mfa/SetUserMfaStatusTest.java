package test.management.mfa;

import cn.genauth.sdk.java.client.ManagementClient;
import cn.genauth.sdk.java.dto.ApplicationMfaDto;
import cn.genauth.sdk.java.dto.GetMfaInfoDataDto;
import cn.genauth.sdk.java.dto.IsSuccessRespDto;
import cn.genauth.sdk.java.dto.SetMfaStatusDto;
import cn.genauth.sdk.java.model.ManagementClientOptions;
import cn.genauth.sdk.java.util.JsonUtils;
import java.util.ArrayList;
import java.util.List;

public class SetUserMfaStatusTest {
    // 需要替换成你的 Authing Access Key ID
    private static final String ACCESS_KEY_ID = "63b3fbc36cdc24e3b58f3943";
    // 需要替换成你的 Authing Access Key Secret
    private static final String ACCESS_KEY_SECRET = "e88a21b819f86e6be9d21df0bfa71f9e";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        // 如果是私有化部署的客户，需要设置 Authing 服务域名
        // clientOptions.setHost("https://api.your-authing-service.com");

        ManagementClient client = new ManagementClient(clientOptions);

        SetMfaStatusDto setMfaStatusDto = new SetMfaStatusDto();
        setMfaStatusDto.setUserId("64355e5f20dfae11d8ae12dc");
        GetMfaInfoDataDto getMfaInfoDataDto = new GetMfaInfoDataDto();
        getMfaInfoDataDto.setMfaToken("xxxxx");
        getMfaInfoDataDto.setMfaPhone("130xxxx4456");
        List<ApplicationMfaDto> applicationMfa = new ArrayList<>();
        ApplicationMfaDto applicationMfaDto = new ApplicationMfaDto();
        applicationMfaDto.setMfaPolicy("SMS");
        applicationMfaDto.setStatus(1);
        applicationMfaDto.setSort(1);
        applicationMfa.add(applicationMfaDto);
        getMfaInfoDataDto.setApplicationMfa(applicationMfa);
        setMfaStatusDto.setMfaTriggerData(getMfaInfoDataDto);
        IsSuccessRespDto response = client.setUsersMfaStatus(setMfaStatusDto);
        System.out.println(JsonUtils.serialize(response));
    }
}
