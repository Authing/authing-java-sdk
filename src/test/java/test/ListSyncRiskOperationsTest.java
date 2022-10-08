import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class ListSyncRiskOperationsTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        ListSyncRiskOperationsDto request = new ListSyncRiskOperationsDto();
        request.setSyncTaskId(0);
        request.setPage(0);
        request.setLimit(0);
        request.setStatus("status_268");
        request.setObjectType("objectType_2973");

        SyncRiskOperationPaginatedRespDto response = client.listSyncRiskOperations(request);
        System.out.println(JsonUtils.serialize(response));
    }

}