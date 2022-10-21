package test;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class ListSyncRiskOperationsTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        ListSyncRiskOperationsDto request = new ListSyncRiskOperationsDto();
        request.setSyncTaskId(0);
        request.setPage(0);
        request.setLimit(0);
        request.setStatus("status_5431");
        request.setObjectType("objectType_9301");

        SyncRiskOperationPaginatedRespDto response = client.listSyncRiskOperations(request);
        System.out.println(JsonUtils.serialize(response));
    }

}