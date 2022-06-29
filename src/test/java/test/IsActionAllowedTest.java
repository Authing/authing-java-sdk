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
        request.setAction("action_8579");
        request.setResource("resource_534");
        request.setUserId("userId_6062");
        request.setNamespace("namespace_2437");

        IsActionAllowedRespDtp response = client.isActionAllowed(request);
        System.out.println(JsonUtils.serialize(response));
    }

}