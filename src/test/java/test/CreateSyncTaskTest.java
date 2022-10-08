package test;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class CreateSyncTaskTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        CreateSyncTaskDto request = new CreateSyncTaskDto();
        request.setFieldMapping(Collections.singletonList(new cn.authing.sdk.java.dto.SyncTaskFieldMapping()));
        request.setSyncTaskTrigger(cn.authing.sdk.java.dto.CreateSyncTaskDto.SyncTaskTrigger.MANUALLY);
        request.setSyncTaskFlow(cn.authing.sdk.java.dto.CreateSyncTaskDto.SyncTaskFlow.UPSTREAM);
        request.setSyncTaskType(cn.authing.sdk.java.dto.CreateSyncTaskDto.SyncTaskType.LARK);
        request.setSyncTaskName("syncTaskName_2581");
        request.setClientConfig(new cn.authing.sdk.java.dto.SyncTaskClientConfig());
        request.setOrganizationCode("organizationCode_1580");
        request.setProvisioningScope(new cn.authing.sdk.java.dto.SyncTaskProvisioningScope());
        request.setTimedScheduler(new cn.authing.sdk.java.dto.SyncTaskTimedScheduler());

        SyncTaskPaginatedRespDto response = client.createSyncTask(request);
        System.out.println(JsonUtils.serialize(response));
    }

}