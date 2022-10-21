package test;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class CreateSyncTaskTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        CreateSyncTaskDto request = new CreateSyncTaskDto();
        request.setFieldMapping(Collections.singletonList(new cn.authing.sdk.java.dto.SyncTaskFieldMapping()));
        request.setSyncTaskTrigger(cn.authing.sdk.java.dto.CreateSyncTaskDto.SyncTaskTrigger.MANUALLY);
        request.setSyncTaskFlow(cn.authing.sdk.java.dto.CreateSyncTaskDto.SyncTaskFlow.UPSTREAM);
        request.setClientConfig(new cn.authing.sdk.java.dto.SyncTaskClientConfig());
        request.setSyncTaskType(cn.authing.sdk.java.dto.CreateSyncTaskDto.SyncTaskType.LARK);
        request.setSyncTaskName("syncTaskName_1409");
        request.setOrganizationCode("organizationCode_1698");
        request.setProvisioningScope(new cn.authing.sdk.java.dto.SyncTaskProvisioningScope());
        request.setTimedScheduler(new cn.authing.sdk.java.dto.SyncTaskTimedScheduler());

        SyncTaskPaginatedRespDto response = client.createSyncTask(request);
        System.out.println(JsonUtils.serialize(response));
    }

}