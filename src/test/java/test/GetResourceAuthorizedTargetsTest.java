package test;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class GetResourceAuthorizedTargetsTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        GetResourceAuthorizedTargetsDto request = new GetResourceAuthorizedTargetsDto();
        request.setResource("resource_4962");
        request.setNamespace("namespace_3447");
        request.setTargetType(cn.authing.sdk.java.dto.GetResourceAuthorizedTargetsDto.TargetType.USER);
        request.setPage(0);
        request.setLimit(0);

        GetResourceAuthorizedTargetRespDto response = client.getResourceAuthorizedTargets(request);
        System.out.println(JsonUtils.serialize(response));
    }

}