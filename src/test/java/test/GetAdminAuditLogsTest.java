package test;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class GetAdminAuditLogsTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        GetAdminAuditLogsDto request = new GetAdminAuditLogsDto();
        request.setRequestId("requestId_1145");
        request.setClientIp("clientIp_9839");
        request.setOperationType("operationType_7631");
        request.setResourceType("resourceType_4049");
        request.setUserId("userId_6116");
        request.setSuccess(Boolean.TRUE);
        request.setStart(0);
        request.setEnd(0);
        request.setPagination(new cn.authing.sdk.java.dto.ListWebhooksDto());

        AdminAuditLogRespDto response = client.getAdminAuditLogs(request);
        System.out.println(JsonUtils.serialize(response));
    }

}