import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class GetUserActionLogsTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        GetUserActionLogsDto request = new GetUserActionLogsDto();
        request.setRequestId("requestId_5983");
        request.setClientIp("clientIp_6231");
        request.setEventType("eventType_1023");
        request.setUserId("userId_4");
        request.setAppId("appId_7621");
        request.setStart(0);
        request.setEnd(0);
        request.setSuccess(Boolean.TRUE);
        request.setPagination(new cn.authing.sdk.java.dto.ListWebhooksDto());

        UserActionLogRespDto response = client.getUserActionLogs(request);
        System.out.println(JsonUtils.serialize(response));
    }

}