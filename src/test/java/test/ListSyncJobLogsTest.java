package test;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class ListSyncJobLogsTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        ListSyncJobLogsDto request = new ListSyncJobLogsDto();
        request.setSyncJobId(0);
        request.setPage(0);
        request.setLimit(0);
        request.setSuccess(Boolean.TRUE);
        request.setAction("action_2773");
        request.setObjectType("objectType_9256");

        TriggerSyncTaskRespDto response = client.listSyncJobLogs(request);
        System.out.println(JsonUtils.serialize(response));
    }

}