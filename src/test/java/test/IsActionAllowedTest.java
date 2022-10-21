package test;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class IsActionAllowedTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        IsActionAllowedDto request = new IsActionAllowedDto();
        request.setAction("action_4400");
        request.setResource("resource_3987");
        request.setUserId("userId_9305");
        request.setNamespace("namespace_579");

        IsActionAllowedRespDtp response = client.isActionAllowed(request);
        System.out.println(JsonUtils.serialize(response));
    }

}