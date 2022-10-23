package test.management;

import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.CostGetCurrentPackageRespDto;
import cn.authing.sdk.java.dto.GetPipelineLogsDto;
import cn.authing.sdk.java.dto.PipelineFunctionPaginatedRespDto;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

public class GetPipelineLogsTest {
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

        GetPipelineLogsDto getPipelineLogsDto = new GetPipelineLogsDto();
        getPipelineLogsDto.setFuncId("AUTHING_FUNC_ID");
        PipelineFunctionPaginatedRespDto pipelineLogs = client.getPipelineLogs(getPipelineLogsDto);
        System.out.println(JsonUtils.serialize(pipelineLogs));
    }
}
