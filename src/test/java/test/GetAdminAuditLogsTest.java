package test;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;



public class GetAdminAuditLogsTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        GetAdminAuditLogsDto request = new GetAdminAuditLogsDto();
        request.setRequestId("requestId_8072");
        request.setClientIp("clientIp_1920");
        request.setOperationType("operationType_4285");
        request.setResourceType("resourceType_5848");
        request.setUserId("userId_4692");
        request.setSuccess(Boolean.TRUE);
        request.setStart(0);
        request.setEnd(0);

        ListWebhooksDto listWebhooksDto = new ListWebhooksDto();
        listWebhooksDto.setPage(1);
        listWebhooksDto.setLimit(10);
        request.setPagination(listWebhooksDto);

        AdminAuditLogRespDto response = client.getAdminAuditLogs(request);
        System.out.println(JsonUtils.serialize(response));
    }

}