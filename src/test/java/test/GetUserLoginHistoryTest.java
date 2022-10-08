import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class GetUserLoginHistoryTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        GetUserLoginHistoryDto request = new GetUserLoginHistoryDto();
        request.setUserId("userId_3143");
        request.setUserIdType("userIdType_7931");
        request.setAppId("appId_7326");
        request.setClientIp("clientIp_156");
        request.setStart(0);
        request.setEnd(0);
        request.setPage(0);
        request.setLimit(0);

        UserLoginHistoryPaginatedRespDto response = client.getUserLoginHistory(request);
        System.out.println(JsonUtils.serialize(response));
    }

}