package test;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class GetUserActionLogsTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        GetUserActionLogsDto request = new GetUserActionLogsDto();
        request.setRequestId("requestId_2476");
        request.setClientIp("clientIp_402");
        request.setEventType("eventType_5396");
        request.setUserId("userId_2210");
        request.setAppId("appId_1647");
        request.setStart(0);
        request.setEnd(0);
        request.setSuccess(Boolean.TRUE);
        request.setPagination(new cn.authing.sdk.java.dto.ListWebhooksDto());

        UserActionLogRespDto response = client.getUserActionLogs(request);
        System.out.println(JsonUtils.serialize(response));
    }

}