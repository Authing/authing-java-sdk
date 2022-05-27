import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class SetCustomDataTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        SetCustomDataReqDto request = new SetCustomDataReqDto();
        request.setList(Collections.singletonList(new cn.authing.sdk.java.dto.SetCustomDataDto()));
        request.setTargetIdentifier("targetIdentifier_5544");
        request.setTargetType(cn.authing.sdk.java.dto.SetCustomDataReqDto.TargetType.USER);
        request.setNamespace("namespace_877");

        IsSuccessRespDto response = client.setCustomData(request);
        System.out.println(JsonUtils.serialize(response));
    }

}