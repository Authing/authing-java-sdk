import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class GetUserLoggedinAppsTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        GetUserLoggedinAppsDto request = new GetUserLoggedinAppsDto();
        request.setUserId("userId_6776");
        request.setUserIdType("userIdType_2096");

        UserLoggedInAppsListRespDto response = client.getUserLoggedinApps(request);
        System.out.println(JsonUtils.serialize(response));
    }

}