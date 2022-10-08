package test
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class IsActionAllowedTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        IsActionAllowedDto request = new IsActionAllowedDto();
        request.setAction("action_6873");
        request.setResource("resource_4750");
        request.setUserId("userId_3108");
        request.setNamespace("namespace_209");

        IsActionAllowedRespDtp response = client.isActionAllowed(request);
        System.out.println(JsonUtils.serialize(response));
    }

}