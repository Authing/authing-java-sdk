package test.management;

import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.CreateSyncTaskDto;
import cn.authing.sdk.java.dto.SyncTaskClientConfig;
import cn.authing.sdk.java.dto.SyncTaskFieldMapping;
import cn.authing.sdk.java.dto.SyncTaskPaginatedRespDto;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.ArrayList;
import java.util.List;

public class CreateSyncTaskTest {
    // 需要替换成你的 Authing Access Key ID
    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    // 需要替换成你的 Authing Access Key Secret
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        // 如果是私有化部署的客户，需要设置 Authing 服务域名
        // clientOptions.setHost("https://api.your-authing-service.com");

        ManagementClient client = new ManagementClient(clientOptions);

        CreateSyncTaskDto reqDto = new CreateSyncTaskDto();
        List<SyncTaskFieldMapping> list = new ArrayList<>();
        SyncTaskFieldMapping fieldMapping = new SyncTaskFieldMapping();
        fieldMapping.setExpression("mobile");
        fieldMapping.setTargetKey("phone");
        list.add(fieldMapping);
        reqDto.setFieldMapping(list);
        reqDto.setSyncTaskTrigger(CreateSyncTaskDto.SyncTaskTrigger.MANUALLY);
        reqDto.setSyncTaskFlow(CreateSyncTaskDto.SyncTaskFlow.UPSTREAM);
        reqDto.setClientConfig(new SyncTaskClientConfig());
        reqDto.setSyncTaskType(CreateSyncTaskDto.SyncTaskType.ACTIVE_DIRECTORY);
        reqDto.setSyncTaskName("task_name");
        SyncTaskPaginatedRespDto response = client.createSyncTask(reqDto);
        System.out.println(JsonUtils.serialize(response));
    }
}
