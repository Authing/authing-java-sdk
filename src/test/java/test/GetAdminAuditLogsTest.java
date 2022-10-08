package test
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class GetAdminAuditLogsTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        GetAdminAuditLogsDto request = new GetAdminAuditLogsDto();
        request.setRequestId("requestId_9609");
        request.setClientIp("clientIp_2402");
        request.setOperationType("operationType_4690");
        request.setResourceType("resourceType_9360");
        request.setUserId("userId_1848");
        request.setSuccess(Boolean.TRUE);
        request.setStart(0);
        request.setEnd(0);
        request.setPagination(new cn.authing.sdk.java.dto.ListWebhooksDto());

        AdminAuditLogRespDto response = client.getAdminAuditLogs(request);
        System.out.println(JsonUtils.serialize(response));
    }

}